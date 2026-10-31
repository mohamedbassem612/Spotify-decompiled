package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rew0 extends a8d1 implements zu30 {
    public /* synthetic */ vir0 a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ w7u0 d;
    public final /* synthetic */ gfw0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rew0(w7u0 w7u0Var, gfw0 gfw0Var, lnm lnmVar) {
        super(4, lnmVar);
        this.d = w7u0Var;
        this.e = gfw0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        rew0 rew0Var = new rew0(this.d, this.e, (lnm) obj4);
        rew0Var.a = (vir0) obj;
        rew0Var.b = zBooleanValue;
        rew0Var.c = zBooleanValue2;
        return rew0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        vir0 vir0Var = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        hm5.M(obj);
        boolean z3 = false;
        boolean z4 = z2 && j0o1.o(vir0Var, this.d);
        gfw0 gfw0Var = this.e;
        boolean z5 = z4 && !gfw0Var.E;
        gfw0Var.E = z4;
        if (z5 && gfw0Var.K == 1 && gfw0Var.D) {
            gfw0Var.p.m((Object) null, Boolean.TRUE);
        }
        if (z4 && z) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
