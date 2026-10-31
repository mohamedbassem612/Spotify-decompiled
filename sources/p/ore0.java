package p;

import android.util.DisplayMetrics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class ore0 {
    public static final xat a = new xat(DisplayMetrics.DENSITY_DEVICE_STABLE / 160.0f, 1.0f);

    public static final void a(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(152590117);
        int i2 = (x340Var.i(j2iVar) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mod.b(t4k.h.a(a), j2iVar, x340Var, ((i2 << 3) & 112) | 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ak10(j2iVar, i, (byte) 18);
        }
    }
}
