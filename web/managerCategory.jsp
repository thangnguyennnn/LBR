<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
                        <div class="col-md-3"></div>
                        <div class="col-md-6">
                            <div class="card">
                                <div class="card-header">
                                    <h3 class="card-title">Danh sách thể loại sách</h3>
                                </div>
                                <!-- /.card-header -->
                                <div class="card-body">

                                    <table class="table table-bordered">
                                        <thead>
                                            <tr>
                                                <th style="width: 10px">STT</th>
                                                <th>Tên thể loại</th>
                                                <th>Chỉnh sửa</th>
                                                <th>Xóa</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${categoryList}" var="c"
                                                       varStatus="loop">
                                                <tr>
                                                    <td>${c.id}</td>
                                                    <td>${c.name}</td>
                                                    <td><a
                                                            href="EditCategory?id=${c.id}"
                                                            class="btn btn-sm btn-info">Chỉnh sửa</a></td>
                                                        <c:if test="${c.id != 0}">
                                                        <td>
                                                            <button type="button" class="btn btn-primary btn-danger"
                                                                    data-toggle="modal"
                                                                    data-target="#staticBackdrop-${c.id}">Xóa</button>
                                                        </td>
                                                    </c:if>

                                                </tr>

                                            <div class="modal fade"
                                                 id="staticBackdrop-${c.id}"
                                                 data-backdrop="static" data-keyboard="false" tabindex="-1"
                                                 aria-labelledby="staticBackdropLabel" aria-hidden="true">
                                                <div class="modal-dialog">
                                                    <div class="modal-content">
                                                        <div class="modal-header">
                                                            <h5 class="modal-title" id="staticBackdropLabel1">Chú
                                                                ý</h5>
                                                            <button type="button" class="close" data-dismiss="modal"
                                                                    aria-label="Close">
                                                                <span aria-hidden="true">&times;</span>
                                                            </button>
                                                        </div>
                                                        <div class="modal-body">
                                                            <span class="text-danger"> Bạn có muốn chắc xóa thể
                                                                loại '${c.name}', Việc xóa thể loại sẽ dẫn đến lỗi, do đó chúng tôi sẽ chuyển toàn bộ sách có thể loại '${c.name}' sang thể loại 'Không xác định', bạn có đồng ý không!</span>
                                                        </div>
                                                        <div class="modal-footer">
                                                            <button type="button"
                                                                    class="btn btn-warning  btn-secondary"
                                                                    data-dismiss="modal">Hủy</button>
                                                            
                                                            <a href="deleteCate?caID=${c.id}" type="submit" class="btn btn-danger">Xóa</a>
                                                            

                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                        </c:forEach>
                                        </tbody>
                                    </table>
                                    <div class="card-header" style="margin-left: -20px;">
                                        <input type="button" value="Thêm thể loại"
                                               class="btn btn-primary"
                                               onclick="location.href = 'addCategory.jsp'">
                                    </div>
                                </div>

                            </div>
                            <!-- /.card -->
                        </div>
                    </div>
                    <!-- /.container-fluid -->
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
