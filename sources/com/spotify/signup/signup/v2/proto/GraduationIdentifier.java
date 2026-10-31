package com.spotify.signup.signup.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.w850;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class GraduationIdentifier extends h implements v2j0 {
    private static final GraduationIdentifier DEFAULT_INSTANCE;
    public static final int EMAIL_AND_PASSWORD_IDENTIFIER_FIELD_NUMBER = 101;
    public static final int GRADUATION_TOKEN_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private Object identifier_;
    private int identifierCase_ = 0;
    private String graduationToken_ = "";

    static {
        GraduationIdentifier graduationIdentifier = new GraduationIdentifier();
        DEFAULT_INSTANCE = graduationIdentifier;
        h.registerDefaultInstance(GraduationIdentifier.class, graduationIdentifier);
    }

    private GraduationIdentifier() {
    }

    public static w850 n() {
        return (w850) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001e\u0002\u0000\u0000\u0000\u0001Ȉe<\u0000", new Object[]{"identifier_", "identifierCase_", "graduationToken_", EmailAndPasswordIdentifier.class});
        }
        if (iOrdinal == 3) {
            return new GraduationIdentifier();
        }
        if (iOrdinal == 4) {
            return new w850(DEFAULT_INSTANCE);
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
        synchronized (GraduationIdentifier.class) {
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

    public final void o(EmailAndPasswordIdentifier emailAndPasswordIdentifier) {
        emailAndPasswordIdentifier.getClass();
        this.identifier_ = emailAndPasswordIdentifier;
        this.identifierCase_ = 101;
    }

    public final void p(String str) {
        str.getClass();
        this.graduationToken_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
