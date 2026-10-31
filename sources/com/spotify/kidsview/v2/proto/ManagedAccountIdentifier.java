package com.spotify.kidsview.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ldg0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ManagedAccountIdentifier extends h implements v2j0 {
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    private static final ManagedAccountIdentifier DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TEEN_ID_FIELD_NUMBER = 2;
    private int identifierCase_ = 0;
    private Object identifier_;

    static {
        ManagedAccountIdentifier managedAccountIdentifier = new ManagedAccountIdentifier();
        DEFAULT_INSTANCE = managedAccountIdentifier;
        h.registerDefaultInstance(ManagedAccountIdentifier.class, managedAccountIdentifier);
    }

    private ManagedAccountIdentifier() {
    }

    public static ManagedAccountIdentifier n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ldg0 q() {
        return (ldg0) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000", new Object[]{"identifier_", "identifierCase_"});
        }
        if (iOrdinal == 3) {
            return new ManagedAccountIdentifier();
        }
        if (iOrdinal == 4) {
            return new ldg0(DEFAULT_INSTANCE);
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
        synchronized (ManagedAccountIdentifier.class) {
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

    public final String getChildId() {
        return this.identifierCase_ == 1 ? (String) this.identifier_ : "";
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.identifierCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final String p() {
        return this.identifierCase_ == 2 ? (String) this.identifier_ : "";
    }

    public final void r(String str) {
        str.getClass();
        this.identifierCase_ = 1;
        this.identifier_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.identifierCase_ = 2;
        this.identifier_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
