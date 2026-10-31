package com.spotify.lyrics.fullscreenview.events.proto;

import com.google.protobuf.h;
import p.ahf0;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class LyricsErrorReportingEvent extends h implements v2j0 {
    private static final LyricsErrorReportingEvent DEFAULT_INSTANCE;
    public static final int FLAG_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 2;
    public static final int PROVIDER_LYRICS_ID_FIELD_NUMBER = 3;
    public static final int TRACK_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private String trackUri_ = "";
    private String provider_ = "";
    private String providerLyricsId_ = "";
    private String flag_ = "";

    static {
        LyricsErrorReportingEvent lyricsErrorReportingEvent = new LyricsErrorReportingEvent();
        DEFAULT_INSTANCE = lyricsErrorReportingEvent;
        h.registerDefaultInstance(LyricsErrorReportingEvent.class, lyricsErrorReportingEvent);
    }

    private LyricsErrorReportingEvent() {
    }

    public static ahf0 n() {
        return (ahf0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "trackUri_", "provider_", "providerLyricsId_", "flag_"});
        }
        if (iOrdinal == 3) {
            return new LyricsErrorReportingEvent();
        }
        if (iOrdinal == 4) {
            return new ahf0(DEFAULT_INSTANCE);
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
        synchronized (LyricsErrorReportingEvent.class) {
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

    public final void o(String str) {
        this.bitField0_ |= 8;
        this.flag_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.provider_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.providerLyricsId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.trackUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
