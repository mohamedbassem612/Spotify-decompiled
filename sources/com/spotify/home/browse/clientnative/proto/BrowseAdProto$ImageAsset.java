package com.spotify.home.browse.clientnative.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lka;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class BrowseAdProto$ImageAsset extends h implements v2j0 {
    public static final int ASPECT_RATIO_FIELD_NUMBER = 1;
    private static final BrowseAdProto$ImageAsset DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 5;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    public static final int LOGO_IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 4;
    private int bitField0_;
    private int height_;
    private int width_;
    private String aspectRatio_ = "";
    private String imageUrl_ = "";
    private String logoImageUrl_ = "";

    static {
        BrowseAdProto$ImageAsset browseAdProto$ImageAsset = new BrowseAdProto$ImageAsset();
        DEFAULT_INSTANCE = browseAdProto$ImageAsset;
        h.registerDefaultInstance(BrowseAdProto$ImageAsset.class, browseAdProto$ImageAsset);
    }

    private BrowseAdProto$ImageAsset() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002Ȉ\u0003ለ\u0001\u0004\u0004\u0005\u0004", new Object[]{"bitField0_", "aspectRatio_", "imageUrl_", "logoImageUrl_", "width_", "height_"});
        }
        if (iOrdinal == 3) {
            return new BrowseAdProto$ImageAsset();
        }
        if (iOrdinal == 4) {
            return new lka(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (BrowseAdProto$ImageAsset.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final int n() {
        return this.height_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.logoImageUrl_;
    }

    public final int p() {
        return this.width_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
