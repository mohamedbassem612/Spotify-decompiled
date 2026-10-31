package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.o9b1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class StaticEnrichedHeading extends h implements v2j0 {
    private static final StaticEnrichedHeading DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTEXT_FIELD_NUMBER = 2;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String text_ = "";
    private String subtext_ = "";
    private String imageUrl_ = "";
    private String navigationUri_ = "";

    static {
        StaticEnrichedHeading staticEnrichedHeading = new StaticEnrichedHeading();
        DEFAULT_INSTANCE = staticEnrichedHeading;
        h.registerDefaultInstance(StaticEnrichedHeading.class, staticEnrichedHeading);
    }

    private StaticEnrichedHeading() {
    }

    public static StaticEnrichedHeading o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"text_", "subtext_", "imageUrl_", "navigationUri_"});
        }
        if (iOrdinal == 3) {
            return new StaticEnrichedHeading();
        }
        if (iOrdinal == 4) {
            return new o9b1((byte) 17);
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
        synchronized (StaticEnrichedHeading.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.navigationUri_;
    }

    public final String q() {
        return this.subtext_;
    }

    public final String r() {
        return this.text_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
