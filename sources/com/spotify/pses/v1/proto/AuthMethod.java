package com.spotify.pses.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ch8;
import p.eh8;
import p.fh8;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class AuthMethod extends h implements v2j0 {
    public static final int AUTH_PROVIDER_FIELD_NUMBER = 1;
    private static final AuthMethod DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 3;
    private int authProvider_;
    private String name_ = "";
    private int state_;

    static {
        AuthMethod authMethod = new AuthMethod();
        DEFAULT_INSTANCE = authMethod;
        h.registerDefaultInstance(AuthMethod.class, authMethod);
    }

    private AuthMethod() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ch8 q() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f", new Object[]{"authProvider_", "name_", "state_"});
        }
        if (iOrdinal == 3) {
            return new AuthMethod();
        }
        if (iOrdinal == 4) {
            return new ch8();
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
        synchronized (AuthMethod.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final eh8 o() {
        eh8 eh8VarA = eh8.a(this.authProvider_);
        return eh8VarA == null ? eh8.t : eh8VarA;
    }

    public final fh8 p() {
        fh8 fh8VarA = fh8.a(this.state_);
        return fh8VarA == null ? fh8.e : fh8VarA;
    }

    public final void r(eh8 eh8Var) {
        this.authProvider_ = eh8Var.getNumber();
    }

    public final void s(fh8 fh8Var) {
        this.state_ = fh8Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
