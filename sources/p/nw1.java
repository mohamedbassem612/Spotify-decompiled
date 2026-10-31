package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class nw1 {
    public static final mj11 a = new mj11(wy71.a, null, null, 30);

    public static final fu1 a(av1 av1Var, so1 so1Var, tx4 tx4Var, fo1 fo1Var, ma61 ma61Var, boolean z) {
        fo1 fo1VarL;
        gy1 gy1Var = av1Var.i;
        if (fo1Var == null) {
            zu1 zu1Var = av1Var.b;
            List listN = p7h.N(zu1Var != null ? new yv51(zu1Var.a, zu1Var.b) : null);
            tu1 tu1Var = new tu1();
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                tu1Var = new p030((yv51) it.next()).N(tu1Var);
            }
            fo1VarL = s8p1.l(tu1Var);
        } else {
            fo1VarL = fo1Var;
        }
        String str = (String) so1Var.V0.getValue();
        bpb1 bpb1Var = so1Var.Y0;
        pia1 pia1VarA = so1Var.d.a(so1Var.S0);
        boolean z2 = av1Var.g;
        ma61 ma61Var2 = ma61Var == null ? new ma61(new stu0(av1Var.f), new ttu0(av1Var.h), 124) : ma61Var;
        boolean zF = tx4Var.f();
        fg91 fg91Var = fg91.b;
        w7x w7xVar = w7x.a;
        fu1 fu1Var = new fu1(str, fo1VarL, true, 0L, 1, false, z2, ma61Var2, pia1VarA, z, fg91Var, fg91Var, gy1Var, zF, false, w7xVar, false, tka1.a, w7xVar);
        yv51 yv51Var = (yv51) fo1VarL.b.get("atp");
        String str2 = yv51Var != null ? yv51Var.a : null;
        if (!u890.j((String) bpb1Var.getValue(), str2)) {
            so1Var.O0.d((String) bpb1Var.getValue(), str2);
            bpb1Var.l(str2);
        }
        return fu1Var;
    }
}
