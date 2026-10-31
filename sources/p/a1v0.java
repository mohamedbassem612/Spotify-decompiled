package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a1v0 extends a8d1 implements zu30 {
    public /* synthetic */ List a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ j1v0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1v0(j1v0 j1v0Var, lnm lnmVar) {
        super(4, lnmVar);
        this.d = j1v0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        a1v0 a1v0Var = new a1v0(this.d, (lnm) obj4);
        a1v0Var.a = (List) obj;
        a1v0Var.b = iIntValue;
        a1v0Var.c = iIntValue2;
        return a1v0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        List list = this.a;
        int i = this.b;
        int i2 = this.c;
        hm5.M(obj);
        int size = list.size();
        int i3 = i2 - (i + this.d.l);
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = size - i3;
        int size2 = list.size();
        if (i4 > size2) {
            i4 = size2;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        return list.subList(0, i4);
    }
}
