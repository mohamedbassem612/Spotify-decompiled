package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x721 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ uqs0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x721(uqs0 uqs0Var, lnm lnmVar) {
        super(lnmVar);
        this.e = uqs0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
