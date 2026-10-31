package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kir extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ t0l e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kir(t0l t0lVar, lnm lnmVar) {
        super(lnmVar);
        this.e = t0lVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit((Object) null, this);
    }
}
