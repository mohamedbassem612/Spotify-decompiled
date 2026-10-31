package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y940 implements x940 {
    public final npj0 a;
    public final zpj0 b;

    public y940(npj0 npj0Var, zpj0 zpj0Var) {
        this.a = npj0Var;
        this.b = zpj0Var;
    }

    @Override // p.x940
    public final void record(double d) {
        double d2;
        zpj0 zpj0Var = this.b;
        String str = this.a.a;
        long jLongValue = ((Number) zpj0Var.a.invoke()).longValue();
        synchronized (zpj0Var.m) {
            a6e a6eVarK = zpj0Var.j.k(str);
            if (a6eVarK != null) {
                if (a6eVarK.b()) {
                    d2 = d;
                    zpj0Var.k.u(str, d2, jLongValue);
                } else {
                    d2 = d;
                }
                z6x z6xVar = (List) zpj0Var.g.get(str);
                if (z6xVar == null) {
                    z6xVar = z6x.a;
                }
                Iterator it = z6xVar.iterator();
                while (it.hasNext()) {
                    ((mqj0) it.next()).i(d2);
                }
            }
        }
    }
}
