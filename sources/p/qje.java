package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qje extends onm {
    public String a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sje d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qje(sje sjeVar, onm onmVar) {
        super(onmVar);
        this.d = sjeVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, null, this);
    }
}
