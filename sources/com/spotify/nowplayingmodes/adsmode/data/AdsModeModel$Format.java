package com.spotify.nowplayingmodes.adsmode.data;

import kotlin.Metadata;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/spotify/nowplayingmodes/adsmode/data/AdsModeModel$Format", "", "Lcom/spotify/nowplayingmodes/adsmode/data/AdsModeModel$Format;", "VIDEO_AD_VERTICAL", "VIDEO_AD_HORIZONTAL", "AUDIO_AD", "src_main_java_com_spotify_nowplayingmodes_adsmode-adsmode"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum AdsModeModel$Format {
    VIDEO_AD_VERTICAL("video"),
    VIDEO_AD_HORIZONTAL("video"),
    AUDIO_AD("audio");

    public final String a;

    AdsModeModel$Format(String str) {
        this.a = str;
    }

    public final String a(AdsModeModel$Product adsModeModel$Product) {
        return f4i1.f(this.a, "_", adsModeModel$Product.a);
    }
}
