package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m6d0 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public vr20 d;
    public int e;
    public final /* synthetic */ om70 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6d0(om70 om70Var, lnm lnmVar) {
        super(lnmVar);
        this.f = om70Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
