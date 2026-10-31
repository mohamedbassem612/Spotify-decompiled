package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ssy extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jut c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssy(jut jutVar, onm onmVar) {
        super(onmVar);
        this.c = jutVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(null, this);
    }
}
