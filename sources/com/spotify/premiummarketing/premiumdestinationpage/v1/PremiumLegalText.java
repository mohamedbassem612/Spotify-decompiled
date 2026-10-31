package com.spotify.premiummarketing.premiumdestinationpage.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r4v0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PremiumLegalText extends h implements v2j0 {
    private static final PremiumLegalText DEFAULT_INSTANCE;
    public static final int LOGGING_INFO_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_COLOR_FIELD_NUMBER = 2;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private LoggingInfo loggingInfo_;
    private String text_ = "";
    private String textColor_ = "";

    static {
        PremiumLegalText premiumLegalText = new PremiumLegalText();
        DEFAULT_INSTANCE = premiumLegalText;
        h.registerDefaultInstance(PremiumLegalText.class, premiumLegalText);
    }

    private PremiumLegalText() {
    }

    public static PremiumLegalText n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "text_", "textColor_", "loggingInfo_"});
        }
        if (iOrdinal == 3) {
            return new PremiumLegalText();
        }
        if (iOrdinal == 4) {
            return new r4v0(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (PremiumLegalText.class) {
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

    public final LoggingInfo o() {
        LoggingInfo loggingInfo = this.loggingInfo_;
        return loggingInfo == null ? LoggingInfo.o() : loggingInfo;
    }

    public final String p() {
        return this.text_;
    }

    public final String q() {
        return this.textColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
