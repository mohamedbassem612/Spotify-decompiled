package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nx10 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ vgr b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx10(vgr vgrVar, onm onmVar) {
        super(onmVar);
        this.b = vgrVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        Object objS = this.b.s(null, false, false, this);
        return objS == d9n.a ? objS : new e331(objS);
    }
}
