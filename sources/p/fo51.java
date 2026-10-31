package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fo51 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ jo51 e;
    public final /* synthetic */ mhg1 f;
    public final /* synthetic */ float g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo51(Object obj, Object obj2, jo51 jo51Var, mhg1 mhg1Var, float f, lnm lnmVar) {
        super(2, lnmVar);
        this.c = obj;
        this.d = obj2;
        this.e = jo51Var;
        this.f = mhg1Var;
        this.g = f;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        fo51 fo51Var = new fo51(this.c, this.d, this.e, this.f, this.g, lnmVar);
        fo51Var.b = obj;
        return fo51Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        rih1 rih1Var = rih1.a;
        jo51 jo51Var = this.e;
        if (!z) {
            hm5.M(obj);
            c9n c9nVar = (c9n) this.b;
            Object obj2 = this.c;
            Object obj3 = this.d;
            if (u890.j(obj2, obj3)) {
                jo51Var.P0 = null;
                if (u890.j(jo51Var.d.getValue(), obj2)) {
                    return rih1Var;
                }
            } else {
                jo51Var.x1();
            }
            boolean zJ = u890.j(obj2, obj3);
            float f = this.g;
            if (!zJ) {
                mhg1 mhg1Var = this.f;
                mhg1Var.r(obj2);
                mhg1Var.n(0L);
                jo51Var.c.setValue(obj2);
                mhg1Var.j(f);
            }
            jo51Var.C1(f);
            if (jo51Var.O0.j()) {
                fn31.T(c9nVar, null, 0, new b751(jo51Var, (lnm) null, (byte) 3), 3);
            } else {
                jo51Var.N0 = Long.MIN_VALUE;
            }
            this.a = true;
            Object objF1 = jo51Var.F1(this);
            d9n d9nVar = d9n.a;
            if (objF1 == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        jo51Var.B1();
        return rih1Var;
    }
}
