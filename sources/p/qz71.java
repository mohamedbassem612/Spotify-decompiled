package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qz71 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o95 c;
    public final /* synthetic */ o95 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qz71(o95 o95Var, o95 o95Var2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = o95Var;
        this.d = o95Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        o95 o95Var = this.d;
        o95 o95Var2 = this.c;
        switch (b) {
            case 0:
                qz71 qz71Var = new qz71(o95Var2, o95Var, lnmVar, (byte) 0);
                qz71Var.b = obj;
                return qz71Var;
            default:
                qz71 qz71Var2 = new qz71(o95Var2, o95Var, lnmVar, (byte) 1);
                qz71Var2.b = obj;
                return qz71Var2;
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
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        o95 o95Var = this.d;
        o95 o95Var2 = this.c;
        c9n c9nVar = (c9n) this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                fn31.T(c9nVar, (o8n) null, 0, new b(o95Var2, (lnm) null, (byte) 19), 3);
                return fn31.T(c9nVar, (o8n) null, 0, new b(o95Var, (lnm) null, (byte) 20), 3);
            default:
                hm5.M(obj);
                fn31.T(c9nVar, (o8n) null, 0, new b(o95Var2, (lnm) null, (byte) 25), 3);
                fn31.T(c9nVar, (o8n) null, 0, new b(o95Var, (lnm) null, (byte) 26), 3);
                return rih1.a;
        }
    }
}
