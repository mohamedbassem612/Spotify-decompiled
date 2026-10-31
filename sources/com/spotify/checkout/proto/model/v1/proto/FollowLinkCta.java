package com.spotify.checkout.proto.model.v1.proto;

import p.bf40;
import p.i630;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class FollowLinkCta extends com.google.protobuf.h implements v2j0 {
    private static final FollowLinkCta DEFAULT_INSTANCE;
    public static final int DESTINATION_URL_FIELD_NUMBER = 2;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String label_ = "";
    private String destinationUrl_ = "";

    static {
        FollowLinkCta followLinkCta = new FollowLinkCta();
        DEFAULT_INSTANCE = followLinkCta;
        com.google.protobuf.h.registerDefaultInstance(FollowLinkCta.class, followLinkCta);
    }

    private FollowLinkCta() {
    }

    public static FollowLinkCta n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static i630 q() {
        return (i630) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"label_", "destinationUrl_"});
        }
        if (iOrdinal == 3) {
            return new FollowLinkCta();
        }
        if (iOrdinal == 4) {
            return new i630(DEFAULT_INSTANCE);
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
        synchronized (FollowLinkCta.class) {
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

    public final String o() {
        return this.destinationUrl_;
    }

    public final String p() {
        return this.label_;
    }

    public final void r(String str) {
        this.destinationUrl_ = str;
    }

    public final void s(String str) {
        this.label_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
