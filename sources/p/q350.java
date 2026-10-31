package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q350 {
    public final yqg a;
    public final k2i b;
    public final yrd0 c;

    public q350(yqg yqgVar, k2i k2iVar, yrd0 yrd0Var) {
        this.a = yqgVar;
        this.b = k2iVar;
        this.c = yrd0Var;
    }

    public final af5 a(int i, Function0 function0, x340 x340Var) {
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = new q811();
            x340Var.s0(objT);
        }
        q811 q811Var = (q811) objT;
        String strO0 = cwl1.o0(x340Var, 2131956297);
        String strN0 = cwl1.n0(i, new Object[]{strO0}, x340Var);
        int iW0 = ihc1.w0(strN0, strO0, 0, false, 6);
        int length = strO0.length() + iW0;
        x340Var.i0(1859675760);
        ye5 ye5Var = new ye5();
        ye5Var.f(strN0.subSequence(0, iW0));
        boolean zI = x340Var.i(this) | x340Var.i(q811Var) | x340Var.g(function0);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new djx(this, q811Var, function0, (byte) 29);
            x340Var.s0(objT2);
        }
        vhg.b(ye5Var, strO0, "link", (iu30) objT2);
        ye5Var.f(strN0.subSequence(length, strN0.length()));
        af5 af5VarP = ye5Var.p();
        x340Var.r(false);
        return af5VarP;
    }

    public final void b() {
        k2i k2iVar = this.b;
        z7a z7aVar = k2iVar.b;
        if (z7aVar != null) {
            z7aVar.a();
        }
        k2iVar.b = null;
    }

    public final void c(Function0 function0, p350 p350Var) {
        yrd0 yrd0Var = this.c;
        yrd0Var.a.f(yrd0Var.c.h().e(), null);
        this.b.c(new c8a(2131956289), 2131956288, new o350(new y0u(yrd0Var, (byte) 29), function0, (byte) 0), p350Var != null ? new o350(new p350(yrd0Var, (byte) 0), p350Var, (byte) 0) : null);
    }

    public final void d(Function0 function0, p350 p350Var) {
        yrd0 yrd0Var = this.c;
        yrd0Var.a.f(yrd0Var.c.j().e(), null);
        this.b.c(new c8a(2131956305), 2131956304, new o350(new p350(yrd0Var, (byte) 2), function0, (byte) 0), p350Var != null ? new o350(new p350(yrd0Var, (byte) 3), p350Var, (byte) 0) : null);
    }
}
