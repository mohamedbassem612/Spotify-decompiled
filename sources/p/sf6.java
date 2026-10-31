package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class sf6 {
    public static final cr31 a = er31.b(15.0f);
    public static final float b = 0.5f;
    public static final long c = u7h.b(u7h.f, 0.2f, 0.0f, 0.0f, 0.0f, 14);
    public static final float d = 16.0f;
    public static final float e = 24.0f;
    public static final float f = 8.0f;
    public static final float g = 8.0f;

    public static final void a(qe6 qe6Var, wj31 wj31Var, List list, rk41 rk41Var, int i, boolean z, boolean z2, xd6 xd6Var, qim0 qim0Var, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-614779363);
        int i3 = i2 | (x340Var.g(qe6Var) ? 4 : 2) | (x340Var.i(wj31Var) ? 32 : 16) | (x340Var.i(list) ? 256 : 128) | (x340Var.g(rk41Var) ? 2048 : 1024) | (x340Var.e(i) ? 16384 : 8192) | (x340Var.h(z) ? 131072 : 65536) | (x340Var.h(z2) ? 1048576 : 524288) | (x340Var.g(xd6Var) ? 8388608 : 4194304) | (x340Var.g(qim0Var) ? 67108864 : 33554432);
        if (x340Var.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            w2g0.c(d7e.r(0.63117874f, qim0Var, false), (tl3) null, apo.r(-833513741, new qf6(xd6Var, wj31Var, rk41Var, z, z2, i, list, qe6Var), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rf6(qe6Var, wj31Var, list, rk41Var, i, z, z2, xd6Var, qim0Var, i2);
        }
    }
}
