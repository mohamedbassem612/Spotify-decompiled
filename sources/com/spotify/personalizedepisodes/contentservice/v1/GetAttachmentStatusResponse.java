package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.kl7;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vk40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class GetAttachmentStatusResponse extends h implements v2j0 {
    private static final GetAttachmentStatusResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private ContentServiceError error_;
    private int status_;

    static {
        GetAttachmentStatusResponse getAttachmentStatusResponse = new GetAttachmentStatusResponse();
        DEFAULT_INSTANCE = getAttachmentStatusResponse;
        h.registerDefaultInstance(GetAttachmentStatusResponse.class, getAttachmentStatusResponse);
    }

    private GetAttachmentStatusResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "status_", "error_"});
        }
        if (iOrdinal == 3) {
            return new GetAttachmentStatusResponse();
        }
        if (iOrdinal == 4) {
            return new vk40(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (GetAttachmentStatusResponse.class) {
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

    public final ContentServiceError n() {
        ContentServiceError contentServiceError = this.error_;
        return contentServiceError == null ? ContentServiceError.n() : contentServiceError;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final kl7 o() {
        kl7 kl7Var;
        int i = this.status_;
        if (i == 0) {
            kl7Var = kl7.ATTACHMENT_VALIDATION_STATUS_UNSPECIFIED;
        } else if (i == 1) {
            kl7Var = kl7.ATTACHMENT_VALIDATION_STATUS_PENDING;
        } else if (i != 2) {
            kl7Var = i != 3 ? null : kl7.ATTACHMENT_VALIDATION_STATUS_REJECTED;
        } else {
            kl7Var = kl7.ATTACHMENT_VALIDATION_STATUS_SAFE;
        }
        return kl7Var == null ? kl7.UNRECOGNIZED : kl7Var;
    }

    public final boolean p() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
