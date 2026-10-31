package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class not0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ s4q0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public not0(s4q0 s4q0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = s4q0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
