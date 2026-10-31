package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e6w extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ glu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6w(glu gluVar, lnm lnmVar) {
        super(lnmVar);
        this.c = gluVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
