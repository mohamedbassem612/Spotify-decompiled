package com.spotify.kidsrequest.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jjn;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tqn;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class CreateRequestResponse extends h implements v2j0 {
    private static final CreateRequestResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;

    static {
        CreateRequestResponse createRequestResponse = new CreateRequestResponse();
        DEFAULT_INSTANCE = createRequestResponse;
        h.registerDefaultInstance(CreateRequestResponse.class, createRequestResponse);
    }

    private CreateRequestResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"result_"});
        }
        if (iOrdinal == 3) {
            return new CreateRequestResponse();
        }
        if (iOrdinal == 4) {
            return new jjn(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (CreateRequestResponse.class) {
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

    public final tqn n() {
        tqn tqnVar;
        switch (this.result_) {
            case 0:
                tqnVar = tqn.CREATE_REQUEST_RESULT_UNSPECIFIED;
                break;
            case 1:
                tqnVar = tqn.CREATE_REQUEST_RESULT_CREATED;
                break;
            case 2:
                tqnVar = tqn.CREATE_REQUEST_RESULT_ALREADY_PENDING;
                break;
            case 3:
                tqnVar = tqn.CREATE_REQUEST_RESULT_BLOCKED;
                break;
            case 4:
                tqnVar = tqn.CREATE_REQUEST_RESULT_DAILY_LIMIT_REACHED;
                break;
            case 5:
                tqnVar = tqn.CREATE_REQUEST_RESULT_ALREADY_ALLOWED;
                break;
            case 6:
                tqnVar = tqn.CREATE_REQUEST_RESULT_REQUESTS_DISABLED;
                break;
            case 7:
                tqnVar = tqn.CREATE_REQUEST_RESULT_DENIED_COOLDOWN;
                break;
            default:
                tqnVar = null;
                break;
        }
        return tqnVar == null ? tqn.UNRECOGNIZED : tqnVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
