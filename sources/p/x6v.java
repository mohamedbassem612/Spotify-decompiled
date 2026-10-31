package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x6v extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6v(int i, int i2, ven0 ven0Var, ven0 ven0Var2, ss50 ss50Var, xtb0 xtb0Var, ven0 ven0Var3) {
        super(1);
        this.b = i;
        this.c = i2;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.g = ss50Var;
        this.h = xtb0Var;
        this.f = ven0Var3;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x003a  */
    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = false;
        Object obj2 = this.h;
        int i = this.c;
        int i2 = this.b;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                fde1 fde1Var = fde1.a;
                ((ven0) obj6).setValue(fde1Var);
                bs51.d((ven0) obj5, (ss50) obj3, (xtb0) obj2, (ven0) obj4, new oz(fde1Var, yoi1.p(i2 - jch0.U(fFloatValue), 0, i2), i, i2));
                return rih1.a;
            default:
                y9e1 y9e1VarH = fqo1.H((y9e1[]) obj6, (yae1) obj5, (lee1) obj4, this.c, (pzg1) obj3, ((Number) obj).intValue());
                n1d0 n1d0Var = new n1d0((znb0) obj2, (byte) 1);
                if (i2 <= 0) {
                    z = true;
                } else {
                    boolean zD = y9e1VarH.d();
                    zrm0 zrm0Var = y9e1VarH.b;
                    if (zD) {
                        int i3 = zrm0Var.f - 1;
                        if (i2 <= zrm0Var.c(i3, false)) {
                            if (zrm0Var.d(i2 - 1) >= i3 && zrm0Var.i(i3)) {
                                float fE = y9e1VarH.e(i2, true);
                                if (y9e1VarH.j(i2) != 2) {
                                    fE = i - fE;
                                }
                                if (fE >= ((Number) n1d0Var.invoke()).intValue()) {
                                    z = true;
                                }
                            } else {
                                z = true;
                            }
                        }
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6v(int i, int i2, y9e1[] y9e1VarArr, yae1 yae1Var, lee1 lee1Var, pzg1 pzg1Var, znb0 znb0Var) {
        super(1);
        this.b = i;
        this.c = i2;
        this.d = y9e1VarArr;
        this.e = yae1Var;
        this.f = lee1Var;
        this.g = pzg1Var;
        this.h = znb0Var;
    }
}
