package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uch0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ a8d0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uch0(a8d0 a8d0Var, lnm lnmVar) {
        super(lnmVar);
        this.e = a8d0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
