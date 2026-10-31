package com.spotify.stream_reporting_esperanto.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import com.spotify.stream_reporting_attribution.proto.StreamReportingAttributionOuterClass$StreamReportingAttribution;
import p.b5u0;
import p.bf40;
import p.gfc1;
import p.h290;
import p.hhc;
import p.i9;
import p.igc1;
import p.jf40;
import p.kqq0;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u8i0;
import p.uqt0;
import p.v2j0;
import p.x2k1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class StreamStartRequestOuterClass$StreamStartRequest extends h implements v2j0 {
    public static final int AGENTIC_PRODUCT_TYPE_FIELD_NUMBER = 55;
    public static final int ATTRIBUTION_FIELD_NUMBER = 58;
    public static final int CLIENT_OFFLINE_FIELD_NUMBER = 34;
    public static final int CLIENT_TIMESTAMP_FIELD_NUMBER = 40;
    public static final int CONFIG_PARAMS_FIELD_NUMBER = 49;
    public static final int CONNECT_CONTROLLER_DEVICE_ID_FIELD_NUMBER = 16;
    public static final int CONTENT_IS_DOWNLOADED_FIELD_NUMBER = 33;
    public static final int CONTENT_URI_FIELD_NUMBER = 6;
    public static final int CUSTOM_REPORTING_ATTRIBUTION_FIELD_NUMBER = 38;
    public static final int DECISION_ID_FIELD_NUMBER = 37;
    private static final StreamStartRequestOuterClass$StreamStartRequest DEFAULT_INSTANCE;
    public static final int DISPLAYED_CONTENT_URI_FIELD_NUMBER = 7;
    public static final int ENTRYPOINT_URI_FIELD_NUMBER = 53;
    public static final int FEATURE_UUID_FIELD_NUMBER = 36;
    public static final int INTERACTION_ID_FIELD_NUMBER = 18;
    public static final int IS_AUDIO_ON_FIELD_NUMBER = 43;
    public static final int IS_LIVE_FIELD_NUMBER = 32;
    public static final int IS_REPEATING_CONTEXT_FIELD_NUMBER = 42;
    public static final int IS_REPEATING_TRACK_FIELD_NUMBER = 41;
    public static final int IS_SHUFFLE_FIELD_NUMBER = 23;
    public static final int IS_VIDEO_ON_FIELD_NUMBER = 44;
    public static final int LIST_URI_FIELD_NUMBER = 57;
    public static final int MEDIA_ID_FIELD_NUMBER = 28;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 29;
    public static final int ON_DEMAND_TYPE_FIELD_NUMBER = 52;
    public static final int ORCHESTRATION_STACK_FIELD_NUMBER = 56;
    public static final int PAGE_INSTANCE_ID_FIELD_NUMBER = 17;
    public static final int PARENT_PLAYBACK_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 1;
    public static final int PLAYBACK_STACK_FIELD_NUMBER = 8;
    public static final int PLAYBACK_STACK_V2_FIELD_NUMBER = 46;
    public static final int PLAYBACK_START_TIME_FIELD_NUMBER = 30;
    public static final int PLAYER_SESSION_ID_FIELD_NUMBER = 47;
    public static final int PLAY_CONTEXT_DECISION_ID_FIELD_NUMBER = 39;
    public static final int PLAY_CONTEXT_FIELD_NUMBER = 5;
    public static final int PREVIEW_IMPRESSION_URI_FIELD_NUMBER = 48;
    public static final int PROVIDER_FIELD_NUMBER = 11;
    public static final int REASON_START_FIELD_NUMBER = 20;
    public static final int REFERRER_FIELD_NUMBER = 12;
    public static final int SOURCE_START_FIELD_NUMBER = 19;
    public static final int START_POSITION_FIELD_NUMBER = 31;
    public static final int STREAMING_RULE_FIELD_NUMBER = 15;
    public static final int VIDEO_SESSION_ID_FIELD_NUMBER = 4;
    public static final int VIDEO_SURFACE_V2_FIELD_NUMBER = 51;
    private String agenticProductType_;
    private StreamReportingAttributionOuterClass$StreamReportingAttribution attribution_;
    private int bitField0_;
    private boolean clientOffline_;
    private Timestamp clientTimestamp_;
    private h290 configParams_;
    private String connectControllerDeviceId_;
    private boolean contentIsDownloaded_;
    private String contentUri_;
    private String customReportingAttribution_;
    private String decisionId_;
    private String displayedContentUri_;
    private String entrypointUri_;
    private String featureUuid_;
    private String interactionId_;
    private boolean isAudioOn_;
    private boolean isLive_;
    private boolean isRepeatingContext_;
    private boolean isRepeatingTrack_;
    private boolean isShuffle_;
    private boolean isVideoOn_;
    private String listUri_;
    private String mediaId_;
    private int mediaType_;
    private String onDemandType_;
    private int orchestrationStack_;
    private String pageInstanceId_;
    private phc parentPlaybackId_;
    private String playContextDecisionId_;
    private String playContext_;
    private phc playbackId_;
    private int playbackStackV2_;
    private int playbackStack_;
    private long playbackStartTime_;
    private String playerSessionId_;
    private String previewImpressionUri_;
    private String provider_;
    private int reasonStart_;
    private String referrer_;
    private String sourceStart_;
    private long startPosition_;
    private int streamingRule_;
    private String videoSessionId_;
    private int videoSurfaceV2_;

    static {
        StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest = new StreamStartRequestOuterClass$StreamStartRequest();
        DEFAULT_INSTANCE = streamStartRequestOuterClass$StreamStartRequest;
        h.registerDefaultInstance(StreamStartRequestOuterClass$StreamStartRequest.class, streamStartRequestOuterClass$StreamStartRequest);
    }

    private StreamStartRequestOuterClass$StreamStartRequest() {
        hhc hhcVar = phc.b;
        this.playbackId_ = hhcVar;
        this.parentPlaybackId_ = hhcVar;
        this.videoSessionId_ = "";
        this.playContext_ = "";
        this.contentUri_ = "";
        this.displayedContentUri_ = "";
        this.provider_ = "";
        this.referrer_ = "";
        this.connectControllerDeviceId_ = "";
        this.pageInstanceId_ = "";
        this.interactionId_ = "";
        this.sourceStart_ = "";
        this.mediaId_ = "";
        this.featureUuid_ = "";
        this.decisionId_ = "";
        this.customReportingAttribution_ = "";
        this.playContextDecisionId_ = "";
        this.playerSessionId_ = "";
        this.previewImpressionUri_ = "";
        this.configParams_ = h.emptyProtobufList();
        this.onDemandType_ = "";
        this.entrypointUri_ = "";
        this.agenticProductType_ = "";
        this.listUri_ = "";
    }

    public static gfc1 p() {
        return (gfc1) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(String str) {
        this.interactionId_ = str;
    }

    public final void B(boolean z) {
        this.bitField0_ |= 8;
        this.isAudioOn_ = z;
    }

    public final void C(boolean z) {
        this.isLive_ = z;
    }

    public final void D(boolean z) {
        this.isShuffle_ = z;
    }

    public final void E(boolean z) {
        this.isVideoOn_ = z;
    }

    public final void F(String str) {
        this.mediaId_ = str;
    }

    public final void G(u8i0 u8i0Var) {
        this.mediaType_ = u8i0Var.getNumber();
    }

    public final void H(String str) {
        this.bitField0_ |= 128;
        this.onDemandType_ = str;
    }

    public final void I(kqq0 kqq0Var) {
        this.orchestrationStack_ = kqq0Var.getNumber();
        this.bitField0_ |= 1024;
    }

    public final void J(String str) {
        this.pageInstanceId_ = str;
    }

    public final void K(String str) {
        this.playContext_ = str;
    }

    public final void L(String str) {
        this.playContextDecisionId_ = str;
    }

    public final void M(hhc hhcVar) {
        this.playbackId_ = hhcVar;
    }

    public final void N() {
        this.playbackStack_ = b5u0.BETAMAX.getNumber();
    }

    public final void O(long j) {
        this.playbackStartTime_ = j;
    }

    public final void P(String str) {
        this.playerSessionId_ = str;
    }

    public final void Q(String str) {
        this.bitField0_ |= 32;
        this.previewImpressionUri_ = str;
    }

    public final void R(String str) {
        this.provider_ = str;
    }

    public final void S(uqt0 uqt0Var) {
        this.reasonStart_ = uqt0Var.getNumber();
    }

    public final void T(String str) {
        this.referrer_ = str;
    }

    public final void U(long j) {
        this.startPosition_ = j;
    }

    public final void V(igc1 igc1Var) {
        this.streamingRule_ = igc1Var.getNumber();
    }

    public final void W(String str) {
        this.videoSessionId_ = str;
    }

    public final void X(x2k1 x2k1Var) {
        this.videoSurfaceV2_ = x2k1Var.getNumber();
        this.bitField0_ |= 64;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000+\u0000\u0001\u0001:+\u0000\u0001\u0000\u0001\n\u0002\n\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\f\u000bȈ\fȈ\u000f\f\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014\f\u0017\u0007\u001cȈ\u001d\f\u001e\u0003\u001f\u0003 \u0007!\u0007\"\u0007$Ȉ%Ȉ&Ȉ'Ȉ(ဉ\u0000)ဇ\u0001*ဇ\u0002+ဇ\u0003,\u0007.ဌ\u0004/Ȉ0ለ\u00051Ț3ဌ\u00064ለ\u00075ለ\b7ለ\t8ဌ\n9ለ\u000b:ဉ\f", new Object[]{"bitField0_", "playbackId_", "parentPlaybackId_", "videoSessionId_", "playContext_", "contentUri_", "displayedContentUri_", "playbackStack_", "provider_", "referrer_", "streamingRule_", "connectControllerDeviceId_", "pageInstanceId_", "interactionId_", "sourceStart_", "reasonStart_", "isShuffle_", "mediaId_", "mediaType_", "playbackStartTime_", "startPosition_", "isLive_", "contentIsDownloaded_", "clientOffline_", "featureUuid_", "decisionId_", "customReportingAttribution_", "playContextDecisionId_", "clientTimestamp_", "isRepeatingTrack_", "isRepeatingContext_", "isAudioOn_", "isVideoOn_", "playbackStackV2_", "playerSessionId_", "previewImpressionUri_", "configParams_", "videoSurfaceV2_", "onDemandType_", "entrypointUri_", "agenticProductType_", "orchestrationStack_", "listUri_", "attribution_"});
        }
        if (iOrdinal == 3) {
            return new StreamStartRequestOuterClass$StreamStartRequest();
        }
        if (iOrdinal == 4) {
            return new gfc1(DEFAULT_INSTANCE);
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
        synchronized (StreamStartRequestOuterClass$StreamStartRequest.class) {
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

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final void n(String str) {
        h290 h290VarMutableCopy = this.configParams_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.configParams_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o() {
        this.playbackId_ = DEFAULT_INSTANCE.playbackId_;
    }

    public final void q(StreamReportingAttributionOuterClass$StreamReportingAttribution streamReportingAttributionOuterClass$StreamReportingAttribution) {
        this.attribution_ = streamReportingAttributionOuterClass$StreamReportingAttribution;
        this.bitField0_ |= 4096;
    }

    public final void r(boolean z) {
        this.clientOffline_ = z;
    }

    public final void s(Timestamp timestamp) {
        this.clientTimestamp_ = timestamp;
        this.bitField0_ |= 1;
    }

    public final void t(String str) {
        this.connectControllerDeviceId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(boolean z) {
        this.contentIsDownloaded_ = z;
    }

    public final void v(String str) {
        this.contentUri_ = str;
    }

    public final void w(String str) {
        this.customReportingAttribution_ = str;
    }

    public final void x(String str) {
        this.decisionId_ = str;
    }

    public final void y(String str) {
        this.bitField0_ |= 256;
        this.entrypointUri_ = str;
    }

    public final void z(String str) {
        this.featureUuid_ = str;
    }
}
