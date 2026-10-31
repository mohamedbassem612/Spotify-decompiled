package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class dcj1 {
    public static final xr6 a = new xr6(dbj1.class.getName());

    public static ia00 a(paj1 paj1Var, boolean z) {
        int iOrdinal = paj1Var.ordinal();
        xr6 xr6Var = a;
        if (iOrdinal != 0) {
            return iOrdinal != 2 ? xr6Var.a(k3j1.h, k3j1.i) : xr6Var.a(k3j1.X, k3j1.Y);
        }
        return xr6Var.a(k3j1.t, new ccj1(z));
    }
}
