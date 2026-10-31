package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uf2 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ vt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf2(vt vtVar, lnm lnmVar) {
        super(lnmVar);
        this.e = vtVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit(null, this);
    }
}
