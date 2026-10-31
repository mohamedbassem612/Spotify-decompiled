package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fqv extends hab0 implements zu30 {
    public final /* synthetic */ cqs0 X;
    public final /* synthetic */ vqv a;
    public final /* synthetic */ nqm0 b;
    public final /* synthetic */ ftv c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ftv e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ru31 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqv(vqv vqvVar, nqm0 nqm0Var, ftv ftvVar, int i, ftv ftvVar2, boolean z, ru31 ru31Var, boolean z2, boolean z3, boolean z4, cqs0 cqs0Var) {
        super(4);
        this.a = vqvVar;
        this.b = nqm0Var;
        this.c = ftvVar;
        this.d = i;
        this.e = ftvVar2;
        this.f = z;
        this.g = ru31Var;
        this.h = z2;
        this.i = z3;
        this.t = z4;
        this.X = cqs0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        de21 de21Var = (de21) obj;
        ((Boolean) obj2).getClass();
        x340 x340Var = (b0k) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(de21Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 131) != 130)) {
            boolean z = this.t;
            cqs0 cqs0Var = this.X;
            nqm0 nqm0Var = this.b;
            vqv vqvVar = this.a;
            vqvVar.b(48, 1, apo.r(1659016517, new eqv(nqm0Var, vqvVar, de21Var, this.c, this.d, this.e, this.f, this.g, this.h, this.i, z, cqs0Var), x340Var2), x340Var2, (qim0) null);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
