package com.spotify.scrollsita.v1;

import com.google.protobuf.h;
import p.bf40;
import p.eku;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class EmbeddedAd extends h implements v2j0 {
    public static final int ADVERTISER_FIELD_NUMBER = 1;
    public static final int CALL_TO_ACTION_FIELD_NUMBER = 2;
    public static final int CLICKTHROUGH_URL_FIELD_NUMBER = 3;
    private static final EmbeddedAd DEFAULT_INSTANCE;
    public static final int IMAGES_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TAGLINE_FIELD_NUMBER = 5;
    private int bitField0_;
    private String advertiser_ = "";
    private String callToAction_ = "";
    private String clickthroughUrl_ = "";
    private h290 images_ = h.emptyProtobufList();
    private String tagline_ = "";

    static {
        EmbeddedAd embeddedAd = new EmbeddedAd();
        DEFAULT_INSTANCE = embeddedAd;
        h.registerDefaultInstance(EmbeddedAd.class, embeddedAd);
    }

    private EmbeddedAd() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EmbeddedAd q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003Ȉ\u0004\u001b\u0005ለ\u0002", new Object[]{"bitField0_", "advertiser_", "callToAction_", "clickthroughUrl_", "images_", ImageAsset.class, "tagline_"});
        }
        if (iOrdinal == 3) {
            return new EmbeddedAd();
        }
        if (iOrdinal == 4) {
            return new eku(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (EmbeddedAd.class) {
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
        return this.advertiser_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.callToAction_;
    }

    public final String p() {
        return this.clickthroughUrl_;
    }

    public final h290 r() {
        return this.images_;
    }

    public final String s() {
        return this.tagline_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
