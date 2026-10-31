package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class s8g1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ t8g1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8g1(t8g1 t8g1Var, onm onmVar) {
        super(onmVar);
        this.c = t8g1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
