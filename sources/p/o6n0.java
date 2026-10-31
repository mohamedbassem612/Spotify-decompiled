package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o6n0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ulc b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6n0(ulc ulcVar, onm onmVar) {
        super(onmVar);
        this.b = ulcVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.s(null, null, this);
    }
}
