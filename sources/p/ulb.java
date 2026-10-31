package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class ulb extends tv30 implements vu30 {
    public static final ulb a = new ulb(2, wlb.class, "mapState", "mapState(Lcom/spotify/audiobookrelease/elements/extras/BookExtrasElement$Props;Lcom/spotify/audiobookrelease/elements/extras/ExternalState;)Lcom/spotify/audiobookrelease/elements/extras/BookExtrasElement$State;", 1);

    public final Object invoke(Object obj, Object obj2) {
        xto nobVar;
        goj0 goj0VarA;
        goj0 goj0VarA2;
        goj0 goj0VarA3;
        ia10 ia10Var = (ia10) obj2;
        dmb dmbVar = wlb.a;
        ioj0 ioj0Var = ia10Var.a;
        String str = ((cmb) obj).a;
        hoj0 hoj0VarC = ioj0Var.c(hll.class, str);
        hll hllVar = (hoj0VarC == null || (goj0VarA3 = hoj0VarC.a()) == null) ? null : (hll) goj0VarA3.a;
        hoj0 hoj0VarC2 = ioj0Var.c(w281.class, str);
        w281 w281Var = (hoj0VarC2 == null || (goj0VarA2 = hoj0VarC2.a()) == null) ? null : (w281) goj0VarA2.a;
        hoj0 hoj0VarC3 = ioj0Var.c(cd8.class, str);
        cd8 cd8Var = (hoj0VarC3 == null || (goj0VarA = hoj0VarC3.a()) == null) ? null : (cd8) goj0VarA.a;
        if (hllVar == null || cd8Var == null) {
            return wlb.a;
        }
        boolean zContains = hllVar.b.contains(ell.b);
        ArrayList arrayList = new ArrayList();
        if (zContains && ia10Var.b) {
            arrayList.add(ylb.a);
        }
        if ((w281Var != null ? nln.s(w281Var) : null) instanceof smb) {
            arrayList.add(new zlb(str));
        }
        amb ambVar = (amb) o7h.s0(arrayList);
        if (ambVar == null) {
            ambVar = xlb.a;
        }
        ArrayList<bd8> arrayList2 = cd8Var.a;
        if (arrayList2.isEmpty()) {
            nobVar = lob.d;
        } else {
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            for (bd8 bd8Var : arrayList2) {
                arrayList3.add(new mob(bd8Var.d, bd8Var.b, bd8Var.a, zContains));
            }
            nobVar = new nob(arrayList3);
        }
        return new dmb(ambVar, nobVar);
    }
}
