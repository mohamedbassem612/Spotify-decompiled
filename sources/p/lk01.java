package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lk01 extends onm {
    public String a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mk01 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk01(mk01 mk01Var, onm onmVar) {
        super(onmVar);
        this.d = mk01Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0L, null, this);
    }
}
