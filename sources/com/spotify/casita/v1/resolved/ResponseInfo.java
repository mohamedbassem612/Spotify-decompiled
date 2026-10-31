package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.eu21;
import p.hhc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ResponseInfo extends h implements v2j0 {
    private static final ResponseInfo DEFAULT_INSTANCE;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    public static final int PAGE_URI_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REFRESH_TOKEN_FIELD_NUMBER = 4;
    public static final int RESPONSE_ID_FIELD_NUMBER = 1;
    private phc pageToken_;
    private phc refreshToken_;
    private String responseId_ = "";
    private String pageUri_ = "";

    static {
        ResponseInfo responseInfo = new ResponseInfo();
        DEFAULT_INSTANCE = responseInfo;
        h.registerDefaultInstance(ResponseInfo.class, responseInfo);
    }

    private ResponseInfo() {
        hhc hhcVar = phc.b;
        this.pageToken_ = hhcVar;
        this.refreshToken_ = hhcVar;
    }

    public static ResponseInfo o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n\u0004\n", new Object[]{"responseId_", "pageUri_", "pageToken_", "refreshToken_"});
        }
        if (iOrdinal == 3) {
            return new ResponseInfo();
        }
        if (iOrdinal == 4) {
            return new eu21((byte) 7);
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
        synchronized (ResponseInfo.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final phc p() {
        return this.pageToken_;
    }

    public final String q() {
        return this.pageUri_;
    }

    public final phc r() {
        return this.refreshToken_;
    }

    public final String s() {
        return this.responseId_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
