package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l3m implements zu30 {
    public final /* synthetic */ List a;
    public final /* synthetic */ d0r b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ vky f;

    public l3m(List list, d0r d0rVar, int i, String str, iu30 iu30Var, vky vkyVar) {
        this.a = list;
        this.b = d0rVar;
        this.c = i;
        this.d = str;
        this.e = iu30Var;
        this.f = vkyVar;
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
            hby hbyVar = (hby) this.a.get(iIntValue);
            x340Var2.i0(-16120011);
            bqn1.h(iIntValue, hbyVar, this.b, this.c, this.d, this.e, this.f, x340Var2, ((i & 126) >> 3) & 14);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
