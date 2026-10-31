package com.spotify.ucs.proto.v0;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tch1;
import p.uch1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class UcsResponseWrapper$AccountAttributesResponse extends h implements v2j0 {
    public static final int ACCOUNT_ATTRIBUTES_FIELD_NUMBER = 1;
    private static final UcsResponseWrapper$AccountAttributesResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private qng0 accountAttributes_ = qng0.b;

    static {
        UcsResponseWrapper$AccountAttributesResponse ucsResponseWrapper$AccountAttributesResponse = new UcsResponseWrapper$AccountAttributesResponse();
        DEFAULT_INSTANCE = ucsResponseWrapper$AccountAttributesResponse;
        h.registerDefaultInstance(UcsResponseWrapper$AccountAttributesResponse.class, ucsResponseWrapper$AccountAttributesResponse);
    }

    private UcsResponseWrapper$AccountAttributesResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static uch1 r() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"accountAttributes_", tch1.a});
        }
        if (iOrdinal == 3) {
            return new UcsResponseWrapper$AccountAttributesResponse();
        }
        if (iOrdinal == 4) {
            return new uch1();
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
        synchronized (UcsResponseWrapper$AccountAttributesResponse.class) {
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

    public final int o() {
        return this.accountAttributes_.size();
    }

    public final Map p() {
        return Collections.unmodifiableMap(this.accountAttributes_);
    }

    public final qng0 q() {
        qng0 qng0Var = this.accountAttributes_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.accountAttributes_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
