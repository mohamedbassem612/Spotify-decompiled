package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s14 extends onm {
    public Object a;
    public faa0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ v14 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s14(v14 v14Var, lnm lnmVar) {
        super(lnmVar);
        this.d = v14Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= os00.INVALID_ID;
        return this.d.emit(null, this);
    }
}
