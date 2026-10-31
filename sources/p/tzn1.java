package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tzn1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public rvo1 b;
    public byte c;
    public final /* synthetic */ rvo1 d;
    public final /* synthetic */ u9c e;
    public final /* synthetic */ long f;
    public final /* synthetic */ yln1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tzn1(rvo1 rvo1Var, u9c u9cVar, long j, yln1 yln1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = rvo1Var;
        this.e = u9cVar;
        this.f = j;
        this.g = yln1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new tzn1(this.d, this.e, this.f, this.g, lnmVar, (byte) 0);
            default:
                return new tzn1(this.d, this.e, this.f, this.g, lnmVar, (byte) 1);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
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
        Object qwo1Var;
        Object objC;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        u9c u9cVar = this.e;
        rvo1 rvo1Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                byte b2 = this.c;
                if (b2 == 0) {
                    hm5.M(obj);
                    tmc0 tmc0Var = (tmc0) u9cVar.b;
                    this.b = rvo1Var;
                    this.c = (byte) 1;
                    qwo1Var = new qwo1(new gxn1(tmc0Var, this.f, this.g, null, (byte) 0));
                    if (qwo1Var != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b2 != 1) {
                    hm5.M(obj);
                    return rih1Var;
                }
                rvo1Var = this.b;
                hm5.M(obj);
                qwo1Var = obj;
                this.b = null;
                this.c = (byte) 2;
                if (((qwo1) qwo1Var).a(rvo1Var.a(), this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                byte b3 = this.c;
                if (b3 == 0) {
                    hm5.M(obj);
                    ssk1 ssk1Var = (ssk1) u9cVar.a;
                    this.b = rvo1Var;
                    this.c = (byte) 1;
                    objC = ssk1Var.c(this.f, this.g);
                    if (objC != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    hm5.M(obj);
                    return rih1Var;
                }
                rvo1Var = this.b;
                hm5.M(obj);
                objC = obj;
                this.b = null;
                this.c = (byte) 2;
                if (((nwo1) objC).a(rvo1Var.a(), this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }
}
