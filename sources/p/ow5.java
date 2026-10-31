package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ow5 extends onm {
    public String a;
    public bxt b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vw5 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow5(vw5 vw5Var, onm onmVar) {
        super(onmVar);
        this.d = vw5Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
