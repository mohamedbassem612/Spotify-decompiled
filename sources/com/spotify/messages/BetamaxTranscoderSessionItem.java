package com.spotify.messages;

import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rpa;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class BetamaxTranscoderSessionItem extends com.google.protobuf.h implements v2j0 {
    public static final int CLIP_END_MS_FIELD_NUMBER = 10;
    public static final int CLIP_START_MS_FIELD_NUMBER = 9;
    private static final BetamaxTranscoderSessionItem DEFAULT_INSTANCE;
    public static final int EFFECTS_FIELD_NUMBER = 8;
    public static final int IS_DRM_FIELD_NUMBER = 6;
    public static final int ITEM_INDEX_FIELD_NUMBER = 3;
    public static final int ITEM_TYPE_FIELD_NUMBER = 4;
    public static final int MEDIA_URL_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_LOCALE_FIELD_NUMBER = 7;
    public static final int TRANSCODING_ID_FIELD_NUMBER = 1;
    public static final int TRANSCODING_ITEM_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clipEndMs_;
    private long clipStartMs_;
    private boolean isDrm_;
    private int itemIndex_;
    private String transcodingId_ = "";
    private String transcodingItemId_ = "";
    private String itemType_ = "";
    private String mediaUrl_ = "";
    private String subtitleLocale_ = "";
    private h290 effects_ = com.google.protobuf.h.emptyProtobufList();

    static {
        BetamaxTranscoderSessionItem betamaxTranscoderSessionItem = new BetamaxTranscoderSessionItem();
        DEFAULT_INSTANCE = betamaxTranscoderSessionItem;
        com.google.protobuf.h.registerDefaultInstance(BetamaxTranscoderSessionItem.class, betamaxTranscoderSessionItem);
    }

    private BetamaxTranscoderSessionItem() {
    }

    public static rpa o() {
        return (rpa) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဈ\u0006\b\u001a\tဂ\u0007\nဂ\b", new Object[]{"bitField0_", "transcodingId_", "transcodingItemId_", "itemIndex_", "itemType_", "mediaUrl_", "isDrm_", "subtitleLocale_", "effects_", "clipStartMs_", "clipEndMs_"});
        }
        if (iOrdinal == 3) {
            return new BetamaxTranscoderSessionItem();
        }
        if (iOrdinal == 4) {
            return new rpa(DEFAULT_INSTANCE);
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
        synchronized (BetamaxTranscoderSessionItem.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.effects_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.effects_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(long j) {
        this.bitField0_ |= 256;
        this.clipEndMs_ = j;
    }

    public final void q(long j) {
        this.bitField0_ |= 128;
        this.clipStartMs_ = j;
    }

    public final void r(boolean z) {
        this.bitField0_ |= 32;
        this.isDrm_ = z;
    }

    public final void s(int i) {
        this.bitField0_ |= 4;
        this.itemIndex_ = i;
    }

    public final void t() {
        this.bitField0_ |= 8;
        this.itemType_ = "video";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.mediaUrl_ = str;
    }

    public final void v(String str) {
        this.bitField0_ |= 64;
        this.subtitleLocale_ = str;
    }

    public final void w(String str) {
        this.bitField0_ |= 1;
        this.transcodingId_ = str;
    }

    public final void x(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.transcodingItemId_ = str;
    }
}
