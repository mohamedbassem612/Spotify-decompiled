package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gjc1 {
    public final kly0 a;
    public final ced0 b;
    public final vjc1 c;
    public final xm41 d;
    public final idd1 e = new idd1(new fjc1(this, (byte) 0));

    public gjc1(kly0 kly0Var, ced0 ced0Var, vjc1 vjc1Var, xm41 xm41Var) {
        this.a = kly0Var;
        this.b = ced0Var;
        this.c = vjc1Var;
        this.d = xm41Var;
    }

    public final boolean a(m9d0... m9d0VarArr) {
        idd1 idd1Var = this.e;
        if (idd1Var.isInitialized() || eth.C(this.d)) {
            Map map = (Map) ((u601) idd1Var.getValue()).getValue();
            for (m9d0 m9d0Var : m9d0VarArr) {
                if (map.get(m9d0Var) instanceof ul10) {
                }
            }
            return true;
        }
        return false;
    }
}
