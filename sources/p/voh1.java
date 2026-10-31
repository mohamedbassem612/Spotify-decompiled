package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class voh1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ woh1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voh1(woh1 woh1Var, onm onmVar) {
        super(onmVar);
        this.c = woh1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
