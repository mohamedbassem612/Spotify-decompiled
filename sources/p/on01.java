package p;

import com.spotify.search.recentslistimpl.events.proto.RecentSearchesError;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class on01 {
    public static final blc0[] f = {blc0.BROWSE_GENRES, blc0.BROWSE_HUBS, blc0.COLLECTION_TRACKS, blc0.CULTURALMOMENTHUB, blc0.CREATE_AI_PLAYLIST, blc0.PROMPTED_PLAYLIST, blc0.SETTINGS, blc0.JAM, blc0.JAM_AUTOPLAY, blc0.HOME_ROOT};
    public final xrc0 a;
    public final iyc0 b;
    public final hc51 c;
    public final q8n d;
    public final t2j0 e;

    public on01(xrc0 xrc0Var, iyc0 iyc0Var, hc51 hc51Var, q8n q8nVar, t2j0 t2j0Var) {
        this.a = xrc0Var;
        this.b = iyc0Var;
        this.c = hc51Var;
        this.d = q8nVar;
        this.e = t2j0Var;
    }

    public final void a(int i, String str, String str2) {
        String str3;
        pn01 pn01VarN = RecentSearchesError.n();
        pn01VarN.r(ywx0.f(i));
        pn01VarN.q(str2);
        if (str != null) {
            List listQ0 = ihc1.Q0(str, new String[]{":"}, 0, 6);
            if (!u890.j(o7h.s0(listQ0), "spotify") || listQ0.size() <= 1) {
                str3 = (String) o7h.s0(listQ0);
                if (str3 == null) {
                    str3 = "unknown";
                }
            } else {
                str3 = (String) listQ0.get(1);
            }
            pn01VarN.n(str3);
        }
        this.e.a(pn01VarN.build());
    }
}
