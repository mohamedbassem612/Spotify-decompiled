package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ts20 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ huz c;
    public vr20 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts20(huz huzVar, lnm lnmVar) {
        super(lnmVar);
        this.c = huzVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
