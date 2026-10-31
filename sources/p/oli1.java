package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oli1 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ pli1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oli1(pli1 pli1Var, onm onmVar) {
        super(onmVar);
        this.c = pli1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
