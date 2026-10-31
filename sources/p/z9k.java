package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z9k extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ aak c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9k(aak aakVar, onm onmVar) {
        super(onmVar);
        this.c = aakVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
