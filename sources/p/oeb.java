package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oeb extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ lz20 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oeb(boolean z, md80 md80Var, boolean z2, lz20 lz20Var, lz20 lz20Var2, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.g = md80Var;
        this.c = z2;
        this.d = lz20Var;
        this.h = lz20Var2;
        this.e = ven0Var;
        this.f = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                ven0 ven0Var = this.e;
                ven0 ven0Var2 = this.f;
                return new oeb(this.b, (md80) obj3, this.c, this.d, (lz20) obj2, ven0Var, ven0Var2, lnmVar);
            default:
                ven0 ven0Var3 = this.f;
                return new oeb(this.c, this.d, (k6a1) obj3, this.e, (crl1) obj2, ven0Var3, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.g;
        lz20 lz20Var = this.d;
        Object obj3 = this.h;
        boolean z = this.c;
        ven0 ven0Var = this.e;
        ven0 ven0Var2 = this.f;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                hm5.M(obj);
                boolean z2 = this.b;
                md80 md80Var = z2 ? (md80) obj2 : (md80) ven0Var.getValue();
                if (md80Var != ((md80) ven0Var2.getValue())) {
                    return rih1Var;
                }
                if (((md80) ven0Var2.getValue()) == md80.c && (z || z2)) {
                    return rih1Var;
                }
                int i = md80Var == null ? -1 : neb.a[md80Var.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        lz20.b(lz20Var);
                    } else {
                        if (i != 2) {
                            eg.o();
                            return null;
                        }
                        lz20.b((lz20) obj3);
                    }
                }
                ven0Var.setValue((Object) null);
                return rih1Var;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    if (!z) {
                        return rih1Var;
                    }
                    float f = phg.c;
                    if (((Boolean) ven0Var.getValue()).booleanValue()) {
                        return rih1Var;
                    }
                    ven0Var.setValue(Boolean.TRUE);
                    m441 m441VarQ = rwq.q(new lwe((crl1) obj3, (byte) 20));
                    nw5 nw5Var = new nw5(2, (lnm) null, (byte) 5);
                    this.b = true;
                    Object objJ = b5p1.j(m441VarQ, nw5Var, this);
                    d9n d9nVar = d9n.a;
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                float f2 = phg.c;
                c8e1 c8e1Var = (c8e1) ven0Var2.getValue();
                int length = ((c8e1) ven0Var2.getValue()).a.b.length();
                ven0Var2.setValue(c8e1.a(c8e1Var, (af5) null, e6p1.e(length, length), 5));
                lz20.b(lz20Var);
                b6t b6tVar = (k6a1) obj2;
                if (b6tVar == null) {
                    return rih1Var;
                }
                b6tVar.b();
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oeb(boolean z, lz20 lz20Var, k6a1 k6a1Var, ven0 ven0Var, crl1 crl1Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.c = z;
        this.d = lz20Var;
        this.g = k6a1Var;
        this.e = ven0Var;
        this.h = crl1Var;
        this.f = ven0Var2;
    }
}
