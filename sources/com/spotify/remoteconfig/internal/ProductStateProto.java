package com.spotify.remoteconfig.internal;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.ruw0;
import p.s2j0;
import p.suw0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ProductStateProto extends h implements v2j0 {
    private static final ProductStateProto DEFAULT_INSTANCE;
    public static final int ETAG_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private qng0 values_ = qng0.b;
    private String etag_ = "";

    static {
        ProductStateProto productStateProto = new ProductStateProto();
        DEFAULT_INSTANCE = productStateProto;
        h.registerDefaultInstance(ProductStateProto.class, productStateProto);
    }

    private ProductStateProto() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ruw0 q() {
        return (ruw0) DEFAULT_INSTANCE.createBuilder();
    }

    public static ProductStateProto r(byte[] bArr) {
        return (ProductStateProto) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002Ȉ", new Object[]{"values_", suw0.a, "etag_"});
        }
        if (iOrdinal == 3) {
            return new ProductStateProto();
        }
        if (iOrdinal == 4) {
            return new ruw0(DEFAULT_INSTANCE);
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
        synchronized (ProductStateProto.class) {
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

    public final String n() {
        return this.etag_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.values_);
    }

    public final qng0 p() {
        qng0 qng0Var = this.values_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.values_ = qng0VarH;
        return qng0VarH;
    }

    public final void s(String str) {
        this.etag_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
