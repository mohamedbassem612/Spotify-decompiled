package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lkv0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ nkv0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkv0(nkv0 nkv0Var, onm onmVar) {
        super(onmVar);
        this.c = nkv0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
