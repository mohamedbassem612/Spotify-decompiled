package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gkl1 {
    public static boolean a(ln21 ln21Var) {
        l370 l370Var = ln21Var.a;
        boolean zF = l370Var.f();
        String str = l370Var.d;
        if (zF) {
            if ("wgint.spotify.net".equals(str) || nhc1.R(str, ".spotify.com", false)) {
                return true;
            }
            if (ln21Var.c(wf90.class) != null && nhc1.R(str, ".spotify.com", false)) {
                return true;
            }
        }
        return false;
    }
}
