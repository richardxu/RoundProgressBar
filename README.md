![](https://github.com/Qiu800820/RoundProgressBar/blob/master/demos/Screenshot_STROKE.png)
```xml
<com.sum.roundprogressbar.RoundProgressBar
        android:id="@+id/progress1"
        android:layout_width="100dp"
        android:layout_height="100dp"
        custom:max="100"
        custom:roundColor="#F9DA80"
        custom:roundProgressColor="#FF9933"
        custom:roundProgressWidth="10dp"
        custom:roundWidth="10dp"
        custom:textSize="16sp"
        custom:style="STROKE"
        custom:textIsDisplayable="true"
        />
```
![](https://github.com/Qiu800820/RoundProgressBar/blob/master/demos/Screenshot_FILL.png)
```xml
<com.sum.roundprogressbar.RoundProgressBar
        android:id="@+id/progress2"
        android:layout_width="100dp"
        android:layout_height="100dp"
        custom:max="100"
        custom:roundColor="#F9DA80"
        custom:roundProgressColor="#FF9933"
        custom:roundProgressWidth="10dp"
        custom:roundWidth="10dp"
        custom:textSize="16sp"
        custom:style="HORIZONTAL"
        custom:textIsDisplayable="true"
        />
```
![](https://github.com/Qiu800820/RoundProgressBar/blob/master/demos/Screenshot_HORIZONTAL.png)
```xml
<com.sum.roundprogressbar.RoundProgressBar
        android:id="@+id/progress3"
        android:layout_width="100dp"
        android:layout_height="100dp"
        custom:max="100"
        custom:roundColor="#F9DA80"
        custom:roundProgressColor="#FF9933"
        custom:roundProgressWidth="10dp"
        custom:roundWidth="10dp"
        custom:textSize="16sp"
        custom:style="FILL"
        custom:textIsDisplayable="true"
        />
```
styleable
```xml
        <attr name="roundColor" format="color"/><!-->进度条底色<-->
        <attr name="roundProgressColor" format="color"/><!-->进度颜色<-->
        <attr name="roundWidth" format="dimension"></attr><!-->进度条宽度<-->
        <attr name="roundProgressWidth" format="dimension"></attr><!-->进度宽度<-->
        <attr name="textColor" format="color" /><!-->中间文字颜色<-->
        <attr name="textSize" format="dimension" /><!-->中间文字大小<-->
        <attr name="max" format="integer"></attr><!-->最大进度值<-->
        <attr name="textIsDisplayable" format="boolean"></attr><!-->是否显示中间文字<-->
        <attr name="style"><!-->进度样式<-->
            <enum name="STROKE" value="0"></enum><!-->外层圆弧进度 中间空心<-->
            <enum name="FILL" value="1"></enum><!-->中间扇形进度 外层不变<-->
            <enum name="FILL_AND_STROKE" value="2"></enum><!-->中间和外层扇形进度<-->
            <enum name="HORIZONTAL" value="3"></enum><!-->中间水平进度 外层不变<-->
        </attr>
```
