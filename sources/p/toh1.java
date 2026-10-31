package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class toh1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ uoh1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toh1(uoh1 uoh1Var, onm onmVar) {
        super(onmVar);
        this.c = uoh1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
