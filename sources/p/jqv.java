package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jqv extends hab0 implements vu30 {
    public final /* synthetic */ qim0 X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ vqv a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xtb0 c;
    public final /* synthetic */ c380 d;
    public final /* synthetic */ vzq0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ nqm0 g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ pe21 i;
    public final /* synthetic */ cqs0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqv(vqv vqvVar, boolean z, xtb0 xtb0Var, c380 c380Var, vzq0 vzq0Var, boolean z2, nqm0 nqm0Var, iu30 iu30Var, pe21 pe21Var, cqs0 cqs0Var, qim0 qim0Var, int i, int i2) {
        super(2);
        this.a = vqvVar;
        this.b = z;
        this.c = xtb0Var;
        this.d = c380Var;
        this.e = vzq0Var;
        this.f = z2;
        this.g = nqm0Var;
        this.h = iu30Var;
        this.i = pe21Var;
        this.t = cqs0Var;
        this.X = qim0Var;
        this.Y = i;
        this.Z = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Y | 1);
        int iP2 = czo1.p(this.Z);
        this.a.g(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP, iP2);
        return rih1.a;
    }
}
