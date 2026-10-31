package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ted extends onm {
    public String a;
    public Throwable b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bfd d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ted(bfd bfdVar, onm onmVar) {
        super(onmVar);
        this.d = bfdVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.C(null, this);
    }
}
