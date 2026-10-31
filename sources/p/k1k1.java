package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k1k1 implements xpw {
    public final lzn0 a;
    public final rey0 b = new rey0(new g2j1(this, (byte) 18));
    public final ia00 c = n3o1.q(this).a(cxj1.e, new zbb1(this, (byte) 14));
    public final psw d;

    public k1k1(lzn0 lzn0Var) {
        this.a = lzn0Var;
        j2i j2iVar = crj.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public static String e(j1k1 j1k1Var) {
        kik1 kik1Var;
        ibg0 ibg0Var = j1k1Var.b;
        String strP = cy30.p("spotify:internal:managed-account-details:", ibg0Var.a, ":", j1k1Var.a, ":video-settings");
        int iOrdinal = ibg0Var.ordinal();
        if (iOrdinal == 0) {
            kik1Var = nik1.W3;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            kik1Var = nik1.V3;
        }
        return kik1Var.b(strP).a;
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
