package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q010 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ o010 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q010(o010 o010Var, lnm lnmVar) {
        super(lnmVar);
        this.c = o010Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
