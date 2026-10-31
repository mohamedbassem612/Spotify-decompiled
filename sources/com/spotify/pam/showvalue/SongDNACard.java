package com.spotify.pam.showvalue;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z5a1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class SongDNACard extends h implements v2j0 {
    public static final int ACTION_TITLE_FIELD_NUMBER = 8;
    public static final int CONTRIBUTORS_FIELD_NUMBER = 4;
    private static final SongDNACard DEFAULT_INSTANCE;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int TOTAL_CONTRIBUTORS_FIELD_NUMBER = 5;
    public static final int TOTAL_SAMPLES_FIELD_NUMBER = 6;
    public static final int TRACK_IMAGE_URL_FIELD_NUMBER = 2;
    public static final int TRACK_NAME_FIELD_NUMBER = 1;
    public static final int TRACK_URI_FIELD_NUMBER = 3;
    private int bitField0_;
    private int totalContributors_;
    private int totalSamples_;
    private String trackName_ = "";
    private String trackImageUrl_ = "";
    private String trackUri_ = "";
    private h290 contributors_ = h.emptyProtobufList();
    private String navigationUri_ = "";
    private String actionTitle_ = "";

    static {
        SongDNACard songDNACard = new SongDNACard();
        DEFAULT_INSTANCE = songDNACard;
        h.registerDefaultInstance(SongDNACard.class, songDNACard);
    }

    private SongDNACard() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002ለ\u0000\u0003Ȉ\u0004\u001b\u0005\u0004\u0006\u0004\u0007Ȉ\bȈ", new Object[]{"bitField0_", "trackName_", "trackImageUrl_", "trackUri_", "contributors_", SongDNAContributor.class, "totalContributors_", "totalSamples_", "navigationUri_", "actionTitle_"});
        }
        if (iOrdinal == 3) {
            return new SongDNACard();
        }
        if (iOrdinal == 4) {
            return new z5a1(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (SongDNACard.class) {
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

    public final String n() {
        return this.actionTitle_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.contributors_;
    }

    public final String p() {
        return this.navigationUri_;
    }

    public final int q() {
        return this.totalContributors_;
    }

    public final int r() {
        return this.totalSamples_;
    }

    public final String s() {
        return this.trackImageUrl_;
    }

    public final String t() {
        return this.trackName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.trackUri_;
    }

    public final boolean v() {
        return (this.bitField0_ & 1) != 0;
    }
}
