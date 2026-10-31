package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d731 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ e731 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d731(e731 e731Var, onm onmVar) {
        super(onmVar);
        this.c = e731Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
