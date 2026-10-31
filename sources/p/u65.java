package p;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u65 {
    public final XmlPullParser a;
    public int[] c;
    public int d;
    public int b = 0;
    public final tym0 e = new tym0((byte) 18);

    public u65(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        float fR = xzn1.r(typedArray, this.a, str, i, f);
        b(typedArray.getChangingConfigurations());
        return fR;
    }

    public final void b(int i) {
        this.b = i | this.b;
    }
}
