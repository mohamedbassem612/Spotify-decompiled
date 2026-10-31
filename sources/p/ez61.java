package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class ez61 implements Parcelable {
    public static final zy61 c = new zy61(6.0f, 5.0f);
    public final float a;
    public final String b;

    public ez61(float f, float f2) {
        cbx.a.getClass();
        if (f <= 0.0f || f2 <= 0.0f) {
            eg.m("Aspect ratio width and height must be bigger than zero.");
            throw null;
        }
        float f3 = f / f2;
        if (f3 <= 0.0f) {
            hhg1.n("Aspect ratio value must be bigger than zero.");
            throw null;
        }
        this.a = f3;
        this.b = f4i1.f(ihc1.J0(String.valueOf(f), ".0"), ":", ihc1.J0(String.valueOf(f2), ".0"));
    }
}
