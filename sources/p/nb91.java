package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class nb91 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tb91 b;

    public /* synthetic */ nb91(tb91 tb91Var, byte b) {
        this.a = b;
        this.b = tb91Var;
    }

    public final Object invoke(Object obj) {
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tb91 tb91Var = this.b;
        switch (b) {
            case 0:
                yr80 yr80Var = (yr80) obj;
                tb91Var.k.t((int) (yr80Var.a >> 32));
                tb91Var.l.t((int) (yr80Var.a & 4294967295L));
                return rih1Var;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                ksg ksgVar = tb91Var.c;
                drr0 drr0Var = tb91Var.d;
                float fO = yoi1.o(fFloatValue, ((Number) ksgVar.m()).floatValue(), ((Number) ksgVar.n()).floatValue());
                int i2 = tb91Var.a;
                boolean z = false;
                if (i2 > 0 && (i = i2 + 1) >= 0) {
                    float fAbs = fO;
                    float f = fAbs;
                    int i3 = 0;
                    while (true) {
                        float fT = dm5.T(((Number) ksgVar.m()).floatValue(), ((Number) ksgVar.n()).floatValue(), i3 / i);
                        float f2 = fT - fO;
                        if (Math.abs(f2) <= fAbs) {
                            fAbs = Math.abs(f2);
                            f = fT;
                        }
                        if (i3 != i) {
                            i3++;
                        } else {
                            fO = f;
                        }
                    }
                }
                if (fO != drr0Var.s()) {
                    if (fO != drr0Var.s()) {
                        iu30 iu30Var = tb91Var.e;
                        if (iu30Var != null) {
                            iu30Var.invoke(Float.valueOf(fO));
                        } else {
                            tb91Var.d(fO);
                        }
                    }
                    Function0 function0 = tb91Var.b;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                tb91Var.b(0.0f);
                tb91Var.o.invoke();
                return rih1Var;
        }
    }
}
