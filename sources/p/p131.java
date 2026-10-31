package p;

import com.spotify.player.esperanto.proto.EsRestrictions$RestrictionReasons;
import com.spotify.player.esperanto.proto.EsRestrictions$Restrictions;
import com.spotify.player.model.Restrictions;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class p131 {
    public static final Restrictions a(EsRestrictions$Restrictions esRestrictions$Restrictions) {
        Restrictions.Builder builder = Restrictions.builder();
        builder.disallowPausingReasons(o7h.p1(esRestrictions$Restrictions.e0()));
        builder.disallowResumingReasons(o7h.p1(esRestrictions$Restrictions.q0()));
        builder.disallowSeekingReasons(o7h.p1(esRestrictions$Restrictions.r0()));
        builder.disallowPeekingPrevReasons(o7h.p1(esRestrictions$Restrictions.g0()));
        builder.disallowPeekingNextReasons(o7h.p1(esRestrictions$Restrictions.f0()));
        builder.disallowSkippingPrevReasons(o7h.p1(esRestrictions$Restrictions.x0()));
        builder.disallowSkippingNextReasons(o7h.p1(esRestrictions$Restrictions.w0()));
        builder.disallowSwipePrevReasons(o7h.p1(esRestrictions$Restrictions.C0()));
        builder.disallowSwipeNextReasons(o7h.p1(esRestrictions$Restrictions.B0()));
        builder.disallowTogglingRepeatContextReasons(o7h.p1(esRestrictions$Restrictions.E0()));
        builder.disallowTogglingRepeatTrackReasons(o7h.p1(esRestrictions$Restrictions.F0()));
        builder.disallowTogglingShuffleReasons(o7h.p1(esRestrictions$Restrictions.G0()));
        builder.disallowSetQueueReasons(o7h.p1(esRestrictions$Restrictions.s0()));
        builder.disallowAddToQueueReasons(o7h.p1(esRestrictions$Restrictions.Z()));
        builder.disallowAddToQueueTrackReasons(o7h.p1(esRestrictions$Restrictions.a0()));
        builder.disallowInterruptingPlaybackReasons(o7h.p1(esRestrictions$Restrictions.d0()));
        builder.disallowTransferringPlaybackReasons(o7h.p1(esRestrictions$Restrictions.H0()));
        builder.disallowRemoteControlReasons(o7h.p1(esRestrictions$Restrictions.h0()));
        builder.disallowInsertingIntoNextTracksReasons(o7h.p1(esRestrictions$Restrictions.c0()));
        builder.disallowInsertingIntoContextTracksReasons(o7h.p1(esRestrictions$Restrictions.b0()));
        builder.disallowReorderingInNextTracksReasons(o7h.p1(esRestrictions$Restrictions.o0()));
        builder.disallowReorderingInContextTracksReasons(o7h.p1(esRestrictions$Restrictions.n0()));
        builder.disallowRemovingFromNextTracksReasons(o7h.p1(esRestrictions$Restrictions.j0()));
        builder.disallowRemovingFromContextTracksReasons(o7h.p1(esRestrictions$Restrictions.i0()));
        builder.disallowUpdatingContextReasons(o7h.p1(esRestrictions$Restrictions.I0()));
        builder.disallowSettingPlaybackSpeedReasons(o7h.p1(esRestrictions$Restrictions.u0()));
        Map mapV0 = esRestrictions$Restrictions.v0();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapV0.size()));
        for (Map.Entry entry : mapV0.entrySet()) {
            linkedHashMap.put(entry.getKey(), Restrictions.RestrictionReasons.builder().reasons(o7h.p1(((EsRestrictions$RestrictionReasons) entry.getValue()).q())).build());
        }
        builder.disallowSignals(linkedHashMap);
        builder.disallowSleepTimerClearReasons(o7h.p1(esRestrictions$Restrictions.y0()));
        builder.disallowSleepTimerDurationReasons(o7h.p1(esRestrictions$Restrictions.z0()));
        builder.disallowSleepTimerEndOfTrackReasons(o7h.p1(esRestrictions$Restrictions.A0()));
        builder.disallowTapToPlayTrackInNextTracksReasons(o7h.p1(esRestrictions$Restrictions.D0()));
        builder.disallowReorderingTrackInNextTracksReasons(o7h.p1(esRestrictions$Restrictions.p0()));
        builder.disallowReorderingEpisodeInNextTracksReasons(o7h.p1(esRestrictions$Restrictions.m0()));
        builder.disallowReorderingEnqueuedTrackInNextTracksReasons(o7h.p1(esRestrictions$Restrictions.l0()));
        builder.disallowReorderingEnqueuedEpisodeInNextTracksReasons(o7h.p1(esRestrictions$Restrictions.k0()));
        builder.disallowViewingQueueReasons(o7h.p1(esRestrictions$Restrictions.K0()));
        builder.disallowViewingOrderedTracksInNextTracksReasons(o7h.p1(esRestrictions$Restrictions.J0()));
        return builder.build();
    }
}
