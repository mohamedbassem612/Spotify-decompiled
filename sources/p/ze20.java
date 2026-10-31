package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ze20 extends onm {
    public bf20 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bf20 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze20(bf20 bf20Var, onm onmVar) {
        super(onmVar);
        this.d = bf20Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return bf20.a(this.d, null, this);
    }
}
