package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aqv {
    public static String a(String str) {
        Set set = s4b1.f;
        String strZ = uic.x("spotify:internal:playlist-edit-coverart:".concat(uic.x(str).h())).z();
        if (strZ != null) {
            return strZ;
        }
        hhg1.n("Required value was null.");
        return null;
    }
}
