package com.spotify.share.linkpreview.impl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rk61;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class SetLinkPreviewRequest extends h implements v2j0 {
    private static final SetLinkPreviewRequest DEFAULT_INSTANCE;
    public static final int IMAGE_UPLOAD_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    public static final int LINK_PREVIEW_FIELDS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private int imageCase_ = 0;
    private Object image_;
    private UploadLinkPreviewFields linkPreviewFields_;

    static {
        SetLinkPreviewRequest setLinkPreviewRequest = new SetLinkPreviewRequest();
        DEFAULT_INSTANCE = setLinkPreviewRequest;
        h.registerDefaultInstance(SetLinkPreviewRequest.class, setLinkPreviewRequest);
    }

    private SetLinkPreviewRequest() {
    }

    public static rk61 n() {
        return (rk61) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003ဉ\u0000", new Object[]{"image_", "imageCase_", "bitField0_", Image.class, "linkPreviewFields_"});
        }
        if (iOrdinal == 3) {
            return new SetLinkPreviewRequest();
        }
        if (iOrdinal == 4) {
            return new rk61(DEFAULT_INSTANCE);
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
        synchronized (SetLinkPreviewRequest.class) {
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

    public final void o(Image image) {
        image.getClass();
        this.image_ = image;
        this.imageCase_ = 1;
    }

    public final void p(String str) {
        str.getClass();
        this.imageCase_ = 2;
        this.image_ = str;
    }

    public final void q(UploadLinkPreviewFields uploadLinkPreviewFields) {
        uploadLinkPreviewFields.getClass();
        this.linkPreviewFields_ = uploadLinkPreviewFields;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
