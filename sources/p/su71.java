package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class su71 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ wu71 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su71(wu71 wu71Var, onm onmVar) {
        super(onmVar);
        this.b = wu71Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
