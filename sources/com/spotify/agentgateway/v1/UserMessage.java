package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zdi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class UserMessage extends h implements v2j0 {
    private static final UserMessage DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int USER_CONTEXT_FIELD_NUMBER = 2;
    private int bitField0_;
    private String text_ = "";
    private UserContext userContext_;

    static {
        UserMessage userMessage = new UserMessage();
        DEFAULT_INSTANCE = userMessage;
        h.registerDefaultInstance(UserMessage.class, userMessage);
    }

    private UserMessage() {
    }

    public static UserMessage n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static zdi1 r() {
        return (zdi1) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "text_", "userContext_"});
        }
        if (iOrdinal == 3) {
            return new UserMessage();
        }
        if (iOrdinal == 4) {
            return new zdi1(DEFAULT_INSTANCE);
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
        synchronized (UserMessage.class) {
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
        return this.text_;
    }

    public final UserContext p() {
        UserContext userContext = this.userContext_;
        return userContext == null ? UserContext.q() : userContext;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void s(String str) {
        str.getClass();
        this.text_ = str;
    }

    public final void t(UserContext userContext) {
        this.userContext_ = userContext;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
