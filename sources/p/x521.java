package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x521 implements xpw {
    public final lzn0 a;
    public final rey0 b = new rey0(new lw11(this, (byte) 5));
    public final ia00 c = n3o1.q(this).a(ok11.W0, new aaq0(this, (byte) 15));
    public final psw d;

    public x521(lzn0 lzn0Var) {
        this.a = lzn0Var;
        j2i j2iVar = new j2i(-506443441, new xyh(this, (byte) 20), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public static String e(String str) {
        w6b1 w6b1VarA = f7b1.a(blc0.Jd);
        if (w6b1VarA == null) {
            eg.m("Failed to retrieve Spotify URI for LinkType");
            return null;
        }
        String str2 = (String) o7h.s0(w6b1VarA.c);
        if (str2 != null) {
            return nhc1.W(str2, "{memberId as text}", str);
        }
        hhg1.n("No valid URI pattern found for LinkType");
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
