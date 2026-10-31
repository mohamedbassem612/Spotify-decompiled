package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.po01;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ReferralEntrypointSection extends h implements v2j0 {
    private static final ReferralEntrypointSection DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REDIRECT_URI_FIELD_NUMBER = 4;
    public static final int ROW_SUBTITLE_FIELD_NUMBER = 2;
    public static final int ROW_TITLE_FIELD_NUMBER = 1;
    public static final int SECTION_HEADER_FIELD_NUMBER = 3;
    private String rowTitle_ = "";
    private String rowSubtitle_ = "";
    private String sectionHeader_ = "";
    private String redirectUri_ = "";

    static {
        ReferralEntrypointSection referralEntrypointSection = new ReferralEntrypointSection();
        DEFAULT_INSTANCE = referralEntrypointSection;
        h.registerDefaultInstance(ReferralEntrypointSection.class, referralEntrypointSection);
    }

    private ReferralEntrypointSection() {
    }

    public static ReferralEntrypointSection n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"rowTitle_", "rowSubtitle_", "sectionHeader_", "redirectUri_"});
        }
        if (iOrdinal == 3) {
            return new ReferralEntrypointSection();
        }
        if (iOrdinal == 4) {
            return new po01(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (ReferralEntrypointSection.class) {
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

    public final String o() {
        return this.redirectUri_;
    }

    public final String p() {
        return this.rowSubtitle_;
    }

    public final String q() {
        return this.rowTitle_;
    }

    public final String r() {
        return this.sectionHeader_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
