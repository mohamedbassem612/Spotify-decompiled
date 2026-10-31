package com.spotify.remoteconfig.internal;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qk;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x0d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class AccountAttribute extends h implements v2j0 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 2;
    private static final AccountAttribute DEFAULT_INSTANCE;
    public static final int LONG_VALUE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 4;
    private int valueCase_ = 0;
    private Object value_;

    static {
        AccountAttribute accountAttribute = new AccountAttribute();
        DEFAULT_INSTANCE = accountAttribute;
        h.registerDefaultInstance(AccountAttribute.class, accountAttribute);
    }

    private AccountAttribute() {
    }

    public static AccountAttribute n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static qk q() {
        return (qk) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002:\u0000\u00035\u0000\u0004Ȼ\u0000", new Object[]{"value_", "valueCase_"});
        }
        if (iOrdinal == 3) {
            return new AccountAttribute();
        }
        if (iOrdinal == 4) {
            return new qk(DEFAULT_INSTANCE);
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
        synchronized (AccountAttribute.class) {
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

    public final boolean getBoolValue() {
        if (this.valueCase_ == 2) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getStringValue() {
        return this.valueCase_ == 4 ? (String) this.value_ : "";
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        if (this.valueCase_ == 3) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final int p() {
        return x0d.b(this.valueCase_);
    }

    public final void r(boolean z) {
        this.valueCase_ = 2;
        this.value_ = Boolean.valueOf(z);
    }

    public final void s(long j) {
        this.valueCase_ = 3;
        this.value_ = Long.valueOf(j);
    }

    public final void t(String str) {
        str.getClass();
        this.valueCase_ = 4;
        this.value_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
