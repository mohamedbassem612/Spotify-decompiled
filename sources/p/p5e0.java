package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p5e0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ jpa0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5e0(jpa0 jpa0Var, onm onmVar) {
        super(onmVar);
        this.b = jpa0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.e(this);
    }
}
