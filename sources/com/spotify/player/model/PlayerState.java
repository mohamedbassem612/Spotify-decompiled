package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p.b380;
import p.i5w0;
import p.j380;
import p.j5;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@JsonDeserialize
public abstract class PlayerState {
    public static final PlayerState EMPTY = builder().build();

    public static abstract class Builder {
        public static Builder builder() {
            return PlayerState.builder();
        }

        public abstract Builder adBreakContext(AdBreakContext adBreakContext);

        public abstract Builder audioStream(AudioStream audioStream);

        public abstract PlayerState build();

        public abstract Builder contextMetadata(Map<String, String> map);

        public abstract Builder contextRestrictions(Restrictions restrictions);

        public abstract Builder contextUri(String str);

        public abstract Builder contextUrl(String str);

        public abstract Builder duration(Long l);

        public abstract Builder format(Format format);

        public abstract Builder index(ContextIndex contextIndex);

        public abstract Builder isBuffering(boolean z);

        public abstract Builder isPaused(boolean z);

        public abstract Builder isPlaying(boolean z);

        public abstract Builder isSystemInitiated(boolean z);

        public abstract Builder nextTracks(List<ContextTrack> list);

        public abstract Builder options(PlayerOptions playerOptions);

        public abstract Builder pageMetadata(Map<String, String> map);

        public abstract Builder playOrigin(PlayOrigin playOrigin);

        public abstract Builder playbackId(String str);

        public abstract Builder playbackQuality(PlaybackQuality playbackQuality);

        public abstract Builder playbackSpeed(Double d);

        public abstract Builder positionAsOfTimestamp(Long l);

        public abstract Builder prevTracks(List<ContextTrack> list);

        public abstract Builder queueRevision(String str);

        public abstract Builder restrictions(Restrictions restrictions);

        public abstract Builder sessionCommandId(String str);

        public abstract Builder sessionId(String str);

        public abstract Builder signals(List<String> list);

        public abstract Builder sleepTimer(SleepTimer sleepTimer);

        public abstract Builder suppressions(Suppressions suppressions);

        public abstract Builder timestamp(long j);

        public abstract Builder track(ContextTrack contextTrack);
    }

    public static Builder builder() {
        Builder builderContextUrl = new AutoValue_PlayerState.Builder().timestamp(0L).contextUri("").contextUrl("");
        Restrictions restrictions = Restrictions.EMPTY;
        Builder builderSuppressions = builderContextUrl.contextRestrictions(restrictions).options(PlayerOptions.EMPTY).restrictions(restrictions).playOrigin(PlayOrigin.create("")).isPlaying(false).isPaused(false).isBuffering(false).isSystemInitiated(false).suppressions(Suppressions.EMPTY);
        List<String> list = Collections.EMPTY_LIST;
        Builder builderNextTracks = builderSuppressions.prevTracks(list).nextTracks(list);
        Map<String, String> map = Collections.EMPTY_MAP;
        return builderNextTracks.contextMetadata(map).pageMetadata(map).sessionId("").queueRevision("0").signals(list).audioStream(AudioStream.DEFAULT);
    }

    public abstract spq0 adBreakContext();

    public abstract AudioStream audioStream();

    public abstract j380 contextMetadata();

    public abstract Restrictions contextRestrictions();

    public abstract String contextUri();

    public abstract String contextUrl();

    public abstract spq0 duration();

    public abstract spq0 format();

    public abstract spq0 index();

    public abstract boolean isBuffering();

    public abstract boolean isPaused();

    public abstract boolean isPlaying();

    public abstract boolean isSystemInitiated();

    public abstract b380 nextTracks();

    public abstract PlayerOptions options();

    public abstract j380 pageMetadata();

    public abstract PlayOrigin playOrigin();

    public abstract spq0 playbackId();

    public abstract spq0 playbackQuality();

    public abstract spq0 playbackSpeed();

    public spq0 position(long j) {
        if (!positionAsOfTimestamp().c()) {
            return j5.a;
        }
        return new i5w0(Long.valueOf(((Long) positionAsOfTimestamp().b()).longValue() + ((long) (((Double) playbackSpeed().e(Double.valueOf(0.0d))).doubleValue() * (j - timestamp())))));
    }

    public abstract spq0 positionAsOfTimestamp();

    public abstract b380 prevTracks();

    public abstract String queueRevision();

    public abstract Restrictions restrictions();

    public abstract spq0 sessionCommandId();

    public abstract String sessionId();

    public abstract b380 signals();

    public abstract spq0 sleepTimer();

    public abstract Suppressions suppressions();

    public abstract long timestamp();

    public abstract Builder toBuilder();

    public abstract spq0 track();
}
