package com.spotify.nowplayingmini.nowplayingmini;

import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/spotify/nowplayingmini/nowplayingmini/NowPlayingMiniMode;", "", "Empty", "Default", "Podcast", "Greenroom", "Endless", "ReinventFree", "Ad", "src_main_java_com_spotify_nowplayingmini_nowplayingmini-nowplayingmini"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class NowPlayingMiniMode {
    public static final NowPlayingMiniMode Ad;
    public static final NowPlayingMiniMode Default;
    public static final NowPlayingMiniMode Empty;
    public static final NowPlayingMiniMode Endless;
    public static final NowPlayingMiniMode Greenroom;
    public static final NowPlayingMiniMode Podcast;
    public static final NowPlayingMiniMode ReinventFree;
    public static final /* synthetic */ NowPlayingMiniMode[] a;

    static {
        NowPlayingMiniMode nowPlayingMiniMode = new NowPlayingMiniMode("Empty", 0);
        Empty = nowPlayingMiniMode;
        NowPlayingMiniMode nowPlayingMiniMode2 = new NowPlayingMiniMode("Default", 1);
        Default = nowPlayingMiniMode2;
        NowPlayingMiniMode nowPlayingMiniMode3 = new NowPlayingMiniMode("Podcast", 2);
        Podcast = nowPlayingMiniMode3;
        NowPlayingMiniMode nowPlayingMiniMode4 = new NowPlayingMiniMode("Greenroom", 3);
        Greenroom = nowPlayingMiniMode4;
        NowPlayingMiniMode nowPlayingMiniMode5 = new NowPlayingMiniMode("Endless", 4);
        Endless = nowPlayingMiniMode5;
        NowPlayingMiniMode nowPlayingMiniMode6 = new NowPlayingMiniMode("ReinventFree", 5);
        ReinventFree = nowPlayingMiniMode6;
        NowPlayingMiniMode nowPlayingMiniMode7 = new NowPlayingMiniMode("Ad", 6);
        Ad = nowPlayingMiniMode7;
        a = new NowPlayingMiniMode[]{nowPlayingMiniMode, nowPlayingMiniMode2, nowPlayingMiniMode3, nowPlayingMiniMode4, nowPlayingMiniMode5, nowPlayingMiniMode6, nowPlayingMiniMode7};
    }

    public static NowPlayingMiniMode valueOf(String str) {
        return (NowPlayingMiniMode) Enum.valueOf(NowPlayingMiniMode.class, str);
    }

    public static NowPlayingMiniMode[] values() {
        return (NowPlayingMiniMode[]) a.clone();
    }
}
