package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yo30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class FullBleedBanner extends h implements v2j0 {
    public static final int ACCESSIBILITY_FIELD_NUMBER = 5;
    public static final int COLOR_CODE_FIELD_NUMBER = 2;
    private static final FullBleedBanner DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private String colorCode_ = "";
    private String imageUrl_ = "";
    private String description_ = "";
    private String accessibility_ = "";

    static {
        FullBleedBanner fullBleedBanner = new FullBleedBanner();
        DEFAULT_INSTANCE = fullBleedBanner;
        h.registerDefaultInstance(FullBleedBanner.class, fullBleedBanner);
    }

    private FullBleedBanner() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static FullBleedBanner q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"colorCode_", "imageUrl_", "description_", "accessibility_"});
        }
        if (iOrdinal == 3) {
            return new FullBleedBanner();
        }
        if (iOrdinal == 4) {
            return new yo30((byte) 1);
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
        synchronized (FullBleedBanner.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.accessibility_;
    }

    public final String p() {
        return this.colorCode_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
