package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cld0 implements xpw, cvl1 {
    public static final r6h1 e;
    public final lzn0 a;
    public final rey0 b = new rey0(new k2d0(this, (byte) 11));
    public final hy00 c = n3o1.r(this).c(i2d0.Y0, i2d0.Z0);
    public final psw d;

    static {
        String str = nik1.m1.a;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "now-playing-bar";
        x6h1VarI.f = "8.2.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = "";
        x6h1VarI.d = str;
        y6h1 y6h1VarA = x6h1VarI.a();
        r6h1 r6h1Var = r6h1.c;
        e = new r6h1(kk0.l(y6h1VarA), (u8h1) null);
    }

    public cld0(lzn0 lzn0Var) {
        this.a = lzn0Var;
        j2i j2iVar = iwi.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
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
