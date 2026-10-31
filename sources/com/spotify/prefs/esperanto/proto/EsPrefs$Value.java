package com.spotify.prefs.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.iqz;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsPrefs$Value extends h implements v2j0 {
    public static final int BOOL_FIELD_NUMBER = 2;
    private static final EsPrefs$Value DEFAULT_INSTANCE;
    public static final int NUMBER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 3;
    private int valueCase_ = 0;
    private Object value_;

    static {
        EsPrefs$Value esPrefs$Value = new EsPrefs$Value();
        DEFAULT_INSTANCE = esPrefs$Value;
        h.registerDefaultInstance(EsPrefs$Value.class, esPrefs$Value);
    }

    private EsPrefs$Value() {
    }

    public static EsPrefs$Value o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static iqz r() {
        return (iqz) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u00015\u0000\u0002:\u0000\u0003Ȼ\u0000", new Object[]{"value_", "valueCase_"});
        }
        if (iOrdinal == 3) {
            return new EsPrefs$Value();
        }
        if (iOrdinal == 4) {
            return new iqz(DEFAULT_INSTANCE);
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
        synchronized (EsPrefs$Value.class) {
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

    public final boolean n() {
        if (this.valueCase_ == 2) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long p() {
        if (this.valueCase_ == 1) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String q() {
        return this.valueCase_ == 3 ? (String) this.value_ : "";
    }

    public final void s(boolean z) {
        this.valueCase_ = 2;
        this.value_ = Boolean.valueOf(z);
    }

    public final void t(long j) {
        this.valueCase_ = 1;
        this.value_ = Long.valueOf(j);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.valueCase_ = 3;
        this.value_ = str;
    }
}
