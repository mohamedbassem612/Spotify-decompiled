package com.spotify.highlightsstats.data.proto.sharing.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ek61;
import p.jf40;
import p.kn71;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ShareCard extends h implements v2j0 {
    private static final ShareCard DEFAULT_INSTANCE;
    public static final int HIGHLIGHTS_TYPE_FIELD_NUMBER = 4;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    public static final int MESSAGING_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STATS_TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private ShareMessaging messaging_;
    private Object type_;
    private int typeCase_ = 0;
    private String imageUrl_ = "";

    static {
        ShareCard shareCard = new ShareCard();
        DEFAULT_INSTANCE = shareCard;
        h.registerDefaultInstance(ShareCard.class, shareCard);
    }

    private ShareCard() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003?\u0000\u0004?\u0000", new Object[]{"type_", "typeCase_", "bitField0_", "imageUrl_", "messaging_"});
        }
        if (iOrdinal == 3) {
            return new ShareCard();
        }
        if (iOrdinal == 4) {
            return new ek61(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (ShareCard.class) {
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
        return this.imageUrl_;
    }

    public final ShareMessaging n() {
        ShareMessaging shareMessaging = this.messaging_;
        return shareMessaging == null ? ShareMessaging.n() : shareMessaging;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final kn71 o() {
        if (this.typeCase_ != 3) {
            return kn71.UNSPECIFIED_TYPE;
        }
        kn71 kn71VarA = kn71.a(((Integer) this.type_).intValue());
        return kn71VarA == null ? kn71.UNRECOGNIZED : kn71VarA;
    }

    public final int p() {
        int i = this.typeCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 2;
        }
        return 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
