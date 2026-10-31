package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zv91 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vu30 d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zv91(vu30 vu30Var, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = vu30Var;
        this.e = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                zv91 zv91Var = new zv91(this.d, this.e, lnmVar, (byte) 0);
                zv91Var.c = obj;
                return zv91Var;
            case 1:
                zv91 zv91Var2 = new zv91(this.d, this.e, lnmVar, (byte) 1);
                zv91Var2.c = obj;
                return zv91Var2;
            default:
                zv91 zv91Var3 = new zv91(this.d, this.e, lnmVar, (byte) 2);
                zv91Var3.c = obj;
                return zv91Var3;
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
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.e;
        vu30 vu30Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    psw0 psw0Var = new psw0(ven0Var, ((c9n) this.c).J());
                    this.b = true;
                    return vu30Var.invoke(psw0Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    psw0 psw0Var2 = new psw0(ven0Var, ((c9n) this.c).J());
                    this.b = true;
                    return vu30Var.invoke(psw0Var2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    psw0 psw0Var3 = new psw0(ven0Var, ((c9n) this.c).J());
                    this.b = true;
                    return vu30Var.invoke(psw0Var3, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
