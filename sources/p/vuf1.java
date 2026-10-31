package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vuf1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ i6e1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vuf1(i6e1 i6e1Var, lnm lnmVar) {
        super(lnmVar);
        this.c = i6e1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
