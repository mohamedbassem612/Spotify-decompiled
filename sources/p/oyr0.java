package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oyr0 implements xpw {
    public final lzn0 a;
    public final rey0 b = new rey0(new n1r0(this, (byte) 11));
    public final ia00 c = n3o1.q(this).a(jgq0.a1, new aaq0(this, (byte) 3));
    public final psw d;

    public oyr0(lzn0 lzn0Var) {
        this.a = lzn0Var;
        j2i j2iVar = j6j.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public static String e(myr0 myr0Var) {
        boolean z = myr0Var.b;
        String str = myr0Var.a;
        if (!z) {
            return nik1.R5.b("spotify:internal:parental-control:manage-blocked-content:".concat(str)).a;
        }
        return nik1.T5.b("spotify:internal:parental-control:child:" + str + ":manage-content").a;
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
