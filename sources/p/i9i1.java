package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i9i1 {
    public final kt91 a;

    public i9i1(kt91 kt91Var) {
        this.a = kt91Var;
    }

    public final void a(Integer num, String str, Integer num2) {
        lgy lgyVar;
        if (str != null) {
            lgyVar = new lgy();
            lgyVar.c = str;
            lgyVar.a = false;
        } else {
            boolean z = true;
            if (num != null) {
                int iIntValue = num.intValue();
                n57.k(iIntValue != 0, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(iIntValue)});
                lgy lgyVar2 = new lgy();
                Integer num3 = (Integer) lgyVar2.d;
                if (num3 != null && num3.intValue() == 0) {
                    z = false;
                }
                n57.k(z, "Invalid resource ID provided: %s", new Object[]{num3});
                lgyVar2.d = Integer.valueOf(iIntValue);
                lgyVar2.a = false;
                lgyVar = lgyVar2;
            } else {
                if (num2 != null) {
                    n57.k(num2.intValue() != 0, "Invalid resource ID provided: %s", new Object[]{num2});
                    lgyVar = new lgy();
                    Integer num4 = (Integer) lgyVar.d;
                    if (num4 != null && num4.intValue() == 0) {
                        z = false;
                    }
                    n57.k(z, "Invalid resource ID provided: %s", new Object[]{num4});
                    lgyVar.d = num2;
                    lgyVar.a = false;
                } else {
                    lgyVar = null;
                }
                if (lgyVar == null) {
                    return;
                }
            }
        }
        er91 er91VarC = lgyVar.c();
        kt91 kt91Var = this.a;
        if (kt91Var.g()) {
            kt91Var.k(er91VarC);
        } else {
            kt91Var.o(er91VarC);
        }
    }

    public final void b(gax gaxVar) {
        a(gaxVar.a, gaxVar.b, null);
    }

    public final void c(ht61 ht61Var) {
        a(ht61Var.a, null, 2131962202);
    }
}
