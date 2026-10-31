package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class smj1 extends a8d1 implements xu30 {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;
    public final /* synthetic */ tmj1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ rzq e;
    public final /* synthetic */ qxc0 f;
    public final /* synthetic */ ptf1 g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smj1(tmj1 tmj1Var, String str, rzq rzqVar, qxc0 qxc0Var, ptf1 ptf1Var, boolean z, lnm lnmVar) {
        super(3, lnmVar);
        this.c = tmj1Var;
        this.d = str;
        this.e = rzqVar;
        this.f = qxc0Var;
        this.g = ptf1Var;
        this.h = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        ptf1 ptf1Var = this.g;
        boolean z = this.h;
        smj1 smj1Var = new smj1(this.c, this.d, this.e, this.f, ptf1Var, z, (lnm) obj3);
        smj1Var.a = zBooleanValue;
        smj1Var.b = zBooleanValue2;
        return smj1Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        boolean z2 = this.b;
        hm5.M(obj);
        Map map = this.f.X;
        boolean z3 = this.h;
        tmj1 tmj1Var = this.c;
        return tmj1Var.c(this.d, this.e, map, this.g, z2, z, tmj1Var.d(z3));
    }
}
