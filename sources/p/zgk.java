package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zgk extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bhk c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgk(bhk bhkVar, onm onmVar) {
        super(onmVar);
        this.c = bhkVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
