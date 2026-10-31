package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tu01 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ wl01 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu01(wl01 wl01Var, lnm lnmVar) {
        super(lnmVar);
        this.c = wl01Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
