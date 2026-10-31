package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tsy extends onm {
    public String a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jut d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsy(jut jutVar, onm onmVar) {
        super(onmVar);
        this.d = jutVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.m(null, this);
    }
}
