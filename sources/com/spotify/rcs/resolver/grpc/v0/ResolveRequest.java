package com.spotify.rcs.resolver.grpc.v0;

import p.bf40;
import p.cu21;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ResolveRequest extends com.google.protobuf.h implements v2j0 {
    public static final int CONTEXT_FIELD_NUMBER = 11;
    private static final ResolveRequest DEFAULT_INSTANCE;
    public static final int FETCH_TYPE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PROPERTY_SET_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private Context context_;
    private Fetch fetchType_;
    private String propertySetId_ = "";

    static {
        ResolveRequest resolveRequest = new ResolveRequest();
        DEFAULT_INSTANCE = resolveRequest;
        com.google.protobuf.h.registerDefaultInstance(ResolveRequest.class, resolveRequest);
    }

    private ResolveRequest() {
    }

    public static cu21 n() {
        return (cu21) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u000b\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u000bဉ\u0001", new Object[]{"bitField0_", "propertySetId_", "fetchType_", "context_"});
        }
        if (iOrdinal == 3) {
            return new ResolveRequest();
        }
        if (iOrdinal == 4) {
            return new cu21(DEFAULT_INSTANCE);
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
        synchronized (ResolveRequest.class) {
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

    public final void o(Context context) {
        context.getClass();
        this.context_ = context;
        this.bitField0_ |= 2;
    }

    public final void p(Fetch fetch) {
        this.fetchType_ = fetch;
        this.bitField0_ |= 1;
    }

    public final void q() {
        this.propertySetId_ = "d731530c05721cd9ac82d78fa0abef6ed6d44e055b95ef2cb87d91a2ab5d43ec";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
