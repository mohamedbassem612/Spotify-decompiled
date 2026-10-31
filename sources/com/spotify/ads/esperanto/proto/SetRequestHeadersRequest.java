package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ql61;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.rl61;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class SetRequestHeadersRequest extends h implements v2j0 {
    private static final SetRequestHeadersRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REFRESH_INVENTORY_FIELD_NUMBER = 2;
    public static final int REQUEST_HEADERS_FIELD_NUMBER = 1;
    private boolean refreshInventory_;
    private qng0 requestHeaders_ = qng0.b;

    static {
        SetRequestHeadersRequest setRequestHeadersRequest = new SetRequestHeadersRequest();
        DEFAULT_INSTANCE = setRequestHeadersRequest;
        h.registerDefaultInstance(SetRequestHeadersRequest.class, setRequestHeadersRequest);
    }

    private SetRequestHeadersRequest() {
    }

    public static ql61 o() {
        return (ql61) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002\u0007", new Object[]{"requestHeaders_", rl61.a, "refreshInventory_"});
        }
        if (iOrdinal == 3) {
            return new SetRequestHeadersRequest();
        }
        if (iOrdinal == 4) {
            return new ql61(DEFAULT_INSTANCE);
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
        synchronized (SetRequestHeadersRequest.class) {
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
        qng0 qng0Var = this.requestHeaders_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.requestHeaders_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(boolean z) {
        this.refreshInventory_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
