package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lia0 extends g6b0 {
    public static final /* synthetic */ mma0[] h = {new cey0(lia0.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0)};
    public jia0 f;
    public final toe0 g;

    public lia0(voe0 voe0Var) {
        super(voe0Var);
        this.g = new toe0(voe0Var, new na(this, voe0Var, (byte) 23));
        int iC = l1d.C(1);
        if (iC != 0) {
            if (iC == 1) {
                c(false);
            } else if (iC == 2) {
                c(true);
            } else {
                eg.o();
                throw null;
            }
        }
    }

    public final oia0 L() {
        mma0 mma0Var = h[0];
        return (oia0) this.g.invoke();
    }

    @Override // p.g6b0
    public final yz1 d() {
        return L();
    }

    @Override // p.g6b0
    public final Iterable n() {
        return o7h.M0(super.n(), new iia0(this.d, m()));
    }

    @Override // p.g6b0
    public final qct0 q() {
        return L();
    }
}
