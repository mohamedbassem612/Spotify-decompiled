package p;

import com.spotify.player.model.ContextTrack;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ln91 {
    public static int a(ContextTrack contextTrack) {
        if (l4o1.I(contextTrack)) {
            Set set = s4b1.f;
            if (uic.x(contextTrack.uri()).c != blc0.SHOW_EPISODE) {
                return 2;
            }
        }
        if (l4o1.J(contextTrack)) {
            return 3;
        }
        return n3o1.s(contextTrack) ? 1 : 4;
    }
}
