package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rs71 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ rzq c;
    public final /* synthetic */ mzr0 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rs71(rzq rzqVar, mzr0 mzr0Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = rzqVar;
        this.d = mzr0Var;
        this.e = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new rs71(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new rs71(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        String str = this.e;
        mzr0 mzr0Var = this.d;
        rzq rzqVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                n4r n4rVarA = ((a5m) mzr0Var.d).a.a(new g1q0(str));
                qi71 qi71Var = qi71.Y0;
                this.b = true;
                Object objL = q3p1.l(rzqVar, n4rVarA, qi71Var, x4m.a, this);
                return objL == d9nVar ? d9nVar : objL;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                n4r n4rVarA2 = ((o3r) ((lc20) mzr0Var.f).d).a(new g1q0(str));
                qi71 qi71Var2 = qi71.Z0;
                this.b = true;
                Object objL2 = q3p1.l(rzqVar, n4rVarA2, qi71Var2, q840.a, this);
                return objL2 == d9nVar ? d9nVar : objL2;
        }
    }
}
