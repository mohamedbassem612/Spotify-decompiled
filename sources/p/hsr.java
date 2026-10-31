package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hsr extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ jnq b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsr(jnq jnqVar, onm onmVar) {
        super(onmVar);
        this.b = jnqVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f((String) null, false, (String) null, (String) null, (tv80) null, this);
    }
}
