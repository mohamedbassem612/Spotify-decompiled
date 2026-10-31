package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gck extends hab0 implements xu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gck(boolean z, boolean z2, boolean z3, int i, float f) {
        super(3);
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = f;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ifh0 ifh0Var = (ifh0) obj;
        afh0 afh0Var = (afh0) obj2;
        long jB = ((hjl) obj3).a;
        if (this.a && this.b) {
            int iP = yoi1.p(this.c ? afh0Var.C(hjl.h(jB)) : ifh0Var.i0(160.0f), hjl.k(jB), hjl.i(jB));
            int i = this.d;
            Integer numValueOf = Integer.valueOf(i);
            if (i <= 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : iP;
            int iP2 = yoi1.p(jch0.U(((iP - iIntValue) * this.e) + iIntValue), hjl.k(jB), hjl.i(jB));
            jB = hjl.b(jB, iP2, iP2, 0, 0, 12);
        }
        q5t0 q5t0VarH = afh0Var.H(jB);
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new f2(q5t0VarH, (byte) 12));
    }
}
