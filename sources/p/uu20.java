package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uu20 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ eu20 c;
    public Object d;
    public vr20 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu20(eu20 eu20Var, lnm lnmVar) {
        super(lnmVar);
        this.c = eu20Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
