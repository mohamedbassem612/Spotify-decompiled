package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yx0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ mf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx0(mf mfVar, lnm lnmVar) {
        super(lnmVar);
        this.c = mfVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
