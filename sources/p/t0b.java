package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t0b implements l381, m381 {
    public final /* synthetic */ byte a;
    public final o3r b;

    public t0b(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = w3p1.n(new l4r(pwc0.d, 2, ent0.S0, new j4r(ent0.Q0), ent0.T0), new l4r(jd0.f18p, 2, ent0.U0, new j4r(ent0.R0), ent0.V0), new xgr0(this, (byte) 8));
                break;
            default:
                this.b = w3p1.o(new l4r(new wlu(rc11.a.b(mtl.class)), 2, f9z.T0, new j4r(f9z.S0), f9z.U0), fcz.a);
                break;
        }
    }

    public o3r b() {
        byte b = this.a;
        return this.b;
    }

    public boolean r(vhc1 vhc1Var, Object obj) {
        String uri = vhc1Var.getUri();
        mtl mtlVar = ((dcz) obj).a;
        if (eqn1.N(uri)) {
            return (mtlVar != null ? mtlVar.a : null) != ktl.b;
        }
        return false;
    }

    public boolean t(Object obj) {
        String strF = lfb.f(((qxc0) obj).X);
        if (strF == null) {
            strF = "";
        }
        return strF.length() > 0;
    }

    public t0b(e0t e0tVar) {
        this.a = (byte) 0;
        this.b = e0tVar.d;
    }
}
