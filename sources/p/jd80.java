package p;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jd80 implements dmh1 {
    public final dmh1 a;
    public final m4e0 b = new m4e0(1);
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public jd80(dmh1 dmh1Var) {
        this.a = dmh1Var;
        new ArrayDeque();
        new ArrayDeque();
    }

    public final void b(ses0 ses0Var) {
        j3r j3rVar;
        Map map = (Map) this.b.b;
        long jK = ses0Var.k();
        try {
            int i = ses0Var.a;
            for (int i2 = 0; i2 < i; i2++) {
                if (ses0Var.h(i2) != null && ses0Var.o(i2) != null) {
                    ses0Var.d(i2);
                }
            }
            this.a.b(ses0Var);
            int i3 = ses0Var.a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (ses0Var.g(i4)) {
                    jh5 jh5VarH = ses0Var.h(i4);
                    jh5VarH.getClass();
                    Object obj = map.get(jh5VarH);
                    j3rVar = obj != null ? new j3r(obj) : null;
                    if (j3rVar != null) {
                        ses0Var.n(i4, j3rVar);
                    }
                } else {
                    ses0Var.a();
                    ses0Var.b(i4);
                    k3r k3rVar = ses0Var.c[i4];
                    if ((ses0Var.b[i4] == null || k3rVar == null || (k3rVar instanceof j3r) || ses0Var.f(i4)) ? false : true) {
                        jh5 jh5VarH2 = ses0Var.h(i4);
                        jh5VarH2.getClass();
                        ses0Var.o(i4);
                        Object obj2 = map.get(jh5VarH2);
                        j3rVar = obj2 != null ? new j3r(obj2) : null;
                        if (j3rVar != null) {
                            ses0Var.a();
                            ses0Var.b(i4);
                            k3r[] k3rVarArr = ses0Var.c;
                            k3r k3rVar2 = k3rVarArr[i4];
                            if (ses0Var.b[i4] == null || k3rVar2 == null || ses0Var.f(i4)) {
                                bhn0.f(gvg.e(i4, "Position ", " is not visible and resolved"));
                            } else if (!(k3rVar2 instanceof j3r)) {
                                k3rVarArr[i4] = j3rVar;
                            }
                        }
                    }
                }
            }
        } finally {
            ses0Var.i(jK);
        }
    }

    public final cmh1 c(iu30 iu30Var) {
        id80 id80Var = new id80(this, iu30Var);
        this.c.add(id80Var);
        return id80Var;
    }

    public final yla1 e() {
        return this.a.e();
    }
}
