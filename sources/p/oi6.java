package p;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class oi6 {
    public static final int[] a = {z4p1.G(z4p1.h(0.82f, 0.67f, 1.0f, 0.0f, 24)), z4p1.G(z4p1.h(1.0f, 0.65f, 0.78f, 0.0f, 24)), z4p1.G(z4p1.h(1.0f, 0.95f, 0.7f, 0.0f, 24)), z4p1.G(z4p1.h(0.55f, 0.9f, 1.0f, 0.0f, 24)), z4p1.G(z4p1.h(0.65f, 0.72f, 1.0f, 0.0f, 24)), z4p1.G(z4p1.h(0.68f, 1.0f, 0.78f, 0.0f, 24))};
    public static final float[] b = {0.0f, 0.2f, 0.4f, 0.6f, 0.8f, 1.0f};
    public static final int[] c;
    public static final float[] d;
    public static final int[] e;

    static {
        long j = u7h.j;
        int iG = z4p1.G(j);
        long j2 = u7h.f;
        c = new int[]{iG, z4p1.G(u7h.b(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14)), z4p1.G(u7h.b(j2, 0.06f, 0.0f, 0.0f, 0.0f, 14)), z4p1.G(u7h.b(j2, 0.18f, 0.0f, 0.0f, 0.0f, 14)), z4p1.G(u7h.b(j2, 0.45f, 0.0f, 0.0f, 0.0f, 14)), z4p1.G(j2), z4p1.G(u7h.b(j2, 0.45f, 0.0f, 0.0f, 0.0f, 14)), z4p1.G(u7h.b(j2, 0.18f, 0.0f, 0.0f, 0.0f, 14)), z4p1.G(u7h.b(j2, 0.06f, 0.0f, 0.0f, 0.0f, 14)), z4p1.G(u7h.b(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14)), z4p1.G(j)};
        d = new float[]{0.0f, 0.2f, 0.32f, 0.4f, 0.46f, 0.5f, 0.54f, 0.6f, 0.68f, 0.8f, 1.0f};
        e = new int[]{z4p1.G(j), z4p1.G(z4p1.h(0.82f, 0.67f, 1.0f, 0.0f, 16)), z4p1.G(z4p1.h(0.82f, 0.67f, 1.0f, 0.06f, 16)), z4p1.G(z4p1.h(1.0f, 0.65f, 0.78f, 0.18f, 16)), z4p1.G(z4p1.h(1.0f, 0.95f, 0.7f, 0.45f, 16)), z4p1.G(z4p1.h(0.55f, 0.9f, 1.0f, 0.0f, 24)), z4p1.G(z4p1.h(0.65f, 0.72f, 1.0f, 0.45f, 16)), z4p1.G(z4p1.h(0.68f, 1.0f, 0.78f, 0.18f, 16)), z4p1.G(z4p1.h(0.82f, 0.67f, 1.0f, 0.06f, 16)), z4p1.G(z4p1.h(0.82f, 0.67f, 1.0f, 0.0f, 16)), z4p1.G(j)};
    }

    public static final void a(Bitmap bitmap, xd6 xd6Var, qim0 qim0Var, Function0 function0, b4g1 b4g1Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2059004861);
        int i2 = (x340Var.i(bitmap) ? 4 : 2) | i | (x340Var.g(xd6Var) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | (x340Var.g(b4g1Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zI = x340Var.i(bitmap) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new db(bitmap, function0, b4g1Var, xd6Var);
                x340Var.s0(objT);
            }
            op71.g(x340Var, exd0.r(qim0Var, (iu30) objT));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m(bitmap, xd6Var, qim0Var, function0, b4g1Var, i);
        }
    }
}
