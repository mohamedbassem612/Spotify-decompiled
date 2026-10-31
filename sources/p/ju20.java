package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ju20 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ mib c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju20(mib mibVar, lnm lnmVar) {
        super(lnmVar);
        this.c = mibVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit((Object) null, this);
    }
}
