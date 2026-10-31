package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y4e1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ r7e1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4e1(r7e1 r7e1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = r7e1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        r7e1 r7e1Var = this.c;
        switch (b) {
            case 0:
                return new y4e1(r7e1Var, lnmVar, (byte) 0);
            case 1:
                return new y4e1(r7e1Var, lnmVar, (byte) 1);
            default:
                return new y4e1(r7e1Var, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        r7e1 r7e1Var = this.c;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    if (r7e1Var.y(this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    r7e1Var.getClass();
                    Object objCollect = z4p1.v(rqt0.t(rwq.q(new nea(r7e1Var, (byte) 5)), l7e1.a), 1).collect(new m7e1(r7e1Var, (byte) 0), this);
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    r7e1Var.getClass();
                    Object objCollect2 = rqt0.w(rwq.q(new nea(r7e1Var, (byte) 4)), new p5e1((byte) 8), rqt0.b).collect(new m7e1(r7e1Var, (byte) 1), this);
                    if (objCollect2 != d9nVar) {
                        objCollect2 = rih1Var;
                    }
                    if (objCollect2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
