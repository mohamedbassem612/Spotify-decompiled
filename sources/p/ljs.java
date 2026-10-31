package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ljs extends onm {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mjs c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljs(mjs mjsVar, onm onmVar) {
        super(onmVar);
        this.c = mjsVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, null, this);
    }
}
