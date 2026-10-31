package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jx0 {
    public static final jx0 b;
    public static final jx0 c;
    public static final jx0 d;
    public static final jx0 e;
    public static final jx0 f;
    public static final jx0 g;
    public static final jx0 h;
    public static final jx0 i;
    public static final jx0 j;
    public static final jx0 k;
    public static final jx0 l;
    public static final jx0 m;
    public static final jx0 n;
    public static final jx0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final jx0 f57p;
    public static final jx0 q;
    public static final List r;
    public final String a;

    static {
        jx0 jx0Var = new jx0("preroll");
        b = jx0Var;
        jx0 jx0Var2 = new jx0("stream");
        c = jx0Var2;
        jx0 jx0Var3 = new jx0("marquee");
        d = jx0Var3;
        jx0 jx0Var4 = new jx0("sponsored-playlist");
        e = jx0Var4;
        jx0 jx0Var5 = new jx0("active-play-limit");
        jx0 jx0Var6 = new jx0("repeat-play");
        jx0 jx0Var7 = new jx0("podcast-midroll-1");
        f = jx0Var7;
        jx0 jx0Var8 = new jx0("podcast-creator-sponsorship-1");
        g = jx0Var8;
        jx0 jx0Var9 = new jx0("podcast-creator-sponsorship-2");
        h = jx0Var9;
        jx0 jx0Var10 = new jx0("embedded-npv");
        i = jx0Var10;
        jx0 jx0Var11 = new jx0("now-playing-bar");
        j = jx0Var11;
        jx0 jx0Var12 = new jx0("embedded-playlist");
        k = jx0Var12;
        jx0 jx0Var13 = new jx0("app-open");
        l = jx0Var13;
        jx0 jx0Var14 = new jx0("home-above-the-fold");
        jx0 jx0Var15 = new jx0("on-demand-cap-reached");
        m = jx0Var15;
        jx0 jx0Var16 = new jx0("podcast-show-page");
        n = jx0Var16;
        jx0 jx0Var17 = new jx0("podcast-episode-page");
        o = jx0Var17;
        jx0 jx0Var18 = new jx0("music-see-all");
        f57p = jx0Var18;
        jx0 jx0Var19 = new jx0("podcast-see-all");
        q = jx0Var19;
        r = p7h.M(new jx0[]{jx0Var, jx0Var2, jx0Var3, jx0Var4, jx0Var5, jx0Var6, jx0Var7, jx0Var8, jx0Var9, jx0Var10, jx0Var11, jx0Var12, jx0Var13, jx0Var14, jx0Var15, jx0Var16, jx0Var17, jx0Var18, jx0Var19});
    }

    public jx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jx0) && u890.j(this.a, ((jx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
