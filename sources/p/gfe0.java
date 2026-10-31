package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class gfe0 {
    public static final kiv a = new kiv(wce0.N0, (byte) 1);

    public static ven0 a(b0k b0kVar) {
        m4c m4cVar = fkj0.X;
        u601 u601VarC = c(b0kVar);
        x340 x340Var = (x340) b0kVar;
        boolean zG = x340Var.g(u601VarC);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            objT = v8r.q(u601VarC.getValue());
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        boolean zI = x340Var.i(u601VarC) | x340Var.g(ven0Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new q4d0(u601VarC, ven0Var, null, (byte) 28);
            x340Var.s0(objT2);
        }
        qxd0.t(u601VarC, x340Var, (vu30) objT2);
        return ven0Var;
    }

    public static op80 b(b0k b0kVar) {
        return (op80) c(b0kVar).getValue();
    }

    public static u601 c(b0k b0kVar) {
        return (u601) ((x340) b0kVar).k(a);
    }

    public static ely0 d(Function0 function0, b0k b0kVar) {
        q6x q6xVar = (op80) function0.invoke();
        if (q6xVar == null) {
            q6xVar = q6x.b;
        }
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new ien0(q6xVar);
            x340Var.s0(objT);
        }
        ien0 ien0Var = (ien0) objT;
        ien0Var.c(q6xVar);
        return a.a(ien0Var);
    }

    public static ely0 e(u601 u601Var) {
        return a.a(u601Var);
    }
}
