package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vpl1 extends onm {
    public vgn0 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wpl1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpl1(wpl1 wpl1Var, onm onmVar) {
        super(onmVar);
        this.d = wpl1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objA = this.d.a(this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
