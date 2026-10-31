package com.spotify.upsells.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x740;
import p.y740;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class GatedFeatureContext extends h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 3;
    public static final int CONTENT_URI_FIELD_NUMBER = 1;
    private static final GatedFeatureContext DEFAULT_INSTANCE;
    public static final int FEATURE_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 4;
    private Object entity_;
    private int reason_;
    private int entityCase_ = 0;
    private String action_ = "";

    static {
        GatedFeatureContext gatedFeatureContext = new GatedFeatureContext();
        DEFAULT_INSTANCE = gatedFeatureContext;
        h.registerDefaultInstance(GatedFeatureContext.class, gatedFeatureContext);
    }

    private GatedFeatureContext() {
    }

    public static x740 p() {
        return (x740) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȉ\u0004\f", new Object[]{"entity_", "entityCase_", "action_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new GatedFeatureContext();
        }
        if (iOrdinal == 4) {
            return new x740(DEFAULT_INSTANCE);
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
        synchronized (GatedFeatureContext.class) {
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
        return this.action_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.entityCase_ == 2 ? (String) this.entity_ : "";
    }

    public final void q(String str) {
        str.getClass();
        this.action_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.entityCase_ = 2;
        this.entity_ = str;
    }

    public final void s(y740 y740Var) {
        this.reason_ = y740Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
