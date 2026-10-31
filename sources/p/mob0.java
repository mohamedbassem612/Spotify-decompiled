package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mob0 extends a8d1 implements vu30 {
    public /* synthetic */ Object a;
    public final /* synthetic */ pob0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mob0(pob0 pob0Var, int i, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.b = pob0Var;
        this.c = i;
        this.d = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        mob0 mob0Var = new mob0(this.b, this.c, this.d, lnmVar);
        mob0Var.a = obj;
        return mob0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        c9n c9nVar = (c9n) this.a;
        hm5.M(obj);
        qz20 qz20Var = new qz20(this.c);
        pob0 pob0Var = this.b;
        pob0Var.e(qz20Var);
        long j = this.d;
        fn31.T(c9nVar, (o8n) null, 0, new lob0(pob0Var, j, null, (byte) 0), 3);
        return fn31.T(c9nVar, (o8n) null, 0, new lob0(pob0Var, j, null, (byte) 1), 3);
    }
}
