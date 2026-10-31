package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q27 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xb10 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q27(xb10 xb10Var, byte b) {
        super(0);
        this.a = b;
        this.b = xb10Var;
    }

    public final Object invoke() {
        int iA;
        rmr0 rmr0VarB;
        byte b = this.a;
        rmr0 vb10Var = null;
        xb10 xb10Var = this.b;
        switch (b) {
            case 0:
                smr0 smr0VarA = xb10Var.a();
                if (smr0VarA != null) {
                    int iJ = w5p1.j(smr0VarA);
                    if (uah.e(-1, iJ) >= 4.5d) {
                        iA = iJ;
                    } else {
                        float[] fArr = new float[3];
                        uah.h(iJ, fArr);
                        float f = fArr[0];
                        float f2 = fArr[1];
                        float f3 = fArr[2];
                        float f4 = 0.0f;
                        while (f3 - f4 > 0.01d) {
                            float f5 = (f3 + f4) * 0.5f;
                            if (uah.e(-1, uah.a(new float[]{f, f2, f5})) < 4.5d) {
                                f3 = f5;
                            } else {
                                f4 = f5;
                            }
                        }
                        iA = uah.a(new float[]{f, f2, f4});
                    }
                    vb10Var = new vb10(iJ, iA);
                }
                return vb10Var;
            case 1:
                smr0 smr0VarA2 = xb10Var.a();
                if (smr0VarA2 == null) {
                    return null;
                }
                int iJ2 = w5p1.j(smr0VarA2);
                return new wb10(iJ2, t5p1.l(iJ2));
            default:
                smr0 smr0VarA3 = xb10Var.a();
                uwr uwrVar = cbx.a;
                long jE = ((yex) zex.a.d).e;
                if (smr0VarA3 != null && (rmr0VarB = smr0VarA3.b(grd1.h)) != null) {
                    vb10Var = rmr0VarB;
                } else if (smr0VarA3 != null) {
                    vb10Var = smr0VarA3.b(grd1.e);
                }
                if (vb10Var != null) {
                    jE = z4p1.e(vb10Var.d);
                }
                return new u7h(jE);
        }
    }
}
