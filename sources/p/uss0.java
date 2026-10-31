package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uss0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ s4q0 e;
    public z310 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uss0(s4q0 s4q0Var, lnm lnmVar) {
        super(lnmVar);
        this.e = s4q0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
