package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xvb1 extends hab0 implements iu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ List b;
    public final /* synthetic */ c380 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ long g;
    public final /* synthetic */ n511 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvb1(long j, List list, c380 c380Var, float f, float f2, float f3, long j2, n511 n511Var) {
        super(1);
        this.a = j;
        this.b = list;
        this.c = c380Var;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = j2;
        this.h = n511Var;
    }

    public final Object invoke(Object obj) {
        p5t0 p5t0Var = (p5t0) obj;
        long j = this.a;
        float f = 2.0f;
        float fI = hjl.i(j) / 2.0f;
        float fH = hjl.h(j) / 2.0f;
        int i = 0;
        for (Object obj2 : this.b) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            afh0 afh0Var = (afh0) obj2;
            t5t0 t5t0Var = (t5t0) this.c.get(i);
            int i3 = (int) ((this.e * f) + (this.d * t5t0Var.g));
            int i4 = (int) this.f;
            if (i3 < i4) {
                i3 = i4;
            }
            if (!((i3 >= 0) & (i3 >= 0))) {
                sf80.a("width and height must be >= 0");
            }
            q5t0 q5t0VarH = afh0Var.H(jjl.h(i3, i3, i3, i3));
            long j2 = this.g;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + fI;
            float f2 = t5t0Var.d;
            n511 n511Var = this.h;
            float f3 = f;
            float fE = l1d.e(n511Var.c, n511Var.a, f2, fIntBitsToFloat);
            float fE2 = l1d.e(n511Var.d, n511Var.b, t5t0Var.e, Float.intBitsToFloat((int) (j2 & 4294967295L)) + fH);
            float f4 = i3 / f3;
            p5t0Var.f(q5t0VarH, (int) (fE - f4), (int) (fE2 - f4), 0.0f);
            f = f3;
            i = i2;
        }
        return rih1.a;
    }
}
