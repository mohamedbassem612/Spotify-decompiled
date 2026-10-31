package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lxj0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ kqi0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lxj0(kqi0 kqi0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = kqi0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        kqi0 kqi0Var = this.c;
        switch (b) {
            case 0:
                return new lxj0(kqi0Var, lnmVar, (byte) 0);
            case 1:
                return new lxj0(kqi0Var, lnmVar, (byte) 1);
            case 2:
                return new lxj0(kqi0Var, lnmVar, (byte) 2);
            default:
                return new lxj0(kqi0Var, lnmVar, (byte) 3);
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
            case 2:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        kqi0 kqi0Var = this.c;
        boolean z = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    f8f0 f8f0Var = new f8f0(((mnk0) kqi0Var.d).a, (byte) 27);
                    this.b = true;
                    obj = b5p1.k(f8f0Var, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 1:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    nxj0 nxj0Var = new nxj0(((roc0) ((koc0) kqi0Var.b)).d(), kqi0Var, z ? (byte) 1 : (byte) 0);
                    this.b = true;
                    obj = b5p1.k(nxj0Var, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                Boolean bool2 = (Boolean) obj;
                return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
            case 2:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    f8f0 f8f0Var2 = new f8f0(((mnk0) kqi0Var.d).a, (byte) 28);
                    this.b = true;
                    obj = b5p1.k(f8f0Var2, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                Boolean bool3 = (Boolean) obj;
                return Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false);
            default:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    nxj0 nxj0Var2 = new nxj0(((roc0) ((koc0) kqi0Var.b)).d(), kqi0Var, b2);
                    this.b = true;
                    obj = b5p1.k(nxj0Var2, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                Boolean bool4 = (Boolean) obj;
                return Boolean.valueOf(bool4 != null ? bool4.booleanValue() : false);
        }
    }
}
