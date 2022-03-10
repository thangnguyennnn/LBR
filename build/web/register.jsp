<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="head.jsp"></jsp:include>
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
                                <div class="card card-primary">
                                    <div class="card-header">
                                        <h3 class="card-title">Đăng Ký</h3>
                                    </div>
                                    <!-- /.card-header -->
                                    <!-- form start -->
                                    <form role="form"
                                          action="register" method="post">
                                        <div class="row justify-content-center card-body"
                                             style="margin-bottom: -34px;">
                                            <div style="color: red;">${errorString}</div>
                                    </div>
                                    <div class="card-body">
                                        <div class="form-group">
                                            <label for="exampleInputEmail1">Tên đăng nhập</label> <input
                                                type="text" class="form-control" name="username"
                                                placeholder="Nhập tên đăng nhập" required="required">
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword1">Mật khẩu</label> <input
                                                type="password" class="form-control" name="password"
                                                id="exampleInputPassword1" placeholder="Nhập mật khẩu"
                                                required="required">
                                        </div>
                                        <div class="form-check">
                                            <a href="login.jsp  "
                                                class="form-check-label" for="exampleCheck1">Đăng Nhập
                                                </a>
                                        </div>
                                        <div style="margin-bottom: -14px; margin-top: 25px;">

                                        </div>
                                    </div>
                                    <!-- /.card-body -->

                                    <div class="card-footer">
                                        <button type="submit" class="btn btn-primary">Đăng ký</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                        <!-- /.row -->
                    </div>
                    <!-- /.container-fluid -->
            </section>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
