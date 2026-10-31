package com.spotify.remoteconfig.commons.nebula;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zg7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Attribute extends h implements v2j0 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 2;
    private static final Attribute DEFAULT_INSTANCE;
    public static final int LONG_VALUE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 5;
    private int valueCase_ = 0;
    private Object value_;

    static {
        Attribute attribute = new Attribute();
        DEFAULT_INSTANCE = attribute;
        h.registerDefaultInstance(Attribute.class, attribute);
    }

    private Attribute() {
    }

    public static Attribute n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002:\u0000\u00035\u0000\u0004Ȼ\u0000\u0005<\u0000", new Object[]{"value_", "valueCase_", Timestamp.class});
        }
        if (iOrdinal == 3) {
            return new Attribute();
        }
        if (iOrdinal == 4) {
            return new zg7(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (Attribute.class) {
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

    public final Timestamp p() {
        return this.valueCase_ == 5 ? (Timestamp) this.value_ : Timestamp.o();
    }

    public final int q() {
        int i = this.valueCase_;
        if (i == 0) {
            return 5;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            return i != 5 ? 0 : 4;
        }
        return 3;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
