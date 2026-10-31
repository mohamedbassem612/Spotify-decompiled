package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e9c implements it80 {
    public static final Set c = f46.S0(new String[]{"spotify:genre:0JQ5DAt0tbjZptfcdMSKl3", "spotify:genre:made-for-x-hub", "spotify:genre:made-for-x-hub-blend"});
    public final lzn0 a;
    public final hr4 b;

    public e9c(lzn0 lzn0Var, hr4 hr4Var) {
        this.a = lzn0Var;
        this.b = hr4Var;
    }

    public static final hrn0 c(e9c e9cVar, s4b1 s4b1Var, th61 th61Var) {
        String strZ = s4b1Var.z();
        if (strZ == null) {
            strZ = "";
        }
        return new hrn0(h7c.class, new j7c(strZ, th61Var.a, s4b1Var.A("page"), strZ), a6w0.a);
    }

    public static final hrn0 d(th61 th61Var) {
        return new hrn0(h7c.class, new j7c("spotify:made-for-you", th61Var.a, "spotify:page:0JQ5DAt0tbjZptfcdMSKl3", "spotify:genre:0JQ5DAt0tbjZptfcdMSKl3"), a6w0.a);
    }

    public final void a(ajq0 ajq0Var) {
        l7m0 l7m0Var = new l7m0(this, (byte) 8);
        ajq0Var.K(blc0.N6, "Page presenting the top level find content as an entry point to search and genres.", l7m0Var);
        ajq0Var.K(blc0.P2, "Page presenting the top level find content as an entry point to search and genres.", l7m0Var);
        ajq0Var.K(blc0.J2, "Page presenting a browse genre.", l7m0Var);
        ajq0Var.K(blc0.Nh, "Page presenting special content in the scope of browse.", l7m0Var);
        if (this.b.a()) {
            c9c c9cVar = new c9c(this, (byte) 0);
            ajq0Var.K(blc0.Qa, "Page presenting Made For You content.", c9cVar);
            ajq0Var.K(blc0.a6, "Page presenting Made For You content.", c9cVar);
        }
        ajq0Var.B("android.intent.action.SEARCH", "Open Find if NPT is enabled or Search if not.", new d9c(new cka(this, (byte) 13)));
    }
}
