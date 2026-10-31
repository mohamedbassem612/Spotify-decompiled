package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qk9 implements zu30 {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ al9 c;
    public final /* synthetic */ jl9 d;
    public final /* synthetic */ d0r e;

    public qk9(List list, int i, al9 al9Var, jl9 jl9Var, d0r d0rVar) {
        this.a = list;
        this.b = i;
        this.c = al9Var;
        this.d = jl9Var;
        this.e = d0rVar;
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
            yq9 yq9Var = (yq9) this.a.get(iIntValue);
            x340Var2.i0(1215313803);
            boolean z = iIntValue == this.b;
            String str = yq9Var.a;
            long j = yq9Var.b;
            jp9 jp9Var = this.d.b;
            vk9 vk9Var = new vk9(j, str, z, (jp9Var != null ? jp9Var.c : 0) == 2 && z);
            tv80 tv80Var = al9.i;
            i1o1.e(this.c, vk9Var, this.e, (qim0) null, (ipb1) null, (vu30) null, (xu30) null, 0, (xu30) null, x340Var2, 8, 252);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
