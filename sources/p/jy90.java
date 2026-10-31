package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class jy90 {
    public static final List a = p7h.M(new gbl[]{gbl.X, gbl.Y});

    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    public static iy90 a(hy90 hy90Var) {
        yx90 yx90Var;
        ay90 xx90Var;
        jeh0 jeh0Var = hy90Var.c;
        gbl gblVar = hy90Var.b;
        int i = hy90Var.d;
        vo90 vo90Var = hy90Var.a;
        boolean z = false;
        boolean z2 = jeh0Var != null;
        List list = a;
        if (i == 0 && vo90Var != null && list.contains(gblVar)) {
            z = true;
        }
        if (z2 && !z) {
            xx90Var = zx90.a;
        } else if (!z2 && z) {
            xx90Var = new xx90(new jeh0(vo90Var));
        } else if (z2 && u890.j(vo90Var, jeh0Var.a)) {
            xx90Var = null;
        } else if (z2 && z) {
            xx90Var = new xx90(new jeh0(vo90Var));
        } else if (vo90Var == null) {
            xx90Var = null;
        } else {
            String str = vo90Var.c;
            if (i != 0) {
                yx90Var = new yx90(str, i);
            } else if (list.contains(gblVar)) {
                xx90Var = null;
            } else {
                yx90Var = new yx90(str, 1);
            }
            xx90Var = yx90Var;
        }
        return new iy90(hy90Var, xx90Var);
    }
}
