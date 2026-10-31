package com.spotify.scrollsita.v1;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.eku;
import p.jf40;
import p.m1x;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class EmbeddedAdMetadata extends h implements v2j0 {
    public static final int AD_ID_FIELD_NUMBER = 1;
    public static final int CREATIVE_ID_FIELD_NUMBER = 2;
    private static final EmbeddedAdMetadata DEFAULT_INSTANCE;
    public static final int LINEITEM_ID_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 5;
    public static final int PRODUCT_NAME_FIELD_NUMBER = 4;
    public static final int SLOT_FIELD_NUMBER = 6;
    public static final int TRACKING_EVENTS_FIELD_NUMBER = 7;
    private qng0 trackingEvents_ = qng0.b;
    private String adId_ = "";
    private String creativeId_ = "";
    private String lineitemId_ = "";
    private String productName_ = "";
    private String playbackId_ = "";
    private String slot_ = "";

    static {
        EmbeddedAdMetadata embeddedAdMetadata = new EmbeddedAdMetadata();
        DEFAULT_INSTANCE = embeddedAdMetadata;
        h.registerDefaultInstance(EmbeddedAdMetadata.class, embeddedAdMetadata);
    }

    private EmbeddedAdMetadata() {
    }

    public static EmbeddedAdMetadata p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u00072", new Object[]{"adId_", "creativeId_", "lineitemId_", "productName_", "playbackId_", "slot_", "trackingEvents_", m1x.a});
        }
        if (iOrdinal == 3) {
            return new EmbeddedAdMetadata();
        }
        if (iOrdinal == 4) {
            return new eku(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (EmbeddedAdMetadata.class) {
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
        return this.adId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.creativeId_;
    }

    public final String q() {
        return this.lineitemId_;
    }

    public final String r() {
        return this.playbackId_;
    }

    public final String s() {
        return this.productName_;
    }

    public final String t() {
        return this.slot_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Map u() {
        return Collections.unmodifiableMap(this.trackingEvents_);
    }
}
