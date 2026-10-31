package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c101 implements xpw {
    public final kgq a;
    public final String b;
    public final String c;
    public final b0i0 d;
    public final rey0 e;
    public final idd1 f;
    public final idd1 g;
    public final ia00 h;
    public final psw i;

    public c101(ytp0 ytp0Var, kgq kgqVar, String str, String str2) {
        this.a = kgqVar;
        this.b = str;
        this.c = str2;
        mmv0.a.getClass();
        this.d = ytp0Var.k(lmv0.b);
        this.e = new rey0(krz0.c);
        this.f = new idd1(new vwz0(this, (byte) 2));
        this.g = new idd1(ijz0.g);
        this.h = n3o1.q(this).a(new b101(this, (byte) 0), new b101(this, (byte) 1));
        j2i j2iVar = new j2i(392376663, new zyy0(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
