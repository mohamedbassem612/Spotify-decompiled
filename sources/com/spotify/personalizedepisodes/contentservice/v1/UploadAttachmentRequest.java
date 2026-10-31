package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vvh1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class UploadAttachmentRequest extends h implements v2j0 {
    public static final int CHARACTER_COUNT_FIELD_NUMBER = 4;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    private static final UploadAttachmentRequest DEFAULT_INSTANCE;
    public static final int FILE_SIZE_BYTES_FIELD_NUMBER = 2;
    public static final int IMAGE_METADATA_FIELD_NUMBER = 6;
    public static final int PAGE_COUNT_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PDF_METADATA_FIELD_NUMBER = 5;
    private int bitField0_;
    private int characterCount_;
    private long fileSizeBytes_;
    private Object metadata_;
    private int pageCount_;
    private int metadataCase_ = 0;
    private String contentType_ = "";

    static {
        UploadAttachmentRequest uploadAttachmentRequest = new UploadAttachmentRequest();
        DEFAULT_INSTANCE = uploadAttachmentRequest;
        h.registerDefaultInstance(UploadAttachmentRequest.class, uploadAttachmentRequest);
    }

    private UploadAttachmentRequest() {
    }

    public static vvh1 n() {
        return (vvh1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003င\u0000\u0004င\u0001\u0005<\u0000\u0006<\u0000", new Object[]{"metadata_", "metadataCase_", "bitField0_", "contentType_", "fileSizeBytes_", "pageCount_", "characterCount_", PdfAttachmentMetadata.class, ImageAttachmentMetadata.class});
        }
        if (iOrdinal == 3) {
            return new UploadAttachmentRequest();
        }
        if (iOrdinal == 4) {
            return new vvh1(DEFAULT_INSTANCE);
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
        synchronized (UploadAttachmentRequest.class) {
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
        this.contentType_ = str;
    }

    public final void p(long j) {
        this.fileSizeBytes_ = j;
    }

    public final void q(ImageAttachmentMetadata imageAttachmentMetadata) {
        imageAttachmentMetadata.getClass();
        this.metadata_ = imageAttachmentMetadata;
        this.metadataCase_ = 6;
    }

    public final void r(PdfAttachmentMetadata pdfAttachmentMetadata) {
        pdfAttachmentMetadata.getClass();
        this.metadata_ = pdfAttachmentMetadata;
        this.metadataCase_ = 5;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
