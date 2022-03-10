
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="head.jsp"></jsp:include>
        </head>
        <body>
        <jsp:include page="leftMenu.jsp"></jsp:include>
            <div class="content-wrapper">
                <!-- Main content -->
                <section class="content">
                    <div class="row justify-content-center">
                        <div style="margin-top: 20px; color: red;">${errorString}</div>
                </div>
                <div class="container-fluid">
                    <div class="row">

                        <div class="col-md-12">
                            <div class="card">
                                <form role="form" method="post"
                                      action="" onsubmit="return false;">

                                    <div class="card-header">
                                        <c:if test="${IDPAGE == 'history'}">
                                            <h3 class="card-title">Danh sách lịch sử mượn sách sách</h3>
                                            <div class="card-tools" style="margin-right: 1px;">
                                            <div class="input-group input-group-sm" style="width: 200px;">
                                                <input type="text" name="data_search"
                                                       class="form-control float-right"
                                                       placeholder="Tìm kiếm theo tên" oninput="searchTXTH(this)">
                                                <script>
                                                    function searchTXTH(param){
                                                        $.ajax({
                                                           url: 'searchInHistory',
                                                           type: 'post',
                                                           data:{
                                                               name : param.value
                                                           },
                                                           success: function (data){
                                                               document.getElementById('listReader').innerHTML = data;
                                                           }
                                                        });
                                                    }
                                                </script>
                                                <div class="input-group-append">
                                                    <button type="submit" class="btn btn-primary">
                                                        <i class="fas fa-search"></i>
                                                    </button>
                                                </div>
                                            </div>
                                        </div>
                                        </c:if>
                                        <c:if test="${IDPAGE == 'dangmuon'}">
                                            <h3 class="card-title">Danh sách sách những người đang mượn
                                                sách</h3>
                                            <div class="card-tools" style="margin-right: 1px;">
                                                <div class="input-group input-group-sm" style="width: 200px;">
                                                    <input type="text" name="data_search"
                                                           class="form-control float-right"
                                                           placeholder="Tìm kiếm theo tên" oninput="searchTXT(this)">
                                                    <script>
                                                        function searchTXT(param) {
                                                            $.ajax({
                                                                url: 'searchReader',
                                                                type: 'post',
                                                                data: {
                                                                    name: param.value
                                                                },
                                                                success: function (data) {
                                                                    document.getElementById('listReader').innerHTML = data;
                                                                }
                                                            });
                                                        }
                                                    </script>
                                                    <div class="input-group-append">
                                                        <button type="submit" class="btn btn-primary">
                                                            <i class="fas fa-search"></i>
                                                        </button>
                                                    </div>
                                                </div>
                                            </div>
                                        </c:if>


                                    </div>
                                </form>
                                <!-- /.card-header -->
                                <div class="card-body">
                                    <table class="table table-bordered table-hover" id="example2">
                                        <thead>
                                            <tr>
                                                <th style="width: 10px">STT</th>
                                                <th>Tên</th>
                                                <th>Số CMNN</th>
                                                <th>Tên sách mượn</th>
                                                <th>Ngày mượn</th>

                                                <th>Ngày phải trả</th>
                                                <th>Xác nhận</th>



                                                <th>Ngày trả</th>


                                            </tr>
                                        </thead>
                                        <tbody id="listReader"> 
                                            <c:forEach items="${readerList}" var="r" varStatus="loop">
                                                <c:if test="${r.stt != '' && IDPAGE == 'history'}">
                                                    <tr>
                                                        <td>${r.id}</td>
                                                        <td>${r.name}</td>
                                                        <td>${r.indentityCard}</td>
                                                        <c:forEach items="${bookList}" var="b">
                                                            <c:if test="${b.id == r.bookid}">
                                                                <td>${b.name}</td>
                                                            </c:if>
                                                        </c:forEach>
                                                        <td>${r.startDay}</td>
                                                        <td>${r.endDay}</td>
                                                        <td id="confirmR">
                                                            <button type="submit"
                                                                    class="btn btn-success  btn-secondary"
                                                                    >Đã Trả
                                                                sách</button>
                                                        </td>
                                                        <td>${r.stt}</td>
                                                    </tr>
                                                </c:if>
                                                <c:if test="${r.stt == '' && IDPAGE == 'dangmuon'}">
                                                    <tr>
                                                        <td>${r.id}</td>
                                                        <td>${r.name}</td>
                                                        <td>${r.indentityCard}</td>
                                                        <c:forEach items="${bookList}" var="b">
                                                            <c:if test="${b.id == r.bookid}">
                                                                <td>${b.name}</td>
                                                            </c:if>
                                                        </c:forEach>
                                                        <td>${r.startDay}</td>
                                                        <td>${r.endDay}</td>
                                                        <td id="confirmR${r.id}">

                                                            <button type="submit"
                                                                    class="btn btn-warning  btn-secondary"
                                                                    onclick="ConfirmR('${r.id}')">Trả
                                                                sách</button>
                                                        </td>
                                                        <td>${r.stt}</td>
                                                    </tr>
                                                </c:if>
                                            </c:forEach>
                                        </tbody>
                                        <script>
                                            function ConfirmR(id) {
                                                $.ajax({
                                                    url: 'traSach',
                                                    type: 'post',
                                                    data: {
                                                        id: id
                                                    },
                                                    success: function (data) {
                                                        var li = document.getElementById('confirmR'+id);
                                                        li.innerHTML = data;
                                                    }
                                                });
                                            }
                                        </script>
                                    </table>
                                </div>

                            </div>
                            <!-- /.card -->
                        </div>
                    </div>
                </div>    <!-- /.container-fluid -->
            </section>
        </div>
    </body>
    <jsp:include page="footer.jsp"></jsp:include>
    <script src="Resources/plugins/datatables/jquery.dataTables.min.js"></script>
    <script
    src="Resources/plugins/datatables-bs4/js/dataTables.bootstrap4.min.js"></script>
    <script
    src="Resources/plugins/datatables-responsive/js/dataTables.responsive.min.js"></script>
    <script
    src="Resources/plugins/datatables-responsive/js/responsive.bootstrap4.min.js"></script>
    <!-- AdminLTE App -->
    <script src="Resources/js/adminlte.min.js"></script>
    <!-- AdminLTE for demo purposes -->
    <script src="Resources/dist/js/demo.js"></script>
    <!-- page script -->
    <script>
                                            $(function () {
                                                $("#example1").DataTable({
                                                    "responsive": true,
                                                    "autoWidth": false,
                                                });
                                                $('#example2').DataTable({
                                                    "paging": true,
                                                    "lengthChange": false,
                                                    "searching": false,
                                                    "ordering": true,
                                                    "info": true,
                                                    "autoWidth": false,
                                                    "responsive": true,
                                                });
                                            });
    </script>
</html>
