package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k14 extends a8d1 implements zu30 {
    public boolean a;
    public /* synthetic */ n24 b;
    public /* synthetic */ zmg0 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ s24 e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k14(s24 s24Var, float f, lnm lnmVar) {
        super(4, lnmVar);
        this.e = s24Var;
        this.f = f;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        k14 k14Var = new k14(this.e, this.f, (lnm) obj4);
        k14Var.b = (n24) obj;
        k14Var.c = (zmg0) obj2;
        k14Var.d = obj3;
        return k14Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            n24 n24Var = this.b;
            float fD = this.c.d(this.d);
            if (!Float.isNaN(fD)) {
                m811 m811Var = new m811();
                s24 s24Var = this.e;
                float fS = Float.isNaN(((drr0) s24Var.Y).s()) ? 0.0f : ((drr0) s24Var.Y).s();
                m811Var.a = fS;
                fe5 fe5Var = ((vy71) ((ww21) s24Var.d).b).d;
                j14 j14Var = new j14(n24Var, m811Var, (byte) 0);
                this.b = null;
                this.c = null;
                this.a = true;
                Object objR = wwo1.r(fS, fD, this.f, fe5Var, j14Var, this);
                d9n d9nVar = d9n.a;
                if (objR == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
