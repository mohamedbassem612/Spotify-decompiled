package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bu41 extends a8d1 implements vu30 {
    public du41 a;
    public o811 b;
    public long c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ du41 f;
    public final /* synthetic */ o811 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu41(du41 du41Var, o811 o811Var, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.f = du41Var;
        this.g = o811Var;
        this.h = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        bu41 bu41Var = new bu41(this.f, this.g, this.h, lnmVar);
        bu41Var.e = obj;
        return bu41Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((cu41) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        du41 du41Var;
        o811 o811Var;
        du41 du41Var2;
        long j;
        boolean z = this.d;
        qqq0 qqq0Var = qqq0.b;
        if (!z) {
            hm5.M(obj);
            cu41 cu41Var = (cu41) this.e;
            du41Var = this.f;
            y14 y14Var = new y14(du41Var, cu41Var, (byte) 1);
            iq20 iq20Var = du41Var.c;
            o811 o811Var2 = this.g;
            long j2 = o811Var2.a;
            qqq0 qqq0Var2 = du41Var.d;
            long j3 = this.h;
            float fE = du41Var.e(qqq0Var2 == qqq0Var ? qui1.d(j3) : qui1.e(j3));
            this.e = du41Var;
            this.a = du41Var;
            this.b = o811Var2;
            this.c = j2;
            this.d = true;
            obj = iq20Var.a(y14Var, fE, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
            o811Var = o811Var2;
            du41Var2 = du41Var;
            j = j2;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.c;
            o811Var = this.b;
            du41Var = this.a;
            du41Var2 = (du41) this.e;
            hm5.M(obj);
        }
        float fE2 = du41Var2.e(((Number) obj).floatValue());
        o811Var.a = du41Var.d == qqq0Var ? qui1.b(j, 2, fE2, 0.0f) : qui1.b(j, 1, 0.0f, fE2);
        return rih1.a;
    }
}
