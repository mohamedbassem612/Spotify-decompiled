package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n4n0 implements m381 {
    public final /* synthetic */ byte a;
    public final o3r b;

    public n4n0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = w3p1.o(new l4r(pwc0.r, 2, rdb1.W0, new j4r(rdb1.V0), rdb1.X0), leb1.a);
                break;
            default:
                this.b = w3p1.o(new l4r(new wlu(rc11.a.b(mtl.class)), 2, k4n0.f, new j4r(k4n0.e), k4n0.g), m4n0.a);
                break;
        }
    }

    public final o3r b() {
        byte b = this.a;
        return this.b;
    }

    public final boolean r(vhc1 vhc1Var, Object obj) {
        switch (this.a) {
            case 0:
                return ob51.m(vhc1Var.getUri(), ((l4n0) obj).a);
            default:
                qfd qfdVar = ((keb1) obj).a;
                return (qfdVar == null || qfdVar.b || qfdVar.c != 3) ? false : true;
        }
    }
}
