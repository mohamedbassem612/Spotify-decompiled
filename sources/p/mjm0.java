package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mjm0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l811 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mjm0(l811 l811Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = l811Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        l811 l811Var = this.b;
        switch (b) {
            case 0:
                return new mjm0(l811Var, lnmVar, (byte) 0);
            default:
                return new mjm0(l811Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((mjm0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((mjm0) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                hm5.M(obj);
                this.b.a = false;
                synchronized (pv91.c) {
                    oen0 oen0Var = ((ten0) pv91.j).h;
                    z = oen0Var != null && oen0Var.h();
                }
                if (z) {
                    pv91.c();
                }
                return rih1.a;
            default:
                hm5.M(obj);
                return Boolean.valueOf(!this.b.a);
        }
    }
}
