package com.spotify.traits.share.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mn71;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ShareTraitProto$ShareOption extends h implements v2j0 {
    private static final ShareTraitProto$ShareOption DEFAULT_INSTANCE;
    public static final int EXTENSION_KIND_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_URI_FIELD_NUMBER = 1;
    private int valueCase_ = 0;
    private Object value_;

    static {
        ShareTraitProto$ShareOption shareTraitProto$ShareOption = new ShareTraitProto$ShareOption();
        DEFAULT_INSTANCE = shareTraitProto$ShareOption;
        h.registerDefaultInstance(ShareTraitProto$ShareOption.class, shareTraitProto$ShareOption);
    }

    private ShareTraitProto$ShareOption() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u00027\u0000", new Object[]{"value_", "valueCase_"});
        }
        if (iOrdinal == 3) {
            return new ShareTraitProto$ShareOption();
        }
        if (iOrdinal == 4) {
            return new mn71(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (ShareTraitProto$ShareOption.class) {
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

    public final int n() {
        if (this.valueCase_ == 2) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.valueCase_ == 1 ? (String) this.value_ : "";
    }

    public final boolean p() {
        return this.valueCase_ == 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
