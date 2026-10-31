package com.spotify.player.model.command.options;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class SkipToTrack$Builder {
    public static SkipToTrack$Builder builder() {
        return SkipToTrack.builder();
    }

    public abstract SkipToTrack build();

    public abstract SkipToTrack$Builder pageIndex(Long l);

    public abstract SkipToTrack$Builder pageUrl(String str);

    public abstract SkipToTrack$Builder trackIndex(Long l);

    public abstract SkipToTrack$Builder trackUid(String str);

    public abstract SkipToTrack$Builder trackUri(String str);
}
