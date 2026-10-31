package com.spotify.fingerprintfilterservice;

import com.google.protobuf.h;
import p.bf40;
import p.fxy;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EpisodeAdPlacements extends h implements v2j0 {
    public static final int AUDIO_DURATION_MS_FIELD_NUMBER = 1;
    public static final int AUDIO_URI_FIELD_NUMBER = 4;
    private static final EpisodeAdPlacements DEFAULT_INSTANCE;
    public static final int FINGERPRINTS_CDN_URL_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PLACEMENTS_FIELD_NUMBER = 2;
    private int audioDurationMs_;
    private int bitField0_;
    private h290 placements_ = h.emptyProtobufList();
    private String fingerprintsCdnUrl_ = "";
    private String audioUri_ = "";

    static {
        EpisodeAdPlacements episodeAdPlacements = new EpisodeAdPlacements();
        DEFAULT_INSTANCE = episodeAdPlacements;
        h.registerDefaultInstance(EpisodeAdPlacements.class, episodeAdPlacements);
    }

    private EpisodeAdPlacements() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EpisodeAdPlacements r(byte[] bArr) {
        return (EpisodeAdPlacements) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002\u001b\u0003ለ\u0000\u0004Ȉ", new Object[]{"bitField0_", "audioDurationMs_", "placements_", AdPlacement.class, "fingerprintsCdnUrl_", "audioUri_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeAdPlacements();
        }
        if (iOrdinal == 4) {
            return new fxy(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (EpisodeAdPlacements.class) {
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

    public final int n() {
        return this.audioDurationMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.audioUri_;
    }

    public final String p() {
        return this.fingerprintsCdnUrl_;
    }

    public final h290 q() {
        return this.placements_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
