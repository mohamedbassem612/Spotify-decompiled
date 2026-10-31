package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qq01 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ uqs0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq01(uqs0 uqs0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = uqs0Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
