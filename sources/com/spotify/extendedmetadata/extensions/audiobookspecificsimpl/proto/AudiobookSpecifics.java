package com.spotify.extendedmetadata.extensions.audiobookspecificsimpl.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.hw7;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class AudiobookSpecifics extends h implements v2j0 {
    public static final int CREDITS_FIELD_NUMBER = 2;
    private static final AudiobookSpecifics DEFAULT_INSTANCE;
    public static final int DURATION_MS_FIELD_NUMBER = 4;
    public static final int EDITION_FIELD_NUMBER = 3;
    public static final int MAIN_TITLE_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PUBLISH_DATE_FIELD_NUMBER = 5;
    public static final int SERIES_NAME_FIELD_NUMBER = 9;
    public static final int SERIES_NUMBER_FIELD_NUMBER = 8;
    public static final int SERIES_POSITION_LABEL_FIELD_NUMBER = 10;
    public static final int SUBTITLE_FIELD_NUMBER = 7;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Credits credits_;
    private long durationMs_;
    private Timestamp publishDate_;
    private String uri_ = "";
    private String edition_ = "";
    private String mainTitle_ = "";
    private String subtitle_ = "";
    private String seriesNumber_ = "";
    private String seriesName_ = "";
    private String seriesPositionLabel_ = "";

    static {
        AudiobookSpecifics audiobookSpecifics = new AudiobookSpecifics();
        DEFAULT_INSTANCE = audiobookSpecifics;
        h.registerDefaultInstance(AudiobookSpecifics.class, audiobookSpecifics);
    }

    private AudiobookSpecifics() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static AudiobookSpecifics v(byte[] bArr) {
        return (AudiobookSpecifics) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004\u0002\u0005ဉ\u0001\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ", new Object[]{"bitField0_", "uri_", "credits_", "edition_", "durationMs_", "publishDate_", "mainTitle_", "subtitle_", "seriesNumber_", "seriesName_", "seriesPositionLabel_"});
        }
        if (iOrdinal == 3) {
            return new AudiobookSpecifics();
        }
        if (iOrdinal == 4) {
            return new hw7(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (AudiobookSpecifics.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final Credits n() {
        Credits credits = this.credits_;
        return credits == null ? Credits.o() : credits;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.durationMs_;
    }

    public final String p() {
        return this.edition_;
    }

    public final String q() {
        return this.mainTitle_;
    }

    public final Timestamp r() {
        Timestamp timestamp = this.publishDate_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final String s() {
        return this.seriesName_;
    }

    public final String t() {
        return this.seriesNumber_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.seriesPositionLabel_;
    }
}
