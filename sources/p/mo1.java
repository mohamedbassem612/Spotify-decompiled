package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mo1 extends a8d1 implements dv30 {
    public /* synthetic */ pia1 a;
    public /* synthetic */ String b;
    public /* synthetic */ String c;
    public /* synthetic */ List d;
    public /* synthetic */ Set e;
    public final /* synthetic */ so1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo1(so1 so1Var, lnm lnmVar) {
        super(6, lnmVar);
        this.f = so1Var;
    }

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        mo1 mo1Var = new mo1(this.f, (lnm) obj6);
        mo1Var.a = (pia1) obj;
        mo1Var.b = (String) obj2;
        mo1Var.c = (String) obj3;
        mo1Var.d = (List) obj4;
        mo1Var.e = (Set) obj5;
        return mo1Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        pia1 pia1Var = this.a;
        String str = this.b;
        String str2 = this.c;
        List list = this.d;
        Set set = this.e;
        hm5.M(obj);
        so1 so1Var = this.f;
        so1Var.e1 = set;
        hy1 hy1Var = so1Var.i;
        hy1Var.g(list);
        hy1Var.h(pia1Var, str);
        hy1Var.f(str2);
        return hy1Var;
    }
}
