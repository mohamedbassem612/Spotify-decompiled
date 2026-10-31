package p;

import android.opengl.GLES20;
import android.opengl.Matrix;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q3g1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ q3g1(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.d;
        int i2 = this.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((r3g1) obj).k(i2, i);
                break;
            case 1:
                ((r3g1) obj).l(i2, i);
                break;
            default:
                ec5 ec5Var = (ec5) obj;
                zb5 zb5Var = ec5Var.a;
                zb5Var.getClass();
                GLES20.glViewport(0, 0, i2, i);
                Matrix.orthoM(zb5Var.e, 0, 0.0f, i2, 0.0f, i, -1.0f, 1.0f);
                ec5Var.a();
                break;
        }
    }
}
