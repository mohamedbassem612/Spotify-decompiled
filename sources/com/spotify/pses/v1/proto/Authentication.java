package com.spotify.pses.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.ij8;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class Authentication extends h implements v2j0 {
    public static final int AUTH_METHODS_FIELD_NUMBER = 1;
    private static final Authentication DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private h290 authMethods_ = h.emptyProtobufList();
    private String name_ = "";

    static {
        Authentication authentication = new Authentication();
        DEFAULT_INSTANCE = authentication;
        h.registerDefaultInstance(Authentication.class, authentication);
    }

    private Authentication() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Authentication r() {
        return DEFAULT_INSTANCE;
    }

    public static ij8 s() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"authMethods_", AuthMethod.class, "name_"});
        }
        if (iOrdinal == 3) {
            return new Authentication();
        }
        if (iOrdinal == 4) {
            return new ij8();
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
        synchronized (Authentication.class) {
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

    public final void o(Iterable iterable) {
        h290 h290VarMutableCopy = this.authMethods_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.authMethods_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final int p() {
        return this.authMethods_.size();
    }

    public final h290 q() {
        return this.authMethods_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
