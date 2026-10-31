package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kjn0 implements xpw {
    public final lzn0 a;
    public final rey0 b = new rey0(new ec3(this, (byte) 5));
    public final ia00 c = n3o1.q(this).a(fmk0.Z0, new kds(this, (byte) 25));
    public final psw d;

    public kjn0(lzn0 lzn0Var) {
        this.a = lzn0Var;
        j2i j2iVar = e3j.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public static String g(int i, String str) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return cfm0.i("spotify:account-management:member-details:update-name:", str, nik1.j0).a;
        }
        if (iC == 1) {
            return cfm0.i("spotify:internal:parental-control:update-name:", str, nik1.q0).a;
        }
        eg.o();
        return null;
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
