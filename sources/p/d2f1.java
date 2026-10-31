package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d2f1 {
    public final xx4 a;
    public final m021 b;
    public final jq4 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public d2f1(xx4 xx4Var, m021 m021Var, jq4 jq4Var) {
        this.a = xx4Var;
        this.b = m021Var;
        this.c = jq4Var;
        this.d = jq4Var.n();
        this.e = xx4Var.a();
        this.f = jq4Var.m();
        this.g = jq4Var.g();
    }

    public static boolean a(String str, le30 le30Var) {
        if (le30Var == le30.S0 || str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks")) {
            return true;
        }
        return nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false);
    }

    public final int b(cij1 cij1Var) {
        boolean zM;
        boolean z = cij1Var.b;
        List list = cij1Var.d;
        Map map = cij1Var.f;
        m021 m021Var = this.b;
        if (((xp4) m021Var.c).a() && ((yp4) m021Var.b).b()) {
            zM = m021Var.m(list, map) && poo1.D(list, map) != null;
        } else {
            zM = m021Var.m(list, map);
        }
        if (zM) {
            return 3;
        }
        if (!Boolean.parseBoolean((String) map.get("is_video_first"))) {
            boolean zA = a(cij1Var.a, cij1Var.c);
            jq4 jq4Var = this.c;
            if (zA) {
                if (jq4Var.e()) {
                    return 2;
                }
            } else if ((!z || jq4Var.h() || cij1Var.e.b) && (z || jq4Var.f())) {
                return 2;
            }
        }
        return 1;
    }
}
