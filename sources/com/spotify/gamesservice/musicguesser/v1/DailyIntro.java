package com.spotify.gamesservice.musicguesser.v1;

import p.bf40;
import p.jf40;
import p.p2o;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class DailyIntro extends com.google.protobuf.h implements v2j0 {
    public static final int BACKGROUND_AUDIO_FIELD_NUMBER = 9;
    public static final int CTA_TEXT_FIELD_NUMBER = 5;
    public static final int CTA_URI_FIELD_NUMBER = 4;
    private static final DailyIntro DEFAULT_INSTANCE;
    public static final int ERROR_SUBTITLE_FIELD_NUMBER = 8;
    public static final int ERROR_TITLE_FIELD_NUMBER = 7;
    public static final int FOOTER_FIELD_NUMBER = 3;
    public static final int LOGO_URL_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private String subtitle_ = "";
    private String footer_ = "";
    private String ctaUri_ = "";
    private String ctaText_ = "";
    private String logoUrl_ = "";
    private String errorTitle_ = "";
    private String errorSubtitle_ = "";
    private String backgroundAudio_ = "";

    static {
        DailyIntro dailyIntro = new DailyIntro();
        DEFAULT_INSTANCE = dailyIntro;
        com.google.protobuf.h.registerDefaultInstance(DailyIntro.class, dailyIntro);
    }

    private DailyIntro() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static DailyIntro q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ", new Object[]{"title_", "subtitle_", "footer_", "ctaUri_", "ctaText_", "logoUrl_", "errorTitle_", "errorSubtitle_", "backgroundAudio_"});
        }
        if (iOrdinal == 3) {
            return new DailyIntro();
        }
        if (iOrdinal == 4) {
            return new p2o(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (DailyIntro.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.backgroundAudio_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.ctaText_;
    }

    public final String p() {
        return this.ctaUri_;
    }

    public final String r() {
        return this.errorSubtitle_;
    }

    public final String s() {
        return this.errorTitle_;
    }

    public final String t() {
        return this.footer_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.logoUrl_;
    }
}
