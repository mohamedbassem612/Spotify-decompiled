package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z5d extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zob1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5d(u63 u63Var, zob1 zob1Var) {
        super(1);
        this.a = (byte) 2;
        this.b = zob1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        zob1 zob1Var = this.b;
        switch (b) {
            case 0:
                return rrn1.I(new ca10((ioj0) zob1Var.getValue(), (hwt) null), (d6d) obj);
            case 1:
                return zob1Var;
            case 2:
                sfv sfvVar = (sfv) obj;
                whx0 whx0Var = (whx0) zob1Var.getValue();
                hix0 hix0Var = (iix0) whx0Var.a.get(sfvVar.a);
                if (hix0Var == null) {
                    hix0Var = new hix0(false, 0L);
                }
                return new ufv(sfvVar, hix0Var);
            case 3:
                return hu20.c(zob1Var, new cqu0((vgx0) obj, lnmVar, (byte) 19));
            case 4:
                vgx0 vgx0Var = (vgx0) obj;
                whx0 whx0Var2 = (whx0) zob1Var.getValue();
                hix0 hix0Var2 = (iix0) whx0Var2.a.get(vgx0Var.a);
                if (hix0Var2 == null) {
                    hix0Var2 = new hix0(false, 0L);
                }
                return new wgx0(vgx0Var, hix0Var2);
            case 5:
                return zob1Var;
            case 6:
                return zob1Var;
            case 7:
                return zob1Var;
            default:
                return new a1b1(zob1Var, (svi1) obj, (byte) 27);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5d(zob1 zob1Var, byte b) {
        super(1);
        this.a = b;
        this.b = zob1Var;
    }
}
