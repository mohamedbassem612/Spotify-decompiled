package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d4n0 implements zu30 {
    public final /* synthetic */ List a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ iu30 c;

    public d4n0(List list, Set set, iu30 iu30Var) {
        this.a = list;
        this.b = set;
        this.c = iu30Var;
    }

    @Override // p.zu30
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= x340Var.e(iIntValue) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 147) != 146)) {
            xi40 xi40Var = (xi40) this.a.get(iIntValue);
            x340Var2.i0(-61095820);
            boolean zContains = this.b.contains(new f3n0(xi40Var.a));
            iu30 iu30Var = this.c;
            boolean zG = x340Var2.g(iu30Var) | x340Var2.g(xi40Var);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new uah0(iu30Var, xi40Var, (byte) 29);
                x340Var2.s0(objT);
            }
            poo1.g(zContains, (iu30) objT, new nex(6), yoo1.z(x340Var2), (qim0) null, 0, (qex) null, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(-123966152, new fhk0(xi40Var, (byte) 9), x340Var2), x340Var2, 0, 196608, 32752);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
