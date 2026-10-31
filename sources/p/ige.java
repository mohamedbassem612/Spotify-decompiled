package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ige extends onm {
    public Object a;
    public faa0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ u60 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ige(u60 u60Var, lnm lnmVar) {
        super(lnmVar);
        this.d = u60Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.emit((Object) null, this);
    }
}
