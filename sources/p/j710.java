package p;

import com.spotify.player.model.ContextTrack;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j710 implements i710 {
    public final vku a = new vku();
    public final tuz b;

    public j710(cyp cypVar) {
        this.b = cypVar.e();
    }

    public static boolean a(ContextTrack contextTrack) {
        if (contextTrack == null) {
            return false;
        }
        blc0 blc0Var = blc0.TRACK;
        String strUri = contextTrack.uri();
        Set set = s4b1.f;
        return blc0Var == uic.x(strUri).c || blc0.SHOW_EPISODE == uic.x(contextTrack.uri()).c;
    }
}
