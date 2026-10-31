package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xc31 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ zgz0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc31(zgz0 zgz0Var, onm onmVar) {
        super(onmVar);
        this.b = zgz0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objH = this.b.h(null, null, this);
        return objH == d9n.a ? objH : new e331(objH);
    }
}
