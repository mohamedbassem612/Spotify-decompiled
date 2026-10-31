package com.spotify.watchfeed.api.v1.proto;

import com.google.protobuf.Any;
import com.google.protobuf.h;
import p.bf40;
import p.eu21;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ResponsePivoting extends h implements v2j0 {
    public static final int ADDITIONAL_PAGES_URIS_FIELD_NUMBER = 1;
    private static final ResponsePivoting DEFAULT_INSTANCE;
    public static final int ONBOARDING_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private h290 additionalPagesUris_ = h.emptyProtobufList();
    private int bitField0_;
    private Any onboarding_;

    static {
        ResponsePivoting responsePivoting = new ResponsePivoting();
        DEFAULT_INSTANCE = responsePivoting;
        h.registerDefaultInstance(ResponsePivoting.class, responsePivoting);
    }

    private ResponsePivoting() {
    }

    public static ResponsePivoting o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002ဉ\u0000", new Object[]{"bitField0_", "additionalPagesUris_", "onboarding_"});
        }
        if (iOrdinal == 3) {
            return new ResponsePivoting();
        }
        if (iOrdinal == 4) {
            return new eu21(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (ResponsePivoting.class) {
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

    public final h290 n() {
        return this.additionalPagesUris_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
