package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p4f implements cvl1, xpw {
    public final String a;
    public final a1r0 b;
    public final ynb0 c;
    public final ynb0 d;
    public final rey0 e = new rey0(new n4f(this, (byte) 0));
    public final idd1 f = new idd1(new o4f(this, (byte) 0));
    public final idd1 g = new idd1(new o4f(this, (byte) 1));
    public final dvm0 h = new dvm0(lbg1.N0, new n4f(this, (byte) 1));
    public final psw i;

    public p4f(String str, a1r0 a1r0Var, ynb0 ynb0Var, ynb0 ynb0Var2) {
        this.a = str;
        this.b = a1r0Var;
        this.c = ynb0Var;
        this.d = ynb0Var2;
        j2i j2iVar = rbi.a;
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
