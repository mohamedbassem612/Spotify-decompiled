package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mns0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public vr20 c;
    public int d;
    public final /* synthetic */ ywm0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mns0(ywm0 ywm0Var, lnm lnmVar) {
        super(lnmVar);
        this.e = ywm0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.emit((Object) null, this);
    }
}
