package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p7e1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ r7e1 c;
    public final /* synthetic */ nav0 d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7e1(nav0 nav0Var, r7e1 r7e1Var, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.d = nav0Var;
        this.c = r7e1Var;
        this.e = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        boolean z = this.e;
        nav0 nav0Var = this.d;
        r7e1 r7e1Var = this.c;
        switch (b) {
            case 0:
                return new p7e1(nav0Var, r7e1Var, z, lnmVar);
            default:
                return new p7e1(r7e1Var, nav0Var, z, lnmVar);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.e;
        nav0 nav0Var = this.d;
        r7e1 r7e1Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                svh0 svh0Var = new svh0(r7e1Var, z, (byte) 18);
                nea neaVar = new nea(r7e1Var, (byte) 6);
                this.b = true;
                Object objD = s9p1.D(nav0Var, new lhg(svh0Var, neaVar, (lnm) null), this);
                if (objD != d9nVar) {
                    objD = rih1Var;
                }
                return objD == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    return r7e1Var.g(nav0Var, z, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7e1(r7e1 r7e1Var, nav0 nav0Var, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.c = r7e1Var;
        this.d = nav0Var;
        this.e = z;
    }
}
