package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nob0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ pob0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nob0(pob0 pob0Var, onm onmVar) {
        super(onmVar);
        this.b = pob0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.h(this);
    }
}
