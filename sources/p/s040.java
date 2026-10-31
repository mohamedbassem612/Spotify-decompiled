package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s040 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ t040 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s040(t040 t040Var, onm onmVar) {
        super(onmVar);
        this.c = t040Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
