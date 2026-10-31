package p;

import android.graphics.Bitmap;
import android.opengl.Matrix;
import android.util.Pair;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class oxa {
    public final float[] a;
    public int b;
    public int c;
    public Bitmap d;

    static {
        fn31.A();
    }

    public oxa() {
        float[] fArrA = fn31.A();
        Matrix.scaleM(fArrA, 0, 1.0f, -1.0f, 1.0f);
        this.a = fArrA;
        this.b = -1;
    }

    public abstract Bitmap a(long j);

    public yrb1 b() {
        Pair pair = fwq0.a;
        Pair pair2 = fwq0.a;
        Pair pair3 = fwq0.c;
        Float fValueOf = Float.valueOf(0.0f);
        Pair pairCreate = Pair.create(fValueOf, fValueOf);
        dm5.m(-1.0f <= 0.08f && 0.08f <= 1.0f);
        return new yrb1(Pair.create(fValueOf, Float.valueOf(0.08f)), pairCreate, pair3);
    }
}
