package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wnn extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnn(inn innVar, float f, float f2, t24 t24Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = innVar;
        this.b = f;
        this.c = f2;
        this.e = t24Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                return new wnn((inn) this.d, this.b, this.c, (t24) obj2, lnmVar);
            default:
                wnn wnnVar = new wnn((pob0) obj2, this.b, this.c, lnmVar);
                wnnVar.d = obj;
                return wnnVar;
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
        float f = this.c;
        float f2 = this.b;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                hm5.M(obj);
                inn innVar = (inn) this.d;
                Float f3 = new Float(f2);
                if (((t24) obj2).h.getValue() != tnn.b) {
                    f3 = null;
                }
                innVar.invoke(f3 != null ? new Float(Math.copySign(f3.floatValue(), Math.signum(f))) : null);
                return rih1.a;
            default:
                c9n c9nVar = (c9n) this.d;
                hm5.M(obj);
                pob0 pob0Var = (pob0) obj2;
                fn31.T(c9nVar, (o8n) null, 0, new gob0(pob0Var, f2, (lnm) null, (byte) 0), 3);
                return fn31.T(c9nVar, (o8n) null, 0, new gob0(pob0Var, f, (lnm) null, (byte) 1), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnn(pob0 pob0Var, float f, float f2, lnm lnmVar) {
        super(2, lnmVar);
        this.e = pob0Var;
        this.b = f;
        this.c = f2;
    }
}
