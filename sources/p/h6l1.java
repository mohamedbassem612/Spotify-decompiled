package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h6l1 implements f4r {
    public static final h6l1 a = new h6l1();

    @Override // p.f4r
    public final f1r a(Object obj) {
        List<e6l1> listF = ((f6l1) obj).f();
        ArrayList arrayList = new ArrayList();
        for (e6l1 e6l1Var : listF) {
            smc0 smc0VarN = k4p1.n();
            if (e6l1Var.a() != null) {
                smc0VarN.add(new e1r(new jh5(new xv00(rc11.a.b(bbl1.class)), e6l1Var.a()), 3, v5l1.h));
            }
            smc0VarN.add(new e1r(new jh5(new xv00(rc11.a.b(bbl1.class)), e6l1Var.b()), 3, v5l1.i));
            r7h.W(k4p1.k(smc0VarN), arrayList);
        }
        return new hoc0(arrayList, false);
    }
}
