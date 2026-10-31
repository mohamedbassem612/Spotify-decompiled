package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class agb1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dgb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ agb1(dgb1 dgb1Var, byte b) {
        super(1);
        this.a = b;
        this.b = dgb1Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    public final Object invoke(Object obj) {
        zfb1 zfb1Var;
        boolean z;
        byte b = this.a;
        v4m v4mVar = v4m.a;
        p840 p840Var = p840.a;
        dgb1 dgb1Var = this.b;
        switch (b) {
            case 0:
                key0 key0Var = (key0) obj;
                h7e0 h7e0Var = key0Var.b;
                boolean z2 = dgb1Var.d;
                ux3 ux3Var = dgb1Var.c;
                d0r d0rVar = dgb1Var.g;
                return h5p1.q(d3p1.H(d0rVar, dgb1Var.X, key0Var), dgb1Var.i ? d3p1.H(d0rVar, dgb1Var.Y, key0Var) : new huz(Boolean.FALSE, (byte) 10), z2 ? d3p1.H(d0rVar, (o3r) dgb1Var.e.d, new i1q0(h7e0Var.getUri(), dgb1Var.a)) : new huz(p840Var, (byte) 10), z2 ? d3p1.H(d0rVar, dgb1Var.f.a, new g1q0(h7e0Var.getUri())) : new huz(v4mVar, (byte) 10), ux3Var.a() ? ux3Var.b() : new huz(Boolean.FALSE, (byte) 10), new du((lnm) null, (byte) 1));
            case 1:
                key0 key0Var2 = (key0) obj;
                d0r d0rVar2 = dgb1Var.g;
                i1r i1rVarB = d0rVar2.b(dgb1Var.X.a(key0Var2));
                i1r i1rVar = i1rVarB instanceof i1r ? i1rVarB : null;
                if (i1rVar == null || (zfb1Var = (zfb1) i1rVar.a) == null) {
                    zfb1Var = new zfb1(null, null, null);
                }
                hwq hwqVar = key0Var2.a;
                h7e0 h7e0Var2 = key0Var2.b;
                Boolean bool = zfb1Var.a;
                uw9 uw9Var = zfb1Var.c;
                if (dgb1Var.i) {
                    k1r k1rVarB = d0rVar2.b(dgb1Var.Y.a(key0Var2));
                    i1r i1rVar2 = k1rVarB instanceof i1r ? (i1r) k1rVarB : null;
                    if (i1rVar2 == null || !((Boolean) i1rVar2.a).booleanValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                return new eob1(hwqVar, h7e0Var2, bool, z, false, uw9Var, dgb1Var.d ? new vj90(v4mVar, p840Var) : new uj90(uyn1.F(zfb1Var)));
            default:
                ((qtr) obj).b(new bgb1((avl1) dgb1Var, (lnm) null, (byte) 0));
                return rih1.a;
        }
    }
}
