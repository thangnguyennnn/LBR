<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="wrapper">

    <!-- Navbar -->
    <nav
        class="main-header navbar navbar-expand navbar-white navbar-light">
        <!-- Left navbar links -->
        <ul class="navbar-nav">
            <li class="nav-item"><a class="nav-link" data-widget="pushmenu"
                                    href="#" role="button"><i class="fas fa-bars"></i></a></li>
            <li class="nav-item d-none d-sm-inline-block"><a href="#"
                                                             class="nav-link">Hướng dẫn sử dụng</a></li>
        </ul>

    </nav>
    <!-- /.navbar -->

    <!-- Main Sidebar Container -->
    <aside class="main-sidebar sidebar-dark-primary elevation-4" style="height:730px">
        <a href="#" class="brand-link"> <img
                src="Resources/img/AdminLTELogo.png" alt="AdminLTE Logo"
                class="brand-image img-circle elevation-3" style="opacity: .8">
            <span class="brand-text font-weight-light">Quán lý thư viện</span>
        </a>

        <!-- Sidebar -->
        <div class="sidebar">
            <!-- Sidebar user panel (optional) -->
            <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                <c:if test="${User != null}">
                    <div class="image">
                        <img src="Resources/img/avatar.jpg" class="img-circle elevation-2"
                             alt="User Image">
                    </div>
                    <div class="info">
                        <a href="#" class="d-block">${User.username}</a>
                    </div>
                </c:if>
                <c:if test="${User == null}">
                    <div class="info" style="margin-left: 60px;">
                        <a href="login.jsp" class="d-block">Đăng
                            nhập</a>
                    </div>
                </c:if>

            </div>

            <!-- Sidebar Menu -->
            <nav class="mt-2">
                <ul class="nav nav-pills nav-sidebar flex-column"
                    data-widget="treeview" role="menu" data-accordion="false">
                    <li class="nav-item "><a
                            href="loadHome"
                            class="nav-link ${index == 1 ? "active":""}">
                            <i class="nav-icon fas fa-book"></i>
                            <p>Hướng dẫn</p>
                        </a></li>
                        <c:if test="${User != null}">
                        <li id="li1"
                            class="nav-item has-treeview menu-open"><a
                                href="#"
                                class="nav-link ${index == 2 ? "active":""}">
                                <i class="nav-icon fas fa-book"></i>
                                <p>
                                    Quản lý sách<i class="right fas fa-angle-left"></i>
                                </p>
                                
                            </a>
                            <ul id="menu1" class="nav nav-treeview">
                                <li class="nav-item"><a
                                        href="loadManagerBook"
                                        class="nav-link ${index2 == 1 ? "active":""}">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>Danh sách</p>
                                    </a></li>
                                <li class="nav-item"><a
                                        href="loadAddBookPage"
                                        class="nav-link ${index2 == 2 ? "active":""}"">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>Thêm sách</p>
                                    </a></li>
                                <li class="nav-item"><a
                                        href="loadManagerCate"
                                        class="nav-link ${index2 == 3 ? "active":""}">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>Thể loại</p>
                                    </a></li>
                            </ul></li>
                        <li id="li2"
                            class="nav-item has-treeview menu-open"><a
                                
                                class="nav-link ${index == 3 ? "active":""}">
                                <i class="nav-icon fas fa-book"></i>
                                <p>
                                    Quản lý mượn sách<i class="right fas fa-angle-left"></i>
                                </p>
                            </a>
                            <ul id="menu2" class="nav nav-treeview">
                                <li class="nav-item"><a
                                        href="loadAddReader"
                                        class="nav-link ${index2 == 4 ? "active":""}">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>Thêm người mượn sách</p>
                                    </a></li>
                                <li class="nav-item"><a
                                        href="loadDangMuon"
                                        class="nav-link ${index2 == 5 ? "active":""}">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>Danh sách đang mượn sách</p>
                                    </a></li>

                                <li class="nav-item"><a
                                        href="loadHistory"
                                        class="nav-link ${index2 == 6 ? "active":""}">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>Lịch sử mượn sách</p>
                                    </a></li>
                            </ul></li>
                        <li class="nav-item"><a
                                href="logout" class="nav-link">
                                <i class="fas fa-circle nav-icon"></i>
                                <p>Đăng xuất</p>
                            </a></li>  
                        </c:if>

                </ul>
            </nav>
            <!-- /.sidebar-menu -->
        </div>
        <!-- /.sidebar -->
    </aside>
</div>
