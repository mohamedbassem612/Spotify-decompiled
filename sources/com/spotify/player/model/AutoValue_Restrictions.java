package com.spotify.player.model;

import java.util.Map;
import java.util.Set;
import p.bb00;
import p.eg;
import p.gvg;
import p.j380;
import p.l1d;
import p.mno1;
import p.t380;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
final class AutoValue_Restrictions extends Restrictions {
    private final t380 disallowAddToQueueReasons;
    private final t380 disallowAddToQueueTrackReasons;
    private final t380 disallowInsertingIntoContextTracksReasons;
    private final t380 disallowInsertingIntoNextTracksReasons;
    private final t380 disallowInterruptingPlaybackReasons;
    private final t380 disallowPausingReasons;
    private final t380 disallowPeekingNextReasons;
    private final t380 disallowPeekingPrevReasons;
    private final t380 disallowPlayAsNextInQueueReasons;
    private final t380 disallowRemoteControlReasons;
    private final t380 disallowRemovingFromContextTracksReasons;
    private final t380 disallowRemovingFromNextTracksReasons;
    private final t380 disallowReorderingEnqueuedEpisodeInNextTracksReasons;
    private final t380 disallowReorderingEnqueuedTrackInNextTracksReasons;
    private final t380 disallowReorderingEpisodeInNextTracksReasons;
    private final t380 disallowReorderingInContextTracksReasons;
    private final t380 disallowReorderingInNextTracksReasons;
    private final t380 disallowReorderingTrackInNextTracksReasons;
    private final t380 disallowResumingReasons;
    private final t380 disallowSeekingReasons;
    private final t380 disallowSetQueueReasons;
    private final j380 disallowSettingModes;
    private final t380 disallowSettingPlaybackSpeedReasons;
    private final j380 disallowSignals;
    private final t380 disallowSkippingNextReasons;
    private final t380 disallowSkippingPrevReasons;
    private final t380 disallowSleepTimerClearReasons;
    private final t380 disallowSleepTimerDurationReasons;
    private final t380 disallowSleepTimerEndOfTrackReasons;
    private final t380 disallowSwipeNextReasons;
    private final t380 disallowSwipePrevReasons;
    private final t380 disallowTapToPlayTrackInNextTracksReasons;
    private final t380 disallowTogglingRepeatContextReasons;
    private final t380 disallowTogglingRepeatTrackReasons;
    private final t380 disallowTogglingShuffleReasons;
    private final t380 disallowTransferringPlaybackReasons;
    private final t380 disallowUpdatingContextReasons;
    private final t380 disallowViewingOrderedTracksInNextTracksReasons;
    private final t380 disallowViewingQueueReasons;

    private AutoValue_Restrictions(t380 t380Var, t380 t380Var2, t380 t380Var3, t380 t380Var4, t380 t380Var5, t380 t380Var6, t380 t380Var7, t380 t380Var8, t380 t380Var9, t380 t380Var10, t380 t380Var11, t380 t380Var12, t380 t380Var13, t380 t380Var14, t380 t380Var15, t380 t380Var16, t380 t380Var17, t380 t380Var18, t380 t380Var19, t380 t380Var20, t380 t380Var21, t380 t380Var22, t380 t380Var23, j380 j380Var, j380 j380Var2, t380 t380Var24, t380 t380Var25, t380 t380Var26, t380 t380Var27, t380 t380Var28, t380 t380Var29, t380 t380Var30, t380 t380Var31, t380 t380Var32, t380 t380Var33, t380 t380Var34, t380 t380Var35, t380 t380Var36, t380 t380Var37) {
        this.disallowPausingReasons = t380Var;
        this.disallowResumingReasons = t380Var2;
        this.disallowSeekingReasons = t380Var3;
        this.disallowPeekingPrevReasons = t380Var4;
        this.disallowPeekingNextReasons = t380Var5;
        this.disallowSkippingPrevReasons = t380Var6;
        this.disallowSkippingNextReasons = t380Var7;
        this.disallowTogglingRepeatContextReasons = t380Var8;
        this.disallowTogglingRepeatTrackReasons = t380Var9;
        this.disallowTogglingShuffleReasons = t380Var10;
        this.disallowSetQueueReasons = t380Var11;
        this.disallowAddToQueueReasons = t380Var12;
        this.disallowInterruptingPlaybackReasons = t380Var13;
        this.disallowTransferringPlaybackReasons = t380Var14;
        this.disallowRemoteControlReasons = t380Var15;
        this.disallowInsertingIntoNextTracksReasons = t380Var16;
        this.disallowInsertingIntoContextTracksReasons = t380Var17;
        this.disallowReorderingInNextTracksReasons = t380Var18;
        this.disallowReorderingInContextTracksReasons = t380Var19;
        this.disallowRemovingFromNextTracksReasons = t380Var20;
        this.disallowRemovingFromContextTracksReasons = t380Var21;
        this.disallowUpdatingContextReasons = t380Var22;
        this.disallowSettingPlaybackSpeedReasons = t380Var23;
        this.disallowSettingModes = j380Var;
        this.disallowSignals = j380Var2;
        this.disallowPlayAsNextInQueueReasons = t380Var24;
        this.disallowSleepTimerClearReasons = t380Var25;
        this.disallowSleepTimerDurationReasons = t380Var26;
        this.disallowSleepTimerEndOfTrackReasons = t380Var27;
        this.disallowAddToQueueTrackReasons = t380Var28;
        this.disallowTapToPlayTrackInNextTracksReasons = t380Var29;
        this.disallowReorderingTrackInNextTracksReasons = t380Var30;
        this.disallowReorderingEpisodeInNextTracksReasons = t380Var31;
        this.disallowReorderingEnqueuedTrackInNextTracksReasons = t380Var32;
        this.disallowReorderingEnqueuedEpisodeInNextTracksReasons = t380Var33;
        this.disallowViewingQueueReasons = t380Var34;
        this.disallowViewingOrderedTracksInNextTracksReasons = t380Var35;
        this.disallowSwipeNextReasons = t380Var36;
        this.disallowSwipePrevReasons = t380Var37;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowAddToQueueReasons() {
        return this.disallowAddToQueueReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowAddToQueueTrackReasons() {
        return this.disallowAddToQueueTrackReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowInsertingIntoContextTracksReasons() {
        return this.disallowInsertingIntoContextTracksReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowInsertingIntoNextTracksReasons() {
        return this.disallowInsertingIntoNextTracksReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowInterruptingPlaybackReasons() {
        return this.disallowInterruptingPlaybackReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowPausingReasons() {
        return this.disallowPausingReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowPeekingNextReasons() {
        return this.disallowPeekingNextReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowPeekingPrevReasons() {
        return this.disallowPeekingPrevReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowPlayAsNextInQueueReasons() {
        return this.disallowPlayAsNextInQueueReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowRemoteControlReasons() {
        return this.disallowRemoteControlReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowRemovingFromContextTracksReasons() {
        return this.disallowRemovingFromContextTracksReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowRemovingFromNextTracksReasons() {
        return this.disallowRemovingFromNextTracksReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowReorderingEnqueuedEpisodeInNextTracksReasons() {
        return this.disallowReorderingEnqueuedEpisodeInNextTracksReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowReorderingEnqueuedTrackInNextTracksReasons() {
        return this.disallowReorderingEnqueuedTrackInNextTracksReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowReorderingEpisodeInNextTracksReasons() {
        return this.disallowReorderingEpisodeInNextTracksReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowReorderingInContextTracksReasons() {
        return this.disallowReorderingInContextTracksReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowReorderingInNextTracksReasons() {
        return this.disallowReorderingInNextTracksReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowReorderingTrackInNextTracksReasons() {
        return this.disallowReorderingTrackInNextTracksReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowResumingReasons() {
        return this.disallowResumingReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowSeekingReasons() {
        return this.disallowSeekingReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowSetQueueReasons() {
        return this.disallowSetQueueReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public j380 disallowSettingModes() {
        return this.disallowSettingModes;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowSettingPlaybackSpeedReasons() {
        return this.disallowSettingPlaybackSpeedReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public j380 disallowSignals() {
        return this.disallowSignals;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowSkippingNextReasons() {
        return this.disallowSkippingNextReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowSkippingPrevReasons() {
        return this.disallowSkippingPrevReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowSleepTimerClearReasons() {
        return this.disallowSleepTimerClearReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowSleepTimerDurationReasons() {
        return this.disallowSleepTimerDurationReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowSleepTimerEndOfTrackReasons() {
        return this.disallowSleepTimerEndOfTrackReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowSwipeNextReasons() {
        return this.disallowSwipeNextReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowSwipePrevReasons() {
        return this.disallowSwipePrevReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowTapToPlayTrackInNextTracksReasons() {
        return this.disallowTapToPlayTrackInNextTracksReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowTogglingRepeatContextReasons() {
        return this.disallowTogglingRepeatContextReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowTogglingRepeatTrackReasons() {
        return this.disallowTogglingRepeatTrackReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowTogglingShuffleReasons() {
        return this.disallowTogglingShuffleReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowTransferringPlaybackReasons() {
        return this.disallowTransferringPlaybackReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowUpdatingContextReasons() {
        return this.disallowUpdatingContextReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowViewingOrderedTracksInNextTracksReasons() {
        return this.disallowViewingOrderedTracksInNextTracksReasons;
    }

    @Override // com.spotify.player.model.Restrictions
    public t380 disallowViewingQueueReasons() {
        return this.disallowViewingQueueReasons;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Restrictions) {
            Restrictions restrictions = (Restrictions) obj;
            if (this.disallowPausingReasons.equals(restrictions.disallowPausingReasons()) && this.disallowResumingReasons.equals(restrictions.disallowResumingReasons()) && this.disallowSeekingReasons.equals(restrictions.disallowSeekingReasons()) && this.disallowPeekingPrevReasons.equals(restrictions.disallowPeekingPrevReasons()) && this.disallowPeekingNextReasons.equals(restrictions.disallowPeekingNextReasons()) && this.disallowSkippingPrevReasons.equals(restrictions.disallowSkippingPrevReasons()) && this.disallowSkippingNextReasons.equals(restrictions.disallowSkippingNextReasons()) && this.disallowTogglingRepeatContextReasons.equals(restrictions.disallowTogglingRepeatContextReasons()) && this.disallowTogglingRepeatTrackReasons.equals(restrictions.disallowTogglingRepeatTrackReasons()) && this.disallowTogglingShuffleReasons.equals(restrictions.disallowTogglingShuffleReasons()) && this.disallowSetQueueReasons.equals(restrictions.disallowSetQueueReasons()) && this.disallowAddToQueueReasons.equals(restrictions.disallowAddToQueueReasons()) && this.disallowInterruptingPlaybackReasons.equals(restrictions.disallowInterruptingPlaybackReasons()) && this.disallowTransferringPlaybackReasons.equals(restrictions.disallowTransferringPlaybackReasons()) && this.disallowRemoteControlReasons.equals(restrictions.disallowRemoteControlReasons()) && this.disallowInsertingIntoNextTracksReasons.equals(restrictions.disallowInsertingIntoNextTracksReasons()) && this.disallowInsertingIntoContextTracksReasons.equals(restrictions.disallowInsertingIntoContextTracksReasons()) && this.disallowReorderingInNextTracksReasons.equals(restrictions.disallowReorderingInNextTracksReasons()) && this.disallowReorderingInContextTracksReasons.equals(restrictions.disallowReorderingInContextTracksReasons()) && this.disallowRemovingFromNextTracksReasons.equals(restrictions.disallowRemovingFromNextTracksReasons()) && this.disallowRemovingFromContextTracksReasons.equals(restrictions.disallowRemovingFromContextTracksReasons()) && this.disallowUpdatingContextReasons.equals(restrictions.disallowUpdatingContextReasons()) && this.disallowSettingPlaybackSpeedReasons.equals(restrictions.disallowSettingPlaybackSpeedReasons())) {
                j380 j380Var = this.disallowSettingModes;
                j380 j380VarDisallowSettingModes = restrictions.disallowSettingModes();
                j380Var.getClass();
                if (mno1.l(j380VarDisallowSettingModes, j380Var)) {
                    j380 j380Var2 = this.disallowSignals;
                    j380 j380VarDisallowSignals = restrictions.disallowSignals();
                    j380Var2.getClass();
                    if (mno1.l(j380VarDisallowSignals, j380Var2) && this.disallowPlayAsNextInQueueReasons.equals(restrictions.disallowPlayAsNextInQueueReasons()) && this.disallowSleepTimerClearReasons.equals(restrictions.disallowSleepTimerClearReasons()) && this.disallowSleepTimerDurationReasons.equals(restrictions.disallowSleepTimerDurationReasons()) && this.disallowSleepTimerEndOfTrackReasons.equals(restrictions.disallowSleepTimerEndOfTrackReasons()) && this.disallowAddToQueueTrackReasons.equals(restrictions.disallowAddToQueueTrackReasons()) && this.disallowTapToPlayTrackInNextTracksReasons.equals(restrictions.disallowTapToPlayTrackInNextTracksReasons()) && this.disallowReorderingTrackInNextTracksReasons.equals(restrictions.disallowReorderingTrackInNextTracksReasons()) && this.disallowReorderingEpisodeInNextTracksReasons.equals(restrictions.disallowReorderingEpisodeInNextTracksReasons()) && this.disallowReorderingEnqueuedTrackInNextTracksReasons.equals(restrictions.disallowReorderingEnqueuedTrackInNextTracksReasons()) && this.disallowReorderingEnqueuedEpisodeInNextTracksReasons.equals(restrictions.disallowReorderingEnqueuedEpisodeInNextTracksReasons()) && this.disallowViewingQueueReasons.equals(restrictions.disallowViewingQueueReasons()) && this.disallowViewingOrderedTracksInNextTracksReasons.equals(restrictions.disallowViewingOrderedTracksInNextTracksReasons()) && this.disallowSwipeNextReasons.equals(restrictions.disallowSwipeNextReasons()) && this.disallowSwipePrevReasons.equals(restrictions.disallowSwipePrevReasons())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.disallowSwipePrevReasons.hashCode() ^ ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.disallowPausingReasons.hashCode() ^ 1000003) * 1000003) ^ this.disallowResumingReasons.hashCode()) * 1000003) ^ this.disallowSeekingReasons.hashCode()) * 1000003) ^ this.disallowPeekingPrevReasons.hashCode()) * 1000003) ^ this.disallowPeekingNextReasons.hashCode()) * 1000003) ^ this.disallowSkippingPrevReasons.hashCode()) * 1000003) ^ this.disallowSkippingNextReasons.hashCode()) * 1000003) ^ this.disallowTogglingRepeatContextReasons.hashCode()) * 1000003) ^ this.disallowTogglingRepeatTrackReasons.hashCode()) * 1000003) ^ this.disallowTogglingShuffleReasons.hashCode()) * 1000003) ^ this.disallowSetQueueReasons.hashCode()) * 1000003) ^ this.disallowAddToQueueReasons.hashCode()) * 1000003) ^ this.disallowInterruptingPlaybackReasons.hashCode()) * 1000003) ^ this.disallowTransferringPlaybackReasons.hashCode()) * 1000003) ^ this.disallowRemoteControlReasons.hashCode()) * 1000003) ^ this.disallowInsertingIntoNextTracksReasons.hashCode()) * 1000003) ^ this.disallowInsertingIntoContextTracksReasons.hashCode()) * 1000003) ^ this.disallowReorderingInNextTracksReasons.hashCode()) * 1000003) ^ this.disallowReorderingInContextTracksReasons.hashCode()) * 1000003) ^ this.disallowRemovingFromNextTracksReasons.hashCode()) * 1000003) ^ this.disallowRemovingFromContextTracksReasons.hashCode()) * 1000003) ^ this.disallowUpdatingContextReasons.hashCode()) * 1000003) ^ this.disallowSettingPlaybackSpeedReasons.hashCode()) * 1000003) ^ this.disallowSettingModes.hashCode()) * 1000003) ^ this.disallowSignals.hashCode()) * 1000003) ^ this.disallowPlayAsNextInQueueReasons.hashCode()) * 1000003) ^ this.disallowSleepTimerClearReasons.hashCode()) * 1000003) ^ this.disallowSleepTimerDurationReasons.hashCode()) * 1000003) ^ this.disallowSleepTimerEndOfTrackReasons.hashCode()) * 1000003) ^ this.disallowAddToQueueTrackReasons.hashCode()) * 1000003) ^ this.disallowTapToPlayTrackInNextTracksReasons.hashCode()) * 1000003) ^ this.disallowReorderingTrackInNextTracksReasons.hashCode()) * 1000003) ^ this.disallowReorderingEpisodeInNextTracksReasons.hashCode()) * 1000003) ^ this.disallowReorderingEnqueuedTrackInNextTracksReasons.hashCode()) * 1000003) ^ this.disallowReorderingEnqueuedEpisodeInNextTracksReasons.hashCode()) * 1000003) ^ this.disallowViewingQueueReasons.hashCode()) * 1000003) ^ this.disallowViewingOrderedTracksInNextTracksReasons.hashCode()) * 1000003) ^ this.disallowSwipeNextReasons.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.Restrictions
    public Restrictions.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.disallowPausingReasons);
        String strValueOf2 = String.valueOf(this.disallowResumingReasons);
        String strValueOf3 = String.valueOf(this.disallowSeekingReasons);
        String strValueOf4 = String.valueOf(this.disallowPeekingPrevReasons);
        String strValueOf5 = String.valueOf(this.disallowPeekingNextReasons);
        String strValueOf6 = String.valueOf(this.disallowSkippingPrevReasons);
        String strValueOf7 = String.valueOf(this.disallowSkippingNextReasons);
        String strValueOf8 = String.valueOf(this.disallowTogglingRepeatContextReasons);
        String strValueOf9 = String.valueOf(this.disallowTogglingRepeatTrackReasons);
        String strValueOf10 = String.valueOf(this.disallowTogglingShuffleReasons);
        String strValueOf11 = String.valueOf(this.disallowSetQueueReasons);
        String strValueOf12 = String.valueOf(this.disallowAddToQueueReasons);
        String strValueOf13 = String.valueOf(this.disallowInterruptingPlaybackReasons);
        String strValueOf14 = String.valueOf(this.disallowTransferringPlaybackReasons);
        String strValueOf15 = String.valueOf(this.disallowRemoteControlReasons);
        String strValueOf16 = String.valueOf(this.disallowInsertingIntoNextTracksReasons);
        String strValueOf17 = String.valueOf(this.disallowInsertingIntoContextTracksReasons);
        String strValueOf18 = String.valueOf(this.disallowReorderingInNextTracksReasons);
        String strValueOf19 = String.valueOf(this.disallowReorderingInContextTracksReasons);
        String strValueOf20 = String.valueOf(this.disallowRemovingFromNextTracksReasons);
        String strValueOf21 = String.valueOf(this.disallowRemovingFromContextTracksReasons);
        String strValueOf22 = String.valueOf(this.disallowUpdatingContextReasons);
        String strValueOf23 = String.valueOf(this.disallowSettingPlaybackSpeedReasons);
        String strValueOf24 = String.valueOf(this.disallowSettingModes);
        String strValueOf25 = String.valueOf(this.disallowSignals);
        String strValueOf26 = String.valueOf(this.disallowPlayAsNextInQueueReasons);
        String strValueOf27 = String.valueOf(this.disallowSleepTimerClearReasons);
        String strValueOf28 = String.valueOf(this.disallowSleepTimerDurationReasons);
        String strValueOf29 = String.valueOf(this.disallowSleepTimerEndOfTrackReasons);
        String strValueOf30 = String.valueOf(this.disallowAddToQueueTrackReasons);
        String strValueOf31 = String.valueOf(this.disallowTapToPlayTrackInNextTracksReasons);
        String strValueOf32 = String.valueOf(this.disallowReorderingTrackInNextTracksReasons);
        String strValueOf33 = String.valueOf(this.disallowReorderingEpisodeInNextTracksReasons);
        String strValueOf34 = String.valueOf(this.disallowReorderingEnqueuedTrackInNextTracksReasons);
        String strValueOf35 = String.valueOf(this.disallowReorderingEnqueuedEpisodeInNextTracksReasons);
        String strValueOf36 = String.valueOf(this.disallowViewingQueueReasons);
        String strValueOf37 = String.valueOf(this.disallowViewingOrderedTracksInNextTracksReasons);
        String strValueOf38 = String.valueOf(this.disallowSwipeNextReasons);
        String strValueOf39 = String.valueOf(this.disallowSwipePrevReasons);
        StringBuilder sbN = gvg.n("Restrictions{disallowPausingReasons=", strValueOf, ", disallowResumingReasons=", strValueOf2, ", disallowSeekingReasons=");
        bb00.j(sbN, strValueOf3, ", disallowPeekingPrevReasons=", strValueOf4, ", disallowPeekingNextReasons=");
        bb00.j(sbN, strValueOf5, ", disallowSkippingPrevReasons=", strValueOf6, ", disallowSkippingNextReasons=");
        bb00.j(sbN, strValueOf7, ", disallowTogglingRepeatContextReasons=", strValueOf8, ", disallowTogglingRepeatTrackReasons=");
        bb00.j(sbN, strValueOf9, ", disallowTogglingShuffleReasons=", strValueOf10, ", disallowSetQueueReasons=");
        bb00.j(sbN, strValueOf11, ", disallowAddToQueueReasons=", strValueOf12, ", disallowInterruptingPlaybackReasons=");
        bb00.j(sbN, strValueOf13, ", disallowTransferringPlaybackReasons=", strValueOf14, ", disallowRemoteControlReasons=");
        bb00.j(sbN, strValueOf15, ", disallowInsertingIntoNextTracksReasons=", strValueOf16, ", disallowInsertingIntoContextTracksReasons=");
        bb00.j(sbN, strValueOf17, ", disallowReorderingInNextTracksReasons=", strValueOf18, ", disallowReorderingInContextTracksReasons=");
        bb00.j(sbN, strValueOf19, ", disallowRemovingFromNextTracksReasons=", strValueOf20, ", disallowRemovingFromContextTracksReasons=");
        bb00.j(sbN, strValueOf21, ", disallowUpdatingContextReasons=", strValueOf22, ", disallowSettingPlaybackSpeedReasons=");
        bb00.j(sbN, strValueOf23, ", disallowSettingModes=", strValueOf24, ", disallowSignals=");
        bb00.j(sbN, strValueOf25, ", disallowPlayAsNextInQueueReasons=", strValueOf26, ", disallowSleepTimerClearReasons=");
        bb00.j(sbN, strValueOf27, ", disallowSleepTimerDurationReasons=", strValueOf28, ", disallowSleepTimerEndOfTrackReasons=");
        bb00.j(sbN, strValueOf29, ", disallowAddToQueueTrackReasons=", strValueOf30, ", disallowTapToPlayTrackInNextTracksReasons=");
        bb00.j(sbN, strValueOf31, ", disallowReorderingTrackInNextTracksReasons=", strValueOf32, ", disallowReorderingEpisodeInNextTracksReasons=");
        bb00.j(sbN, strValueOf33, ", disallowReorderingEnqueuedTrackInNextTracksReasons=", strValueOf34, ", disallowReorderingEnqueuedEpisodeInNextTracksReasons=");
        bb00.j(sbN, strValueOf35, ", disallowViewingQueueReasons=", strValueOf36, ", disallowViewingOrderedTracksInNextTracksReasons=");
        bb00.j(sbN, strValueOf37, ", disallowSwipeNextReasons=", strValueOf38, ", disallowSwipePrevReasons=");
        return l1d.n(strValueOf39, "}", sbN);
    }

    public /* synthetic */ AutoValue_Restrictions(t380 t380Var, t380 t380Var2, t380 t380Var3, t380 t380Var4, t380 t380Var5, t380 t380Var6, t380 t380Var7, t380 t380Var8, t380 t380Var9, t380 t380Var10, t380 t380Var11, t380 t380Var12, t380 t380Var13, t380 t380Var14, t380 t380Var15, t380 t380Var16, t380 t380Var17, t380 t380Var18, t380 t380Var19, t380 t380Var20, t380 t380Var21, t380 t380Var22, t380 t380Var23, j380 j380Var, j380 j380Var2, t380 t380Var24, t380 t380Var25, t380 t380Var26, t380 t380Var27, t380 t380Var28, t380 t380Var29, t380 t380Var30, t380 t380Var31, t380 t380Var32, t380 t380Var33, t380 t380Var34, t380 t380Var35, t380 t380Var36, t380 t380Var37, int i) {
        this(t380Var, t380Var2, t380Var3, t380Var4, t380Var5, t380Var6, t380Var7, t380Var8, t380Var9, t380Var10, t380Var11, t380Var12, t380Var13, t380Var14, t380Var15, t380Var16, t380Var17, t380Var18, t380Var19, t380Var20, t380Var21, t380Var22, t380Var23, j380Var, j380Var2, t380Var24, t380Var25, t380Var26, t380Var27, t380Var28, t380Var29, t380Var30, t380Var31, t380Var32, t380Var33, t380Var34, t380Var35, t380Var36, t380Var37);
    }

    public static final class Builder extends Restrictions.Builder {
        private t380 disallowAddToQueueReasons;
        private t380 disallowAddToQueueTrackReasons;
        private t380 disallowInsertingIntoContextTracksReasons;
        private t380 disallowInsertingIntoNextTracksReasons;
        private t380 disallowInterruptingPlaybackReasons;
        private t380 disallowPausingReasons;
        private t380 disallowPeekingNextReasons;
        private t380 disallowPeekingPrevReasons;
        private t380 disallowPlayAsNextInQueueReasons;
        private t380 disallowRemoteControlReasons;
        private t380 disallowRemovingFromContextTracksReasons;
        private t380 disallowRemovingFromNextTracksReasons;
        private t380 disallowReorderingEnqueuedEpisodeInNextTracksReasons;
        private t380 disallowReorderingEnqueuedTrackInNextTracksReasons;
        private t380 disallowReorderingEpisodeInNextTracksReasons;
        private t380 disallowReorderingInContextTracksReasons;
        private t380 disallowReorderingInNextTracksReasons;
        private t380 disallowReorderingTrackInNextTracksReasons;
        private t380 disallowResumingReasons;
        private t380 disallowSeekingReasons;
        private t380 disallowSetQueueReasons;
        private j380 disallowSettingModes;
        private t380 disallowSettingPlaybackSpeedReasons;
        private j380 disallowSignals;
        private t380 disallowSkippingNextReasons;
        private t380 disallowSkippingPrevReasons;
        private t380 disallowSleepTimerClearReasons;
        private t380 disallowSleepTimerDurationReasons;
        private t380 disallowSleepTimerEndOfTrackReasons;
        private t380 disallowSwipeNextReasons;
        private t380 disallowSwipePrevReasons;
        private t380 disallowTapToPlayTrackInNextTracksReasons;
        private t380 disallowTogglingRepeatContextReasons;
        private t380 disallowTogglingRepeatTrackReasons;
        private t380 disallowTogglingShuffleReasons;
        private t380 disallowTransferringPlaybackReasons;
        private t380 disallowUpdatingContextReasons;
        private t380 disallowViewingOrderedTracksInNextTracksReasons;
        private t380 disallowViewingQueueReasons;

        public Builder(Restrictions restrictions) {
            this.disallowPausingReasons = restrictions.disallowPausingReasons();
            this.disallowResumingReasons = restrictions.disallowResumingReasons();
            this.disallowSeekingReasons = restrictions.disallowSeekingReasons();
            this.disallowPeekingPrevReasons = restrictions.disallowPeekingPrevReasons();
            this.disallowPeekingNextReasons = restrictions.disallowPeekingNextReasons();
            this.disallowSkippingPrevReasons = restrictions.disallowSkippingPrevReasons();
            this.disallowSkippingNextReasons = restrictions.disallowSkippingNextReasons();
            this.disallowTogglingRepeatContextReasons = restrictions.disallowTogglingRepeatContextReasons();
            this.disallowTogglingRepeatTrackReasons = restrictions.disallowTogglingRepeatTrackReasons();
            this.disallowTogglingShuffleReasons = restrictions.disallowTogglingShuffleReasons();
            this.disallowSetQueueReasons = restrictions.disallowSetQueueReasons();
            this.disallowAddToQueueReasons = restrictions.disallowAddToQueueReasons();
            this.disallowInterruptingPlaybackReasons = restrictions.disallowInterruptingPlaybackReasons();
            this.disallowTransferringPlaybackReasons = restrictions.disallowTransferringPlaybackReasons();
            this.disallowRemoteControlReasons = restrictions.disallowRemoteControlReasons();
            this.disallowInsertingIntoNextTracksReasons = restrictions.disallowInsertingIntoNextTracksReasons();
            this.disallowInsertingIntoContextTracksReasons = restrictions.disallowInsertingIntoContextTracksReasons();
            this.disallowReorderingInNextTracksReasons = restrictions.disallowReorderingInNextTracksReasons();
            this.disallowReorderingInContextTracksReasons = restrictions.disallowReorderingInContextTracksReasons();
            this.disallowRemovingFromNextTracksReasons = restrictions.disallowRemovingFromNextTracksReasons();
            this.disallowRemovingFromContextTracksReasons = restrictions.disallowRemovingFromContextTracksReasons();
            this.disallowUpdatingContextReasons = restrictions.disallowUpdatingContextReasons();
            this.disallowSettingPlaybackSpeedReasons = restrictions.disallowSettingPlaybackSpeedReasons();
            this.disallowSettingModes = restrictions.disallowSettingModes();
            this.disallowSignals = restrictions.disallowSignals();
            this.disallowPlayAsNextInQueueReasons = restrictions.disallowPlayAsNextInQueueReasons();
            this.disallowSleepTimerClearReasons = restrictions.disallowSleepTimerClearReasons();
            this.disallowSleepTimerDurationReasons = restrictions.disallowSleepTimerDurationReasons();
            this.disallowSleepTimerEndOfTrackReasons = restrictions.disallowSleepTimerEndOfTrackReasons();
            this.disallowAddToQueueTrackReasons = restrictions.disallowAddToQueueTrackReasons();
            this.disallowTapToPlayTrackInNextTracksReasons = restrictions.disallowTapToPlayTrackInNextTracksReasons();
            this.disallowReorderingTrackInNextTracksReasons = restrictions.disallowReorderingTrackInNextTracksReasons();
            this.disallowReorderingEpisodeInNextTracksReasons = restrictions.disallowReorderingEpisodeInNextTracksReasons();
            this.disallowReorderingEnqueuedTrackInNextTracksReasons = restrictions.disallowReorderingEnqueuedTrackInNextTracksReasons();
            this.disallowReorderingEnqueuedEpisodeInNextTracksReasons = restrictions.disallowReorderingEnqueuedEpisodeInNextTracksReasons();
            this.disallowViewingQueueReasons = restrictions.disallowViewingQueueReasons();
            this.disallowViewingOrderedTracksInNextTracksReasons = restrictions.disallowViewingOrderedTracksInNextTracksReasons();
            this.disallowSwipeNextReasons = restrictions.disallowSwipeNextReasons();
            this.disallowSwipePrevReasons = restrictions.disallowSwipePrevReasons();
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions build() {
            if (this.disallowPausingReasons != null && this.disallowResumingReasons != null && this.disallowSeekingReasons != null && this.disallowPeekingPrevReasons != null && this.disallowPeekingNextReasons != null && this.disallowSkippingPrevReasons != null && this.disallowSkippingNextReasons != null && this.disallowTogglingRepeatContextReasons != null && this.disallowTogglingRepeatTrackReasons != null && this.disallowTogglingShuffleReasons != null && this.disallowSetQueueReasons != null && this.disallowAddToQueueReasons != null && this.disallowInterruptingPlaybackReasons != null && this.disallowTransferringPlaybackReasons != null && this.disallowRemoteControlReasons != null && this.disallowInsertingIntoNextTracksReasons != null && this.disallowInsertingIntoContextTracksReasons != null && this.disallowReorderingInNextTracksReasons != null && this.disallowReorderingInContextTracksReasons != null && this.disallowRemovingFromNextTracksReasons != null && this.disallowRemovingFromContextTracksReasons != null && this.disallowUpdatingContextReasons != null && this.disallowSettingPlaybackSpeedReasons != null && this.disallowSettingModes != null && this.disallowSignals != null && this.disallowPlayAsNextInQueueReasons != null && this.disallowSleepTimerClearReasons != null && this.disallowSleepTimerDurationReasons != null && this.disallowSleepTimerEndOfTrackReasons != null && this.disallowAddToQueueTrackReasons != null && this.disallowTapToPlayTrackInNextTracksReasons != null && this.disallowReorderingTrackInNextTracksReasons != null && this.disallowReorderingEpisodeInNextTracksReasons != null && this.disallowReorderingEnqueuedTrackInNextTracksReasons != null && this.disallowReorderingEnqueuedEpisodeInNextTracksReasons != null && this.disallowViewingQueueReasons != null && this.disallowViewingOrderedTracksInNextTracksReasons != null && this.disallowSwipeNextReasons != null && this.disallowSwipePrevReasons != null) {
                return new AutoValue_Restrictions(this.disallowPausingReasons, this.disallowResumingReasons, this.disallowSeekingReasons, this.disallowPeekingPrevReasons, this.disallowPeekingNextReasons, this.disallowSkippingPrevReasons, this.disallowSkippingNextReasons, this.disallowTogglingRepeatContextReasons, this.disallowTogglingRepeatTrackReasons, this.disallowTogglingShuffleReasons, this.disallowSetQueueReasons, this.disallowAddToQueueReasons, this.disallowInterruptingPlaybackReasons, this.disallowTransferringPlaybackReasons, this.disallowRemoteControlReasons, this.disallowInsertingIntoNextTracksReasons, this.disallowInsertingIntoContextTracksReasons, this.disallowReorderingInNextTracksReasons, this.disallowReorderingInContextTracksReasons, this.disallowRemovingFromNextTracksReasons, this.disallowRemovingFromContextTracksReasons, this.disallowUpdatingContextReasons, this.disallowSettingPlaybackSpeedReasons, this.disallowSettingModes, this.disallowSignals, this.disallowPlayAsNextInQueueReasons, this.disallowSleepTimerClearReasons, this.disallowSleepTimerDurationReasons, this.disallowSleepTimerEndOfTrackReasons, this.disallowAddToQueueTrackReasons, this.disallowTapToPlayTrackInNextTracksReasons, this.disallowReorderingTrackInNextTracksReasons, this.disallowReorderingEpisodeInNextTracksReasons, this.disallowReorderingEnqueuedTrackInNextTracksReasons, this.disallowReorderingEnqueuedEpisodeInNextTracksReasons, this.disallowViewingQueueReasons, this.disallowViewingOrderedTracksInNextTracksReasons, this.disallowSwipeNextReasons, this.disallowSwipePrevReasons, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.disallowPausingReasons == null) {
                sb.append(" disallowPausingReasons");
            }
            if (this.disallowResumingReasons == null) {
                sb.append(" disallowResumingReasons");
            }
            if (this.disallowSeekingReasons == null) {
                sb.append(" disallowSeekingReasons");
            }
            if (this.disallowPeekingPrevReasons == null) {
                sb.append(" disallowPeekingPrevReasons");
            }
            if (this.disallowPeekingNextReasons == null) {
                sb.append(" disallowPeekingNextReasons");
            }
            if (this.disallowSkippingPrevReasons == null) {
                sb.append(" disallowSkippingPrevReasons");
            }
            if (this.disallowSkippingNextReasons == null) {
                sb.append(" disallowSkippingNextReasons");
            }
            if (this.disallowTogglingRepeatContextReasons == null) {
                sb.append(" disallowTogglingRepeatContextReasons");
            }
            if (this.disallowTogglingRepeatTrackReasons == null) {
                sb.append(" disallowTogglingRepeatTrackReasons");
            }
            if (this.disallowTogglingShuffleReasons == null) {
                sb.append(" disallowTogglingShuffleReasons");
            }
            if (this.disallowSetQueueReasons == null) {
                sb.append(" disallowSetQueueReasons");
            }
            if (this.disallowAddToQueueReasons == null) {
                sb.append(" disallowAddToQueueReasons");
            }
            if (this.disallowInterruptingPlaybackReasons == null) {
                sb.append(" disallowInterruptingPlaybackReasons");
            }
            if (this.disallowTransferringPlaybackReasons == null) {
                sb.append(" disallowTransferringPlaybackReasons");
            }
            if (this.disallowRemoteControlReasons == null) {
                sb.append(" disallowRemoteControlReasons");
            }
            if (this.disallowInsertingIntoNextTracksReasons == null) {
                sb.append(" disallowInsertingIntoNextTracksReasons");
            }
            if (this.disallowInsertingIntoContextTracksReasons == null) {
                sb.append(" disallowInsertingIntoContextTracksReasons");
            }
            if (this.disallowReorderingInNextTracksReasons == null) {
                sb.append(" disallowReorderingInNextTracksReasons");
            }
            if (this.disallowReorderingInContextTracksReasons == null) {
                sb.append(" disallowReorderingInContextTracksReasons");
            }
            if (this.disallowRemovingFromNextTracksReasons == null) {
                sb.append(" disallowRemovingFromNextTracksReasons");
            }
            if (this.disallowRemovingFromContextTracksReasons == null) {
                sb.append(" disallowRemovingFromContextTracksReasons");
            }
            if (this.disallowUpdatingContextReasons == null) {
                sb.append(" disallowUpdatingContextReasons");
            }
            if (this.disallowSettingPlaybackSpeedReasons == null) {
                sb.append(" disallowSettingPlaybackSpeedReasons");
            }
            if (this.disallowSettingModes == null) {
                sb.append(" disallowSettingModes");
            }
            if (this.disallowSignals == null) {
                sb.append(" disallowSignals");
            }
            if (this.disallowPlayAsNextInQueueReasons == null) {
                sb.append(" disallowPlayAsNextInQueueReasons");
            }
            if (this.disallowSleepTimerClearReasons == null) {
                sb.append(" disallowSleepTimerClearReasons");
            }
            if (this.disallowSleepTimerDurationReasons == null) {
                sb.append(" disallowSleepTimerDurationReasons");
            }
            if (this.disallowSleepTimerEndOfTrackReasons == null) {
                sb.append(" disallowSleepTimerEndOfTrackReasons");
            }
            if (this.disallowAddToQueueTrackReasons == null) {
                sb.append(" disallowAddToQueueTrackReasons");
            }
            if (this.disallowTapToPlayTrackInNextTracksReasons == null) {
                sb.append(" disallowTapToPlayTrackInNextTracksReasons");
            }
            if (this.disallowReorderingTrackInNextTracksReasons == null) {
                sb.append(" disallowReorderingTrackInNextTracksReasons");
            }
            if (this.disallowReorderingEpisodeInNextTracksReasons == null) {
                sb.append(" disallowReorderingEpisodeInNextTracksReasons");
            }
            if (this.disallowReorderingEnqueuedTrackInNextTracksReasons == null) {
                sb.append(" disallowReorderingEnqueuedTrackInNextTracksReasons");
            }
            if (this.disallowReorderingEnqueuedEpisodeInNextTracksReasons == null) {
                sb.append(" disallowReorderingEnqueuedEpisodeInNextTracksReasons");
            }
            if (this.disallowViewingQueueReasons == null) {
                sb.append(" disallowViewingQueueReasons");
            }
            if (this.disallowViewingOrderedTracksInNextTracksReasons == null) {
                sb.append(" disallowViewingOrderedTracksInNextTracksReasons");
            }
            if (this.disallowSwipeNextReasons == null) {
                sb.append(" disallowSwipeNextReasons");
            }
            if (this.disallowSwipePrevReasons == null) {
                sb.append(" disallowSwipePrevReasons");
            }
            eg.m("Missing required properties:".concat(String.valueOf(sb)));
            return null;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowAddToQueueReasons(Set<String> set) {
            this.disallowAddToQueueReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowAddToQueueTrackReasons(Set<String> set) {
            this.disallowAddToQueueTrackReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowInsertingIntoContextTracksReasons(Set<String> set) {
            this.disallowInsertingIntoContextTracksReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowInsertingIntoNextTracksReasons(Set<String> set) {
            this.disallowInsertingIntoNextTracksReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowInterruptingPlaybackReasons(Set<String> set) {
            this.disallowInterruptingPlaybackReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowPausingReasons(Set<String> set) {
            this.disallowPausingReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowPeekingNextReasons(Set<String> set) {
            this.disallowPeekingNextReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowPeekingPrevReasons(Set<String> set) {
            this.disallowPeekingPrevReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowPlayAsNextInQueueReasons(Set<String> set) {
            this.disallowPlayAsNextInQueueReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowRemoteControlReasons(Set<String> set) {
            this.disallowRemoteControlReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowRemovingFromContextTracksReasons(Set<String> set) {
            this.disallowRemovingFromContextTracksReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowRemovingFromNextTracksReasons(Set<String> set) {
            this.disallowRemovingFromNextTracksReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowReorderingEnqueuedEpisodeInNextTracksReasons(Set<String> set) {
            this.disallowReorderingEnqueuedEpisodeInNextTracksReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowReorderingEnqueuedTrackInNextTracksReasons(Set<String> set) {
            this.disallowReorderingEnqueuedTrackInNextTracksReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowReorderingEpisodeInNextTracksReasons(Set<String> set) {
            this.disallowReorderingEpisodeInNextTracksReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowReorderingInContextTracksReasons(Set<String> set) {
            this.disallowReorderingInContextTracksReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowReorderingInNextTracksReasons(Set<String> set) {
            this.disallowReorderingInNextTracksReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowReorderingTrackInNextTracksReasons(Set<String> set) {
            this.disallowReorderingTrackInNextTracksReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowResumingReasons(Set<String> set) {
            this.disallowResumingReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowSeekingReasons(Set<String> set) {
            this.disallowSeekingReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowSetQueueReasons(Set<String> set) {
            this.disallowSetQueueReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowSettingModes(Map<String, Restrictions.ModeRestrictions> map) {
            this.disallowSettingModes = j380.c(map);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowSettingPlaybackSpeedReasons(Set<String> set) {
            this.disallowSettingPlaybackSpeedReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowSignals(Map<String, Restrictions.RestrictionReasons> map) {
            this.disallowSignals = j380.c(map);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowSkippingNextReasons(Set<String> set) {
            this.disallowSkippingNextReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowSkippingPrevReasons(Set<String> set) {
            this.disallowSkippingPrevReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowSleepTimerClearReasons(Set<String> set) {
            this.disallowSleepTimerClearReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowSleepTimerDurationReasons(Set<String> set) {
            this.disallowSleepTimerDurationReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowSleepTimerEndOfTrackReasons(Set<String> set) {
            this.disallowSleepTimerEndOfTrackReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowSwipeNextReasons(Set<String> set) {
            this.disallowSwipeNextReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowSwipePrevReasons(Set<String> set) {
            this.disallowSwipePrevReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowTapToPlayTrackInNextTracksReasons(Set<String> set) {
            this.disallowTapToPlayTrackInNextTracksReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowTogglingRepeatContextReasons(Set<String> set) {
            this.disallowTogglingRepeatContextReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowTogglingRepeatTrackReasons(Set<String> set) {
            this.disallowTogglingRepeatTrackReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowTogglingShuffleReasons(Set<String> set) {
            this.disallowTogglingShuffleReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowTransferringPlaybackReasons(Set<String> set) {
            this.disallowTransferringPlaybackReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowUpdatingContextReasons(Set<String> set) {
            this.disallowUpdatingContextReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowViewingOrderedTracksInNextTracksReasons(Set<String> set) {
            this.disallowViewingOrderedTracksInNextTracksReasons = t380.p(set);
            return this;
        }

        @Override // com.spotify.player.model.Restrictions.Builder
        public Restrictions.Builder disallowViewingQueueReasons(Set<String> set) {
            this.disallowViewingQueueReasons = t380.p(set);
            return this;
        }

        public Builder() {
        }
    }
}
