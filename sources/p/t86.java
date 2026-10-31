package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t86 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ q86 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t86(q86 q86Var, lnm lnmVar) {
        super(lnmVar);
        this.c = q86Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
