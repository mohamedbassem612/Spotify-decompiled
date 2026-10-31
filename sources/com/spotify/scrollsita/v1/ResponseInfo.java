package com.spotify.scrollsita.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wz21;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ResponseInfo extends h implements v2j0 {
    private static final ResponseInfo DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESPONSE_ID_FIELD_NUMBER = 1;
    private String responseId_ = "";

    static {
        ResponseInfo responseInfo = new ResponseInfo();
        DEFAULT_INSTANCE = responseInfo;
        h.registerDefaultInstance(ResponseInfo.class, responseInfo);
    }

    private ResponseInfo() {
    }

    public static ResponseInfo n() {
        return DEFAULT_INSTANCE;
    }

    public static wz21 p() {
        return (wz21) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"responseId_"});
        }
        if (iOrdinal == 3) {
            return new ResponseInfo();
        }
        if (iOrdinal == 4) {
            return new wz21(DEFAULT_INSTANCE);
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

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.responseId_;
    }

    public final void q() {
        this.responseId_ = "scrollsita_local_fallback";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
