package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nsq0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ osq0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsq0(osq0 osq0Var, onm onmVar) {
        super(onmVar);
        this.b = osq0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.j(this);
    }
}
