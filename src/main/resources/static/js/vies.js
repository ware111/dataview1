var classRoom=[];
var teachers=[];
var students=[];
var months=[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30];
var hours=[];
var dates = [];

var option1 = {

    title:{
        show:"true",//是否显示标题，默认显示，可以不设置
        text:"最近24小时数据",//图表标题文本内容
        textStyle:{//标题内容的样式
            color:'#3923e4',//京东红
            fontStyle:'normal',//主标题文字字体风格，默认normal，有italic(斜体),oblique(斜体)
            fontWeight:"bold",//可选normal(正常)，bold(加粗)，bolder(加粗)，lighter(变细)，100|200|300|400|500...
            fontFamily:"san-serif",//主题文字字体，默认微软雅黑
            fontSize:25//主题文字字体大小，默认为18px
        },
        textAlign:'left',//标题文本水平对齐方式，建议不要设置，就让他默认，想居中显示的话，建议往下看
        textBaseline:"top",//默认就好,垂直对齐方式,不要设置
        left:"center",//left 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比，也可以是 'left', 'center', 'right',如果 left 的值为'left', 'center', 'right'，组件会根据相应的位置自动对齐。
        //top:"center",//left 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比，也可以是 'left', 'center', 'right',如果 left 的值为'left', 'center', 'right'，组件会根据相应的位置自动对齐。
        right:"auto",//right 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比。
        bottom:"auto",//bottom 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比。
        //left设置center标题会自动水平居中
        //top设置center标题会自动垂直居中
        backgroundColor:"#ccc",//标题背景色，默认透明，颜色可以使用 RGB 表示，比如 'rgb(128, 128, 128)' ，如果想要加上 alpha 通道，可以使用 RGBA，比如 'rgba(128, 128, 128, 0.5)'，也可以使用十六进制格式，比如 '#ccc'
        //  borderColor:"red",//标题的边框颜色，颜色格式支持同backgroundColor
        //   borderWidth:2,//标题边框线宽，默认为0，可自行设置
        //   shadowBlur: 10,//图形阴影的模糊大小。该属性配合 shadowColor,shadowOffsetX, shadowOffsetY 一起设置图形的阴影效果。
        shadowColor: "black",
        shadowOffsetX: 0,
        shadowOffsetY: 0,
    },

    backgroundColor: '#FBFBFB',
    tooltip : {
        trigger: 'axis'
    },
    // legend: {
    //     data:['充值','消费']
    // },

    calculable : true,


    xAxis : [
        {
            axisLabel:{
                rotate: 30,
                interval:0
            },
            axisLine:{
                lineStyle :{
                    color: '#CECECE'
                }
            },
            type : 'category',
            boundaryGap : false,
            data :hours
        }
    ],
    yAxis : [
        {

            type : 'value',
            axisLine:{
                lineStyle :{
                    color: '#CECECE'
                }
            }
        }
    ],
    series : [
        {
            name:'教师数',
            type:'line',
            symbol:'none',
            smooth: 0.2,
            color:['#66AEDE'],
            data:[1,3,5,6,8,52,15,25,45]
        },
        {
            name:'学生数',
            type:'line',
            symbol:'none',
            smooth: 0.2,
            color:['#90EC7D'],
            data:[12,5,45,21,26,16,44,19]
        },
        {
            name:'教室数',
            type:'line',
            symbol:'none',
            smooth: 0.2,
            color:['#ec3664'],
            data:classRoom
        }
    ]
};


var option2 = {

    title:{
        show:"true",//是否显示标题，默认显示，可以不设置
        text:"最近30天数据",//图表标题文本内容
        textStyle:{//标题内容的样式
            color:'#3923e4',//京东红
            fontStyle:'normal',//主标题文字字体风格，默认normal，有italic(斜体),oblique(斜体)
            fontWeight:"bold",//可选normal(正常)，bold(加粗)，bolder(加粗)，lighter(变细)，100|200|300|400|500...
            fontFamily:"san-serif",//主题文字字体，默认微软雅黑
            fontSize:25//主题文字字体大小，默认为18px
        },
        textAlign:'left',//标题文本水平对齐方式，建议不要设置，就让他默认，想居中显示的话，建议往下看
        textBaseline:"top",//默认就好,垂直对齐方式,不要设置
        left:"center",//left 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比，也可以是 'left', 'center', 'right',如果 left 的值为'left', 'center', 'right'，组件会根据相应的位置自动对齐。
        //top:"center",//left 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比，也可以是 'left', 'center', 'right',如果 left 的值为'left', 'center', 'right'，组件会根据相应的位置自动对齐。
        right:"auto",//right 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比。
        bottom:"auto",//bottom 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比。
        //left设置center标题会自动水平居中
        //top设置center标题会自动垂直居中
        backgroundColor:"#ccc",//标题背景色，默认透明，颜色可以使用 RGB 表示，比如 'rgb(128, 128, 128)' ，如果想要加上 alpha 通道，可以使用 RGBA，比如 'rgba(128, 128, 128, 0.5)'，也可以使用十六进制格式，比如 '#ccc'
        //  borderColor:"red",//标题的边框颜色，颜色格式支持同backgroundColor
        //   borderWidth:2,//标题边框线宽，默认为0，可自行设置
        //   shadowBlur: 10,//图形阴影的模糊大小。该属性配合 shadowColor,shadowOffsetX, shadowOffsetY 一起设置图形的阴影效果。
        shadowColor: "black",
        shadowOffsetX: 0,
        shadowOffsetY: 0,
    },

    backgroundColor: '#FBFBFB',
    tooltip : {
        trigger: 'axis'
    },


    calculable : true,


    xAxis : [
        {
            axisLabel:{
                rotate: 30,
                interval:0
            },
            axisLine:{
                lineStyle :{
                    color: '#CECECE'
                }
            },
            type : 'category',
            boundaryGap : false,
            data : months
        }
    ],
    yAxis : [
        {

            type : 'value',
            axisLine:{
                lineStyle :{
                    color: '#CECECE'
                }
            }
        }
    ],
    series : [
        {
            name:'教师数2',
            type:'line',
            symbol:'none',
            smooth: 0.2,
            color:['#66AEDE'],
            data:[1,2,3,4,5]
        },
        {
            name:'学生数2',
            type:'line',
            symbol:'none',
            smooth: 0.2,
            color:['#90EC7D'],
            data:[1,3,4,6]
        }
    ]
};

var i = 2;
var myChart = echarts.init(document.getElementById('section-three'));


function addData(num,dateTime) {
    hours.push(dateTime);
    classRoom.push(num);

    if(hours.length == 25 && classRoom.length == 25){
        hours.shift();
        classRoom.shift();
    }
}

$(function () {
    classRoom24();
    $('#data24').click(function () {
        i=2;
        // $("#section-four").hide();
        // alert(1)
        // $("#section-three").show()
        // alert(2)
        myChart.setOption(option1)
    });
    $("#data30").click(function () {
        i = 3;
        // $("#section-three").hide();
        // alert(1)
        // $("#section-four").show();
        // alert(2)

        myChart.setOption(option2);
       // alert(3)
    })
})
if (i==2) {
    echarts.setOption(option1);

}


// 基于准备好的dom，初始化echarts实例




//var myChart1 = echarts.init(document.getElementById('section-four'));
// var myChart = echarts.init(document.getElementById('section-four'));
// 指定图表的配置项和数据


// 使用刚指定的配置项和数据显示图表。


function classRoom24() {
    var nowTeacherUrl="http://localhost:8010/hour10ClassRoom";
    nowTeacherUrl=nowTeacherUrl.replace("https","ws").replace("http","ws");
    if ('WebSocket' in window)
        hour10ClassRoomSocket = new WebSocket(nowTeacherUrl);
    else if ('MozWebSocket' in window)
        hour10ClassRoomSocket = new MozWebSocket(nowTeacherUrl);
    else {
        alert('当前浏览器 Not support websocket')
    }
//连接发生错误的回调方法
    hour10ClassRoomSocket.onerror = function () {
        nowTeacherSetMessageInnerHTML("WebSocket连接发生错误");
    };
//连接成功建立的回调方法
    hour10ClassRoomSocket.onopen = function (event) {
        console.debug("WebSocket连接成功");
    }
//接收到消息的回调方法
    hour10ClassRoomSocket.onmessage = function (event) {
        nowTeacherSetMessageInnerHTML(event.data);
    }

//连接关闭的回调方法
    hour10ClassRoomSocket.onclose = function () {
        console.debug("WebSocket关闭成功");
    }

//监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
    window.onbeforeunload = function () {
        closeWebSocket();
    }

//将消息显示在网页上
    function nowTeacherSetMessageInnerHTML(innerHTML) {
        var strings = innerHTML.split("\t");
        addData(strings[1],strings[0]);
        if (i==2){
            myChart.setOption(option1);
        }

    }

//关闭WebSocket连接
    function closeWebSocket() {
        hour10ClassRoomSocket.close();
    }
    function sendMsg() {
        hour10ClassRoomSocket.send("This is a client message ");
    }
}




