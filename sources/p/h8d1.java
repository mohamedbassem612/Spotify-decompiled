package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h8d1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ i8d1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8d1(i8d1 i8d1Var, faa faaVar) {
        super(faaVar);
        this.b = i8d1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.e(0L, (vu30) null, this);
    }
}
