package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xd61 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ f16 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd61(f16 f16Var, lnm lnmVar) {
        super(lnmVar);
        this.c = f16Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
