package com.spotify.ads.brandads.v1;

import com.google.protobuf.h;
import p.bf40;
import p.eku;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class EmbeddedAdProto$ImageAsset extends h implements v2j0 {
    private static final EmbeddedAdProto$ImageAsset DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    public static final int HEX_ID_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 4;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private int bitField0_;
    private int height_;
    private int width_;
    private String url_ = "";
    private String hexId_ = "";

    static {
        EmbeddedAdProto$ImageAsset embeddedAdProto$ImageAsset = new EmbeddedAdProto$ImageAsset();
        DEFAULT_INSTANCE = embeddedAdProto$ImageAsset;
        h.registerDefaultInstance(EmbeddedAdProto$ImageAsset.class, embeddedAdProto$ImageAsset);
    }

    private EmbeddedAdProto$ImageAsset() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0004ለ\u0000\u0005ለ\u0001", new Object[]{"bitField0_", "width_", "height_", "url_", "hexId_"});
        }
        if (iOrdinal == 3) {
            return new EmbeddedAdProto$ImageAsset();
        }
        if (iOrdinal == 4) {
            return new eku(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (EmbeddedAdProto$ImageAsset.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
