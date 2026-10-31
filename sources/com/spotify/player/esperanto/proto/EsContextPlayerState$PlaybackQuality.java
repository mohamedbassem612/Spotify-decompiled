package com.spotify.player.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jlz;
import p.omz;
import p.pmz;
import p.qmz;
import p.qzr0;
import p.r2j0;
import p.rmz;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsContextPlayerState$PlaybackQuality extends h implements v2j0 {
    public static final int BITRATE_LEVEL_FIELD_NUMBER = 1;
    private static final EsContextPlayerState$PlaybackQuality DEFAULT_INSTANCE;
    public static final int FILE_ORIGIN_FIELD_NUMBER = 7;
    public static final int HARDWARE_SAMPLE_RATE_HZ_FIELD_NUMBER = 9;
    public static final int HIFI_STATUS_FIELD_NUMBER = 5;
    public static final int HIGHEST_AVAILABLE_QUALITY_FIELD_NUMBER = 6;
    public static final int IS_RESAMPLED_FIELD_NUMBER = 11;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYING_BIT_DEPTH_FIELD_NUMBER = 13;
    public static final int PLAYING_SAMPLE_RATE_HZ_FIELD_NUMBER = 8;
    public static final int RESTRICTION_REASON_FIELD_NUMBER = 10;
    public static final int SOURCE_IS_LOSSLESS_FIELD_NUMBER = 12;
    public static final int STRATEGY_FIELD_NUMBER = 2;
    public static final int TARGET_BITRATE_AVAILABLE_FIELD_NUMBER = 4;
    public static final int TARGET_BITRATE_LEVEL_FIELD_NUMBER = 3;
    private int bitField0_;
    private int bitrateLevel_;
    private int fileOrigin_;
    private int hardwareSampleRateHz_;
    private int hifiStatus_;
    private int highestAvailableQuality_;
    private boolean isResampled_;
    private int playingBitDepth_;
    private int playingSampleRateHz_;
    private int restrictionReason_;
    private boolean sourceIsLossless_;
    private int strategy_;
    private boolean targetBitrateAvailable_;
    private int targetBitrateLevel_;

    static {
        EsContextPlayerState$PlaybackQuality esContextPlayerState$PlaybackQuality = new EsContextPlayerState$PlaybackQuality();
        DEFAULT_INSTANCE = esContextPlayerState$PlaybackQuality;
        h.registerDefaultInstance(EsContextPlayerState$PlaybackQuality.class, esContextPlayerState$PlaybackQuality);
    }

    private EsContextPlayerState$PlaybackQuality() {
    }

    public static EsContextPlayerState$PlaybackQuality p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0004\u0007\u0005\f\u0006\f\u0007\f\b\u0004\t\u0004\n\f\u000b\u0007\fဇ\u0000\r\u0004", new Object[]{"bitField0_", "bitrateLevel_", "strategy_", "targetBitrateLevel_", "targetBitrateAvailable_", "hifiStatus_", "highestAvailableQuality_", "fileOrigin_", "playingSampleRateHz_", "hardwareSampleRateHz_", "restrictionReason_", "isResampled_", "sourceIsLossless_", "playingBitDepth_"});
        }
        if (iOrdinal == 3) {
            return new EsContextPlayerState$PlaybackQuality();
        }
        if (iOrdinal == 4) {
            return new jlz((byte) 24);
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
        synchronized (EsContextPlayerState$PlaybackQuality.class) {
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

    public final omz o() {
        omz omzVarA = omz.a(this.bitrateLevel_);
        return omzVarA == null ? omz.UNRECOGNIZED : omzVarA;
    }

    public final qmz q() {
        qmz qmzVar;
        int i = this.fileOrigin_;
        if (i == 0) {
            qmzVar = qmz.UNKNOWN_FILE_ORIGIN;
        } else if (i == 1) {
            qmzVar = qmz.INTERNAL;
        } else if (i == 2) {
            qmzVar = qmz.EXTERNAL;
        } else if (i != 3) {
            qmzVar = i != 4 ? null : qmz.GENERATED;
        } else {
            qmzVar = qmz.LOCAL;
        }
        return qmzVar == null ? qmz.UNRECOGNIZED : qmzVar;
    }

    public final rmz r() {
        rmz rmzVar;
        int i = this.hifiStatus_;
        if (i == 0) {
            rmzVar = rmz.NONE;
        } else if (i != 1) {
            rmzVar = i != 2 ? null : rmz.ON;
        } else {
            rmzVar = rmz.OFF;
        }
        return rmzVar == null ? rmz.UNRECOGNIZED : rmzVar;
    }

    public final omz s() {
        omz omzVarA = omz.a(this.highestAvailableQuality_);
        return omzVarA == null ? omz.UNRECOGNIZED : omzVarA;
    }

    public final pmz t() {
        pmz pmzVar;
        int i = this.strategy_;
        if (i == 0) {
            pmzVar = pmz.UNKNOWN_STRATEGY;
        } else if (i == 1) {
            pmzVar = pmz.BEST_MATCHING;
        } else if (i == 2) {
            pmzVar = pmz.BACKEND_ADVISED;
        } else if (i == 3) {
            pmzVar = pmz.OFFLINED_FILE;
        } else if (i != 4) {
            pmzVar = i != 5 ? null : pmz.LOCAL_FILE;
        } else {
            pmzVar = pmz.CACHED_FILE;
        }
        return pmzVar == null ? pmz.UNRECOGNIZED : pmzVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.targetBitrateAvailable_;
    }

    public final omz v() {
        omz omzVarA = omz.a(this.targetBitrateLevel_);
        return omzVarA == null ? omz.UNRECOGNIZED : omzVarA;
    }
}
