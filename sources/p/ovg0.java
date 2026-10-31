package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ovg0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o95 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ o95 e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ovg0(o95 o95Var, float f, o95 o95Var2, float f2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = o95Var;
        this.d = f;
        this.e = o95Var2;
        this.f = f2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                ovg0 ovg0Var = new ovg0(this.c, this.d, this.e, this.f, lnmVar, (byte) 0);
                ovg0Var.b = obj;
                return ovg0Var;
            case 1:
                ovg0 ovg0Var2 = new ovg0(this.c, this.d, this.e, this.f, lnmVar, (byte) 1);
                ovg0Var2.b = obj;
                return ovg0Var2;
            default:
                ovg0 ovg0Var3 = new ovg0(this.c, this.d, this.e, this.f, lnmVar, (byte) 2);
                ovg0Var3.b = obj;
                return ovg0Var3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.f;
        o95 o95Var = this.e;
        float f2 = this.d;
        o95 o95Var2 = this.c;
        c9n c9nVar = (c9n) this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                fn31.T(c9nVar, (o8n) null, 0, new jpo(o95Var2, f2, (lnm) null, (byte) 4), 3);
                return fn31.T(c9nVar, (o8n) null, 0, new jpo(o95Var, f, (lnm) null, (byte) 5), 3);
            case 1:
                hm5.M(obj);
                fn31.T(c9nVar, (o8n) null, 0, new pvg0(o95Var2, f2, null, (byte) 0), 3);
                fn31.T(c9nVar, (o8n) null, 0, new pvg0(o95Var, f, null, (byte) 1), 3);
                return rih1Var;
            default:
                hm5.M(obj);
                fn31.T(c9nVar, (o8n) null, 0, new pvg0(o95Var2, f2, null, (byte) 2), 3);
                fn31.T(c9nVar, (o8n) null, 0, new pvg0(o95Var, f, null, (byte) 3), 3);
                return rih1Var;
        }
    }
}
