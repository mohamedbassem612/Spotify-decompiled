package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zn71 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ao71 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn71(ao71 ao71Var, onm onmVar) {
        super(onmVar);
        this.b = ao71Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
