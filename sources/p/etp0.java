package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class etp0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ygi0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etp0(ygi0 ygi0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = ygi0Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
