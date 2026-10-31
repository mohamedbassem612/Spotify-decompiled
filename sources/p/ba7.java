package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ba7 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ca7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba7(ca7 ca7Var, onm onmVar) {
        super(onmVar);
        this.c = ca7Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
