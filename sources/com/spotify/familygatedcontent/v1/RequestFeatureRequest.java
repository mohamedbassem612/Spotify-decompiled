package com.spotify.familygatedcontent.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.ro21;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class RequestFeatureRequest extends h implements v2j0 {
    private static final RequestFeatureRequest DEFAULT_INSTANCE;
    public static final int OFFER_UUID_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REQUESTTYPE_FIELD_NUMBER = 1;
    public static final int USER_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private String requestType_ = "";
    private String userId_ = "";
    private String offerUuid_ = "";

    static {
        RequestFeatureRequest requestFeatureRequest = new RequestFeatureRequest();
        DEFAULT_INSTANCE = requestFeatureRequest;
        h.registerDefaultInstance(RequestFeatureRequest.class, requestFeatureRequest);
    }

    private RequestFeatureRequest() {
    }

    public static ro21 n() {
        return (ro21) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "requestType_", "userId_", "offerUuid_"});
        }
        if (iOrdinal == 3) {
            return new RequestFeatureRequest();
        }
        if (iOrdinal == 4) {
            return new ro21(DEFAULT_INSTANCE);
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
        synchronized (RequestFeatureRequest.class) {
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
        this.bitField0_ |= 2;
        this.offerUuid_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.requestType_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
