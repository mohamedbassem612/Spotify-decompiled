package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k8h0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8h0(int i, int i2, int i3, int i4, ven0 ven0Var, ven0 ven0Var2) {
        super(1);
        this.c = i;
        this.d = i2;
        this.f = i3;
        this.g = i4;
        this.b = ven0Var;
        this.e = ven0Var2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        int i2 = this.f;
        int i3 = this.d;
        int i4 = this.c;
        Object obj2 = this.e;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                p5t0 p5t0Var = (p5t0) obj;
                q5t0 q5t0Var = (q5t0) obj2;
                q5t0 q5t0Var2 = (q5t0) obj3;
                if (q5t0Var2 != null) {
                    p5t0Var.f(q5t0Var2, q5t0Var == null ? (i4 - i3) / 2 : 0, q5t0Var == null ? (i2 - i3) / 2 : 0, 0.0f);
                }
                if (q5t0Var != null) {
                    int i5 = (int) (i4 * 0.48f);
                    int i6 = (int) (i2 * 0.49f);
                    int i7 = i2 - i;
                    if (i6 > i7) {
                        i6 = i7;
                    }
                    p5t0Var.f(q5t0Var, i5, i6, 0.0f);
                }
                break;
            case 1:
                p5t0 p5t0Var2 = (p5t0) obj;
                p5t0Var2.k((q5t0) obj3, i4, i3, 0.0f);
                p5t0Var2.k((q5t0) obj2, i2, i, 0.0f);
                break;
            default:
                elb0 elb0Var = (elb0) obj;
                if (!((Boolean) ((ven0) obj3).getValue()).booleanValue()) {
                    long jE = elb0Var.E(0L);
                    n511 n511VarN = nho1.n(elb0Var, true);
                    float fB = (int) (elb0Var.b() >> 32);
                    float fB2 = (int) (elb0Var.b() & 4294967295L);
                    ven0 ven0Var = (ven0) obj2;
                    float f = n511VarN.c - n511VarN.a;
                    if (f > 0.0f) {
                        float f2 = n511VarN.d - n511VarN.b;
                        if (f2 > 0.0f && fB == f && fB2 == f2) {
                            int i8 = (int) (jE >> 32);
                            if (Float.intBitsToFloat(i8) >= 0.0f) {
                                int i9 = (int) (jE & 4294967295L);
                                if (Float.intBitsToFloat(i9) >= i4 && Float.intBitsToFloat(i8) + fB <= i3 && Float.intBitsToFloat(i9) + fB2 <= i2 - i) {
                                    z = true;
                                }
                            }
                        }
                    }
                    ven0Var.setValue(Boolean.valueOf(z));
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8h0(q5t0 q5t0Var, int i, int i2, q5t0 q5t0Var2, int i3, int i4) {
        super(1);
        this.b = q5t0Var;
        this.c = i;
        this.d = i2;
        this.e = q5t0Var2;
        this.f = i3;
        this.g = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8h0(q5t0 q5t0Var, q5t0 q5t0Var2, int i, int i2, int i3, int i4) {
        super(1);
        this.b = q5t0Var;
        this.e = q5t0Var2;
        this.c = i;
        this.d = i2;
        this.f = i3;
        this.g = i4;
    }
}
