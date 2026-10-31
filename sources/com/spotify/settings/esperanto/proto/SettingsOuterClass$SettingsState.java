package com.spotify.settings.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ek61;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SettingsOuterClass$SettingsState extends h implements v2j0 {
    public static final int ALLOW_AUDIO_QUALITY_DOWNGRADE_FIELD_NUMBER = 8;
    public static final int AUTOMIX_FIELD_NUMBER = 12;
    public static final int CROSSFADE_FIELD_NUMBER = 15;
    public static final int CROSSFADE_TIME_SECONDS_FIELD_NUMBER = 16;
    public static final int CROSSFEED_FIELD_NUMBER = 29;
    public static final int CROSSFEED_INTENSITY_FIELD_NUMBER = 30;
    private static final SettingsOuterClass$SettingsState DEFAULT_INSTANCE;
    public static final int DOWNLOAD_OVER_3G_FIELD_NUMBER = 4;
    public static final int DOWNLOAD_PREFERRED_RESOURCE_TYPE_FIELD_NUMBER = 20;
    public static final int DOWNLOAD_QUALITY_FIELD_NUMBER = 5;
    public static final int DOWNMIX_FIELD_NUMBER = 22;
    public static final int GAPLESS_FIELD_NUMBER = 11;
    public static final int LOCAL_DEVICES_ONLY_FIELD_NUMBER = 18;
    public static final int LOUDNESS_ENVIRONMENT_FIELD_NUMBER = 14;
    public static final int NORMALIZE_FIELD_NUMBER = 13;
    public static final int OFFLINE_MODE_FIELD_NUMBER = 1;
    public static final int OTFN_FIELD_NUMBER = 25;
    public static final int PARROT_FIELD_NUMBER = 27;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 26;
    public static final int PLAY_EXPLICIT_CONTENT_FIELD_NUMBER = 2;
    public static final int PRIVATE_SESSION_FIELD_NUMBER = 3;
    public static final int SHOW_UNAVAILABLE_TRACKS_FIELD_NUMBER = 17;
    public static final int SHUFFLE_MODE_FIELD_NUMBER = 28;
    public static final int STREAM_NON_METERED_QUALITY_FIELD_NUMBER = 7;
    public static final int STREAM_QUALITY_FIELD_NUMBER = 6;
    public static final int TRIM_SILENCE_FIELD_NUMBER = 21;
    public static final int WEBGATE_URL_FIELD_NUMBER = 19;
    private boolean allowAudioQualityDowngrade_;
    private boolean automix_;
    private int crossfadeTimeSeconds_;
    private boolean crossfade_;
    private int crossfeedIntensity_;
    private boolean crossfeed_;
    private boolean downloadOver3G_;
    private int downloadPreferredResourceType_;
    private int downloadQuality_;
    private boolean downmix_;
    private boolean gapless_;
    private boolean localDevicesOnly_;
    private int loudnessEnvironment_;
    private boolean normalize_;
    private boolean offlineMode_;
    private boolean otfn_;
    private boolean parrot_;
    private boolean playExplicitContent_;
    private int playbackSpeed_;
    private boolean privateSession_;
    private boolean showUnavailableTracks_;
    private int streamNonMeteredQuality_;
    private int streamQuality_;
    private boolean trimSilence_;
    private String webgateUrl_ = "";
    private String shuffleMode_ = "";

    static {
        SettingsOuterClass$SettingsState settingsOuterClass$SettingsState = new SettingsOuterClass$SettingsState();
        DEFAULT_INSTANCE = settingsOuterClass$SettingsState;
        h.registerDefaultInstance(SettingsOuterClass$SettingsState.class, settingsOuterClass$SettingsState);
    }

    private SettingsOuterClass$SettingsState() {
    }

    public static SettingsOuterClass$SettingsState J(byte[] bArr) {
        return (SettingsOuterClass$SettingsState) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final boolean A() {
        return this.normalize_;
    }

    public final boolean B() {
        return this.offlineMode_;
    }

    public final boolean C() {
        return this.otfn_;
    }

    public final boolean D() {
        return this.playExplicitContent_;
    }

    public final boolean E() {
        return this.privateSession_;
    }

    public final boolean F() {
        return this.showUnavailableTracks_;
    }

    public final int G() {
        return this.streamNonMeteredQuality_;
    }

    public final int H() {
        return this.streamQuality_;
    }

    public final String I() {
        return this.webgateUrl_;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001a\u0000\u0000\u0001\u001e\u001a\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0004\u0006\u0004\u0007\u0004\b\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0004\u000f\u0007\u0010\u0004\u0011\u0007\u0012\u0007\u0013Ȉ\u0014\u0004\u0015\u0007\u0016\u0007\u0019\u0007\u001a\u0004\u001b\u0007\u001cȈ\u001d\u0007\u001e\u0004", new Object[]{"offlineMode_", "playExplicitContent_", "privateSession_", "downloadOver3G_", "downloadQuality_", "streamQuality_", "streamNonMeteredQuality_", "allowAudioQualityDowngrade_", "gapless_", "automix_", "normalize_", "loudnessEnvironment_", "crossfade_", "crossfadeTimeSeconds_", "showUnavailableTracks_", "localDevicesOnly_", "webgateUrl_", "downloadPreferredResourceType_", "trimSilence_", "downmix_", "otfn_", "playbackSpeed_", "parrot_", "shuffleMode_", "crossfeed_", "crossfeedIntensity_"});
        }
        if (iOrdinal == 3) {
            return new SettingsOuterClass$SettingsState();
        }
        if (iOrdinal == 4) {
            return new ek61((byte) 8);
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
        synchronized (SettingsOuterClass$SettingsState.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.allowAudioQualityDowngrade_;
    }

    public final boolean p() {
        return this.automix_;
    }

    public final boolean q() {
        return this.crossfade_;
    }

    public final int r() {
        return this.crossfadeTimeSeconds_;
    }

    public final boolean s() {
        return this.crossfeed_;
    }

    public final int t() {
        return this.crossfeedIntensity_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.downloadOver3G_;
    }

    public final int v() {
        return this.downloadPreferredResourceType_;
    }

    public final int w() {
        return this.downloadQuality_;
    }

    public final boolean x() {
        return this.downmix_;
    }

    public final boolean y() {
        return this.gapless_;
    }

    public final int z() {
        return this.loudnessEnvironment_;
    }
}
