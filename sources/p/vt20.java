package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vt20 extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ wt20 c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt20(wt20 wt20Var, lnm lnmVar) {
        super(lnmVar);
        this.c = wt20Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.collect((vr20) null, this);
    }
}
