package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.j1x;
import p.jf40;
import p.k1x;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EmbeddedAdMetadata extends h implements v2j0 {
    public static final int CREATIVE_ID_FIELD_NUMBER = 2;
    private static final EmbeddedAdMetadata DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LINEITEM_ID_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int PRODUCT_NAME_FIELD_NUMBER = 4;
    public static final int SLOT_FIELD_NUMBER = 6;
    public static final int TRACKING_EVENT_URLS_FIELD_NUMBER = 7;
    private qng0 trackingEventUrls_ = qng0.b;
    private String id_ = "";
    private String creativeId_ = "";
    private String playbackId_ = "";
    private String productName_ = "";
    private String lineitemId_ = "";
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

    public static j1x v() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public final void A(String str) {
        this.slot_ = str;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u00072", new Object[]{"id_", "creativeId_", "playbackId_", "productName_", "lineitemId_", "slot_", "trackingEventUrls_", k1x.a});
        }
        if (iOrdinal == 3) {
            return new EmbeddedAdMetadata();
        }
        if (iOrdinal == 4) {
            return new j1x();
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getId() {
        return this.id_;
    }

    @Override // com.google.protobuf.h, p.s2j0
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

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Map u() {
        return Collections.unmodifiableMap(this.trackingEventUrls_);
    }

    public final void w(String str) {
        str.getClass();
        this.creativeId_ = str;
    }

    public final void x(String str) {
        str.getClass();
        this.id_ = str;
    }

    public final void y(String str) {
        str.getClass();
        this.lineitemId_ = str;
    }

    public final void z(String str) {
        str.getClass();
        this.productName_ = str;
    }
}
