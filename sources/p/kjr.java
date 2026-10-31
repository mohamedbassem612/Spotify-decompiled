package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kjr {
    public static final kjr a = new kjr();

    public final void a(yu3 yu3Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1565826668);
        int i2 = (x340Var.g(yu3Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            anm1.a((Function0) yu3Var.b, (i3u) yu3Var.d, apo.r(1163527043, new x94(yu3Var, (byte) 2), x340Var), x340Var, 384, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f14(this, yu3Var, i, (byte) 8);
        }
    }
}
