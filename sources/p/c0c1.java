package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c0c1 implements xpw, cvl1 {
    public final lzn0 a;
    public final rey0 b = new rey0(new bxb1(this, (byte) 1));
    public final hy00 c = n3o1.r(this).c(vva1.e1, new zbb1(this, (byte) 3));
    public final psw d;

    public c0c1(lzn0 lzn0Var) {
        this.a = lzn0Var;
        j2i j2iVar = flj.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public static String e(b0c1 b0c1Var) {
        return f4i1.f("spotify:internal:parental-control:remove-teen:", b0c1Var.a, "");
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
