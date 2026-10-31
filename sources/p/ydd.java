package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ydd extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ bfd b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydd(bfd bfdVar, onm onmVar) {
        super(onmVar);
        this.b = bfdVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objN = this.b.n(0, null, this);
        return objN == d9n.a ? objN : new e331(objN);
    }
}
