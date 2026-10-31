package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yzm1 implements xpw {
    public final String a;
    public final u911 b;
    public final frl1 c;
    public final l911 d;
    public boolean f;
    public final psw i;
    public final idd1 e = new idd1(new yrm1(this, (byte) 6));
    public final eih1 g = new eih1();
    public final k8d1 h = k1o1.u(new td1(this, (lnm) null, (byte) 18));

    public yzm1(String str, u911 u911Var, frl1 frl1Var, k911 k911Var) {
        this.a = str;
        this.b = u911Var;
        this.c = frl1Var;
        this.d = new l911(2, k911Var.a, k911Var.b);
        j2i j2iVar = new j2i(-1999103917, new fbm1(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.i;
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
