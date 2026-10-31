package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k7c extends onm {
    public String a;
    public zwa b;
    public zol c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ zwa f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7c(zwa zwaVar, onm onmVar) {
        super(onmVar);
        this.f = zwaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= os00.INVALID_ID;
        Object objL = this.f.l(null, this);
        return objL == d9n.a ? objL : new e331(objL);
    }
}
