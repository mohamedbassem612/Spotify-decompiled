package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oow extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ zeu b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oow(zeu zeuVar, onm onmVar) {
        super(onmVar);
        this.b = zeuVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.p(null, this);
    }
}
