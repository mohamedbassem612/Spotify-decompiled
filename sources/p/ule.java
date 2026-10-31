package p;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ule {
    public static final o3r a = w3p1.o(new l4r(hvm.c, 1, mle.R0, new j4r(mle.P0), mle.S0), mle.Q0);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(d0r d0rVar, String str, onm onmVar) {
        tle tleVar;
        if (onmVar instanceof tle) {
            tleVar = (tle) onmVar;
            int i = tleVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tleVar.d = i - Integer.MIN_VALUE;
            } else {
                tleVar = new tle(this, onmVar);
            }
        } else {
            tleVar = new tle(this, onmVar);
        }
        Object objJ = tleVar.b;
        int i2 = tleVar.d;
        Object obj = null;
        if (i2 == 0) {
            hm5.M(objJ);
            ay8 ay8VarF = d3p1.F(d0rVar, a, str);
            s4 s4Var = new s4(2, (lnm) null, (byte) 28);
            tleVar.a = str;
            tleVar.d = 1;
            objJ = b5p1.j(ay8VarF, s4Var, tleVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = tleVar.a;
            hm5.M(objJ);
        }
        i1r i1rVar = (k1r) objJ;
        if (!(i1rVar instanceof i1r)) {
            if (i1rVar instanceof h1r) {
                throw rno1.p(((h1r) i1rVar).a);
            }
            if (u890.j(i1rVar, j1r.a)) {
                eg.m("filtered above");
                return null;
            }
            eg.o();
            return null;
        }
        List<pvc0> list = (List) i1rVar.a;
        smc0 smc0VarN = k4p1.n();
        for (pvc0 pvc0Var : list) {
            Map map = pvc0Var.f;
            String str2 = pvc0Var.c;
            String str3 = (String) map.get("list_item_heading");
            if (str3 != null && !str3.equals(obj)) {
                obj = obj;
                obj = obj;
                smc0VarN.add(new xle(str3));
                obj = str3;
            }
            obj = obj;
            obj = obj;
            obj = obj;
            Set set = s4b1.f;
            if (uic.g(str2, blc0.Pg)) {
                smc0VarN.add(new vle(str2, pvc0Var.a));
            }
        }
        return new yle(str, mqo1.A(k4p1.k(smc0VarN)));
    }
}
