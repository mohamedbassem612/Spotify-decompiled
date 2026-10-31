package com.spotify.ads.brandads.v1;

import com.google.protobuf.h;
import p.b2x;
import p.bf40;
import p.eku;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class EmbeddedAdProto$EmbeddedAdMetadata extends h implements v2j0 {
    public static final int AD_ID_FIELD_NUMBER = 1;
    public static final int CREATIVE_ID_FIELD_NUMBER = 2;
    private static final EmbeddedAdProto$EmbeddedAdMetadata DEFAULT_INSTANCE;
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
        EmbeddedAdProto$EmbeddedAdMetadata embeddedAdProto$EmbeddedAdMetadata = new EmbeddedAdProto$EmbeddedAdMetadata();
        DEFAULT_INSTANCE = embeddedAdProto$EmbeddedAdMetadata;
        h.registerDefaultInstance(EmbeddedAdProto$EmbeddedAdMetadata.class, embeddedAdProto$EmbeddedAdMetadata);
    }

    private EmbeddedAdProto$EmbeddedAdMetadata() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u00072", new Object[]{"adId_", "creativeId_", "lineitemId_", "productName_", "playbackId_", "slot_", "trackingEvents_", b2x.a});
        }
        if (iOrdinal == 3) {
            return new EmbeddedAdProto$EmbeddedAdMetadata();
        }
        if (iOrdinal == 4) {
            return new eku(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (EmbeddedAdProto$EmbeddedAdMetadata.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
