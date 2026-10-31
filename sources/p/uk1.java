package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uk1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kbf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uk1(kbf0 kbf0Var, byte b) {
        super(0);
        this.a = b;
        this.b = kbf0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        kbf0 kbf0Var = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(kbf0Var.f());
            case 1:
                return (Float) kbf0Var.getValue();
            case 2:
                return Float.valueOf(kbf0Var.f());
            case 3:
                return Float.valueOf(kbf0Var.f());
            case 4:
                return Float.valueOf(((Number) kbf0Var.getValue()).floatValue());
            case 5:
                return Float.valueOf(kbf0Var.f());
            case 6:
                return (Float) kbf0Var.getValue();
            case 7:
                return Float.valueOf(kbf0Var.f());
            case 8:
                fcf0 fcf0VarD = kbf0Var.d();
                float fA = 0.0f;
                if (fcf0VarD != null) {
                    if (kbf0Var.i() < 0.0f) {
                        bcf0 bcf0VarC = kbf0Var.c();
                        if (bcf0VarC != null) {
                            fA = bcf0VarC.b(fcf0VarD);
                        }
                    } else {
                        bcf0 bcf0VarC2 = kbf0Var.c();
                        fA = bcf0VarC2 != null ? bcf0VarC2.a(fcf0VarD) : 1.0f;
                    }
                }
                return Float.valueOf(fA);
            case 9:
                return Float.valueOf((((Boolean) kbf0Var.d.getValue()).booleanValue() && kbf0Var.e() % 2 == 0) ? -kbf0Var.i() : kbf0Var.i());
            case 10:
                return Boolean.valueOf(kbf0Var.e() == ((Number) kbf0Var.c.getValue()).intValue() && kbf0Var.f() == ((Number) kbf0Var.Z.getValue()).floatValue());
            case 11:
                return Float.valueOf(((Number) kbf0Var.getValue()).floatValue());
            case 12:
                return Float.valueOf(((Number) kbf0Var.getValue()).floatValue());
            case 13:
                return Float.valueOf(kbf0Var.f());
            case 14:
                return Float.valueOf(kbf0Var.f());
            case 15:
                return Float.valueOf(((Number) kbf0Var.getValue()).floatValue());
            case 16:
                return (Float) kbf0Var.getValue();
            default:
                return Float.valueOf(((Number) kbf0Var.getValue()).floatValue());
        }
    }
}
