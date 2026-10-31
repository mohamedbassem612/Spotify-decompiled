package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uca;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class BasicBanner extends h implements v2j0 {
    public static final int ALIGNMENT_FIELD_NUMBER = 1;
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 2;
    public static final int BODY_COLOR_FIELD_NUMBER = 6;
    public static final int BODY_TEXT_FIELD_NUMBER = 5;
    private static final BasicBanner DEFAULT_INSTANCE;
    public static final int HEADLINE_COLOR_FIELD_NUMBER = 4;
    public static final int HEADLINE_TEXT_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int alignment_;
    private String backgroundColor_ = "";
    private String headlineText_ = "";
    private String headlineColor_ = "";
    private String bodyText_ = "";
    private String bodyColor_ = "";

    static {
        BasicBanner basicBanner = new BasicBanner();
        DEFAULT_INSTANCE = basicBanner;
        h.registerDefaultInstance(BasicBanner.class, basicBanner);
    }

    private BasicBanner() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static BasicBanner q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"alignment_", "backgroundColor_", "headlineText_", "headlineColor_", "bodyText_", "bodyColor_"});
        }
        if (iOrdinal == 3) {
            return new BasicBanner();
        }
        if (iOrdinal == 4) {
            return new uca(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (BasicBanner.class) {
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
        return this.backgroundColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.bodyColor_;
    }

    public final String p() {
        return this.bodyText_;
    }

    public final String r() {
        return this.headlineColor_;
    }

    public final String s() {
        return this.headlineText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
