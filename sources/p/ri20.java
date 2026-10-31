package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ri20 extends onm {
    public long a;
    public si20 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ si20 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri20(si20 si20Var, onm onmVar) {
        super(onmVar);
        this.d = si20Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(0L, this);
    }
}
