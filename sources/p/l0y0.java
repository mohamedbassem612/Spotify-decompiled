package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l0y0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m0y0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0y0(m0y0 m0y0Var, byte b) {
        super(1);
        this.a = b;
        this.b = m0y0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        yqu0 yqu0Var;
        byte b = this.a;
        m0y0 m0y0Var = this.b;
        switch (b) {
            case 0:
                m0y0Var.getClass();
                y6w0 y6w0Var = new y6w0(m0y0Var, (byte) 15);
                ((ji50) obj).b.put(k0y0.class, r4o1.Q(xox0.Z0, f46.S0(new yp21[]{new yp21(gw81.class), new yp21(jo70.class), new yp21(xkk1.class)}), y6w0Var, gbw0.Y0));
                return rih1.a;
            default:
                k0y0 k0y0Var = (k0y0) obj;
                yqu0 yqu0Var2 = m0y0Var.c;
                String str = k0y0Var.b;
                if (!ihc1.y0(str)) {
                    if (str.equals((String) yqu0Var2.b)) {
                        z2 = true;
                    } else {
                        z = !u890.j(((dma1) yqu0Var2.c).e(mzx0.a, (String) null), str);
                    }
                    if (z2) {
                        yqu0Var = m0y0Var.c;
                        if (!ihc1.y0(str)) {
                            yqu0Var.b = str;
                            hma1 hma1VarEdit = ((dma1) yqu0Var.c).edit();
                            hma1VarEdit.d(mzx0.a, str);
                            hma1VarEdit.g();
                        }
                    }
                    return new hv70(l1d.m("image_link_carousel_", k0y0Var.c), new i460(k0y0Var.c, 4, k0y0Var.d, (String) null, z2, k0y0Var.f), k0y0Var.e, false, (n1x) null, 112);
                }
                z = false;
                z2 = z;
                if (z2) {
                    yqu0Var = m0y0Var.c;
                    if (!ihc1.y0(str)) {
                        yqu0Var.b = str;
                        hma1 hma1VarEdit2 = ((dma1) yqu0Var.c).edit();
                        hma1VarEdit2.d(mzx0.a, str);
                        hma1VarEdit2.g();
                    }
                }
                return new hv70(l1d.m("image_link_carousel_", k0y0Var.c), new i460(k0y0Var.c, 4, k0y0Var.d, (String) null, z2, k0y0Var.f), k0y0Var.e, false, (n1x) null, 112);
        }
    }
}
