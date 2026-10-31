package com.spotify.clientoptinproxy.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v261;
import p.v2j0;
import p.w261;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class SendClientActionRequest extends h implements v2j0 {
    private static final SendClientActionRequest DEFAULT_INSTANCE;
    public static final int FEATURE_TYPE_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 3;
    public static final int OPT_IN_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private boolean optIn_;
    private qng0 metadata_ = qng0.b;
    private String featureType_ = "";

    static {
        SendClientActionRequest sendClientActionRequest = new SendClientActionRequest();
        DEFAULT_INSTANCE = sendClientActionRequest;
        h.registerDefaultInstance(SendClientActionRequest.class, sendClientActionRequest);
    }

    private SendClientActionRequest() {
    }

    public static v261 o() {
        return (v261) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002\u0007\u00032", new Object[]{"featureType_", "optIn_", "metadata_", w261.a});
        }
        if (iOrdinal == 3) {
            return new SendClientActionRequest();
        }
        if (iOrdinal == 4) {
            return new v261(DEFAULT_INSTANCE);
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
        synchronized (SendClientActionRequest.class) {
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

    public final qng0 n() {
        qng0 qng0Var = this.metadata_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.metadata_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.featureType_ = str;
    }

    public final void q(boolean z) {
        this.optIn_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
