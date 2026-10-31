package com.spotify.player.model.command.options;

import com.spotify.player.model.AudioStream;
import com.spotify.player.model.Suppressions;
import java.util.Set;
import p.j380;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class PreparePlayOptions$Builder {
    public static PreparePlayOptions$Builder builder() {
        return PreparePlayOptions.builder();
    }

    public abstract PreparePlayOptions$Builder alwaysPlaySomething(boolean z);

    public abstract PreparePlayOptions$Builder audioStream(AudioStream audioStream);

    public abstract PreparePlayOptions build();

    public abstract PreparePlayOptions$Builder configurationOverride(j380 j380Var);

    public abstract PreparePlayOptions$Builder initiallyPaused(boolean z);

    public abstract PreparePlayOptions$Builder license(String str);

    public abstract PreparePlayOptions$Builder playbackId(String str);

    public abstract PreparePlayOptions$Builder playerOptionsOverride(PlayerOptionOverrides playerOptionOverrides);

    public abstract PreparePlayOptions$Builder prefetchLevel(PrefetchLevel prefetchLevel);

    public abstract PreparePlayOptions$Builder seekTo(Long l);

    public abstract PreparePlayOptions$Builder seekToCreatorTimestamp(String str);

    public abstract PreparePlayOptions$Builder sessionId(String str);

    public abstract PreparePlayOptions$Builder skipTo(SkipToTrack skipToTrack);

    public abstract PreparePlayOptions$Builder suppressions(Suppressions suppressions);

    public PreparePlayOptions$Builder suppressions(Set<String> set) {
        return suppressions(Suppressions.create(set));
    }

    public abstract PreparePlayOptions$Builder systemInitiated(boolean z);
}
