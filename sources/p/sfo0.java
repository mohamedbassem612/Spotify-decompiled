package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sfo0 extends onm {
    public int a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ tfo0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfo0(tfo0 tfo0Var, onm onmVar) {
        super(onmVar);
        this.d = tfo0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0, this);
    }
}
