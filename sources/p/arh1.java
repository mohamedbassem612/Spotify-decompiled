package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class arh1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ pt b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arh1(pt ptVar, lnm lnmVar) {
        super(lnmVar);
        this.b = ptVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.L(this);
    }
}
