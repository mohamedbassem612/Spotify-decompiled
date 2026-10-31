package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bt20 extends a8d1 implements xu30 {
    public jfe a;
    public p811 b;
    public jfe c;
    public boolean d;
    public /* synthetic */ c9n e;
    public /* synthetic */ vr20 f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ mr20 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public bt20(long j, mr20 mr20Var, lnm lnmVar) {
        super(3, lnmVar);
        this.g = (int) j;
        this.h = mr20Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        bt20 bt20Var = new bt20(this.g, this.h, (lnm) obj3);
        bt20Var.e = (c9n) obj;
        bt20Var.f = (vr20) obj2;
        return bt20Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        p811 p811Var;
        jfe jfeVarQ;
        jfe jfeVar;
        c9n c9nVar = this.e;
        vr20 vr20Var = this.f;
        boolean z = this.d;
        if (!z) {
            hm5.M(obj);
            jfe jfeVarQ2 = jch0.Q(c9nVar, -1, new tya(this.h, (lnm) null, (byte) 6), 1);
            p811Var = new p811();
            jfeVarQ = jch0.Q(c9nVar, 0, new zs20(this.g, null), 1);
            jfeVar = jfeVarQ2;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jfeVarQ = this.c;
            p811Var = this.b;
            jfeVar = this.a;
            hm5.M(obj);
        }
        while (p811Var.a != wqn1.c) {
            ou51 ou51Var = new ou51(getContext());
            ou51Var.g(jfeVar.t(), new piu(p811Var, jfeVarQ, null, (byte) 17));
            ou51Var.g(jfeVarQ.s(), new xr00(p811Var, vr20Var, (lnm) null, (byte) 11));
            this.e = null;
            this.f = vr20Var;
            this.a = jfeVar;
            this.b = p811Var;
            this.c = jfeVarQ;
            this.d = true;
            Object objD = ou51.d(ou51Var, this);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }
}
