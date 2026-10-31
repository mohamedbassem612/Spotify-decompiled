package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pfo0 extends a8d1 implements xu30 {
    public /* synthetic */ tv80 a;
    public final /* synthetic */ rfo0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfo0(rfo0 rfo0Var, int i, int i2, lnm lnmVar) {
        super(3, lnmVar);
        this.b = rfo0Var;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        int i2 = this.d;
        pfo0 pfo0Var = new pfo0(this.b, i, i2, (lnm) obj3);
        pfo0Var.a = (tv80) obj2;
        rih1 rih1Var = rih1.a;
        pfo0Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        tv80 tv80Var = this.a;
        hm5.M(obj);
        Integer num = new Integer(this.c);
        qxm0 qxm0Var = rfo0.h;
        xv61 xv61Var = this.b.c;
        tka0 tka0VarB = rc11.a.b(tfo0.class);
        rih1 rih1Var = rih1.a;
        xv61Var.a(tka0VarB, rih1Var).a(num, Integer.valueOf(this.d), tv80Var);
        return rih1Var;
    }
}
