package com.spotify.traits.share.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.mn71;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ShareTraitProto$ShareTrait extends h implements v2j0 {
    private static final ShareTraitProto$ShareTrait DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_OPTIONS_FIELD_NUMBER = 1;
    private h290 shareOptions_ = h.emptyProtobufList();

    static {
        ShareTraitProto$ShareTrait shareTraitProto$ShareTrait = new ShareTraitProto$ShareTrait();
        DEFAULT_INSTANCE = shareTraitProto$ShareTrait;
        h.registerDefaultInstance(ShareTraitProto$ShareTrait.class, shareTraitProto$ShareTrait);
    }

    private ShareTraitProto$ShareTrait() {
    }

    public static ShareTraitProto$ShareTrait o(byte[] bArr) {
        return (ShareTraitProto$ShareTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"shareOptions_", ShareTraitProto$ShareOption.class});
        }
        if (iOrdinal == 3) {
            return new ShareTraitProto$ShareTrait();
        }
        if (iOrdinal == 4) {
            return new mn71(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (ShareTraitProto$ShareTrait.class) {
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

    public final h290 n() {
        return this.shareOptions_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
