package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ved extends onm {
    public String a;
    public String b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ bfd e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ved(bfd bfdVar, onm onmVar) {
        super(onmVar);
        this.e = bfdVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.E(null, null, this);
    }
}
