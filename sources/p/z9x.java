package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z9x implements xpw {
    public final lzn0 a;
    public final zgq b;
    public final oto0 c;
    public final String d;
    public final String e;
    public final idd1 f = new idd1(new x9x(this, (byte) 0));
    public final rey0 g = new rey0(new o8x(this, (byte) 2));
    public final ia00 h = n3o1.q(this).a(new y9x(this, (byte) 0), new y9x(this, (byte) 1));
    public final psw i;
    public final idd1 t;

    public z9x(lzn0 lzn0Var, zgq zgqVar, oto0 oto0Var, String str, String str2) {
        this.a = lzn0Var;
        this.b = zgqVar;
        this.c = oto0Var;
        this.d = str;
        this.e = str2;
        j2i j2iVar = wli.a;
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
        this.t = new idd1(new x9x(this, (byte) 1));
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
