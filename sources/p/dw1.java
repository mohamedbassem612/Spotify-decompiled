package p;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dw1 implements zu30 {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ ow1 d;
    public final /* synthetic */ Set e;
    public final /* synthetic */ gy1 f;
    public final /* synthetic */ boolean g;

    public dw1(List list, int i, Map map, ow1 ow1Var, Set set, gy1 gy1Var, boolean z) {
        this.a = list;
        this.b = i;
        this.c = map;
        this.d = ow1Var;
        this.e = set;
        this.f = gy1Var;
        this.g = z;
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
            pt1 pt1Var = (pt1) this.a.get(iIntValue);
            x340Var2.i0(-1212051455);
            boolean z = pt1Var instanceof nt1;
            nim0 nim0Var = nim0.a;
            Map map = this.c;
            int i2 = this.b;
            if (z) {
                x340Var2.i0(-1212021045);
                nt1 nt1Var = (nt1) pt1Var;
                int i3 = iIntValue + i2;
                String str = (String) map.get(nt1Var.c);
                g9p1.c(i3, nt1Var, str == null ? "" : str, this.d, aqb0.b(aqb0Var, nim0Var, (pxg1) null, (ni20) null, 7), x340Var2, 0);
                x340Var2.r(false);
            } else if (pt1Var instanceof ot1) {
                x340Var2.i0(-1211753732);
                ot1 ot1Var = (ot1) pt1Var;
                int i4 = iIntValue + i2;
                String str2 = (String) map.get(ot1Var.c);
                g9p1.j(i4, ot1Var, this.f, str2 == null ? "" : str2, this.e.contains(ot1Var.a), this.d, aqb0.b(aqb0Var, nim0Var, (pxg1) null, (ni20) null, 7), this.g, x340Var2, 0);
                x340Var2 = x340Var2;
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1211383561);
                x340Var2.r(false);
            }
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
