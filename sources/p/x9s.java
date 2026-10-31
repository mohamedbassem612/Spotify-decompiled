package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x9s extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ v9s c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9s(v9s v9sVar, lnm lnmVar) {
        super(lnmVar);
        this.c = v9sVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
