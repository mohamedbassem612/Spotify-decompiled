package com.spotify.share.linkpreview.impl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jxh1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class UploadLinkPreviewFields extends h implements v2j0 {
    public static final int AUDIO_URL_FIELD_NUMBER = 4;
    private static final UploadLinkPreviewFields DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TWITTER_CARD_FIELD_NUMBER = 5;
    public static final int VIDEO_URL_FIELD_NUMBER = 3;
    private int bitField0_;
    private String title_ = "";
    private String description_ = "";
    private String videoUrl_ = "";
    private String audioUrl_ = "";
    private String twitterCard_ = "";

    static {
        UploadLinkPreviewFields uploadLinkPreviewFields = new UploadLinkPreviewFields();
        DEFAULT_INSTANCE = uploadLinkPreviewFields;
        h.registerDefaultInstance(UploadLinkPreviewFields.class, uploadLinkPreviewFields);
    }

    private UploadLinkPreviewFields() {
    }

    public static jxh1 n() {
        return (jxh1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004", new Object[]{"bitField0_", "title_", "description_", "videoUrl_", "audioUrl_", "twitterCard_"});
        }
        if (iOrdinal == 3) {
            return new UploadLinkPreviewFields();
        }
        if (iOrdinal == 4) {
            return new jxh1(DEFAULT_INSTANCE);
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
        synchronized (UploadLinkPreviewFields.class) {
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

    public final void o(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.audioUrl_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.description_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.title_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.twitterCard_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.videoUrl_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
