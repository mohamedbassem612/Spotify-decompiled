package com.spotify.premiummarketing.premiumdestinationpage.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zp50;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class HeaderCTA extends h implements v2j0 {
    public static final int CTA_CLICK_EVENT_FIELD_NUMBER = 2;
    public static final int CTA_COLOR_SET_FIELD_NUMBER = 5;
    private static final HeaderCTA DEFAULT_INSTANCE;
    public static final int LOGGING_INFO_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private CTAClickEvent ctaClickEvent_;
    private LoggingInfo loggingInfo_;
    private String title_ = "";
    private String ctaColorSet_ = "";

    static {
        HeaderCTA headerCTA = new HeaderCTA();
        DEFAULT_INSTANCE = headerCTA;
        h.registerDefaultInstance(HeaderCTA.class, headerCTA);
    }

    private HeaderCTA() {
    }

    public static HeaderCTA p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001\u0004ဉ\u0002\u0005ለ\u0003", new Object[]{"bitField0_", "title_", "ctaClickEvent_", "loggingInfo_", "ctaColorSet_"});
        }
        if (iOrdinal == 3) {
            return new HeaderCTA();
        }
        if (iOrdinal == 4) {
            return new zp50(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (HeaderCTA.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final CTAClickEvent n() {
        CTAClickEvent cTAClickEvent = this.ctaClickEvent_;
        return cTAClickEvent == null ? CTAClickEvent.o() : cTAClickEvent;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.ctaColorSet_;
    }

    public final LoggingInfo q() {
        LoggingInfo loggingInfo = this.loggingInfo_;
        return loggingInfo == null ? LoggingInfo.o() : loggingInfo;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
