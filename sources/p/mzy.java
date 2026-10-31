package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mzy implements h271 {
    public final /* synthetic */ byte a;

    public final Object b(u171 u171Var) {
        switch (this.a) {
            case 0:
                String strZ = u171Var.a.b.z();
                if (strZ != null) {
                    return strZ;
                }
                hhg1.n("Required value was null.");
                return null;
            default:
                String strZ2 = u171Var.a.b.z();
                if (strZ2 != null) {
                    return new bbn0(strZ2, u171Var.b);
                }
                hhg1.n("Required value was null.");
                return null;
        }
    }

    public final Object t(v171 v171Var) {
        switch (this.a) {
            case 0:
                return v171Var.a;
            default:
                return new bbn0(v171Var.a, v171Var.b);
        }
    }
}
