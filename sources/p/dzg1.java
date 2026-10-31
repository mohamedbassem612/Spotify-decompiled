package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dzg1 extends hab0 implements iu30 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ zc30 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ q5t0 f;
    public final /* synthetic */ q5t0 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ q5t0 i;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzg1(Function0 function0, zc30 zc30Var, Function0 function1, int i, int i2, q5t0 q5t0Var, q5t0 q5t0Var2, int i3, q5t0 q5t0Var3, long j) {
        super(1);
        this.a = function0;
        this.b = zc30Var;
        this.c = function1;
        this.d = i;
        this.e = i2;
        this.f = q5t0Var;
        this.g = q5t0Var2;
        this.h = i3;
        this.i = q5t0Var3;
        this.t = j;
    }

    public final Object invoke(Object obj) {
        p5t0 p5t0Var = (p5t0) obj;
        float fO = yoi1.o(((Number) this.a.invoke()).floatValue(), 0.0f, 1.0f);
        zc30 zc30Var = this.b;
        zc30 zc30Var2 = zc30.c;
        if (zc30Var == zc30Var2) {
            fO = 1.0f;
        }
        float fO2 = yoi1.o(((Number) this.c.invoke()).floatValue(), 0.0f, 1.0f);
        int i = this.d;
        int iU = jch0.U(((this.e - i) * fO) + i);
        q5t0 q5t0Var = this.f;
        int i2 = (q5t0Var != null ? q5t0Var.b : 0) + iU;
        q5t0 q5t0Var2 = this.g;
        int iU2 = jch0.U(i2 * fO2) + q5t0Var2.b;
        q5t0 q5t0Var3 = this.i;
        int i3 = q5t0Var3.b;
        int i4 = this.h;
        int iU3 = jch0.U((i3 + i4) * fO) + iU2;
        long j = this.t;
        int iH = (hjl.h(j) - iU3) / 2;
        if (iH < 0) {
            iH = 0;
        }
        int i5 = q5t0Var2.b + iH;
        p5t0Var.k(q5t0Var2, 0, iH, 0.0f);
        if (q5t0Var != null && fO2 > 0.0f) {
            p5t0Var.k(q5t0Var, (hjl.i(j) - q5t0Var.a) / 2, iU + i5, 0.0f);
        }
        if (zc30Var != zc30Var2) {
            i2 = 0;
        }
        p5t0Var.k(q5t0Var3, 0, i5 + i2 + i4, 0.0f);
        return rih1.a;
    }
}
