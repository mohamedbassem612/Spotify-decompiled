package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wla extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ cv30 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ cv30 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wla(int i, int i2, int i3, int i4, iu30 iu30Var, qim0 qim0Var, iu30 iu30Var2, int i5) {
        super(2);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = iu30Var;
        this.g = qim0Var;
        this.h = iu30Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        iu30 iu30Var = this.h;
        Object obj3 = this.g;
        iu30 iu30Var2 = this.f;
        switch (b) {
            case 0:
                tlc1 tlc1Var = (tlc1) obj;
                long j = ((hjl) obj2).a;
                long jB = hjl.b(j, 0, 0, 0, Integer.MAX_VALUE, 3);
                q5t0 q5t0VarH = ((afh0) o7h.q0(tlc1Var.P(qd31.a, (j2i) iu30Var2))).H(jB);
                j2i j2iVar = (j2i) obj3;
                int i = ((afh0) o7h.q0(tlc1Var.P(qd31.b, j2iVar))).H(jB).b;
                int iH = hjl.h(j) - q5t0VarH.b;
                int i2 = this.b * 2;
                int i3 = iH - i2;
                if (i3 < 0) {
                    i3 = 0;
                }
                int i4 = i3 - i;
                int i5 = this.c;
                int i6 = this.d;
                int iP = yoi1.p(i4, i5 > i6 ? i6 : i5, i6);
                if (iP > i3) {
                    iP = i3;
                }
                int iMin = Math.min(i, i3 - iP);
                int i7 = iP < i5 ? i5 : iP;
                int i8 = (int) (i7 * 2.0f);
                int i9 = hjl.i(j);
                if (i8 > i9) {
                    i8 = i9;
                }
                q5t0 q5t0VarH2 = ((afh0) o7h.q0(tlc1Var.P(qd31.c, (j2i) iu30Var))).H(hjl.a(0, i8, 0, (this.e * 2) + i7));
                q5t0 q5t0VarH3 = ((afh0) o7h.q0(tlc1Var.P(qd31.d, j2iVar))).H(hjl.b(j, 0, 0, 0, iMin, 3));
                return tlc1Var.S(hjl.i(j), hjl.h(j), b7x.a, new vla(j, q5t0VarH.b + i7 + q5t0VarH3.b + i2, q5t0VarH, this.b, q5t0VarH2, this.e, i7, q5t0VarH3));
            default:
                ((Number) obj2).intValue();
                cgj1.d(this.b, this.c, this.d, this.e, iu30Var2, (qim0) obj3, iu30Var, (b0k) obj, czo1.p(1));
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wla(j2i j2iVar, j2i j2iVar2, int i, int i2, int i3, j2i j2iVar3, int i4) {
        super(2);
        this.f = j2iVar;
        this.g = j2iVar2;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.h = j2iVar3;
        this.e = i4;
    }
}
