package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.ek61;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ShareAsset extends com.google.protobuf.h implements v2j0 {
    private static final ShareAsset DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RIVE_ANIMATION_FIELD_NUMBER = 2;
    private int assetCase_ = 0;
    private Object asset_;

    static {
        ShareAsset shareAsset = new ShareAsset();
        DEFAULT_INSTANCE = shareAsset;
        com.google.protobuf.h.registerDefaultInstance(ShareAsset.class, shareAsset);
    }

    private ShareAsset() {
    }

    public static ShareAsset o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002<\u0000", new Object[]{"asset_", "assetCase_", RiveAnimation.class});
        }
        if (iOrdinal == 3) {
            return new ShareAsset();
        }
        if (iOrdinal == 4) {
            return new ek61(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (ShareAsset.class) {
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
        return this.assetCase_ == 1 ? (String) this.asset_ : "";
    }

    public final int n() {
        int i = this.assetCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final RiveAnimation p() {
        return this.assetCase_ == 2 ? (RiveAnimation) this.asset_ : RiveAnimation.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
