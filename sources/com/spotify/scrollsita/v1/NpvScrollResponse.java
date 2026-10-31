package com.spotify.scrollsita.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.n9p0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class NpvScrollResponse extends h implements v2j0 {
    public static final int DEBUG_INFO_FIELD_NUMBER = 3;
    private static final NpvScrollResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESPONSE_INFO_FIELD_NUMBER = 2;
    public static final int STRUCTURE_FIELD_NUMBER = 1;
    private int bitField0_;
    private DebugInfo debugInfo_;
    private ResponseInfo responseInfo_;
    private NpvScrollStructure structure_;

    static {
        NpvScrollResponse npvScrollResponse = new NpvScrollResponse();
        DEFAULT_INSTANCE = npvScrollResponse;
        h.registerDefaultInstance(NpvScrollResponse.class, npvScrollResponse);
    }

    private NpvScrollResponse() {
    }

    public static n9p0 p() {
        return (n9p0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "structure_", "responseInfo_", "debugInfo_"});
        }
        if (iOrdinal == 3) {
            return new NpvScrollResponse();
        }
        if (iOrdinal == 4) {
            return new n9p0(DEFAULT_INSTANCE);
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
        synchronized (NpvScrollResponse.class) {
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

    public final ResponseInfo n() {
        ResponseInfo responseInfo = this.responseInfo_;
        return responseInfo == null ? ResponseInfo.n() : responseInfo;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final NpvScrollStructure o() {
        NpvScrollStructure npvScrollStructure = this.structure_;
        return npvScrollStructure == null ? NpvScrollStructure.o() : npvScrollStructure;
    }

    public final void q(ResponseInfo responseInfo) {
        responseInfo.getClass();
        this.responseInfo_ = responseInfo;
        this.bitField0_ |= 2;
    }

    public final void r(NpvScrollStructure npvScrollStructure) {
        npvScrollStructure.getClass();
        this.structure_ = npvScrollStructure;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
