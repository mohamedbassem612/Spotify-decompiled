package com.spotify.kidssessions.link.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yrr0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ParentAcceptLinkSessionRequest extends h implements v2j0 {
    private static final ParentAcceptLinkSessionRequest DEFAULT_INSTANCE;
    public static final int DEPENDENT_DATE_OF_BIRTH_FIELD_NUMBER = 2;
    public static final int LINK_SESSION_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String linkSessionId_ = "";
    private String dependentDateOfBirth_ = "";

    static {
        ParentAcceptLinkSessionRequest parentAcceptLinkSessionRequest = new ParentAcceptLinkSessionRequest();
        DEFAULT_INSTANCE = parentAcceptLinkSessionRequest;
        h.registerDefaultInstance(ParentAcceptLinkSessionRequest.class, parentAcceptLinkSessionRequest);
    }

    private ParentAcceptLinkSessionRequest() {
    }

    public static yrr0 n() {
        return (yrr0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"linkSessionId_", "dependentDateOfBirth_"});
        }
        if (iOrdinal == 3) {
            return new ParentAcceptLinkSessionRequest();
        }
        if (iOrdinal == 4) {
            return new yrr0(DEFAULT_INSTANCE);
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
        synchronized (ParentAcceptLinkSessionRequest.class) {
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
        this.dependentDateOfBirth_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.linkSessionId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
