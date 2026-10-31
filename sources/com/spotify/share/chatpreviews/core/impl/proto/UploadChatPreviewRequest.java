package com.spotify.share.chatpreviews.core.impl.proto;

import com.google.protobuf.h;
import p.awh1;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class UploadChatPreviewRequest extends h implements v2j0 {
    public static final int BACKGROUND_FIELD_NUMBER = 1;
    private static final UploadChatPreviewRequest DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_FORMAT_FIELD_NUMBER = 3;
    public static final int STICKER_FIELD_NUMBER = 2;
    private UploadBackground background_;
    private int bitField0_;
    private String entityUri_ = "";
    private ShareFormat shareFormat_;
    private UploadImage sticker_;

    static {
        UploadChatPreviewRequest uploadChatPreviewRequest = new UploadChatPreviewRequest();
        DEFAULT_INSTANCE = uploadChatPreviewRequest;
        h.registerDefaultInstance(UploadChatPreviewRequest.class, uploadChatPreviewRequest);
    }

    private UploadChatPreviewRequest() {
    }

    public static awh1 n() {
        return (awh1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ", new Object[]{"bitField0_", "background_", "sticker_", "shareFormat_", "entityUri_"});
        }
        if (iOrdinal == 3) {
            return new UploadChatPreviewRequest();
        }
        if (iOrdinal == 4) {
            return new awh1(DEFAULT_INSTANCE);
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
        synchronized (UploadChatPreviewRequest.class) {
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

    public final void o(UploadBackground uploadBackground) {
        uploadBackground.getClass();
        this.background_ = uploadBackground;
        this.bitField0_ |= 1;
    }

    public final void p(String str) {
        str.getClass();
        this.entityUri_ = str;
    }

    public final void q(ShareFormat shareFormat) {
        shareFormat.getClass();
        this.shareFormat_ = shareFormat;
        this.bitField0_ |= 4;
    }

    public final void r(UploadImage uploadImage) {
        uploadImage.getClass();
        this.sticker_ = uploadImage;
        this.bitField0_ |= 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
