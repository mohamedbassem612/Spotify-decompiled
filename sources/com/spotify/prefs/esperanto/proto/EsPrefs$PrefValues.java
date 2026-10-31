package com.spotify.prefs.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.bhn0;
import p.eqz;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xoz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsPrefs$PrefValues extends h implements v2j0 {
    private static final EsPrefs$PrefValues DEFAULT_INSTANCE;
    public static final int ENTRIES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private qng0 entries_ = qng0.b;

    static {
        EsPrefs$PrefValues esPrefs$PrefValues = new EsPrefs$PrefValues();
        DEFAULT_INSTANCE = esPrefs$PrefValues;
        h.registerDefaultInstance(EsPrefs$PrefValues.class, esPrefs$PrefValues);
    }

    private EsPrefs$PrefValues() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsPrefs$PrefValues q(byte[] bArr) {
        return (EsPrefs$PrefValues) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"entries_", eqz.a});
        }
        if (iOrdinal == 3) {
            return new EsPrefs$PrefValues();
        }
        if (iOrdinal == 4) {
            return new xoz((byte) 19);
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
        synchronized (EsPrefs$PrefValues.class) {
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

    public final int o() {
        return this.entries_.size();
    }

    public final EsPrefs$Value p(String str) {
        qng0 qng0Var = this.entries_;
        if (qng0Var.containsKey(str)) {
            return (EsPrefs$Value) qng0Var.get(str);
        }
        bhn0.q();
        return null;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
