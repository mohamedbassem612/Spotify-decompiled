package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n0p1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fqn1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0p1(fqn1 fqn1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = fqn1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        fqn1 fqn1Var = this.d;
        switch (b) {
            case 0:
                n0p1 n0p1Var = new n0p1(fqn1Var, lnmVar, (byte) 0);
                n0p1Var.c = obj;
                return n0p1Var;
            default:
                n0p1 n0p1Var2 = new n0p1(fqn1Var, lnmVar, (byte) 1);
                n0p1Var2.c = obj;
                return n0p1Var2;
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
        fqn1 fqn1Var = this.d;
        nwo1 nwo1Var = d9n.a;
        switch (b) {
            case 0:
                byte b2 = this.b;
                if (b2 != 0) {
                    if (b2 != 1) {
                        hm5.M(obj);
                    } else {
                        zwo1Var = (zwo1) this.c;
                        hm5.M(obj);
                    }
                    return (sln1) obj;
                }
                hm5.M(obj);
                zwo1Var = (zwo1) this.c;
                uyo1 uyo1VarG = fqn1Var.g();
                this.c = zwo1Var;
                this.b = (byte) 1;
                obj = f0p1.f(uyo1VarG);
                if (obj == nwo1Var) {
                    return nwo1Var;
                }
                this.c = null;
                this.b = (byte) 2;
                obj = ((qwo1) obj).a(zwo1Var, this);
                if (obj == nwo1Var) {
                    return nwo1Var;
                }
                return (sln1) obj;
            default:
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    zwo1Var2 = (zwo1) this.c;
                    z0i1 z0i1Var = new z0i1(fqn1Var, zwo1Var2, (lnm) null, (byte) 10);
                    this.c = zwo1Var2;
                    this.b = (byte) 1;
                    nwo1 nwo1Var2 = new nwo1(75, z0i1Var, (Integer) null);
                    if (nwo1Var2 != nwo1Var) {
                        obj = nwo1Var2;
                    }
                    return nwo1Var;
                }
                if (b3 != 1) {
                    hm5.M(obj);
                    return obj;
                }
                zwo1Var2 = (zwo1) this.c;
                hm5.M(obj);
                this.c = null;
                this.b = (byte) 2;
                Object objA = ((nwo1) obj).a(zwo1Var2, this);
                if (objA != nwo1Var) {
                    return objA;
                }
                return nwo1Var;
        }
    }
}
