<%-- 
    Document   : addCatelogy
    Created on : Mar 4, 2022, 10:26:24 PM
    Author     : HP
--%>

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
                <!-- Content Header (Page header) -->
                <div class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1 class="m-0 text-dark"></h1>
                            </div>
                        </div>
                        <!-- /.row -->
                    </div>
                    <!-- /.container-fluid -->
                </div>
                <!-- /.content-header -->
                <section class="content">

                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-3"></div>
                            <div class="col-md-6">
                                <!-- general form elements -->
                                <div class="card card-primary">
                                    <div class="card-header">
                                        <h3 class="card-title">Thêm thể loại</h3>
                                    </div>
                                    <!-- /.card-header -->
                                    <!-- form start -->
                                    <form role="form" method="post"
                                          action="AddCategory">
                                    <div class="card-body">
                                        <div class="form-group">
                                            <label>Tên thể loại</label> <input type="text"
                                                                               class="form-control" id="name_category" name="name_category"
                                                                               placeholder="Nhập tên thể loại sách">
                                        </div>
                                    </div>
                                    <div class="card-footer">
                                        <button type="submit" class="btn btn-primary ">Lưu</button>
                                        <input type="button" value="Đến Trang quản lý thể loại" class="btn btn-primary" onclick="location.href ='ManageCategory'">
                                    </div>
                                </form>
                            </div>
                            <!-- /.card -->

                        </div>
                        <!-- /.row -->
                    </div>
                    <!-- /.container-fluid -->
            </section>
        </div>                    
        <!-- /.content -->
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
