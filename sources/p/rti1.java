package p;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rti1 extends vti1 {
    public rti1() {
    }

    public final void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            TypedArray typedArrayF = xzn1.F(resources, theme, attributeSet, z47.d);
            String string = typedArrayF.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArrayF.getString(1);
            if (string2 != null) {
                this.a = cwl1.r(string2);
            }
            this.c = xzn1.z(xmlPullParser, "fillType") ? typedArrayF.getInt(2, 0) : 0;
            typedArrayF.recycle();
        }
    }

    public rti1(rti1 rti1Var) {
        super(rti1Var);
    }
}
