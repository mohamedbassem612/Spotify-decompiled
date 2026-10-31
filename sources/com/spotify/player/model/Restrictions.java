package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p.j380;
import p.t380;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@JsonDeserialize
public abstract class Restrictions {
    public static final Restrictions EMPTY = builder().build();

    public static abstract class Builder {
        public static Builder builder() {
            return Restrictions.builder();
        }

        public abstract Restrictions build();

        public abstract Builder disallowAddToQueueReasons(Set<String> set);

        public abstract Builder disallowAddToQueueTrackReasons(Set<String> set);

        public abstract Builder disallowInsertingIntoContextTracksReasons(Set<String> set);

        public abstract Builder disallowInsertingIntoNextTracksReasons(Set<String> set);

        public abstract Builder disallowInterruptingPlaybackReasons(Set<String> set);

        public abstract Builder disallowPausingReasons(Set<String> set);

        public abstract Builder disallowPeekingNextReasons(Set<String> set);

        public abstract Builder disallowPeekingPrevReasons(Set<String> set);

        public abstract Builder disallowPlayAsNextInQueueReasons(Set<String> set);

        public abstract Builder disallowRemoteControlReasons(Set<String> set);

        public abstract Builder disallowRemovingFromContextTracksReasons(Set<String> set);

        public abstract Builder disallowRemovingFromNextTracksReasons(Set<String> set);

        public abstract Builder disallowReorderingEnqueuedEpisodeInNextTracksReasons(Set<String> set);

        public abstract Builder disallowReorderingEnqueuedTrackInNextTracksReasons(Set<String> set);

        public abstract Builder disallowReorderingEpisodeInNextTracksReasons(Set<String> set);

        public abstract Builder disallowReorderingInContextTracksReasons(Set<String> set);

        public abstract Builder disallowReorderingInNextTracksReasons(Set<String> set);

        public abstract Builder disallowReorderingTrackInNextTracksReasons(Set<String> set);

        public abstract Builder disallowResumingReasons(Set<String> set);

        public abstract Builder disallowSeekingReasons(Set<String> set);

        public abstract Builder disallowSetQueueReasons(Set<String> set);

        public abstract Builder disallowSettingModes(Map<String, ModeRestrictions> map);

        public abstract Builder disallowSettingPlaybackSpeedReasons(Set<String> set);

        public abstract Builder disallowSignals(Map<String, RestrictionReasons> map);

        public abstract Builder disallowSkippingNextReasons(Set<String> set);

        public abstract Builder disallowSkippingPrevReasons(Set<String> set);

        public abstract Builder disallowSleepTimerClearReasons(Set<String> set);

        public abstract Builder disallowSleepTimerDurationReasons(Set<String> set);

        public abstract Builder disallowSleepTimerEndOfTrackReasons(Set<String> set);

        public abstract Builder disallowSwipeNextReasons(Set<String> set);

        public abstract Builder disallowSwipePrevReasons(Set<String> set);

        public abstract Builder disallowTapToPlayTrackInNextTracksReasons(Set<String> set);

        public abstract Builder disallowTogglingRepeatContextReasons(Set<String> set);

        public abstract Builder disallowTogglingRepeatTrackReasons(Set<String> set);

        public abstract Builder disallowTogglingShuffleReasons(Set<String> set);

        public abstract Builder disallowTransferringPlaybackReasons(Set<String> set);

        public abstract Builder disallowUpdatingContextReasons(Set<String> set);

        public abstract Builder disallowViewingOrderedTracksInNextTracksReasons(Set<String> set);

        public abstract Builder disallowViewingQueueReasons(Set<String> set);
    }

    @JsonDeserialize
    public static abstract class RestrictionReasons {

        public static abstract class Builder {
            public static Builder builder() {
                return RestrictionReasons.builder();
            }

            public abstract RestrictionReasons build();

            public abstract Builder reasons(Set<String> set);
        }

        public static Builder builder() {
            return new AutoValue_Restrictions_RestrictionReasons.Builder();
        }

        public abstract t380 reasons();
    }

    public static Builder builder() {
        AutoValue_Restrictions.Builder builder = new AutoValue_Restrictions.Builder();
        Set<String> set = Collections.EMPTY_SET;
        Builder builderDisallowSettingPlaybackSpeedReasons = builder.disallowPausingReasons(set).disallowResumingReasons(set).disallowSeekingReasons(set).disallowPeekingPrevReasons(set).disallowPeekingNextReasons(set).disallowSkippingPrevReasons(set).disallowSkippingNextReasons(set).disallowSwipeNextReasons(set).disallowSwipePrevReasons(set).disallowTogglingRepeatContextReasons(set).disallowTogglingRepeatTrackReasons(set).disallowTogglingShuffleReasons(set).disallowSetQueueReasons(set).disallowAddToQueueReasons(set).disallowInterruptingPlaybackReasons(set).disallowTransferringPlaybackReasons(set).disallowRemoteControlReasons(set).disallowInsertingIntoNextTracksReasons(set).disallowInsertingIntoContextTracksReasons(set).disallowReorderingInNextTracksReasons(set).disallowReorderingInContextTracksReasons(set).disallowRemovingFromNextTracksReasons(set).disallowUpdatingContextReasons(set).disallowRemovingFromContextTracksReasons(set).disallowSettingPlaybackSpeedReasons(set);
        Map<String, RestrictionReasons> map = Collections.EMPTY_MAP;
        return builderDisallowSettingPlaybackSpeedReasons.disallowSettingModes(map).disallowSignals(map).disallowPlayAsNextInQueueReasons(set).disallowSleepTimerClearReasons(set).disallowSleepTimerDurationReasons(set).disallowSleepTimerEndOfTrackReasons(set).disallowAddToQueueTrackReasons(set).disallowTapToPlayTrackInNextTracksReasons(set).disallowReorderingTrackInNextTracksReasons(set).disallowReorderingEpisodeInNextTracksReasons(set).disallowReorderingEnqueuedTrackInNextTracksReasons(set).disallowReorderingEnqueuedEpisodeInNextTracksReasons(set).disallowViewingQueueReasons(set).disallowViewingOrderedTracksInNextTracksReasons(set);
    }

    public abstract t380 disallowAddToQueueReasons();

    public abstract t380 disallowAddToQueueTrackReasons();

    public abstract t380 disallowInsertingIntoContextTracksReasons();

    public abstract t380 disallowInsertingIntoNextTracksReasons();

    public abstract t380 disallowInterruptingPlaybackReasons();

    public abstract t380 disallowPausingReasons();

    public abstract t380 disallowPeekingNextReasons();

    public abstract t380 disallowPeekingPrevReasons();

    public abstract t380 disallowPlayAsNextInQueueReasons();

    public abstract t380 disallowRemoteControlReasons();

    public abstract t380 disallowRemovingFromContextTracksReasons();

    public abstract t380 disallowRemovingFromNextTracksReasons();

    public abstract t380 disallowReorderingEnqueuedEpisodeInNextTracksReasons();

    public abstract t380 disallowReorderingEnqueuedTrackInNextTracksReasons();

    public abstract t380 disallowReorderingEpisodeInNextTracksReasons();

    public abstract t380 disallowReorderingInContextTracksReasons();

    public abstract t380 disallowReorderingInNextTracksReasons();

    public abstract t380 disallowReorderingTrackInNextTracksReasons();

    public abstract t380 disallowResumingReasons();

    public abstract t380 disallowSeekingReasons();

    public abstract t380 disallowSetQueueReasons();

    public abstract j380 disallowSettingModes();

    public abstract t380 disallowSettingPlaybackSpeedReasons();

    public abstract j380 disallowSignals();

    public abstract t380 disallowSkippingNextReasons();

    public abstract t380 disallowSkippingPrevReasons();

    public abstract t380 disallowSleepTimerClearReasons();

    public abstract t380 disallowSleepTimerDurationReasons();

    public abstract t380 disallowSleepTimerEndOfTrackReasons();

    public abstract t380 disallowSwipeNextReasons();

    public abstract t380 disallowSwipePrevReasons();

    public abstract t380 disallowTapToPlayTrackInNextTracksReasons();

    public abstract t380 disallowTogglingRepeatContextReasons();

    public abstract t380 disallowTogglingRepeatTrackReasons();

    public abstract t380 disallowTogglingShuffleReasons();

    public abstract t380 disallowTransferringPlaybackReasons();

    public abstract t380 disallowUpdatingContextReasons();

    public abstract t380 disallowViewingOrderedTracksInNextTracksReasons();

    public abstract t380 disallowViewingQueueReasons();

    public abstract Builder toBuilder();
}
