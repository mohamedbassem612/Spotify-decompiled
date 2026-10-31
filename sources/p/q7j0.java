package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q7j0 implements ya {
    public final agc0 a;

    public static boolean c(String str) {
        Set set = s4b1.f;
        return uic.k(str, new b3i1[]{nyu0.e, wyu0.f});
    }

    public void a() {
        this.a.getClass();
    }

    public boolean accept(Object obj) {
        String str = ((ksk) obj).a;
        this.a.getClass();
        if (!str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") && !str.equals("spotify:collection:tracks") && !str.equals("spotify:internal:collection:tracks") && (!nhc1.Y(str, "spotify:user:", false) || !nhc1.R(str, ":collection", false))) {
            Set set = s4b1.f;
            s4b1 s4b1VarX = uic.x(str);
            v5b1 v5b1Var = s4b1VarX.d;
            if (!u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                if (p7j0.a[s4b1VarX.c.ordinal()] != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean b(String str) {
        this.a.getClass();
        if (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks")) {
            return true;
        }
        return nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false);
    }

    public String d(String str) {
        if (!b(str)) {
            return str;
        }
        a();
        return "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ";
    }
}
