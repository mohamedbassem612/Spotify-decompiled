package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h4m;
import p.jf40;
import p.oiz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ContentServiceError extends h implements v2j0 {
    private static final ContentServiceError DEFAULT_INSTANCE;
    public static final int ERROR_REASON_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    private int errorReason_;
    private String reason_ = "";
    private String message_ = "";

    static {
        ContentServiceError contentServiceError = new ContentServiceError();
        DEFAULT_INSTANCE = contentServiceError;
        h.registerDefaultInstance(ContentServiceError.class, contentServiceError);
    }

    private ContentServiceError() {
    }

    public static ContentServiceError n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ContentServiceError q(byte[] bArr) {
        return (ContentServiceError) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"reason_", "message_", "errorReason_"});
        }
        if (iOrdinal == 3) {
            return new ContentServiceError();
        }
        if (iOrdinal == 4) {
            return new h4m(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (ContentServiceError.class) {
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

    public final String getMessage() {
        return this.message_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final oiz o() {
        oiz oizVar;
        switch (this.errorReason_) {
            case 0:
                oizVar = oiz.ERROR_REASON_UNSPECIFIED;
                break;
            case 1:
                oizVar = oiz.ERROR_REASON_PROMPT_REJECTED;
                break;
            case 2:
                oizVar = oiz.ERROR_REASON_ATTACHMENT_REJECTED;
                break;
            case 3:
                oizVar = oiz.ERROR_REASON_ATTACHMENT_NOT_VALIDATED;
                break;
            case 4:
                oizVar = oiz.ERROR_REASON_NO_CREDITS;
                break;
            case 5:
                oizVar = oiz.ERROR_REASON_GENERATION_NOT_FOUND;
                break;
            case 6:
                oizVar = oiz.ERROR_REASON_INVALID_VOICE;
                break;
            case 7:
                oizVar = oiz.ERROR_REASON_INVALID_SCHEDULE;
                break;
            default:
                oizVar = null;
                break;
        }
        return oizVar == null ? oiz.UNRECOGNIZED : oizVar;
    }

    public final String p() {
        return this.reason_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
