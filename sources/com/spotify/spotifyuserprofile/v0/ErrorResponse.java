package com.spotify.spotifyuserprofile.v0;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lgz;
import p.qzr0;
import p.r2j0;
import p.rdz;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ErrorResponse extends h implements v2j0 {
    private static final ErrorResponse DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 1;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int errorCode_;
    private String errorMessage_ = "";

    static {
        ErrorResponse errorResponse = new ErrorResponse();
        DEFAULT_INSTANCE = errorResponse;
        h.registerDefaultInstance(ErrorResponse.class, errorResponse);
    }

    private ErrorResponse() {
    }

    public static ErrorResponse n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"errorCode_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new ErrorResponse();
        }
        if (iOrdinal == 4) {
            return new rdz(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (ErrorResponse.class) {
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

    public final lgz o() {
        lgz lgzVar;
        switch (this.errorCode_) {
            case 0:
                lgzVar = lgz.ERROR_CODE_UNSPECIFIED;
                break;
            case 1:
                lgzVar = lgz.INVALID_REQUEST;
                break;
            case 2:
                lgzVar = lgz.NOTE_NOT_FOUND;
                break;
            case 3:
                lgzVar = lgz.POLICY_VIOLATION;
                break;
            case 4:
                lgzVar = lgz.UNAUTHORIZED;
                break;
            case 5:
                lgzVar = lgz.CONTENT_TOO_LONG;
                break;
            case 6:
                lgzVar = lgz.MAX_NOTES_REACHED;
                break;
            default:
                lgzVar = null;
                break;
        }
        return lgzVar == null ? lgz.UNRECOGNIZED : lgzVar;
    }

    public final String p() {
        return this.errorMessage_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
