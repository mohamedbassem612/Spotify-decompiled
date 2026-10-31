package com.spotify.kidssessions.link.v1;

import com.google.protobuf.h;
import p.bf40;
import p.gtq0;
import p.jf40;
import p.lm;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ParentAcceptLinkSessionResponse extends h implements v2j0 {
    public static final int ACCOUNT_KIND_FIELD_NUMBER = 2;
    private static final ParentAcceptLinkSessionResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SESSION_FIELD_NUMBER = 1;
    private int accountKind_;
    private int bitField0_;
    private LinkSession session_;

    static {
        ParentAcceptLinkSessionResponse parentAcceptLinkSessionResponse = new ParentAcceptLinkSessionResponse();
        DEFAULT_INSTANCE = parentAcceptLinkSessionResponse;
        h.registerDefaultInstance(ParentAcceptLinkSessionResponse.class, parentAcceptLinkSessionResponse);
    }

    private ParentAcceptLinkSessionResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "session_", "accountKind_"});
        }
        if (iOrdinal == 3) {
            return new ParentAcceptLinkSessionResponse();
        }
        if (iOrdinal == 4) {
            return new gtq0(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (ParentAcceptLinkSessionResponse.class) {
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

    public final lm n() {
        lm lmVar;
        int i = this.accountKind_;
        if (i == 0) {
            lmVar = lm.ACCOUNT_KIND_UNSPECIFIED;
        } else if (i != 1) {
            lmVar = i != 2 ? null : lm.ACCOUNT_KIND_TEEN;
        } else {
            lmVar = lm.ACCOUNT_KIND_CHILD;
        }
        return lmVar == null ? lm.UNRECOGNIZED : lmVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final LinkSession o() {
        LinkSession linkSession = this.session_;
        return linkSession == null ? LinkSession.n() : linkSession;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
