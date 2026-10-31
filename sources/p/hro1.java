package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hro1 extends a8d1 implements vu30 {
    public xgn0 a;
    public yro1 b;
    public long c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ yro1 f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hro1(long j, lnm lnmVar, yro1 yro1Var) {
        super(2, lnmVar);
        this.f = yro1Var;
        this.g = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        hro1 hro1Var = new hro1(this.g, lnmVar, this.f);
        hro1Var.e = obj;
        return hro1Var;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        yro1 yro1Var;
        xgn0 xgn0VarD;
        long j;
        zwo1 zwo1Var;
        if (this.d) {
            j = this.c;
            yro1Var = this.b;
            xgn0VarD = this.a;
            zwo1 zwo1Var2 = (zwo1) this.e;
            hm5.M(obj);
            zwo1Var = zwo1Var2;
        } else {
            hm5.M(obj);
            zwo1 zwo1Var3 = (zwo1) this.e;
            yro1Var = this.f;
            xgn0VarD = yro1.d(yro1Var);
            this.e = zwo1Var3;
            this.a = xgn0VarD;
            this.b = yro1Var;
            j = this.g;
            this.c = j;
            this.d = true;
            Object objA = xgn0VarD.a(this);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            zwo1Var = zwo1Var3;
        }
        long j2 = j;
        yro1 yro1Var2 = yro1Var;
        try {
            boolean zEquals = yro1Var2.c().equals(bto1.b);
            rih1 rih1Var = rih1.a;
            if (!zEquals) {
                bto1 bto1VarC = yro1Var2.c();
                jso1 jso1Var = bto1.c;
                if (!bto1VarC.equals(jso1Var) && (!yro1Var2.c().equals(bto1.d) || yro1.e(yro1.f(yro1Var2)))) {
                    yro1.g(yro1Var2, jso1Var);
                    ayh ayhVarA = sap1.a();
                    yro1.h(yro1Var2, ayhVarA);
                    c921.y(yro1.m(yro1Var2).a(), (o8n) null, 0, new zwn1(zwo1Var, yro1Var2, j2, ayhVarA, null, (byte) 2), 3);
                    return rih1Var;
                }
            }
            return rih1Var;
        } finally {
            xgn0VarD.c((Object) null);
        }
    }
}
