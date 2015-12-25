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
![](https://github.com/Qiu800820/RoundProgressBar/blob/master/demos/Screenshot_HORIZONTAL.png)
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
![](https://github.com/Qiu800820/RoundProgressBar/blob/master/demos/Screenshot_FILL.png)
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
        <attr name="roundColor" format="color"/>
        <attr name="roundProgressColor" format="color"/>
        <attr name="roundWidth" format="dimension"></attr>
        <attr name="roundProgressWidth" format="dimension"></attr>
        <attr name="textColor" format="color" />
        <attr name="textSize" format="dimension" />
        <attr name="max" format="integer"></attr>
        <attr name="textIsDisplayable" format="boolean"></attr>
        <attr name="style">
            <enum name="STROKE" value="0"></enum>
            <enum name="FILL" value="1"></enum>
            <enum name="FILL_AND_STROKE" value="2"></enum>
            <enum name="HORIZONTAL" value="3"></enum>
        </attr>
```