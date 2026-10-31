package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h8z extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ i8z b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8z(i8z i8zVar, onm onmVar) {
        super(onmVar);
        this.b = i8zVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
