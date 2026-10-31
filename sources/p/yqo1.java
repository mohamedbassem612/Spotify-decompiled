package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yqo1 extends a8d1 implements iu30 {
    public boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ yro1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqo1(long j, lnm lnmVar, yro1 yro1Var) {
        super(1, lnmVar);
        this.b = j;
        this.c = yro1Var;
    }

    public final lnm create(lnm lnmVar) {
        return new yqo1(this.b, lnmVar, this.c);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        hm5.M(obj);
        if (!z) {
            uqo1 uqo1Var = new uqo1(this.c, (lnm) null, (byte) 0);
            this.a = true;
            Object objM = rc2.M(this.b, uqo1Var, this);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }
}
