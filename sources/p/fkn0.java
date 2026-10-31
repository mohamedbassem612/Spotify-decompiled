package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fkn0 implements xpw {
    public final lzn0 a;
    public final rey0 b = new rey0(new mbj0(this, 29));
    public final ia00 c = n3o1.q(this).a(fmk0.a1, new kds(this, (byte) 26));
    public final psw d;

    public fkn0(lzn0 lzn0Var) {
        this.a = lzn0Var;
        j2i j2iVar = f3j.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public static String e(String str) {
        return cfm0.i("spotify:account-management:member-details:update-name:", str, nik1.j0).a;
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
