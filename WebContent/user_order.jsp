<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>会员中心-我的订单</title>
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/base.css" />
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/membercenter.css" />

</head>

<body>
	<!--导航 开始-->
	<%@ include file="/WEB-INF/nav.jsp"%>
	<!--导航 结束-->
	<!--搜索 开始-->
	<%@ include file="/WEB-INF/search.jsp"%>
	<!--搜索 结束-->
	<div class="box">
		<div class="path">
			<span class="mr10">您的位置：</span><a href="#" target="_blank">首页</a><em>》</em><span>会员中心</span>
		</div>
		<div class="member_lf fl">
			<ul class="member_nav">
				<li class="nav_home"><label>个人中心首页</label></li>
				<li><label class="erji_nav">基本信息<em class="arrow"></em></label>
					<ul class="cl erji_nav_list ">
						<li>个人信息</li>
						<li>个人信息更新</li>
						<li>修改密码</li>
					</ul></li>
				<li><label class="erji_nav">会员积分<em class="arrow"></em></label>
					<ul class="cl erji_nav_list ">
						<li>积分查询</li>
					</ul></li>
				<li><label class="erji_nav">维修信息<em class="arrow"></em></label>
					<ul class="cl erji_nav_list ">
						<li>我的维修预约</li>
					</ul></li>
				<li><label class="erji_nav">配件订单信息<em class="arrow"></em></label>
					<ul class="cl erji_nav_list ">
						<li class="hover">我的订单</li>
						<li>订单取消记录</li>
					</ul></li>
				<li><label class="erji_nav">评价管理<em class="arrow"></em></label>
					<ul class="cl erji_nav_list ">
						<li>给他人的评价</li>
						<li>来自卖家的评价</li>
					</ul></li>
			</ul>
			<div class="collect">我的收藏</div>
		</div>
		
		<%
		
		UserOrder order = (UserOrder)request.getAttribute("order");
		
		
		%>
		
		<!--右边 开始-->
		<div class="member_rgt fr">
			<h2 class="member_rgt_hd">我的订单</h2>
			<div class="myorders_box">
				<table class="myorders">
					<tr>
						<th>订单编号</th>
						<th>收货人</th>
						<th>订单金额</th>
						<th>时间</th>
						<th>状态</th>
						<th>操作</th>
					</tr>
					
					<%
					for(OrderItem item :order.getOrderItems()){
					%>
						<tr>
							<td>1332456676412</td>
							<td><%= order.getUser().getName() %></td>
							<td><p class="jg"><%= item.getpPrice() %></p>
								<p>在线支付</p></td>
							<td class="time_txt">2014-05-01 13:00:00</td>
							<td>已完成</td>
							<td class="caozuo">
								<p>
									<a class="caozuo_txt" href="#" target="_blank">查看</a><a
										class="caozuo_txt" href="#" target="_blank">删除</a>
								</p>
								<p>
									<a class="hym_btn" href="#" target="_blank">还要买</a>
								</p>
							</td>
						</tr>
						
						<%
					}
					%>
					
					
					
					<tr>
						<td>1332456676412</td>
						<td>张三三</td>
						<td><p class="jg">￥13945.00</p>
							<p>在线支付</p></td>
						<td class="time_txt">2014-05-01 13:00:00</td>
						<td>已完成</td>
						<td class="caozuo">
							<p>
								<a class="caozuo_txt" href="#" target="_blank">查看</a><a
									class="caozuo_txt" href="#" target="_blank">删除</a>
							</p>
							<p>
								<a class="hym_btn" href="#" target="_blank">还要买</a>
							</p>
						</td>
					</tr>
					<tr>
						<td>1332456676412</td>
						<td>张三三</td>
						<td><p class="jg">￥13945.00</p>
							<p>在线支付</p></td>
						<td class="time_txt">2014-05-01 13:00:00</td>
						<td>已完成</td>
						<td class="caozuo">
							<p>
								<a class="caozuo_txt" href="#" target="_blank">查看</a><a
									class="caozuo_txt" href="#" target="_blank">删除</a>
							</p>
							<p>
								<a class="hym_btn" href="#" target="_blank">还要买</a>
							</p>
						</td>
					</tr>
					<tr>
						<td>1332456676412</td>
						<td>张三三</td>
						<td><p class="jg">￥13945.00</p>
							<p>在线支付</p></td>
						<td class="time_txt">2014-05-01 13:00:00</td>
						<td>已完成</td>
						<td class="caozuo">
							<p>
								<a class="caozuo_txt" href="#" target="_blank">查看</a><a
									class="caozuo_txt" href="#" target="_blank">删除</a>
							</p>
							<p>
								<a class="hym_btn" href="#" target="_blank">还要买</a>
							</p>
						</td>
					</tr>
					<tr>
						<td>1332456676412</td>
						<td>张三三</td>
						<td><p class="jg">￥13945.00</p>
							<p>在线支付</p></td>
						<td class="time_txt">2014-05-01 13:00:00</td>
						<td class="zhuantai1">待配送</td>
						<td class="caozuo">
							<p>
								<a class="caozuo_txt" href="#" target="_blank">查看</a><a
									class="caozuo_txt" href="#" target="_blank">删除</a>
							</p>
							<p>
								<a class="hym_btn" href="#" target="_blank">还要买</a>
							</p>
						</td>
					</tr>
				</table>
				<div class="ui_page">
					<ul>
						<li class="page_on page_select">上一页 &gt;&gt;</li>
						<li class="page_select" href="#">1</li>
						<li><a href="#"> 2</a></li>
						<li><a href="#"> 3</a></li>
						<li><a href="#"> 4</a></li>
						<li><a href="#"> &gt;&gt; </a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<!-- 底部开始 -->
	<%@ include file="/WEB-INF/footer.jsp"%>
	<!-- 底部结束 -->
</body>
</html>
