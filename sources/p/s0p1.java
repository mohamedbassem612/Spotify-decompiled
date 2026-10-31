package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s0p1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yln1 d;
    public final /* synthetic */ fqn1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0p1(yln1 yln1Var, fqn1 fqn1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = yln1Var;
        this.e = fqn1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        fqn1 fqn1Var = this.e;
        yln1 yln1Var = this.d;
        switch (b) {
            case 0:
                s0p1 s0p1Var = new s0p1(fqn1Var, yln1Var, lnmVar);
                s0p1Var.c = obj;
                return s0p1Var;
            default:
                s0p1 s0p1Var2 = new s0p1(yln1Var, fqn1Var, lnmVar);
                s0p1Var2.c = obj;
                return s0p1Var2;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zwo1 zwo1Var = (zwo1) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(zwo1Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        zwo1 zwo1Var;
        zwo1 zwo1Var2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    zwo1 zwo1Var3 = (zwo1) this.c;
                    azn1 azn1Var = new azn1(this.e, this.d, zwo1Var3, null, (byte) 6);
                    this.c = zwo1Var3;
                    this.b = (byte) 1;
                    obj = new nwo1(74, azn1Var, (Integer) null);
                    if (obj != d9nVar) {
                        zwo1Var = zwo1Var3;
                    }
                    return d9nVar;
                }
                if (b2 != 1) {
                    hm5.M(obj);
                    return rih1Var;
                }
                zwo1Var = (zwo1) this.c;
                hm5.M(obj);
                this.c = null;
                this.b = (byte) 2;
                if (((nwo1) obj).a(zwo1Var, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    zwo1Var2 = (zwo1) this.c;
                    rln1 rln1VarC = sln1.C();
                    yln1 yln1Var = this.d;
                    rln1VarC.h(yln1Var.A().y());
                    rln1VarC.l(yln1Var.C().x());
                    rln1VarC.i(yln1Var.A().A());
                    rln1VarC.j(yln1Var.A().B());
                    rln1VarC.k(yln1Var.A().C());
                    sln1 sln1VarE = rln1VarC.e();
                    uyo1 uyo1VarG = this.e.g();
                    this.c = zwo1Var2;
                    this.b = (byte) 1;
                    obj = f0p1.d(uyo1VarG, sln1VarE);
                    if (obj != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    hm5.M(obj);
                    return rih1Var;
                }
                zwo1Var2 = (zwo1) this.c;
                hm5.M(obj);
                this.c = null;
                this.b = (byte) 2;
                if (((nwo1) obj).a(zwo1Var2, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0p1(fqn1 fqn1Var, yln1 yln1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = fqn1Var;
        this.d = yln1Var;
    }
}
