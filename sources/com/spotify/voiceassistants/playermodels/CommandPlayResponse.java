package com.spotify.voiceassistants.playermodels;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.chc1;
import p.cy30;
import p.h661;
import p.o661;
import p.o6p1;
import p.p661;
import p.u890;
import p.z1k;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 R2\u00020\u0001:\u0002SRBs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J~\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00109\u0012\u0004\b>\u0010<\u001a\u0004\b=\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00109\u0012\u0004\b@\u0010<\u001a\u0004\b?\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010A\u0012\u0004\bC\u0010<\u001a\u0004\bB\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010D\u0012\u0004\bF\u0010<\u001a\u0004\bE\u0010\u001fR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010G\u0012\u0004\bI\u0010<\u001a\u0004\bH\u0010!R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010J\u0012\u0004\bL\u0010<\u001a\u0004\bK\u0010#R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00109\u0012\u0004\bN\u0010<\u001a\u0004\bM\u0010\u0019R&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010O\u0012\u0004\bQ\u0010<\u001a\u0004\bP\u0010&¨\u0006T"}, d2 = {"Lcom/spotify/voiceassistants/playermodels/CommandPlayResponse;", "", "", "requestId", "error", "endpoint", "Lcom/spotify/player/model/Context;", "context", "Lcom/spotify/player/model/command/options/PreparePlayOptions;", "playOptions", "Lcom/spotify/player/model/PlayOrigin;", "playOrigin", "Lcom/spotify/player/model/command/options/LoggingParams;", "loggingParams", "playbackReadiness", "", "", "retryDelayMs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/player/model/Context;Lcom/spotify/player/model/command/options/PreparePlayOptions;Lcom/spotify/player/model/PlayOrigin;Lcom/spotify/player/model/command/options/LoggingParams;Ljava/lang/String;Ljava/util/List;)V", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/player/model/Context;Lcom/spotify/player/model/command/options/PreparePlayOptions;Lcom/spotify/player/model/PlayOrigin;Lcom/spotify/player/model/command/options/LoggingParams;Ljava/lang/String;Ljava/util/List;Lp/p661;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/spotify/player/model/Context;", "component5", "()Lcom/spotify/player/model/command/options/PreparePlayOptions;", "component6", "()Lcom/spotify/player/model/PlayOrigin;", "component7", "()Lcom/spotify/player/model/command/options/LoggingParams;", "component8", "component9", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/player/model/Context;Lcom/spotify/player/model/command/options/PreparePlayOptions;Lcom/spotify/player/model/PlayOrigin;Lcom/spotify/player/model/command/options/LoggingParams;Ljava/lang/String;Ljava/util/List;)Lcom/spotify/voiceassistants/playermodels/CommandPlayResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels", "(Lcom/spotify/voiceassistants/playermodels/CommandPlayResponse;Lp/z1k;Lp/h661;)V", "write$Self", "Ljava/lang/String;", "getRequestId", "getRequestId$annotations", "()V", "getError", "getError$annotations", "getEndpoint", "getEndpoint$annotations", "Lcom/spotify/player/model/Context;", "getContext", "getContext$annotations", "Lcom/spotify/player/model/command/options/PreparePlayOptions;", "getPlayOptions", "getPlayOptions$annotations", "Lcom/spotify/player/model/PlayOrigin;", "getPlayOrigin", "getPlayOrigin$annotations", "Lcom/spotify/player/model/command/options/LoggingParams;", "getLoggingParams", "getLoggingParams$annotations", "getPlaybackReadiness", "getPlaybackReadiness$annotations", "Ljava/util/List;", "getRetryDelayMs", "getRetryDelayMs$annotations", "Companion", "$serializer", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
@o661
public final /* data */ class CommandPlayResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Context context;
    private final String endpoint;
    private final String error;
    private final LoggingParams loggingParams;
    private final PreparePlayOptions playOptions;
    private final PlayOrigin playOrigin;
    private final String playbackReadiness;
    private final String requestId;
    private final List<Integer> retryDelayMs;

    public /* synthetic */ CommandPlayResponse(int i, String str, String str2, String str3, Context context, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams, String str4, List list, p661 p661Var) {
        if (4 != (i & 4)) {
            o6p1.t(i, 4, CommandPlayResponse$.serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.requestId = null;
        } else {
            this.requestId = str;
        }
        if ((i & 2) == 0) {
            this.error = null;
        } else {
            this.error = str2;
        }
        this.endpoint = str3;
        if ((i & 8) == 0) {
            this.context = null;
        } else {
            this.context = context;
        }
        if ((i & 16) == 0) {
            this.playOptions = null;
        } else {
            this.playOptions = preparePlayOptions;
        }
        if ((i & 32) == 0) {
            this.playOrigin = null;
        } else {
            this.playOrigin = playOrigin;
        }
        if ((i & 64) == 0) {
            this.loggingParams = null;
        } else {
            this.loggingParams = loggingParams;
        }
        if ((i & 128) == 0) {
            this.playbackReadiness = null;
        } else {
            this.playbackReadiness = str4;
        }
        if ((i & 256) == 0) {
            this.retryDelayMs = z6x.a;
        } else {
            this.retryDelayMs = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommandPlayResponse copy$default(CommandPlayResponse commandPlayResponse, String str, String str2, String str3, Context context, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commandPlayResponse.requestId;
        }
        if ((i & 2) != 0) {
            str2 = commandPlayResponse.error;
        }
        if ((i & 4) != 0) {
            str3 = commandPlayResponse.endpoint;
        }
        if ((i & 8) != 0) {
            context = commandPlayResponse.context;
        }
        if ((i & 16) != 0) {
            preparePlayOptions = commandPlayResponse.playOptions;
        }
        if ((i & 32) != 0) {
            playOrigin = commandPlayResponse.playOrigin;
        }
        if ((i & 64) != 0) {
            loggingParams = commandPlayResponse.loggingParams;
        }
        if ((i & 128) != 0) {
            str4 = commandPlayResponse.playbackReadiness;
        }
        if ((i & 256) != 0) {
            list = commandPlayResponse.retryDelayMs;
        }
        String str5 = str4;
        List list2 = list;
        PlayOrigin playOrigin2 = playOrigin;
        LoggingParams loggingParams2 = loggingParams;
        PreparePlayOptions preparePlayOptions2 = preparePlayOptions;
        String str6 = str3;
        return commandPlayResponse.copy(str, str2, str6, context, preparePlayOptions2, playOrigin2, loggingParams2, str5, list2);
    }

    public static /* synthetic */ void getContext$annotations() {
    }

    public static /* synthetic */ void getEndpoint$annotations() {
    }

    public static /* synthetic */ void getError$annotations() {
    }

    public static /* synthetic */ void getLoggingParams$annotations() {
    }

    public static /* synthetic */ void getPlayOptions$annotations() {
    }

    public static /* synthetic */ void getPlayOrigin$annotations() {
    }

    public static /* synthetic */ void getPlaybackReadiness$annotations() {
    }

    public static /* synthetic */ void getRequestId$annotations() {
    }

    @o661(with = RetryDelayMsSerializer.class)
    public static /* synthetic */ void getRetryDelayMs$annotations() {
    }

    public static final /* synthetic */ void write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels(CommandPlayResponse self, z1k output, h661 serialDesc) {
        if (output.d0() || self.requestId != null) {
            output.s(serialDesc, 0, chc1.a, self.requestId);
        }
        if (output.d0() || self.error != null) {
            output.s(serialDesc, 1, chc1.a, self.error);
        }
        output.G(serialDesc, 2, self.endpoint);
        if (output.d0() || self.context != null) {
            output.s(serialDesc, 3, ContextSerializer.INSTANCE, self.context);
        }
        if (output.d0() || self.playOptions != null) {
            output.s(serialDesc, 4, PreparePlayOptionsSerializer.INSTANCE, self.playOptions);
        }
        if (output.d0() || self.playOrigin != null) {
            output.s(serialDesc, 5, PlayOriginSerializer.INSTANCE, self.playOrigin);
        }
        if (output.d0() || self.loggingParams != null) {
            output.s(serialDesc, 6, LoggingParamsSerializer.INSTANCE, self.loggingParams);
        }
        if (output.d0() || self.playbackReadiness != null) {
            output.s(serialDesc, 7, chc1.a, self.playbackReadiness);
        }
        if (!output.d0() && u890.j(self.retryDelayMs, z6x.a)) {
            return;
        }
        output.k(serialDesc, 8, RetryDelayMsSerializer.INSTANCE, self.retryDelayMs);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PreparePlayOptions getPlayOptions() {
        return this.playOptions;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PlayOrigin getPlayOrigin() {
        return this.playOrigin;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final LoggingParams getLoggingParams() {
        return this.loggingParams;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPlaybackReadiness() {
        return this.playbackReadiness;
    }

    public final List<Integer> component9() {
        return this.retryDelayMs;
    }

    public final CommandPlayResponse copy(String requestId, String error, String endpoint, Context context, PreparePlayOptions playOptions, PlayOrigin playOrigin, LoggingParams loggingParams, String playbackReadiness, List<Integer> retryDelayMs) {
        return new CommandPlayResponse(requestId, error, endpoint, context, playOptions, playOrigin, loggingParams, playbackReadiness, retryDelayMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommandPlayResponse)) {
            return false;
        }
        CommandPlayResponse commandPlayResponse = (CommandPlayResponse) other;
        return u890.j(this.requestId, commandPlayResponse.requestId) && u890.j(this.error, commandPlayResponse.error) && u890.j(this.endpoint, commandPlayResponse.endpoint) && u890.j(this.context, commandPlayResponse.context) && u890.j(this.playOptions, commandPlayResponse.playOptions) && u890.j(this.playOrigin, commandPlayResponse.playOrigin) && u890.j(this.loggingParams, commandPlayResponse.loggingParams) && u890.j(this.playbackReadiness, commandPlayResponse.playbackReadiness) && u890.j(this.retryDelayMs, commandPlayResponse.retryDelayMs);
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final String getError() {
        return this.error;
    }

    public final LoggingParams getLoggingParams() {
        return this.loggingParams;
    }

    public final PreparePlayOptions getPlayOptions() {
        return this.playOptions;
    }

    public final PlayOrigin getPlayOrigin() {
        return this.playOrigin;
    }

    public final String getPlaybackReadiness() {
        return this.playbackReadiness;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final List<Integer> getRetryDelayMs() {
        return this.retryDelayMs;
    }

    public int hashCode() {
        String str = this.requestId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.error;
        int iD = cy30.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.endpoint);
        Context context = this.context;
        int iHashCode2 = (iD + (context == null ? 0 : context.hashCode())) * 31;
        PreparePlayOptions preparePlayOptions = this.playOptions;
        int iHashCode3 = (iHashCode2 + (preparePlayOptions == null ? 0 : preparePlayOptions.hashCode())) * 31;
        PlayOrigin playOrigin = this.playOrigin;
        int iHashCode4 = (iHashCode3 + (playOrigin == null ? 0 : playOrigin.hashCode())) * 31;
        LoggingParams loggingParams = this.loggingParams;
        int iHashCode5 = (iHashCode4 + (loggingParams == null ? 0 : loggingParams.hashCode())) * 31;
        String str3 = this.playbackReadiness;
        return this.retryDelayMs.hashCode() + ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public CommandPlayResponse(String str, String str2, String str3, Context context, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams, String str4, List<Integer> list) {
        this.requestId = str;
        this.error = str2;
        this.endpoint = str3;
        this.context = context;
        this.playOptions = preparePlayOptions;
        this.playOrigin = playOrigin;
        this.loggingParams = loggingParams;
        this.playbackReadiness = str4;
        this.retryDelayMs = list;
    }

    public /* synthetic */ CommandPlayResponse(String str, String str2, String str3, Context context, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : context, (i & 16) != 0 ? null : preparePlayOptions, (i & 32) != 0 ? null : playOrigin, (i & 64) != 0 ? null : loggingParams, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? z6x.a : list);
    }
}
