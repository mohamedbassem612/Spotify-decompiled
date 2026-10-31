package p;

import android.opengl.Matrix;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q641 extends pbq {
    public final float[] Y = fn31.A();

    public final float[] M(l291 l291Var, fwq0 fwq0Var) {
        float[] fArrM = super.M(l291Var, fwq0Var);
        float[] fArr = this.Y;
        Matrix.invertM(fArr, 0, fArrM, 0);
        return fArr;
    }
}
