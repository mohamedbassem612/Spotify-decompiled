package com.spotify.player.esperanto.proto;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.arz;
import p.bf40;
import p.brz;
import p.crz;
import p.h290;
import p.i9;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsRestrictions$Restrictions extends h implements v2j0 {
    private static final EsRestrictions$Restrictions DEFAULT_INSTANCE;
    public static final int DISALLOW_ADD_TO_QUEUE_REASONS_FIELD_NUMBER = 22;
    public static final int DISALLOW_ADD_TO_QUEUE_TRACK_REASONS_FIELD_NUMBER = 31;
    public static final int DISALLOW_INSERTING_INTO_CONTEXT_TRACKS_REASONS_FIELD_NUMBER = 16;
    public static final int DISALLOW_INSERTING_INTO_NEXT_TRACKS_REASONS_FIELD_NUMBER = 15;
    public static final int DISALLOW_INTERRUPTING_PLAYBACK_REASONS_FIELD_NUMBER = 12;
    public static final int DISALLOW_PAUSING_REASONS_FIELD_NUMBER = 1;
    public static final int DISALLOW_PEEKING_NEXT_REASONS_FIELD_NUMBER = 5;
    public static final int DISALLOW_PEEKING_PREV_REASONS_FIELD_NUMBER = 4;
    public static final int DISALLOW_PLAY_AS_NEXT_IN_QUEUE_REASONS_FIELD_NUMBER = 27;
    public static final int DISALLOW_REMOTE_CONTROL_REASONS_FIELD_NUMBER = 14;
    public static final int DISALLOW_REMOVING_FROM_CONTEXT_TRACKS_REASONS_FIELD_NUMBER = 20;
    public static final int DISALLOW_REMOVING_FROM_NEXT_TRACKS_REASONS_FIELD_NUMBER = 19;
    public static final int DISALLOW_REORDERING_ENQUEUED_EPISODE_IN_NEXT_TRACKS_REASONS_FIELD_NUMBER = 36;
    public static final int DISALLOW_REORDERING_ENQUEUED_TRACK_IN_NEXT_TRACKS_REASONS_FIELD_NUMBER = 35;
    public static final int DISALLOW_REORDERING_EPISODE_IN_NEXT_TRACKS_REASONS_FIELD_NUMBER = 34;
    public static final int DISALLOW_REORDERING_IN_CONTEXT_TRACKS_REASONS_FIELD_NUMBER = 18;
    public static final int DISALLOW_REORDERING_IN_NEXT_TRACKS_REASONS_FIELD_NUMBER = 17;
    public static final int DISALLOW_REORDERING_TRACK_IN_NEXT_TRACKS_REASONS_FIELD_NUMBER = 33;
    public static final int DISALLOW_RESUMING_REASONS_FIELD_NUMBER = 2;
    public static final int DISALLOW_SEEKING_REASONS_FIELD_NUMBER = 3;
    public static final int DISALLOW_SETTING_MODES_FIELD_NUMBER = 25;
    public static final int DISALLOW_SETTING_PLAYBACK_SPEED_REASONS_FIELD_NUMBER = 23;
    public static final int DISALLOW_SET_QUEUE_REASONS_FIELD_NUMBER = 11;
    public static final int DISALLOW_SIGNALS_FIELD_NUMBER = 26;
    public static final int DISALLOW_SKIPPING_NEXT_REASONS_FIELD_NUMBER = 7;
    public static final int DISALLOW_SKIPPING_PREV_REASONS_FIELD_NUMBER = 6;
    public static final int DISALLOW_SLEEP_TIMER_CLEAR_REASONS_FIELD_NUMBER = 28;
    public static final int DISALLOW_SLEEP_TIMER_DURATION_REASONS_FIELD_NUMBER = 29;
    public static final int DISALLOW_SLEEP_TIMER_END_OF_TRACK_REASONS_FIELD_NUMBER = 30;
    public static final int DISALLOW_SWIPE_NEXT_REASONS_FIELD_NUMBER = 39;
    public static final int DISALLOW_SWIPE_PREV_REASONS_FIELD_NUMBER = 40;
    public static final int DISALLOW_TAP_TO_PLAY_TRACK_IN_NEXT_TRACKS_REASONS_FIELD_NUMBER = 32;
    public static final int DISALLOW_TOGGLING_REPEAT_CONTEXT_REASONS_FIELD_NUMBER = 8;
    public static final int DISALLOW_TOGGLING_REPEAT_TRACK_REASONS_FIELD_NUMBER = 9;
    public static final int DISALLOW_TOGGLING_SHUFFLE_REASONS_FIELD_NUMBER = 10;
    public static final int DISALLOW_TRANSFERRING_PLAYBACK_REASONS_FIELD_NUMBER = 13;
    public static final int DISALLOW_UPDATING_CONTEXT_REASONS_FIELD_NUMBER = 21;
    public static final int DISALLOW_VIEWING_ORDERED_TRACKS_IN_NEXT_TRACKS_REASONS_FIELD_NUMBER = 38;
    public static final int DISALLOW_VIEWING_QUEUE_REASONS_FIELD_NUMBER = 37;
    private static volatile qzr0 PARSER;
    private h290 disallowAddToQueueReasons_;
    private h290 disallowAddToQueueTrackReasons_;
    private h290 disallowInsertingIntoContextTracksReasons_;
    private h290 disallowInsertingIntoNextTracksReasons_;
    private h290 disallowInterruptingPlaybackReasons_;
    private h290 disallowPausingReasons_;
    private h290 disallowPeekingNextReasons_;
    private h290 disallowPeekingPrevReasons_;
    private h290 disallowPlayAsNextInQueueReasons_;
    private h290 disallowRemoteControlReasons_;
    private h290 disallowRemovingFromContextTracksReasons_;
    private h290 disallowRemovingFromNextTracksReasons_;
    private h290 disallowReorderingEnqueuedEpisodeInNextTracksReasons_;
    private h290 disallowReorderingEnqueuedTrackInNextTracksReasons_;
    private h290 disallowReorderingEpisodeInNextTracksReasons_;
    private h290 disallowReorderingInContextTracksReasons_;
    private h290 disallowReorderingInNextTracksReasons_;
    private h290 disallowReorderingTrackInNextTracksReasons_;
    private h290 disallowResumingReasons_;
    private h290 disallowSeekingReasons_;
    private h290 disallowSetQueueReasons_;
    private qng0 disallowSettingModes_;
    private h290 disallowSettingPlaybackSpeedReasons_;
    private qng0 disallowSignals_;
    private h290 disallowSkippingNextReasons_;
    private h290 disallowSkippingPrevReasons_;
    private h290 disallowSleepTimerClearReasons_;
    private h290 disallowSleepTimerDurationReasons_;
    private h290 disallowSleepTimerEndOfTrackReasons_;
    private h290 disallowSwipeNextReasons_;
    private h290 disallowSwipePrevReasons_;
    private h290 disallowTapToPlayTrackInNextTracksReasons_;
    private h290 disallowTogglingRepeatContextReasons_;
    private h290 disallowTogglingRepeatTrackReasons_;
    private h290 disallowTogglingShuffleReasons_;
    private h290 disallowTransferringPlaybackReasons_;
    private h290 disallowUpdatingContextReasons_;
    private h290 disallowViewingOrderedTracksInNextTracksReasons_;
    private h290 disallowViewingQueueReasons_;

    static {
        EsRestrictions$Restrictions esRestrictions$Restrictions = new EsRestrictions$Restrictions();
        DEFAULT_INSTANCE = esRestrictions$Restrictions;
        h.registerDefaultInstance(EsRestrictions$Restrictions.class, esRestrictions$Restrictions);
    }

    private EsRestrictions$Restrictions() {
        qng0 qng0Var = qng0.b;
        this.disallowSettingModes_ = qng0Var;
        this.disallowSignals_ = qng0Var;
        this.disallowPausingReasons_ = h.emptyProtobufList();
        this.disallowResumingReasons_ = h.emptyProtobufList();
        this.disallowSeekingReasons_ = h.emptyProtobufList();
        this.disallowPeekingPrevReasons_ = h.emptyProtobufList();
        this.disallowPeekingNextReasons_ = h.emptyProtobufList();
        this.disallowSkippingPrevReasons_ = h.emptyProtobufList();
        this.disallowSkippingNextReasons_ = h.emptyProtobufList();
        this.disallowTogglingRepeatContextReasons_ = h.emptyProtobufList();
        this.disallowTogglingRepeatTrackReasons_ = h.emptyProtobufList();
        this.disallowTogglingShuffleReasons_ = h.emptyProtobufList();
        this.disallowSetQueueReasons_ = h.emptyProtobufList();
        this.disallowInterruptingPlaybackReasons_ = h.emptyProtobufList();
        this.disallowTransferringPlaybackReasons_ = h.emptyProtobufList();
        this.disallowRemoteControlReasons_ = h.emptyProtobufList();
        this.disallowInsertingIntoNextTracksReasons_ = h.emptyProtobufList();
        this.disallowInsertingIntoContextTracksReasons_ = h.emptyProtobufList();
        this.disallowReorderingInNextTracksReasons_ = h.emptyProtobufList();
        this.disallowReorderingInContextTracksReasons_ = h.emptyProtobufList();
        this.disallowRemovingFromNextTracksReasons_ = h.emptyProtobufList();
        this.disallowRemovingFromContextTracksReasons_ = h.emptyProtobufList();
        this.disallowUpdatingContextReasons_ = h.emptyProtobufList();
        this.disallowAddToQueueReasons_ = h.emptyProtobufList();
        this.disallowSettingPlaybackSpeedReasons_ = h.emptyProtobufList();
        this.disallowPlayAsNextInQueueReasons_ = h.emptyProtobufList();
        this.disallowSleepTimerClearReasons_ = h.emptyProtobufList();
        this.disallowSleepTimerDurationReasons_ = h.emptyProtobufList();
        this.disallowSleepTimerEndOfTrackReasons_ = h.emptyProtobufList();
        this.disallowAddToQueueTrackReasons_ = h.emptyProtobufList();
        this.disallowTapToPlayTrackInNextTracksReasons_ = h.emptyProtobufList();
        this.disallowReorderingTrackInNextTracksReasons_ = h.emptyProtobufList();
        this.disallowReorderingEpisodeInNextTracksReasons_ = h.emptyProtobufList();
        this.disallowReorderingEnqueuedTrackInNextTracksReasons_ = h.emptyProtobufList();
        this.disallowReorderingEnqueuedEpisodeInNextTracksReasons_ = h.emptyProtobufList();
        this.disallowViewingQueueReasons_ = h.emptyProtobufList();
        this.disallowViewingOrderedTracksInNextTracksReasons_ = h.emptyProtobufList();
        this.disallowSwipeNextReasons_ = h.emptyProtobufList();
        this.disallowSwipePrevReasons_ = h.emptyProtobufList();
    }

    public static arz M0() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EsRestrictions$Restrictions Y() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowReorderingEnqueuedTrackInNextTracksReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowReorderingEnqueuedTrackInNextTracksReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 A0() {
        return this.disallowSleepTimerEndOfTrackReasons_;
    }

    public final void B(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowReorderingEpisodeInNextTracksReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowReorderingEpisodeInNextTracksReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 B0() {
        return this.disallowSwipeNextReasons_;
    }

    public final void C(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowReorderingInContextTracksReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowReorderingInContextTracksReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 C0() {
        return this.disallowSwipePrevReasons_;
    }

    public final void D(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowReorderingInNextTracksReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowReorderingInNextTracksReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 D0() {
        return this.disallowTapToPlayTrackInNextTracksReasons_;
    }

    public final void E(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowReorderingTrackInNextTracksReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowReorderingTrackInNextTracksReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 E0() {
        return this.disallowTogglingRepeatContextReasons_;
    }

    public final void F(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowResumingReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowResumingReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 F0() {
        return this.disallowTogglingRepeatTrackReasons_;
    }

    public final void G(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowSeekingReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowSeekingReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 G0() {
        return this.disallowTogglingShuffleReasons_;
    }

    public final void H(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowSetQueueReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowSetQueueReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 H0() {
        return this.disallowTransferringPlaybackReasons_;
    }

    public final void I(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowSettingPlaybackSpeedReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowSettingPlaybackSpeedReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 I0() {
        return this.disallowUpdatingContextReasons_;
    }

    public final void J(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowSkippingNextReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowSkippingNextReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 J0() {
        return this.disallowViewingOrderedTracksInNextTracksReasons_;
    }

    public final void K(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowSkippingPrevReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowSkippingPrevReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 K0() {
        return this.disallowViewingQueueReasons_;
    }

    public final void L(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowSleepTimerClearReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowSleepTimerClearReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final qng0 L0() {
        qng0 qng0Var = this.disallowSignals_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.disallowSignals_ = qng0VarH;
        return qng0VarH;
    }

    public final void M(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowSleepTimerDurationReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowSleepTimerDurationReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void N(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowSleepTimerEndOfTrackReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowSleepTimerEndOfTrackReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void O(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowSwipeNextReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowSwipeNextReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void P(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowSwipePrevReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowSwipePrevReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void Q(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowTapToPlayTrackInNextTracksReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowTapToPlayTrackInNextTracksReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void R(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowTogglingRepeatContextReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowTogglingRepeatContextReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void S(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowTogglingRepeatTrackReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowTogglingRepeatTrackReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void T(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowTogglingShuffleReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowTogglingShuffleReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void U(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowTransferringPlaybackReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowTransferringPlaybackReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void V(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowUpdatingContextReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowUpdatingContextReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void W(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowViewingOrderedTracksInNextTracksReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowViewingOrderedTracksInNextTracksReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final void X(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowViewingQueueReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowViewingQueueReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 Z() {
        return this.disallowAddToQueueReasons_;
    }

    public final h290 a0() {
        return this.disallowAddToQueueTrackReasons_;
    }

    public final h290 b0() {
        return this.disallowInsertingIntoContextTracksReasons_;
    }

    public final h290 c0() {
        return this.disallowInsertingIntoNextTracksReasons_;
    }

    public final h290 d0() {
        return this.disallowInterruptingPlaybackReasons_;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000'\u0000\u0000\u0001('\u0002%\u0000\u0001Ț\u0002Ț\u0003Ț\u0004Ț\u0005Ț\u0006Ț\u0007Ț\bȚ\tȚ\nȚ\u000bȚ\fȚ\rȚ\u000eȚ\u000fȚ\u0010Ț\u0011Ț\u0012Ț\u0013Ț\u0014Ț\u0015Ț\u0016Ț\u0017Ț\u00192\u001a2\u001bȚ\u001cȚ\u001dȚ\u001eȚ\u001fȚ Ț!Ț\"Ț#Ț$Ț%Ț&Ț'Ț(Ț", new Object[]{"disallowPausingReasons_", "disallowResumingReasons_", "disallowSeekingReasons_", "disallowPeekingPrevReasons_", "disallowPeekingNextReasons_", "disallowSkippingPrevReasons_", "disallowSkippingNextReasons_", "disallowTogglingRepeatContextReasons_", "disallowTogglingRepeatTrackReasons_", "disallowTogglingShuffleReasons_", "disallowSetQueueReasons_", "disallowInterruptingPlaybackReasons_", "disallowTransferringPlaybackReasons_", "disallowRemoteControlReasons_", "disallowInsertingIntoNextTracksReasons_", "disallowInsertingIntoContextTracksReasons_", "disallowReorderingInNextTracksReasons_", "disallowReorderingInContextTracksReasons_", "disallowRemovingFromNextTracksReasons_", "disallowRemovingFromContextTracksReasons_", "disallowUpdatingContextReasons_", "disallowAddToQueueReasons_", "disallowSettingPlaybackSpeedReasons_", "disallowSettingModes_", brz.a, "disallowSignals_", crz.a, "disallowPlayAsNextInQueueReasons_", "disallowSleepTimerClearReasons_", "disallowSleepTimerDurationReasons_", "disallowSleepTimerEndOfTrackReasons_", "disallowAddToQueueTrackReasons_", "disallowTapToPlayTrackInNextTracksReasons_", "disallowReorderingTrackInNextTracksReasons_", "disallowReorderingEpisodeInNextTracksReasons_", "disallowReorderingEnqueuedTrackInNextTracksReasons_", "disallowReorderingEnqueuedEpisodeInNextTracksReasons_", "disallowViewingQueueReasons_", "disallowViewingOrderedTracksInNextTracksReasons_", "disallowSwipeNextReasons_", "disallowSwipePrevReasons_"});
        }
        if (iOrdinal == 3) {
            return new EsRestrictions$Restrictions();
        }
        if (iOrdinal == 4) {
            return new arz();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        qzr0 qzr0Var = PARSER;
        if (qzr0Var != null) {
            return qzr0Var;
        }
        synchronized (EsRestrictions$Restrictions.class) {
            try {
                bf40Var = PARSER;
                if (bf40Var == null) {
                    bf40Var = new bf40(DEFAULT_INSTANCE);
                    PARSER = bf40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bf40Var;
    }

    public final h290 e0() {
        return this.disallowPausingReasons_;
    }

    public final h290 f0() {
        return this.disallowPeekingNextReasons_;
    }

    public final h290 g0() {
        return this.disallowPeekingPrevReasons_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final h290 h0() {
        return this.disallowRemoteControlReasons_;
    }

    public final h290 i0() {
        return this.disallowRemovingFromContextTracksReasons_;
    }

    public final h290 j0() {
        return this.disallowRemovingFromNextTracksReasons_;
    }

    public final h290 k0() {
        return this.disallowReorderingEnqueuedEpisodeInNextTracksReasons_;
    }

    public final h290 l0() {
        return this.disallowReorderingEnqueuedTrackInNextTracksReasons_;
    }

    public final h290 m0() {
        return this.disallowReorderingEpisodeInNextTracksReasons_;
    }

    public final h290 n0() {
        return this.disallowReorderingInContextTracksReasons_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowAddToQueueReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowAddToQueueReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 o0() {
        return this.disallowReorderingInNextTracksReasons_;
    }

    public final void p(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowAddToQueueTrackReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowAddToQueueTrackReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 p0() {
        return this.disallowReorderingTrackInNextTracksReasons_;
    }

    public final void q(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowInsertingIntoContextTracksReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowInsertingIntoContextTracksReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 q0() {
        return this.disallowResumingReasons_;
    }

    public final void r(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowInsertingIntoNextTracksReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowInsertingIntoNextTracksReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 r0() {
        return this.disallowSeekingReasons_;
    }

    public final void s(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowInterruptingPlaybackReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowInterruptingPlaybackReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 s0() {
        return this.disallowSetQueueReasons_;
    }

    public final void t(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowPausingReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowPausingReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final Map t0() {
        return Collections.unmodifiableMap(this.disallowSettingModes_);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowPeekingNextReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowPeekingNextReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 u0() {
        return this.disallowSettingPlaybackSpeedReasons_;
    }

    public final void v(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowPeekingPrevReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowPeekingPrevReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final Map v0() {
        return Collections.unmodifiableMap(this.disallowSignals_);
    }

    public final void w(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowRemoteControlReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowRemoteControlReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 w0() {
        return this.disallowSkippingNextReasons_;
    }

    public final void x(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowRemovingFromContextTracksReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowRemovingFromContextTracksReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 x0() {
        return this.disallowSkippingPrevReasons_;
    }

    public final void y(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowRemovingFromNextTracksReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowRemovingFromNextTracksReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 y0() {
        return this.disallowSleepTimerClearReasons_;
    }

    public final void z(Iterable iterable) {
        h290 h290VarMutableCopy = this.disallowReorderingEnqueuedEpisodeInNextTracksReasons_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.disallowReorderingEnqueuedEpisodeInNextTracksReasons_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final h290 z0() {
        return this.disallowSleepTimerDurationReasons_;
    }
}
