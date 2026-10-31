package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hls0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kls0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hls0(kls0 kls0Var, byte b) {
        super(1);
        this.a = b;
        this.b = kls0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        kls0 kls0Var = this.b;
        switch (b) {
            case 0:
                fg60 fg60Var = (fg60) kls0Var.b;
                return h5p1.r(fg60Var.a, fg60Var.b, fg60Var.d, (bpb1) kls0Var.f, new mp6(5, (lnm) null, (byte) 5));
            case 1:
                fls0 fls0Var = (fls0) obj;
                fg60 fg60Var2 = (fg60) kls0Var.b;
                boolean z = false;
                boolean z2 = !fg60Var2.b() && fg60Var2.a();
                if (((Boolean) ((bpb1) kls0Var.f).getValue()).booleanValue() && fg60Var2.a()) {
                    z = true;
                }
                return new gls0(z2, z, fls0Var);
            default:
                ((qtr) obj).b(new eri0((avl1) kls0Var, (lnm) null, (byte) 5));
                return rih1.a;
        }
    }
}
