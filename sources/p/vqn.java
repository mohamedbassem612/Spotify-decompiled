package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vqn extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ v1k c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqn(v1k v1kVar, onm onmVar) {
        super(onmVar);
        this.c = v1kVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.s(this);
    }
}
