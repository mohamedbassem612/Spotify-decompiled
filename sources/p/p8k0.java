package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p8k0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t8k0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p8k0(t8k0 t8k0Var, byte b) {
        super(1);
        this.a = b;
        this.b = t8k0Var;
    }

    public final Object invoke(Object obj) {
        lhg1 lhg1VarA;
        byte b = this.a;
        t8k0 t8k0Var = this.b;
        switch (b) {
            case 0:
                if (((c8k0) obj) instanceof c8k0) {
                    return h5p1.r(t8k0Var.f.b(), new r6k0(t8k0Var.g.a, (byte) 1), t8k0Var.R0, new huz((Object) null, (byte) 10), new cxl(5, null, (byte) 3));
                }
                eg.o();
                return null;
            case 1:
                ((qtr) obj).b(new u08(t8k0Var, (lnm) null, (byte) 10));
                return rih1.a;
            default:
                mig1 mig1Var = (mig1) obj;
                if (mig1Var != null) {
                    kkg1 kkg1Var = t8k0Var.d;
                    String str = mig1Var.f;
                    kkg1Var.getClass();
                    lhg1VarA = kkg1.a(str);
                } else {
                    lhg1VarA = null;
                }
                String str2 = mig1Var != null ? mig1Var.c : null;
                if (str2 == null) {
                    str2 = "";
                }
                return new i8k0(lhg1VarA, str2);
        }
    }
}
