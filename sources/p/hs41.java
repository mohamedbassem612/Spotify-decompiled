package p;

import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hs41 {
    public final zle1 a;

    public static String b(int i, ScrollCardType scrollCardType) {
        if (scrollCardType == null) {
            return prn1.q(i).concat("_LOAD_SCROLL_DATA");
        }
        return scrollCardType + "_" + prn1.q(i) + "_LOAD_SCROLL_DATA";
    }

    public q1m a() {
        return new q1m(this.a, (byte) 1);
    }
}
