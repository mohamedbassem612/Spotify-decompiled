package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r6d extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ s6d b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6d(s6d s6dVar, onm onmVar) {
        super(onmVar);
        this.b = s6dVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
