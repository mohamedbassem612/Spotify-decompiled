package com.spotify.extendedmetadata.extensions.showaccessimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.g7r;
import p.h5t;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class DelegateToUpsellExplanation extends h implements v2j0 {
    private static final DelegateToUpsellExplanation DEFAULT_INSTANCE;
    public static final int FEATURE_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private String featureId_ = "";
    private int reason_;

    static {
        DelegateToUpsellExplanation delegateToUpsellExplanation = new DelegateToUpsellExplanation();
        DEFAULT_INSTANCE = delegateToUpsellExplanation;
        h.registerDefaultInstance(DelegateToUpsellExplanation.class, delegateToUpsellExplanation);
    }

    private DelegateToUpsellExplanation() {
    }

    public static DelegateToUpsellExplanation n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"featureId_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new DelegateToUpsellExplanation();
        }
        if (iOrdinal == 4) {
            return new g7r(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (DelegateToUpsellExplanation.class) {
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
        return this.featureId_;
    }

    public final h5t p() {
        h5t h5tVar;
        int i = this.reason_;
        if (i == 0) {
            h5tVar = h5t.REASON_UNSPECIFIED;
        } else if (i != 1) {
            h5tVar = i != 2 ? null : h5t.ENTITLEMENT_MISSING;
        } else {
            h5tVar = h5t.CAPPED;
        }
        return h5tVar == null ? h5t.UNRECOGNIZED : h5tVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
