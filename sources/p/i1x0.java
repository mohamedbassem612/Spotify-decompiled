package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i1x0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1x0(nm1 nm1Var, byte b) {
        super(1);
        this.a = b;
        this.b = nm1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        nm1 nm1Var = this.b;
        switch (b) {
            case 0:
                c1x0 c1x0Var = (c1x0) obj;
                d0r d0rVar = (d0r) nm1Var.g;
                if (d0rVar != null) {
                    return new m9r0(d3p1.H(d0rVar, (o3r) nm1Var.c, c1x0Var), c1x0Var, (byte) 27);
                }
                x4i1 x4i1Var = c1x0Var.c;
                Integer num = x4i1Var.g;
                String str = x4i1Var.a;
                String str2 = x4i1Var.b;
                String str3 = x4i1Var.e;
                String str4 = str3 == null ? "" : str3;
                String str5 = x4i1Var.c;
                return new huz(new e1x0(str, str2, num, str4, str5 == null ? "" : str5), (byte) 10);
            default:
                ((qtr) obj).b(new gz0(nm1Var, (lnm) null, (byte) 18));
                return rih1.a;
        }
    }
}
