package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class apb1 extends onm {
    public vr20 a;
    public hpb1 b;
    public faa0 c;
    public Object d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ bpb1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apb1(bpb1 bpb1Var, lnm lnmVar) {
        super(lnmVar);
        this.g = bpb1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        this.g.collect(null, this);
        return d9n.a;
    }
}
