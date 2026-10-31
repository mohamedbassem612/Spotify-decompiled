package com.spotify.contentagnostic.v2;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.h1y0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class PublishingMetadataTrait extends h implements v2j0 {
    public static final int COPYRIGHT_INFORMATION_FIELD_NUMBER = 4;
    private static final PublishingMetadataTrait DEFAULT_INSTANCE;
    public static final int FIRST_PUBLISHED_AT_FIELD_NUMBER = 1;
    public static final int LAST_MODIFIED_AT_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PUBLISHED_ON_SPOTIFY_AT_FIELD_NUMBER = 2;
    private int bitField0_;
    private h290 copyrightInformation_ = h.emptyProtobufList();
    private TimestampOfVaryingGranularity firstPublishedAt_;
    private Timestamp lastModifiedAt_;
    private Timestamp publishedOnSpotifyAt_;

    static {
        PublishingMetadataTrait publishingMetadataTrait = new PublishingMetadataTrait();
        DEFAULT_INSTANCE = publishingMetadataTrait;
        h.registerDefaultInstance(PublishingMetadataTrait.class, publishingMetadataTrait);
    }

    private PublishingMetadataTrait() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PublishingMetadataTrait r(byte[] bArr) {
        return (PublishingMetadataTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ț", new Object[]{"bitField0_", "firstPublishedAt_", "publishedOnSpotifyAt_", "lastModifiedAt_", "copyrightInformation_"});
        }
        if (iOrdinal == 3) {
            return new PublishingMetadataTrait();
        }
        if (iOrdinal == 4) {
            return new h1y0((byte) 14);
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
        synchronized (PublishingMetadataTrait.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.copyrightInformation_;
    }

    public final TimestampOfVaryingGranularity p() {
        TimestampOfVaryingGranularity timestampOfVaryingGranularity = this.firstPublishedAt_;
        return timestampOfVaryingGranularity == null ? TimestampOfVaryingGranularity.o() : timestampOfVaryingGranularity;
    }

    public final Timestamp q() {
        Timestamp timestamp = this.publishedOnSpotifyAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
