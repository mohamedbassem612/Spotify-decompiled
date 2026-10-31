package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w1v extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ x1v c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1v(x1v x1vVar, onm onmVar) {
        super(onmVar);
        this.c = x1vVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
