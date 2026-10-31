package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class r4e1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r4e1(boolean z, Object obj, byte b) {
        this.a = b;
        this.b = z;
        this.c = obj;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = false;
        Object obj2 = this.c;
        boolean z2 = this.b;
        switch (b) {
            case 0:
                z4e1 z4e1Var = (z4e1) obj2;
                ej4 ej4Var = (f620) obj;
                if (z2) {
                    CharSequence charSequenceB = ej4Var.b();
                    if (charSequenceB != null) {
                        z4e1Var.Q0.l(charSequenceB);
                    }
                    z4e1Var.l1.setValue(Boolean.TRUE);
                    fn31.T(z4e1Var.v1(), null, 0, new v4e1(z4e1Var, null, (byte) 3), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                z4e1 z4e1Var2 = (z4e1) obj2;
                CharSequence charSequence = (af5) obj;
                if (z2) {
                    z4e1Var2.Q0.l(charSequence);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                z4e1 z4e1Var3 = (z4e1) obj2;
                af5 af5Var = (af5) obj;
                if (z2) {
                    ggg1.m(z4e1Var3.Q0, af5Var, false, false, 28);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                tb91 tb91Var = (tb91) obj2;
                e261 e261Var = (e261) obj;
                if (!z2) {
                    b261.a(e261Var);
                }
                b261.A(e261Var, String.valueOf(jch0.U(tb91Var.d.s() * 100.0f) / 100.0f));
                b261.v(e261Var, new nb91(tb91Var, (byte) 1));
                return rih1.a;
        }
    }
}
