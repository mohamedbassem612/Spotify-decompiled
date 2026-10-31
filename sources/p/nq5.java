package p;

import com.spotify.player.model.ContextTrack;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nq5 {
    public static String a(String str) {
        Set set = s4b1.f;
        v5b1 v5b1Var = uic.x(str).d;
        return u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f) ? uic.x(uic.x(str).A("playlist:")).G(1, 2) : str;
    }

    public static String b(ContextTrack contextTrack) {
        if (contextTrack.metadata().containsKey("image_xlarge_url")) {
            String str = (String) contextTrack.metadata().get("image_xlarge_url");
            if (str != null) {
                return str;
            }
        } else if (contextTrack.metadata().containsKey("image_large_url")) {
            String str2 = (String) contextTrack.metadata().get("image_large_url");
            if (str2 != null) {
                return str2;
            }
        } else {
            String str3 = (String) contextTrack.metadata().get("image_url");
            if (str3 != null) {
                return str3;
            }
        }
        return "";
    }
}
