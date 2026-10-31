package com.spotify.betamax.contextplayercoordinatorimpl.model;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.LoggingParams;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.erj1;
import p.grj1;
import p.hrj1;
import p.jrj1;
import p.o661;
import p.q2g1;
import p.sne1;
import p.vjm;
import p.wkm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b@\b\u0007\u0018\u0000 ^2\u00020\u0001:\u0003\u0002 _Bí\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\n\u0012\b\b\u0002\u0010\"\u001a\u00020\u000e\u0012\b\b\u0002\u0010#\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b1\u00100R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u00104R!\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u00107R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b?\u0010=R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bA\u0010'R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010B\u001a\u0004\bC\u0010DR!\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010E\u001a\u0004\bF\u0010GR$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010.\u001a\u0004\bM\u00100\"\u0004\bN\u0010OR$\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010@\u001a\u0004\bP\u0010'\"\u0004\bQ\u0010RR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\bX\u00100R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\bY\u00100R\u001f\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010\"\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\"\u0010;\u001a\u0004\b\"\u0010=R\u0017\u0010#\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010;\u001a\u0004\b]\u0010=¨\u0006`"}, d2 = {"Lcom/spotify/betamax/contextplayercoordinatorimpl/model/VideoPlayerCommand;", "", "Lp/hrj1;", "type", "", "seekToInMs", "endPositionInMs", "stopPositionInMs", "Lp/q2g1;", "trackWithPlayOrigin", "", "futureTrackWithPlayOrigins", "Lp/wkm;", "contextPlayerOptions", "", "initiallyPaused", "systemInitiated", "clientOffline", "", "startReason", "Lcom/spotify/player/model/command/options/LoggingParams;", "loggingParameters", "Lcom/spotify/player/model/ContextTrack;", "prefetchTracks", "Lp/vjm;", "configuration", "systemInitiatedTimeMs", "sessionId", "Lp/sne1;", "timeMeasurementBuilderSnapshot", "markerBoundaryStartInMs", "markerBoundaryEndInMs", "Lp/grj1;", "markers", "isListPlayer", "automaticallySyncToLiveHead", "<init>", "(Lp/hrj1;JLjava/lang/Long;Ljava/lang/Long;Lp/q2g1;[Lp/q2g1;Lp/wkm;ZZZLjava/lang/String;Lcom/spotify/player/model/command/options/LoggingParams;[Lcom/spotify/player/model/ContextTrack;Lp/vjm;Ljava/lang/Long;Ljava/lang/String;Lp/sne1;Ljava/lang/Long;Ljava/lang/Long;[Lp/grj1;ZZ)V", "toString", "()Ljava/lang/String;", "Lp/hrj1;", "getType", "()Lp/hrj1;", "J", "getSeekToInMs", "()J", "Ljava/lang/Long;", "getEndPositionInMs", "()Ljava/lang/Long;", "getStopPositionInMs", "Lp/q2g1;", "getTrackWithPlayOrigin", "()Lp/q2g1;", "[Lp/q2g1;", "getFutureTrackWithPlayOrigins", "()[Lp/q2g1;", "Lp/wkm;", "getContextPlayerOptions", "()Lp/wkm;", "Z", "getInitiallyPaused", "()Z", "getSystemInitiated", "getClientOffline", "Ljava/lang/String;", "getStartReason", "Lcom/spotify/player/model/command/options/LoggingParams;", "getLoggingParameters", "()Lcom/spotify/player/model/command/options/LoggingParams;", "[Lcom/spotify/player/model/ContextTrack;", "getPrefetchTracks", "()[Lcom/spotify/player/model/ContextTrack;", "Lp/vjm;", "getConfiguration", "()Lp/vjm;", "setConfiguration", "(Lp/vjm;)V", "getSystemInitiatedTimeMs", "setSystemInitiatedTimeMs", "(Ljava/lang/Long;)V", "getSessionId", "setSessionId", "(Ljava/lang/String;)V", "Lp/sne1;", "getTimeMeasurementBuilderSnapshot", "()Lp/sne1;", "setTimeMeasurementBuilderSnapshot", "(Lp/sne1;)V", "getMarkerBoundaryStartInMs", "getMarkerBoundaryEndInMs", "[Lp/grj1;", "getMarkers", "()[Lp/grj1;", "getAutomaticallySyncToLiveHead", "Companion", "p/erj1", "src_main_java_com_spotify_betamax_contextplayercoordinatorimpl-contextplayercoordinatorimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
@o661(with = jrj1.class)
public final class VideoPlayerCommand {
    public static final erj1 Companion = new erj1();
    private final boolean automaticallySyncToLiveHead;
    private final boolean clientOffline;
    private vjm configuration;
    private final wkm contextPlayerOptions;
    private final Long endPositionInMs;
    private final q2g1[] futureTrackWithPlayOrigins;
    private final boolean initiallyPaused;
    private final boolean isListPlayer;
    private final LoggingParams loggingParameters;
    private final Long markerBoundaryEndInMs;
    private final Long markerBoundaryStartInMs;
    private final grj1[] markers;
    private final ContextTrack[] prefetchTracks;
    private final long seekToInMs;
    private String sessionId;
    private final String startReason;
    private final Long stopPositionInMs;
    private final boolean systemInitiated;
    private Long systemInitiatedTimeMs;
    private sne1 timeMeasurementBuilderSnapshot;
    private final q2g1 trackWithPlayOrigin;
    private final hrj1 type;

    public /* synthetic */ VideoPlayerCommand(hrj1 hrj1Var, long j, Long l, Long l2, q2g1 q2g1Var, q2g1[] q2g1VarArr, wkm wkmVar, boolean z, boolean z2, boolean z3, String str, LoggingParams loggingParams, ContextTrack[] contextTrackArr, vjm vjmVar, Long l3, String str2, sne1 sne1Var, Long l4, Long l5, grj1[] grj1VarArr, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hrj1Var, j, l, l2, q2g1Var, q2g1VarArr, wkmVar, z, z2, z3, str, loggingParams, contextTrackArr, vjmVar, l3, str2, sne1Var, l4, l5, grj1VarArr, (i & 1048576) != 0 ? false : z4, (i & 2097152) != 0 ? true : z5);
    }

    public final boolean getAutomaticallySyncToLiveHead() {
        return this.automaticallySyncToLiveHead;
    }

    public final boolean getClientOffline() {
        return this.clientOffline;
    }

    public final vjm getConfiguration() {
        return this.configuration;
    }

    public final wkm getContextPlayerOptions() {
        return this.contextPlayerOptions;
    }

    public final Long getEndPositionInMs() {
        return this.endPositionInMs;
    }

    public final q2g1[] getFutureTrackWithPlayOrigins() {
        return this.futureTrackWithPlayOrigins;
    }

    public final boolean getInitiallyPaused() {
        return this.initiallyPaused;
    }

    public final LoggingParams getLoggingParameters() {
        return this.loggingParameters;
    }

    public final Long getMarkerBoundaryEndInMs() {
        return this.markerBoundaryEndInMs;
    }

    public final Long getMarkerBoundaryStartInMs() {
        return this.markerBoundaryStartInMs;
    }

    public final grj1[] getMarkers() {
        return this.markers;
    }

    public final ContextTrack[] getPrefetchTracks() {
        return this.prefetchTracks;
    }

    public final long getSeekToInMs() {
        return this.seekToInMs;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getStartReason() {
        return this.startReason;
    }

    public final Long getStopPositionInMs() {
        return this.stopPositionInMs;
    }

    public final boolean getSystemInitiated() {
        return this.systemInitiated;
    }

    public final Long getSystemInitiatedTimeMs() {
        return this.systemInitiatedTimeMs;
    }

    public final sne1 getTimeMeasurementBuilderSnapshot() {
        return this.timeMeasurementBuilderSnapshot;
    }

    public final q2g1 getTrackWithPlayOrigin() {
        return this.trackWithPlayOrigin;
    }

    public final hrj1 getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isListPlayer, reason: from getter */
    public final boolean getIsListPlayer() {
        return this.isListPlayer;
    }

    public final void setConfiguration(vjm vjmVar) {
        this.configuration = vjmVar;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setSystemInitiatedTimeMs(Long l) {
        this.systemInitiatedTimeMs = l;
    }

    public final void setTimeMeasurementBuilderSnapshot(sne1 sne1Var) {
        this.timeMeasurementBuilderSnapshot = sne1Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        int iOrdinal = this.type.ordinal();
        if (iOrdinal == 1) {
            q2g1 q2g1Var = this.trackWithPlayOrigin;
            if (q2g1Var != null) {
                sb.append(" playback_id=" + q2g1Var.c);
                ContextTrack contextTrack = q2g1Var.a;
                if (contextTrack != null) {
                    sb.append(" uri=" + contextTrack.uri());
                }
            }
            wkm wkmVar = this.contextPlayerOptions;
            if (wkmVar != null) {
                sb.append(" shuffling_context=" + wkmVar.c());
                sb.append(" repeating_context=" + wkmVar.a());
                sb.append(" repeating_track=" + wkmVar.b());
            }
            sb.append(" initially_paused=" + this.initiallyPaused);
            sb.append(" client_offline=" + this.clientOffline);
            sb.append(" seek_to=" + this.seekToInMs);
            sb.append(" start_reason=" + this.startReason);
            grj1[] grj1VarArr = this.markers;
            sb.append(" markers=" + (grj1VarArr != null ? Arrays.toString(grj1VarArr) : null));
            sb.append(" is_list_player=" + this.isListPlayer);
        } else if (iOrdinal == 5) {
            sb.append(" seek_to=" + this.seekToInMs);
        } else if (iOrdinal == 6) {
            sb.append(" stop_position=" + this.stopPositionInMs);
        }
        return "VideoPlayerCommand{type=" + this.type + ((Object) sb) + "}";
    }

    public VideoPlayerCommand(hrj1 hrj1Var, long j, Long l, Long l2, q2g1 q2g1Var, q2g1[] q2g1VarArr, wkm wkmVar, boolean z, boolean z2, boolean z3, String str, LoggingParams loggingParams, ContextTrack[] contextTrackArr, vjm vjmVar, Long l3, String str2, sne1 sne1Var, Long l4, Long l5, grj1[] grj1VarArr, boolean z4, boolean z5) {
        this.type = hrj1Var;
        this.seekToInMs = j;
        this.endPositionInMs = l;
        this.stopPositionInMs = l2;
        this.trackWithPlayOrigin = q2g1Var;
        this.futureTrackWithPlayOrigins = q2g1VarArr;
        this.contextPlayerOptions = wkmVar;
        this.initiallyPaused = z;
        this.systemInitiated = z2;
        this.clientOffline = z3;
        this.startReason = str;
        this.loggingParameters = loggingParams;
        this.prefetchTracks = contextTrackArr;
        this.configuration = vjmVar;
        this.systemInitiatedTimeMs = l3;
        this.sessionId = str2;
        this.timeMeasurementBuilderSnapshot = sne1Var;
        this.markerBoundaryStartInMs = l4;
        this.markerBoundaryEndInMs = l5;
        this.markers = grj1VarArr;
        this.isListPlayer = z4;
        this.automaticallySyncToLiveHead = z5;
    }
}
