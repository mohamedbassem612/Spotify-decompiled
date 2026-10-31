package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o91 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ p91 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o91(p91 p91Var, onm onmVar) {
        super(onmVar);
        this.c = p91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
