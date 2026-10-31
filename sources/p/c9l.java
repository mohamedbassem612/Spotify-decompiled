package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c9l extends onm {
    public /* synthetic */ Object X;
    public final /* synthetic */ d9l Y;
    public int Z;
    public Object a;
    public vgn0 b;
    public p811 c;
    public vu30 d;
    public p811 e;
    public p811 f;
    public ssw0 g;
    public xgn0 h;
    public short i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9l(d9l d9lVar, lnm lnmVar) {
        super(lnmVar);
        this.Y = d9lVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.emit(null, this);
    }
}
