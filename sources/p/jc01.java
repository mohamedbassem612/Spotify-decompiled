package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jc01 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ d9l b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc01(d9l d9lVar, lnm lnmVar) {
        super(lnmVar);
        this.b = d9lVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
