package com.spotify.addonconsideration.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.nk40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class GetAddonConsiderationRequest extends h implements v2j0 {
    public static final int CONSIDERATION_PAGE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int CONSIDERATION_PAGE_INTENT_FIELD_NUMBER = 2;
    public static final int CONSIDERATION_PAGE_REASON_FIELD_NUMBER = 3;
    private static final GetAddonConsiderationRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private String considerationPageIdentifier_ = "";
    private String considerationPageIntent_ = "";
    private String considerationPageReason_ = "";

    static {
        GetAddonConsiderationRequest getAddonConsiderationRequest = new GetAddonConsiderationRequest();
        DEFAULT_INSTANCE = getAddonConsiderationRequest;
        h.registerDefaultInstance(GetAddonConsiderationRequest.class, getAddonConsiderationRequest);
    }

    private GetAddonConsiderationRequest() {
    }

    public static nk40 n() {
        return (nk40) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"considerationPageIdentifier_", "considerationPageIntent_", "considerationPageReason_"});
        }
        if (iOrdinal == 3) {
            return new GetAddonConsiderationRequest();
        }
        if (iOrdinal == 4) {
            return new nk40(DEFAULT_INSTANCE);
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
        synchronized (GetAddonConsiderationRequest.class) {
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
        this.considerationPageIdentifier_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.considerationPageIntent_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.considerationPageReason_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
