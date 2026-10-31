package com.spotify.searchview.proto;

import p.a53;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Artist extends com.google.protobuf.h implements v2j0 {
    public static final int AI_PERSONA_FIELD_NUMBER = 5;
    public static final int CONCERT_CAMPAIGN_FIELD_NUMBER = 4;
    private static final Artist DEFAULT_INSTANCE;
    public static final int HAS_CONCERTS_FIELD_NUMBER = 2;
    public static final int IS_CLASSICAL_COMPOSER_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int USER_LOCAL_CONCERT_FIELD_NUMBER = 3;
    public static final int VERIFIED_FIELD_NUMBER = 1;
    private AiPersona aiPersona_;
    private int bitField0_;
    private ConcertCampaign concertCampaign_;
    private boolean hasConcerts_;
    private boolean isClassicalComposer_;
    private Concert userLocalConcert_;
    private boolean verified_;

    static {
        Artist artist = new Artist();
        DEFAULT_INSTANCE = artist;
        com.google.protobuf.h.registerDefaultInstance(Artist.class, artist);
    }

    private Artist() {
    }

    public static Artist p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006\u0007", new Object[]{"bitField0_", "verified_", "hasConcerts_", "userLocalConcert_", "concertCampaign_", "aiPersona_", "isClassicalComposer_"});
        }
        if (iOrdinal == 3) {
            return new Artist();
        }
        if (iOrdinal == 4) {
            return new a53(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (Artist.class) {
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

    public final AiPersona n() {
        AiPersona aiPersona = this.aiPersona_;
        return aiPersona == null ? AiPersona.o() : aiPersona;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ConcertCampaign o() {
        ConcertCampaign concertCampaign = this.concertCampaign_;
        return concertCampaign == null ? ConcertCampaign.n() : concertCampaign;
    }

    public final Concert q() {
        Concert concert = this.userLocalConcert_;
        return concert == null ? Concert.o() : concert;
    }

    public final boolean r() {
        return this.verified_;
    }

    public final boolean s() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }
}
