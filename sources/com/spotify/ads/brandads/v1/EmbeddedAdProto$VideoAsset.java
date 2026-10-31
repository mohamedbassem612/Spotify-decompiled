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
public final class EmbeddedAdProto$VideoAsset extends h implements v2j0 {
    public static final int BITRATE_FIELD_NUMBER = 3;
    private static final EmbeddedAdProto$VideoAsset DEFAULT_INSTANCE;
    public static final int DURATION_SEC_FIELD_NUMBER = 6;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    public static final int HEX_ID_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 4;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private int bitField0_;
    private int bitrate_;
    private int durationSec_;
    private int height_;
    private int width_;
    private String url_ = "";
    private String hexId_ = "";

    static {
        EmbeddedAdProto$VideoAsset embeddedAdProto$VideoAsset = new EmbeddedAdProto$VideoAsset();
        DEFAULT_INSTANCE = embeddedAdProto$VideoAsset;
        h.registerDefaultInstance(EmbeddedAdProto$VideoAsset.class, embeddedAdProto$VideoAsset);
    }

    private EmbeddedAdProto$VideoAsset() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004ለ\u0000\u0005ለ\u0001\u0006\u0004", new Object[]{"bitField0_", "width_", "height_", "bitrate_", "url_", "hexId_", "durationSec_"});
        }
        if (iOrdinal == 3) {
            return new EmbeddedAdProto$VideoAsset();
        }
        if (iOrdinal == 4) {
            return new eku(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (EmbeddedAdProto$VideoAsset.class) {
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

    public final int n() {
        return this.durationSec_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.height_;
    }

    public final String p() {
        return this.hexId_;
    }

    public final int q() {
        return this.width_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
