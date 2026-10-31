package p;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface qsk {
    static eqq0 B(qsk qskVar, qsk qskVar2) {
        if (qskVar == null && qskVar2 == null) {
            return eqq0.a();
        }
        xdn0 xdn0VarN = qskVar2 != null ? xdn0.n(qskVar2) : xdn0.d();
        if (qskVar != null) {
            Iterator it = qskVar.c().iterator();
            while (it.hasNext()) {
                o(xdn0VarN, qskVar2, qskVar, (sy8) it.next());
            }
        }
        return eqq0.b(xdn0VarN);
    }

    static void o(xdn0 xdn0Var, qsk qskVar, qsk qskVar2, sy8 sy8Var) {
        if (!Objects.equals(sy8Var, cx70.U)) {
            xdn0Var.s(sy8Var, qskVar2.i(sy8Var), qskVar2.e(sy8Var));
            return;
        }
        ft21 ft21Var = (ft21) qskVar2.h(sy8Var, null);
        xdn0Var.s(sy8Var, qskVar2.i(sy8Var), dro.G((ft21) qskVar.h(sy8Var, null), ft21Var));
    }

    Set c();

    Object e(sy8 sy8Var);

    void f(uk4 uk4Var);

    boolean g(sy8 sy8Var);

    Object h(sy8 sy8Var, Object obj);

    osk i(sy8 sy8Var);

    Object j(sy8 sy8Var, osk oskVar);

    Set k(sy8 sy8Var);
}
