package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nn50 implements xpw {
    public final lzn0 a;
    public final String b;
    public final rey0 c = new rey0(new gn50(this, (byte) 1));
    public final ia00 d = n3o1.q(this).a(new mn50(this, (byte) 0), new mn50(this, (byte) 1));
    public final psw e;

    public nn50(String str, lzn0 lzn0Var) {
        this.a = lzn0Var;
        this.b = str;
        j2i j2iVar = gri.b;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
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
