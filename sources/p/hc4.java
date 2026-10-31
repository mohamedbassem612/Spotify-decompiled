package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class hc4 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hc4(q5t0 q5t0Var, qhe1 qhe1Var, float f) {
        this.a = (byte) 3;
        this.c = q5t0Var;
        this.d = qhe1Var;
        this.b = f;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e8  */
    public final Object invoke(Object obj) {
        byte b = this.a;
        float fFloatValue = 0.0f;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        float f = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                yk4 yk4Var = (yk4) obj3;
                f2b f2bVar = (f2b) obj2;
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                cab cabVarA1 = lslVar.a1();
                long jU = cabVarA1.u();
                cabVarA1.p().q();
                try {
                    dg8 dg8Var = (dg8) cabVarA1.b;
                    dg8Var.z(f, 0.0f);
                    dg8Var.s(45.0f, 0L);
                    DrawScope.m(lslVar, yk4Var, 0L, 0.0f, f2bVar, 0, 46);
                    return rih1Var;
                } finally {
                    i3a.n(cabVarA1, jU);
                }
            case 1:
                m811 m811Var = (m811) obj3;
                vsb0 vsb0Var = (vsb0) obj2;
                de5 de5Var = (de5) obj;
                if (f > 0.0f) {
                    fFloatValue = ((Number) de5Var.e.getValue()).floatValue();
                    if (fFloatValue > f) {
                        fFloatValue = f;
                    }
                } else if (f < 0.0f) {
                    fFloatValue = ((Number) de5Var.e.getValue()).floatValue();
                    if (fFloatValue < f) {
                        fFloatValue = f;
                    }
                }
                float f2 = fFloatValue - m811Var.a;
                if (f2 != vsb0Var.f(f2) || fFloatValue != ((Number) de5Var.e.getValue()).floatValue()) {
                    de5Var.a();
                }
                m811Var.a += f2;
                return rih1Var;
            case 2:
                yr80 yr80Var = (yr80) obj3;
                vy71 vy71Var = (vy71) obj2;
                y5v y5vVar = (y5v) obj;
                y5vVar.a(f, xy71.a);
                float f3 = f / 2.0f;
                if (((int) (yr80Var.a & 4294967295L)) > f3 && !vy71Var.a) {
                    y5vVar.a(f3, xy71.c);
                }
                int i = (int) (yr80Var.a & 4294967295L);
                if (i != 0) {
                    y5vVar.a(Math.max(0.0f, f - i), xy71.b);
                }
                return rih1Var;
            case 3:
                q5t0 q5t0Var = (q5t0) obj3;
                p5t0 p5t0Var = (p5t0) obj;
                o95 o95Var = ((qhe1) obj2).S0;
                p5t0.l(o95Var != null ? (int) ((Number) o95Var.e()).floatValue() : (int) f, 0, p5t0Var, q5t0Var);
                return rih1Var;
            default:
                vnh1 vnh1Var = (vnh1) obj3;
                iu30 iu30Var = (iu30) obj2;
                long jLongValue = ((Long) obj).longValue();
                long j = vnh1Var.b;
                if (j == Long.MIN_VALUE) {
                    vnh1Var.b = jLongValue;
                    j = jLongValue;
                }
                float f4 = vnh1Var.e;
                ke5 ke5Var = new ke5(f4);
                ke5 ke5Var2 = vnh1.f;
                long jE = f == 0.0f ? vnh1Var.a.e(new ke5(f4), ke5Var2, vnh1Var.c) : jch0.a0((jLongValue - j) / f);
                float f5 = vnh1Var.a.n(jE, ke5Var, ke5Var2, vnh1Var.c).a;
                vnh1Var.c = vnh1Var.a.g(jE, ke5Var, ke5Var2, vnh1Var.c);
                vnh1Var.b = jLongValue;
                float f6 = vnh1Var.e - f5;
                vnh1Var.e = f5;
                iu30Var.invoke(Float.valueOf(f6));
                return rih1Var;
        }
    }

    public /* synthetic */ hc4(float f, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = f;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ hc4(vnh1 vnh1Var, float f, iu30 iu30Var) {
        this.a = (byte) 4;
        this.c = vnh1Var;
        this.b = f;
        this.d = iu30Var;
    }
}
