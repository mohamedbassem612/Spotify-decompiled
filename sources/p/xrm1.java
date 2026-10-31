package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xrm1 {
    public static boolean a(String str) {
        if (str.equals("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt")) {
            return true;
        }
        Set set = s4b1.f;
        blc0 blc0Var = uic.x(str).c;
        return blc0Var == blc0.COLLECTION_YOUR_EPISODES || blc0Var == blc0.COLLECTION_YOUR_EPISODES_CORE || blc0Var == blc0.COLLECTION_LISTENLATER_EPISODES;
    }
}
