package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gkr0 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jkr0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ fe5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkr0(jkr0 jkr0Var, int i, float f, fe5 fe5Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = jkr0Var;
        this.d = i;
        this.e = f;
        this.f = fe5Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        gkr0 gkr0Var = new gkr0(this.c, this.d, this.e, this.f, lnmVar);
        gkr0Var.b = obj;
        return gkr0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((bs41) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        boolean z = this.a;
        rih1 rih1Var = rih1.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        bs41 bs41Var = (bs41) this.b;
        jkr0 jkr0Var = this.c;
        zjr0 zjr0Var = new zjr0(bs41Var, jkr0Var);
        this.a = true;
        kkr0 kkr0Var = lkr0.a;
        int i2 = this.d;
        jkr0Var.q.t(jkr0Var.j(new Integer(i2).intValue()));
        boolean z2 = i2 > jkr0Var.e;
        int iB = (zjr0Var.b() - jkr0Var.e) + 1;
        if (((z2 && i2 > zjr0Var.b()) || (!z2 && i2 < jkr0Var.e)) && Math.abs(i2 - jkr0Var.e) >= 3) {
            if (z2) {
                i = i2 - iB;
                int i3 = jkr0Var.e;
                if (i < i3) {
                    i = i3;
                }
            } else {
                int i4 = iB + i2;
                i = jkr0Var.e;
                if (i4 <= i) {
                    i = i4;
                }
            }
            zjr0Var.c(i, 0);
        }
        Object objT = wwo1.t(0.0f, zjr0Var.e(i2) + this.e, this.f, new f14(new m811(), (bs41) zjr0Var, (byte) 23), this, 4);
        d9n d9nVar = d9n.a;
        if (objT != d9nVar) {
            objT = rih1Var;
        }
        return objT == d9nVar ? d9nVar : rih1Var;
    }
}
