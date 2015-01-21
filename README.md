# RippleExpandableLayout
##An expandable (curtain like) layout openable with a beauty ripple button


Here's a little preview of what RippleExpandableLayout is

![RippleExpandableLayout](https://github.com/AleBestia/RippleExpandableLayout/blob/master/rippleExpLayout_preview.gif)

Here's how to declare a RippleExpandableLayout object
``` xml
<it.muzzialessandro.rippleexpandablelayout.RippleExpLayout
        android:id="@+id/btnTest"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        app:rpRxp_bgColor="#3498db"
        app:rpRxp_bold="false"
        app:rpRxp_imgSrc="@drawable/img_down"
        app:rpRxp_italic="true"
        app:rpRxp_text="Premi qui"
        app:rpRxp_textColor="#ffffff"
        app:rpRxp_textSize="28"
        android:gravity="center">
        
</it.muzzialessandro.rippleexpandablelayout.RippleExpLayout>
```

### Customization

You can change several attributes in the XML file.

These paramethers refer to RippleButton:
* app:rv_alpha [integer def:90 0-255] --> Alpha of the ripple
* app:rv_framerate [integer def:10] --> Frame rate of the ripple animation
* app:rv_rippleDuration [integer def:400] --> Duration of the ripple animation
* app:rv_ripplePadding [dimension def:0] --> Add a padding to the ripple
* app:rv_color [color def:@android:color/white] --> Color of the ripple
* app:rv_centered [boolean def:false] --> Center ripple in the child view
* app:rv_type [enum (simpleRipple, doubleRipple) def:simpleRipple] --> Simple or double ripple
* app:rv_zoom [boolean def:false] --> Enable zoom animation
* app:rv_zoomDuration [integer def:150] --> Duration of zoom animation
* app:rv_zoomScale [float def:1.03] --> Scale of zoom animation

These ones refer to others object paramethers:
* app:rpRxp_text [string] --> RippleButton's text
* app:rpRxp_textSize [integer] --> RippleButton's text size
* app:rpRxp_textColor [color] --> RippleButton's text color
* app:rpRxp_bold [boolean] --> Set if the text of the RippleButton is bold or not
* app:rpRxp_italic [boolean] --> Set if the text of the RippleButton is italic or not
* app:rpRxp_bgColor [color] --> RippleButton's background color
* app:rpRxp_imgSrc [reference] --> RippleButton's arrow image
* app:rpRxp_layout_width [dimension] --> RippleButton's layout width
* app:rpRxp_height [dimension] --> RippleButton's layout height
