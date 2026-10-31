package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z14 extends a8d1 implements xu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a24 c;
    public final /* synthetic */ m811 d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z14(a24 a24Var, m811 m811Var, float f, lnm lnmVar) {
        super(3, lnmVar);
        this.c = a24Var;
        this.d = m811Var;
        this.e = f;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m811 m811Var = this.d;
        float f = this.e;
        z14 z14Var = new z14(this.c, m811Var, f, (lnm) obj3);
        z14Var.b = (o24) obj;
        return z14Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        m811 m811Var;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            o24 o24Var = (o24) this.b;
            a24 a24Var = this.c;
            y14 y14Var = new y14(a24Var, o24Var, (byte) 0);
            iq20 iq20Var = a24Var.l1;
            if (iq20Var == null) {
                u890.C("resolvedFlingBehavior");
                throw null;
            }
            m811 m811Var2 = this.d;
            this.b = m811Var2;
            this.a = true;
            obj = iq20Var.a(y14Var, this.e, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
            m811Var = m811Var2;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m811Var = (m811) this.b;
            hm5.M(obj);
        }
        m811Var.a = ((Number) obj).floatValue();
        return rih1.a;
    }
}
