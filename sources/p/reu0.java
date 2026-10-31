package p;

import com.spotify.player.model.BitrateLevel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class reu0 {
    public static final BitrateLevel a(omz omzVar) {
        switch (omzVar.ordinal()) {
            case 0:
                return BitrateLevel.UNKNOWN;
            case 1:
                return BitrateLevel.LOW;
            case 2:
                return BitrateLevel.NORMAL;
            case 3:
                return BitrateLevel.HIGH;
            case 4:
                return BitrateLevel.VERY_HIGH;
            case 5:
                return BitrateLevel.HIFI;
            case 6:
                return BitrateLevel.HIFI_24;
            case 7:
                return BitrateLevel.HIFI_24;
            case 8:
                return BitrateLevel.UNKNOWN;
            default:
                eg.o();
                return null;
        }
    }
}
