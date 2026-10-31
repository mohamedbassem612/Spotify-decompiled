package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ded extends onm {
    public xpf a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bfd d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ded(bfd bfdVar, onm onmVar) {
        super(onmVar);
        this.d = bfdVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.t(null, 0, null, null, null, this);
    }
}
