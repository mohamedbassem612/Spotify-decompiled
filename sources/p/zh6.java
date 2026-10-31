package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zh6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh6(float f, iv21 iv21Var, boolean z, u7h u7hVar, float f2) {
        super(2);
        this.b = f;
        this.e = iv21Var;
        this.c = z;
        this.f = u7hVar;
        this.d = f2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = (qim0) obj3;
                int iP = czo1.p(9);
                fi6.a((yj41) obj4, this.b, this.d, this.c, qim0Var, (b0k) obj, iP);
                return rih1.a;
            default:
                tlc1 tlc1Var = (tlc1) obj;
                long j = ((hjl) obj2).a;
                int iI0 = tlc1Var.i0(this.b);
                pxg1 pxg1Var = zaf1.c;
                int iI1 = tlc1Var.i0(8.0f);
                long jB = hjl.b(j, 0, 0, 0, Integer.MAX_VALUE, 3);
                iv21 iv21Var = (iv21) obj4;
                u7h u7hVar = (u7h) obj3;
                q5t0 q5t0VarH = ((afh0) o7h.q0(tlc1Var.P("name", new j2i(730753422, new xaf1(iv21Var, u7hVar, (byte) 0), true)))).H(jB);
                q5t0 q5t0Var = null;
                if (iv21Var.c != null) {
                    q5t0 q5t0VarH2 = ((afh0) o7h.q0(tlc1Var.P("retune", new j2i(-1184464718, new gf(iv21Var, u7hVar, this.d, (byte) 13), true)))).H(jB);
                    int i = q5t0VarH.b + iI1 + q5t0VarH2.b;
                    if (this.c && i <= iI0) {
                        q5t0Var = q5t0VarH2;
                    }
                }
                int i2 = q5t0VarH.b;
                if (q5t0Var != null) {
                    i2 = i2 + iI1 + q5t0Var.b;
                }
                return tlc1Var.S(hjl.i(j), i2, b7x.a, new udx(q5t0VarH, q5t0Var, iI1, (byte) 2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh6(yj41 yj41Var, float f, float f2, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.e = yj41Var;
        this.b = f;
        this.d = f2;
        this.c = z;
        this.f = qim0Var;
    }
}
