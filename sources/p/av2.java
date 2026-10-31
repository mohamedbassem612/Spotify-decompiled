package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class av2 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ bv2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av2(bv2 bv2Var, onm onmVar) {
        super(onmVar);
        this.b = bv2Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
