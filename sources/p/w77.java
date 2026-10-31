package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w77 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xtb0 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w77(xtb0 xtb0Var, ven0 ven0Var) {
        super(0);
        this.a = (byte) 5;
        this.c = ven0Var;
        this.b = xtb0Var;
    }

    public final Object invoke() {
        int i;
        qtb0 qtb0Var;
        byte b = this.a;
        boolean z = true;
        int i2 = 0;
        xtb0 xtb0Var = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                return Integer.valueOf(b87.j(xtb0Var, ven0Var));
            case 1:
                ptb0 ptb0VarH = xtb0Var.h();
                qtb0 qtb0Var2 = (qtb0) o7h.C0(ptb0VarH.l);
                int i3 = qtb0Var2 != null ? qtb0Var2.a : 0;
                boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                int i4 = ptb0VarH.o;
                if (zBooleanValue) {
                    i4--;
                }
                return Boolean.valueOf(i3 >= i4 + (-3));
            case 2:
                float fO = 1.0f;
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    int i5 = itu.b;
                    if (((err0) xtb0Var.e.b).s() <= 0) {
                        qtb0 qtb0Var3 = (qtb0) o7h.s0(xtb0Var.h().l);
                        fO = (qtb0Var3 == null || (i = qtb0Var3.q) == 0) ? 0.0f : yoi1.o(((err0) xtb0Var.e.c).s() / i, 0.0f, 1.0f);
                    }
                }
                return Float.valueOf(fO);
            case 3:
                qtb0 qtb0Var4 = (qtb0) o7h.s0(xtb0Var.h().l);
                if (u890.j(qtb0Var4 != null ? qtb0Var4.l : null, "list_ux_platform_header") && !((Boolean) ven0Var.getValue()).booleanValue() && (qtb0Var = (qtb0) o7h.s0(xtb0Var.h().l)) != null) {
                    i2 = qtb0Var.q;
                }
                return Integer.valueOf(i2);
            case 4:
                ptb0 ptb0VarH2 = xtb0Var.h();
                qtb0 qtb0Var5 = (qtb0) o7h.C0(ptb0VarH2.l);
                int i6 = qtb0Var5 != null ? qtb0Var5.a : 0;
                boolean zBooleanValue2 = ((Boolean) ven0Var.getValue()).booleanValue();
                int i7 = ptb0VarH2.o;
                if (zBooleanValue2) {
                    i7--;
                }
                return Boolean.valueOf(i6 >= i7 + (-5));
            default:
                Integer num = (Integer) ven0Var.getValue();
                if (num != null) {
                    int iIntValue = num.intValue();
                    int iS = ((err0) xtb0Var.e.b).s();
                    qtb0 qtb0Var6 = (qtb0) o7h.C0(xtb0Var.h().l);
                    int i8 = qtb0Var6 != null ? qtb0Var6.a : iS;
                    if (iS > iIntValue || iIntValue > i8) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w77(xtb0 xtb0Var, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = xtb0Var;
        this.c = ven0Var;
    }
}
