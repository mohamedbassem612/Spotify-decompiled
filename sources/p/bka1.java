package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class bka1 {
    public static final kiv a = new kiv(gr81.W0, (byte) 1);

    public static final kiv a() {
        return a;
    }

    public static final void b(zja1 zja1Var, aka1 aka1Var, fw80 fw80Var) {
        Object objM0;
        rvt0 rvt0Var;
        List list = (List) aka1Var.a.get(fw80Var);
        if (list == null) {
            rvt0Var = null;
        } else {
            List list2 = list;
            cqz0 cqz0Var = dqz0.a;
            if (list2.isEmpty()) {
                objM0 = null;
            } else {
                objM0 = o7h.m0(list2, dqz0.b.g(list2.size()));
            }
            rvt0Var = (rvt0) objM0;
        }
        if (rvt0Var == null || (zja1Var.a.b.getValue() instanceof ngn0)) {
            return;
        }
        fn31.T(zja1Var.e, (o8n) null, 0, new sb91(zja1Var, rvt0Var, (lnm) null, (byte) 14), 3);
    }
}
