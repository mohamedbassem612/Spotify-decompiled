package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bkq0 extends klq0 {
    public static final bkq0 c = new bkq0(0, 4, 1);

    public final void a(a9a a9aVar, j06 j06Var, hf91 hf91Var, h72 h72Var, llq0 llq0Var) {
        znm0 znm0Var = (znm0) a9aVar.m(2);
        znm0 znm0Var2 = (znm0) a9aVar.m(3);
        v3k v3kVar = (v3k) a9aVar.m(1);
        ynm0 ynm0VarQ = (ynm0) a9aVar.m(0);
        if (ynm0VarQ == null && (ynm0VarQ = v3kVar.q(znm0Var)) == null) {
            g0k.b("Could not resolve state for movable content");
            jah.d();
            return;
        }
        ze91 ze91VarA = bf91.a(ynm0VarQ.a);
        if (hf91Var.n > 0 || hf91Var.t(hf91Var.t + 1) != 1) {
            g0k.a("Check failed");
        }
        int i = hf91Var.t;
        int i2 = hf91Var.i;
        int i3 = hf91Var.j;
        hf91Var.a(1);
        hf91Var.Q();
        hf91Var.d();
        hf91 hf91VarI = ze91VarA.i();
        try {
            List listK = t2b.k(hf91VarI, 2, hf91Var, false, true, true);
            hf91VarI.e(true);
            hf91Var.j();
            hf91Var.i();
            hf91Var.t = i;
            hf91Var.i = i2;
            hf91Var.j = i3;
            azo1.k(hf91Var, listK, znm0Var2.c);
        } catch (Throwable th) {
            hf91VarI.e(false);
            throw th;
        }
    }
}
