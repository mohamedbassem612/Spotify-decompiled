package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class vmd1 {
    public static final o3r a = w3p1.o(new l4r(pwc0.b, 3, kmd1.N0, new j4r(kmd1.Y), kmd1.O0), kmd1.Z);

    public static final c3d0 a(d281 d281Var) {
        int iOrdinal = d281Var.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new c3d0(false);
            }
            if (iOrdinal != 3) {
                eg.o();
                return null;
            }
        }
        return new c3d0(true);
    }

    public static final zob1 b(y1c1 y1c1Var) {
        zob1 m231Var;
        try {
            m231Var = ((w2c1) y1c1Var).U(ad2.class);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            return gio1.b(b7x.a);
        }
        return new z2c1(kmd1.P0, ((w2c1) y1c1Var).U(ad2.class));
    }
}
