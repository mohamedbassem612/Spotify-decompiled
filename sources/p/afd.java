package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class afd extends onm {
    public boolean a;
    public iu30 b;
    public a8d1 c;
    public Exception d;
    public /* synthetic */ Object e;
    public final /* synthetic */ bfd f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afd(bfd bfdVar, onm onmVar) {
        super(onmVar);
        this.f = bfdVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.O(false, null, null, this);
    }
}
