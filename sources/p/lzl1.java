package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lzl1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ jzl1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzl1(jzl1 jzl1Var, lnm lnmVar) {
        super(lnmVar);
        this.c = jzl1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
