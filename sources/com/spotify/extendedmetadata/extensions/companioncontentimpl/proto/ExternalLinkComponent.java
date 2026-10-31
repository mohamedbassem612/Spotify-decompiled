package com.spotify.extendedmetadata.extensions.companioncontentimpl.proto;

import p.bf40;
import p.fs00;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ExternalLinkComponent extends com.google.protobuf.h implements v2j0 {
    private static final ExternalLinkComponent DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private String url_ = "";
    private String title_ = "";

    static {
        ExternalLinkComponent externalLinkComponent = new ExternalLinkComponent();
        DEFAULT_INSTANCE = externalLinkComponent;
        com.google.protobuf.h.registerDefaultInstance(ExternalLinkComponent.class, externalLinkComponent);
    }

    private ExternalLinkComponent() {
    }

    public static ExternalLinkComponent n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"bitField0_", "url_", "title_"});
        }
        if (iOrdinal == 3) {
            return new ExternalLinkComponent();
        }
        if (iOrdinal == 4) {
            return new fs00(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (ExternalLinkComponent.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String getUrl() {
        return this.url_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
