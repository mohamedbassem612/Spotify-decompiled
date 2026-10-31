package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wqm extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o95 c;
    public final /* synthetic */ o95 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ float h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wqm(o95 o95Var, o95 o95Var2, float f, boolean z, iu30 iu30Var, float f2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = o95Var;
        this.d = o95Var2;
        this.e = f;
        this.f = z;
        this.g = iu30Var;
        this.h = f2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                wqm wqmVar = new wqm(this.c, this.d, this.e, this.f, this.g, this.h, lnmVar, (byte) 0);
                wqmVar.b = obj;
                return wqmVar;
            default:
                wqm wqmVar2 = new wqm(this.c, this.d, this.e, this.f, this.g, this.h, lnmVar, (byte) 1);
                wqmVar2.b = obj;
                return wqmVar2;
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
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vnh0 vnh0Var = vnh0.a;
        unh0 unh0Var = unh0.a;
        float f = this.h;
        rnh0 rnh0Var = rnh0.a;
        qnh0 qnh0Var = qnh0.a;
        float f2 = this.e;
        o95 o95Var = this.d;
        o95 o95Var2 = this.c;
        boolean z = this.f;
        iu30 iu30Var = this.g;
        c9n c9nVar = (c9n) this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                float fAbs = Math.abs(((Number) o95Var2.e()).floatValue());
                float fAbs2 = Math.abs(((Number) o95Var.e()).floatValue());
                if (fAbs2 <= f2 || fAbs2 <= fAbs) {
                    if (z && fAbs > f && fAbs > fAbs2) {
                        if (((Number) o95Var2.e()).floatValue() < 0.0f) {
                            iu30Var.invoke(unh0Var);
                        } else {
                            iu30Var.invoke(vnh0Var);
                        }
                    }
                } else if (z) {
                    iu30Var.invoke(qnh0Var);
                } else {
                    iu30Var.invoke(rnh0Var);
                }
                fn31.T(c9nVar, (o8n) null, 0, new b(o95Var, (lnm) null, (byte) 5), 3);
                fn31.T(c9nVar, (o8n) null, 0, new b(o95Var2, (lnm) null, (byte) 6), 3);
                break;
            default:
                hm5.M(obj);
                float fAbs3 = Math.abs(((Number) o95Var2.e()).floatValue());
                float fAbs4 = Math.abs(((Number) o95Var.e()).floatValue());
                if (fAbs4 <= f2 || fAbs4 <= fAbs3) {
                    if (z && fAbs3 > f && fAbs3 > fAbs4) {
                        if (((Number) o95Var2.e()).floatValue() < 0.0f) {
                            iu30Var.invoke(unh0Var);
                        } else {
                            iu30Var.invoke(vnh0Var);
                        }
                    }
                } else if (z) {
                    iu30Var.invoke(qnh0Var);
                } else {
                    iu30Var.invoke(rnh0Var);
                }
                fn31.T(c9nVar, (o8n) null, 0, new b(o95Var, (lnm) null, (byte) 27), 3);
                fn31.T(c9nVar, (o8n) null, 0, new b(o95Var2, (lnm) null, (byte) 28), 3);
                break;
        }
        return rih1Var;
    }
}
