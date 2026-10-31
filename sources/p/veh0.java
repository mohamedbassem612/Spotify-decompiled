package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class veh0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ilf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public veh0(ilf0 ilf0Var, lnm lnmVar) {
        super(lnmVar);
        this.c = ilf0Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
