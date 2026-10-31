package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mwa implements xpw {
    public final lzn0 a;
    public final Locale b;
    public final rey0 c = new rey0(new gaa(this, (byte) 9));
    public final ia00 d = n3o1.q(this).a(pn9.Y0, new v08(this, (byte) 2));
    public final psw e;

    public mwa(lzn0 lzn0Var, Locale locale) {
        this.a = lzn0Var;
        this.b = locale;
        j2i j2iVar = new j2i(1061965003, new zk9(this, (byte) 14), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public static String e(lwa lwaVar) {
        return cfm0.i("spotify:account-management:member-details:update-birthday:", lwaVar.b, nik1.i0).a;
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
