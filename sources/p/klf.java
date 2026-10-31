package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class klf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ klf(boolean z, boolean z2, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        boolean z2 = this.c;
        boolean z3 = this.b;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 2);
                b261.E(e261Var, kbb.n(z3));
                if (z2) {
                    b261.a(e261Var);
                }
                return rih1Var;
            case 1:
                dm20 dm20Var = (dm20) obj;
                String str = dm20Var.a;
                kl20 kl20Var = dm20Var.c;
                int iOrdinal = kl20Var.ordinal();
                boolean z4 = kl20Var.f;
                if (iOrdinal != 3) {
                    if (iOrdinal != 12) {
                        z = z4;
                    } else if (!z4 || !z2) {
                        z = false;
                    }
                } else if (!z4 || !z3) {
                    z = false;
                }
                if (z) {
                    return str;
                }
                return null;
            case 2:
                String str2 = ((um01) obj).b;
                if ((z3 && sgy.c(str2)) || (z2 && sgy.d(str2))) {
                    return str2;
                }
                return null;
            default:
                ez20 ez20Var = (ez20) obj;
                if (!z3 && !z2) {
                    z = false;
                }
                ez20Var.c(z);
                return rih1Var;
        }
    }
}
