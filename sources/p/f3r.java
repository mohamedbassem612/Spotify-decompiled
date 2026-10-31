package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class f3r {
    public static final zhq0 a = new zhq0((byte) 14);

    public static final xkg0 a(dmh1 dmh1Var, Set set) {
        int size = set.size();
        zhq0 zhq0Var = a;
        ses0 ses0VarA = zhq0Var.a(size);
        try {
            List listL1 = o7h.l1(set);
            int i = 0;
            int i2 = 0;
            for (Object obj : listL1) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    p7h.T();
                    throw null;
                }
                ses0VarA.p(i2, (jh5) obj);
                i2 = i3;
            }
            dmh1Var.b(ses0VarA);
            xkg0 xkg0Var = new xkg0(listL1.size());
            for (Object obj2 : listL1) {
                int i4 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                jh5 jh5Var = (jh5) obj2;
                k3r k3rVarO = ses0VarA.o(i);
                if (k3rVarO != null) {
                    xkg0Var.put(jh5Var, k3rVarO);
                }
                i = i4;
            }
            xkg0 xkg0VarB = xkg0Var.b();
            zhq0Var.q(ses0VarA);
            return xkg0VarB;
        } catch (Throwable th) {
            zhq0Var.q(ses0VarA);
            throw th;
        }
    }

    public static final k3r b(qua0 qua0Var, mqm mqmVar) {
        jh5 jh5Var = new jh5(qua0Var.d(), mqmVar);
        zhq0 zhq0Var = a;
        ses0 ses0VarA = zhq0Var.a(1);
        try {
            ses0VarA.p(0, jh5Var);
            qua0Var.b(ses0VarA);
            k3r k3rVarO = ses0VarA.o(0);
            if (k3rVarO == null) {
                k3rVarO = null;
            }
            return k3rVarO;
        } finally {
            zhq0Var.q(ses0VarA);
        }
    }

    public static final k3r c(dmh1 dmh1Var, jh5 jh5Var) {
        zhq0 zhq0Var = a;
        ses0 ses0VarA = zhq0Var.a(1);
        try {
            ses0VarA.p(0, jh5Var);
            dmh1Var.b(ses0VarA);
            return ses0VarA.o(0);
        } finally {
            zhq0Var.q(ses0VarA);
        }
    }
}
