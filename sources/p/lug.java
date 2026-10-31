package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lug extends onm {
    public Object a;
    public l811 b;
    public l811 c;
    public ssw0 d;
    public q6n1 e;
    public q6n1 f;
    public short g;
    public /* synthetic */ Object h;
    public final /* synthetic */ ege i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lug(ege egeVar, lnm lnmVar) {
        super(lnmVar);
        this.i = egeVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.t |= Integer.MIN_VALUE;
        return this.i.emit(null, this);
    }
}
