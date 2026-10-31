package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m6o1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ q7o1 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ sln1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m6o1(q7o1 q7o1Var, String str, sln1 sln1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = q7o1Var;
        this.e = str;
        this.f = sln1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                m6o1 m6o1Var = new m6o1(this.d, this.e, this.f, lnmVar, (byte) 0);
                m6o1Var.c = obj;
                return m6o1Var;
            default:
                m6o1 m6o1Var2 = new m6o1(this.d, this.e, this.f, lnmVar, (byte) 1);
                m6o1Var2.c = obj;
                return m6o1Var2;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        rvo1 rvo1Var;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    rvo1Var = (rvo1) this.c;
                    this.c = rvo1Var;
                    this.b = (byte) 1;
                    obj = this.d.c(this.f);
                    if (obj != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b2 != 1) {
                    hm5.M(obj);
                    return obj;
                }
                rvo1Var = (rvo1) this.c;
                hm5.M(obj);
                this.c = null;
                this.b = (byte) 2;
                Object objA = ((qwo1) obj).a(rvo1Var.a(), this);
                if (objA != d9nVar) {
                    return objA;
                }
                return d9nVar;
            default:
                byte b3 = this.b;
                q7o1 q7o1Var = this.d;
                try {
                    if (b3 == 0) {
                        hm5.M(obj);
                        zwo1 zwo1Var = (zwo1) this.c;
                        Integer numP = yah0.p(q7o1Var.zza());
                        m6o1 m6o1Var = new m6o1(q7o1Var, this.e, this.f, null, (byte) 0);
                        this.b = (byte) 1;
                        obj = zwo1Var.d(37, numP, m6o1Var, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (b3 != 1) {
                            hm5.M(obj);
                            return (w7o1) obj;
                        }
                        hm5.M(obj);
                    }
                    return (w7o1) obj;
                } catch (Exception e) {
                    this.b = (byte) 2;
                    obj = q7o1Var.a(e);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                }
        }
    }
}
