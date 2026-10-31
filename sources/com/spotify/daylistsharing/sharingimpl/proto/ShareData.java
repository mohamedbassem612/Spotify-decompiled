package com.spotify.daylistsharing.sharingimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ek61;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ShareData extends h implements v2j0 {
    private static final ShareData DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SCREENSHOT_SHARE_CARD_FIELD_NUMBER = 2;
    public static final int SHARE_CARDS_FIELD_NUMBER = 1;
    public static final int SHARE_ORIGIN_IDS_FIELD_NUMBER = 4;
    public static final int SNAPSHOT_SHARE_CARD_FIELD_NUMBER = 3;
    private int bitField0_;
    private ShareCard screenshotShareCard_;
    private h290 shareCards_ = h.emptyProtobufList();
    private OriginIds shareOriginIds_;
    private ShareCard snapshotShareCard_;

    static {
        ShareData shareData = new ShareData();
        DEFAULT_INSTANCE = shareData;
        h.registerDefaultInstance(ShareData.class, shareData);
    }

    private ShareData() {
    }

    public static ShareData n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ShareData r(byte[] bArr) {
        return (ShareData) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "shareCards_", ShareCard.class, "screenshotShareCard_", "snapshotShareCard_", "shareOriginIds_"});
        }
        if (iOrdinal == 3) {
            return new ShareData();
        }
        if (iOrdinal == 4) {
            return new ek61(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (ShareData.class) {
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

    public final ShareCard o() {
        ShareCard shareCard = this.screenshotShareCard_;
        return shareCard == null ? ShareCard.o() : shareCard;
    }

    public final h290 p() {
        return this.shareCards_;
    }

    public final ShareCard q() {
        ShareCard shareCard = this.snapshotShareCard_;
        return shareCard == null ? ShareCard.o() : shareCard;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
