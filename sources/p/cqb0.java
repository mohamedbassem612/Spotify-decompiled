package p;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cqb0 implements Function0 {
    public final /* synthetic */ byte a;
    public final dqb0 b;

    public /* synthetic */ cqb0(dqb0 dqb0Var, byte b) {
        this.a = b;
        this.b = dqb0Var;
    }

    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        byte b = this.a;
        dqb0 dqb0Var = this.b;
        switch (b) {
            case 0:
                return bb11.a(j2h1.s(dqb0Var.b.a).n()).a();
            case 1:
                kf30 kf30VarB = dqb0Var.b();
                cb11 cb11Var = dqb0Var.b;
                o860 o860Var = dqb0Var.a;
                if (kf30VarB == null) {
                    return bkz.b(zjz.e1, cb11Var.toString());
                }
                uw0 uw0Var = (uw0) o860Var.b;
                g6b0 g6b0Var = ((ajm0) uw0Var.X).e;
                String str = j8a0.a;
                heg hegVarF = j8a0.f(kf30VarB);
                beg begVarK = hegVarF != null ? g6b0Var.k(hegVarF.a()) : null;
                if (begVarK == null) {
                    mb11 mb11Var = new mb11(j2h1.s(cb11Var.a).n());
                    lmw lmwVar = (lmw) ((q881) uw0Var.i).b;
                    if (lmwVar == null) {
                        u890.C("resolver");
                        throw null;
                    }
                    begVarK = lmwVar.x(mb11Var);
                    if (begVarK == null) {
                        begVarK = x1p1.j((ajm0) uw0Var.X, new heg(kf30VarB.b(), kf30VarB.a.g()), (poj0) ((zht) uw0Var.g).c().X);
                    }
                }
                return begVarK.m();
            default:
                ArrayList<db11> arrayListB = dqb0Var.b.b();
                ArrayList arrayList = new ArrayList();
                for (db11 db11Var : arrayListB) {
                    ajn0 ajn0Var = db11Var.a;
                    if (ajn0Var == null) {
                        ajn0Var = eia0.b;
                    }
                    sgl sglVarC = dqb0Var.c(db11Var);
                    mmr0 mmr0Var = sglVarC != null ? new mmr0(ajn0Var, sglVarC) : null;
                    if (mmr0Var != null) {
                        arrayList.add(mmr0Var);
                    }
                }
                return sqg0.T(arrayList);
        }
    }
}
