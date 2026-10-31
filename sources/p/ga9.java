package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ga9 implements zu30 {
    public final /* synthetic */ List a;
    public final /* synthetic */ q2c1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public ga9(List list, q2c1 q2c1Var, boolean z, boolean z2, boolean z3) {
        this.a = list;
        this.b = q2c1Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

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
            s2c1 s2c1Var = (s2c1) this.a.get(iIntValue);
            x340Var2.i0(637443902);
            otw.c(this.b, new p2c1(s2c1Var, iIntValue, this.c, this.d, this.e), (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
