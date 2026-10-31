package com.spotify.socialprompting.v1;

import com.google.protobuf.h;
import p.bf40;
import p.bn81;
import p.ch40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class SocialPromptSession extends h implements v2j0 {
    private static final SocialPromptSession DEFAULT_INSTANCE;
    public static final int DISPLAY_LABEL_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 2;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int STATUS_FIELD_NUMBER = 4;
    private int status_;
    private String sessionId_ = "";
    private String prompt_ = "";
    private String displayLabel_ = "";

    static {
        SocialPromptSession socialPromptSession = new SocialPromptSession();
        DEFAULT_INSTANCE = socialPromptSession;
        h.registerDefaultInstance(SocialPromptSession.class, socialPromptSession);
    }

    private SocialPromptSession() {
    }

    public static SocialPromptSession n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f", new Object[]{"sessionId_", "prompt_", "displayLabel_", "status_"});
        }
        if (iOrdinal == 3) {
            return new SocialPromptSession();
        }
        if (iOrdinal == 4) {
            return new bn81(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (SocialPromptSession.class) {
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

    public final String getPrompt() {
        return this.prompt_;
    }

    public final String getSessionId() {
        return this.sessionId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.displayLabel_;
    }

    public final ch40 p() {
        ch40 ch40VarA = ch40.a(this.status_);
        return ch40VarA == null ? ch40.UNRECOGNIZED : ch40VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
