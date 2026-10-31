package com.spotify.highlightsstats.data.proto.sharing.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ek61;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ShareResponse extends h implements v2j0 {
    private static final ShareResponse DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    public static final int MESSAGING_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_CARDS_FIELD_NUMBER = 3;
    private int bitField0_;
    private ShareMessaging messaging_;
    private String imageUrl_ = "";
    private h290 shareCards_ = h.emptyProtobufList();

    static {
        ShareResponse shareResponse = new ShareResponse();
        DEFAULT_INSTANCE = shareResponse;
        h.registerDefaultInstance(ShareResponse.class, shareResponse);
    }

    private ShareResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b", new Object[]{"bitField0_", "imageUrl_", "messaging_", "shareCards_", ShareCard.class});
        }
        if (iOrdinal == 3) {
            return new ShareResponse();
        }
        if (iOrdinal == 4) {
            return new ek61(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (ShareResponse.class) {
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
        return this.shareCards_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
