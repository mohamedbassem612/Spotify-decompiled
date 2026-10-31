package p;

import com.spotify.player.model.PlayOrigin;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oyq0 implements suk {
    public static final Set a = f46.S0(new uyq0[]{uyq0.u, uyq0.l, uyq0.k, uyq0.s, uyq0.e, uyq0.f39p, uyq0.r, uyq0.j, uyq0.q, uyq0.d, uyq0.n, uyq0.o, uyq0.m, uyq0.c, uyq0.b, uyq0.t, uyq0.f, uyq0.g, uyq0.h, uyq0.i});

    public final boolean b(String str) {
        Set set = a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((uyq0) it.next()).a.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final PlayOrigin c(String str) {
        PlayOrigin.Builder builder = PlayOrigin.builder("partner_mobile_experience-".concat(str));
        a690 a690Var = b690.a;
        return builder.referrerIdentifier("app_integration").build();
    }

    public final fzc e() {
        return fzc.e;
    }

    public final String f() {
        return "spotify_media_browser_root_pme";
    }

    public final m210 h(String str, String str2, tn31 tn31Var) {
        String str3 = tn31Var.c;
        String str4 = str3 == null ? "" : str3;
        String str5 = tn31Var.b;
        return new m210(212, "partner_ui", str5 == null ? "" : str5, (String) null, "app_to_app", "app", (String) null, (String) null, str4, "media_session", str);
    }

    public final hf61 j() {
        return hf61.e;
    }
}
