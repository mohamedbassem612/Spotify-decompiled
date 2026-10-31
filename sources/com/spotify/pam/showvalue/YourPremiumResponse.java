package com.spotify.pam.showvalue;

import com.google.protobuf.h;
import p.bf40;
import p.dnm1;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class YourPremiumResponse extends h implements v2j0 {
    private static final YourPremiumResponse DEFAULT_INSTANCE;
    public static final int PAGE_SUBTITLE_FIELD_NUMBER = 2;
    public static final int PAGE_TITLE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SECTIONS_FIELD_NUMBER = 3;
    private String pageTitle_ = "";
    private String pageSubtitle_ = "";
    private h290 sections_ = h.emptyProtobufList();

    static {
        YourPremiumResponse yourPremiumResponse = new YourPremiumResponse();
        DEFAULT_INSTANCE = yourPremiumResponse;
        h.registerDefaultInstance(YourPremiumResponse.class, yourPremiumResponse);
    }

    private YourPremiumResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"pageTitle_", "pageSubtitle_", "sections_", Section.class});
        }
        if (iOrdinal == 3) {
            return new YourPremiumResponse();
        }
        if (iOrdinal == 4) {
            return new dnm1(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (YourPremiumResponse.class) {
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
        return this.pageSubtitle_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.pageTitle_;
    }

    public final h290 p() {
        return this.sections_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
