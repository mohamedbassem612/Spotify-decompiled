package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t8v extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u8v c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8v(u8v u8vVar, onm onmVar) {
        super(onmVar);
        this.c = u8vVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
