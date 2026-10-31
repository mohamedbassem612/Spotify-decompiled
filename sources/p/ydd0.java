package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ydd0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ zdd0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydd0(zdd0 zdd0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = zdd0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
