package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mx10 extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vgr c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx10(vgr vgrVar, onm onmVar) {
        super(onmVar);
        this.c = vgrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.q(false, this);
    }
}
