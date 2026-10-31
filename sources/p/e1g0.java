package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e1g0 {
    public static final bma1 e = bma1.b.q("MainLayout_nowPlayingViewMode");
    public static final c7p0 f;
    public static final Map g;
    public final ynb0 a;
    public final boolean b;
    public final idd1 c = new idd1(new tzf0(this, (byte) 4));
    public final idd1 d = new idd1(new cc00(this, (byte) 25));

    static {
        c7p0 c7p0Var = c7p0.b;
        f = c7p0Var;
        g = sqg0.J(oqn1.n(0, c7p0.a), oqn1.n(1, c7p0Var));
    }

    public e1g0(ynb0 ynb0Var, boolean z) {
        this.a = ynb0Var;
        this.b = z;
    }

    public final void a(c7p0 c7p0Var) {
        Integer numValueOf;
        Iterator it = g.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                numValueOf = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            c7p0 c7p0Var2 = (c7p0) entry.getValue();
            numValueOf = Integer.valueOf(iIntValue);
            if (c7p0Var2 != c7p0Var) {
                numValueOf = null;
            }
        } while (numValueOf == null);
        if (numValueOf != null) {
            int iIntValue2 = numValueOf.intValue();
            hma1 hma1VarEdit = ((dma1) this.a.get()).edit();
            hma1VarEdit.b(e, iIntValue2);
            hma1VarEdit.g();
        }
        bpb1 bpb1Var = (bpb1) ((wen0) this.c.getValue());
        bpb1Var.getClass();
        bpb1Var.m(null, c7p0Var);
    }
}
