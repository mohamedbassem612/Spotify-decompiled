package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class na00 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ u5z c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na00(u5z u5zVar, lnm lnmVar) {
        super(lnmVar);
        this.c = u5zVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
