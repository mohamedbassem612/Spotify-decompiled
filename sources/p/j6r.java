package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j6r implements xpw {
    public final nwa a;
    public final lzn0 b;
    public final rey0 c = new rey0(new mgl(this, (byte) 23));
    public final ia00 d = n3o1.q(this).a(zho.X, new v08(this, (byte) 19));
    public final psw e;

    public j6r(nwa nwaVar, lzn0 lzn0Var) {
        this.a = nwaVar;
        this.b = lzn0Var;
        j2i j2iVar = new j2i(1075785926, new i6r(this, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public static String e(String str) {
        int iC = l1d.C(2);
        if (iC == 0) {
            return nik1.i0.b("spotify:account-management:member-details:update-birthday:".concat(str)).a;
        }
        if (iC == 1) {
            return nik1.t0.b("spotify:internal:parental-control:update-birthday:".concat(str)).a;
        }
        eg.o();
        return null;
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
