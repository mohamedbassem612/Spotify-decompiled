package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ros extends onm {
    public String a;
    public fi4 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ tos d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ros(tos tosVar, onm onmVar) {
        super(onmVar);
        this.d = tosVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, false, this);
    }
}
