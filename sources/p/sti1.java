package p;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sti1 extends vti1 {
    public mgc d;
    public float e;
    public mgc f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    public sti1(sti1 sti1Var) {
        super(sti1Var);
        this.e = 0.0f;
        this.g = 1.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = 1.0f;
        this.k = 0.0f;
        this.l = Paint.Cap.BUTT;
        this.m = Paint.Join.MITER;
        this.n = 4.0f;
        this.d = sti1Var.d;
        this.e = sti1Var.e;
        this.g = sti1Var.g;
        this.f = sti1Var.f;
        this.c = sti1Var.c;
        this.h = sti1Var.h;
        this.i = sti1Var.i;
        this.j = sti1Var.j;
        this.k = sti1Var.k;
        this.l = sti1Var.l;
        this.m = sti1Var.m;
        this.n = sti1Var.n;
    }

    public final boolean a() {
        return this.f.G() || this.d.G();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public final boolean b(int[] iArr) {
        boolean z;
        mgc mgcVar = this.f;
        boolean z2 = true;
        if (mgcVar.G()) {
            ColorStateList colorStateList = (ColorStateList) mgcVar.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != mgcVar.b) {
                mgcVar.b = colorForState;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        mgc mgcVar2 = this.d;
        if (mgcVar2.G()) {
            ColorStateList colorStateList2 = (ColorStateList) mgcVar2.d;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != mgcVar2.b) {
                mgcVar2.b = colorForState2;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        return z | z2;
    }

    public final void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayF = xzn1.F(resources, theme, attributeSet, z47.c);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            String string = typedArrayF.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArrayF.getString(2);
            if (string2 != null) {
                this.a = cwl1.r(string2);
            }
            this.f = xzn1.q(typedArrayF, xmlPullParser, theme, "fillColor", 1);
            float f = this.h;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                f = typedArrayF.getFloat(12, f);
            }
            this.h = f;
            int i = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayF.getInt(8, -1) : -1;
            Paint.Cap cap = this.l;
            if (i == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i == 1) {
                cap = Paint.Cap.ROUND;
            } else if (i == 2) {
                cap = Paint.Cap.SQUARE;
            }
            this.l = cap;
            int i2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayF.getInt(9, -1) : -1;
            Paint.Join join = this.m;
            if (i2 == 0) {
                join = Paint.Join.MITER;
            } else if (i2 == 1) {
                join = Paint.Join.ROUND;
            } else if (i2 == 2) {
                join = Paint.Join.BEVEL;
            }
            this.m = join;
            float f2 = this.n;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                f2 = typedArrayF.getFloat(10, f2);
            }
            this.n = f2;
            this.d = xzn1.q(typedArrayF, xmlPullParser, theme, "strokeColor", 3);
            float f3 = this.g;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                f3 = typedArrayF.getFloat(11, f3);
            }
            this.g = f3;
            float f4 = this.e;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                f4 = typedArrayF.getFloat(4, f4);
            }
            this.e = f4;
            float f5 = this.j;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                f5 = typedArrayF.getFloat(6, f5);
            }
            this.j = f5;
            float f6 = this.k;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                f6 = typedArrayF.getFloat(7, f6);
            }
            this.k = f6;
            float f7 = this.i;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                f7 = typedArrayF.getFloat(5, f7);
            }
            this.i = f7;
            int i3 = this.c;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                i3 = typedArrayF.getInt(13, i3);
            }
            this.c = i3;
        }
        typedArrayF.recycle();
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f.b;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.d.b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f) {
        this.h = f;
    }

    public void setFillColor(int i) {
        this.f.b = i;
    }

    public void setStrokeAlpha(float f) {
        this.g = f;
    }

    public void setStrokeColor(int i) {
        this.d.b = i;
    }

    public void setStrokeWidth(float f) {
        this.e = f;
    }

    public void setTrimPathEnd(float f) {
        this.j = f;
    }

    public void setTrimPathOffset(float f) {
        this.k = f;
    }

    public void setTrimPathStart(float f) {
        this.i = f;
    }

    public sti1() {
        this.e = 0.0f;
        this.g = 1.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = 1.0f;
        this.k = 0.0f;
        this.l = Paint.Cap.BUTT;
        this.m = Paint.Join.MITER;
        this.n = 4.0f;
    }
}
