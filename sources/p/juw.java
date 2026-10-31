package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class juw extends onm {
    public String a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yzu d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juw(yzu yzuVar, onm onmVar) {
        super(onmVar);
        this.d = yzuVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.k(this);
    }
}
