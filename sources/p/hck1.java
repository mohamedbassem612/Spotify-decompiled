package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hck1 {
    public static final hfb b = new hfb((byte) 29);
    public final hce1 a;

    public hck1(sck1 sck1Var) {
        this(sck1Var.o(), sck1Var instanceof ot50 ? ((ot50) sck1Var).N() : gzs.b, n9p1.s(sck1Var));
    }

    public final xbk1 a(Class cls) {
        return b(rc11.a.b(cls));
    }

    public final xbk1 b(tka0 tka0Var) {
        String strO = tka0Var.o();
        if (strO != null) {
            return this.a.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO), tka0Var);
        }
        hhg1.n("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public hck1(rck1 rck1Var, eck1 eck1Var, esn esnVar) {
        this.a = new hce1(rck1Var, eck1Var, esnVar);
    }

    public hck1(rck1 rck1Var, eck1 eck1Var) {
        this(rck1Var, eck1Var, csn.b);
    }

    public hck1(sck1 sck1Var, eck1 eck1Var) {
        this(sck1Var.o(), eck1Var, n9p1.s(sck1Var));
    }
}
