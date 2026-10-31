package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fgr {
    public static boolean a(String str, String str2) {
        if (str2.equals(str)) {
            return true;
        }
        if (nhc1.Y(str, "spotify:artist:", false)) {
            String strH0 = ihc1.H0(str, "spotify:artist:");
            if (str2.equals("spotify:list:popular-release-segments-main-roles:artist_".concat(strH0)) || str2.equals("spotify:list:offline-playable-artist:".concat(strH0))) {
                return true;
            }
        }
        return false;
    }
}
