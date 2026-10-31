package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fwl extends a8d1 implements bv30 {
    public /* synthetic */ k1r a;
    public /* synthetic */ boolean b;
    public /* synthetic */ dlb c;
    public /* synthetic */ int d;

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int iIntValue = ((Number) obj4).intValue();
        fwl fwlVar = new fwl(5, (lnm) obj5);
        fwlVar.a = (k1r) obj;
        fwlVar.b = zBooleanValue;
        fwlVar.c = (dlb) obj3;
        fwlVar.d = iIntValue;
        return fwlVar.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        mmr0 mmr0Var;
        k1r k1rVar = this.a;
        boolean z = this.b;
        dlb dlbVar = this.c;
        int i = this.d;
        hm5.M(obj);
        if (k1rVar instanceof h1r) {
            return new z910(false, dlbVar, 122);
        }
        p8g1 p8g1Var = null;
        if (!(k1rVar instanceof i1r)) {
            return new z910(true, (dlb) null, 126);
        }
        k8g1 k8g1Var = (k8g1) u890.k(k1rVar, (d0r) null, (n4r) null);
        qpe1 qpe1Var = k8g1Var.X;
        qpe1 qpe1Var2 = qpe1.c;
        if (qpe1Var != qpe1Var2 && qpe1Var != qpe1.d) {
            return new z910(false, dlbVar, 122);
        }
        if (z) {
            List list = k8g1Var.i;
            if (!list.isEmpty()) {
                of51 of51Var = (of51) list.get(hxo1.o(list, i, hxl.b));
                if (of51Var instanceof yde1) {
                    yde1 yde1Var = (yde1) of51Var;
                    List list2 = yde1Var.c;
                    String str = yde1Var.b;
                    if (list2.isEmpty() || k8g1Var.X != qpe1Var2) {
                        mmr0Var = new mmr0(Integer.valueOf(str.length()), Integer.valueOf(str.length()));
                    } else {
                        int i2 = ((mbe1) list2.get(hxo1.o(list2, i, gxl.b))).b;
                        int iMin = Math.min(i2 - 1, str.length() - 1);
                        while (iMin >= 0 && str.charAt(iMin) != ' ') {
                            iMin--;
                        }
                        mmr0Var = new mmr0(Integer.valueOf(i2), Integer.valueOf(Math.max(0, iMin + 1)));
                    }
                    p8g1Var = new p8g1(str, ((Number) mmr0Var.a).intValue(), ((Number) mmr0Var.b).intValue(), false);
                } else if (of51Var instanceof j2n0) {
                    String str2 = ((j2n0) of51Var).c;
                    p8g1Var = new p8g1(str2, str2.length(), 0, true);
                }
            }
        }
        p8g1 p8g1Var2 = p8g1Var;
        jno gnoVar = hno.a;
        if (z && p8g1Var2 != null) {
            gnoVar = p8g1Var2.d ? new gno(p8g1Var2.a) : ino.a;
        }
        return new z910(false, gnoVar, dlbVar, z4p1.e(k8g1Var.h), z, p8g1Var2, k8g1Var.X);
    }
}
