package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rga extends onm {
    public vga a;
    public nga b;
    public sga c;
    public y7g1 d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ sga h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rga(sga sgaVar, onm onmVar) {
        super(onmVar);
        this.h = sgaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        Object objB = this.h.b(null, null, 0, null, this);
        return objB == d9n.a ? objB : new e331(objB);
    }
}
