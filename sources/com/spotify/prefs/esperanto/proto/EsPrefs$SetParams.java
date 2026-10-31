package com.spotify.prefs.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.fqz;
import p.gqz;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsPrefs$SetParams extends h implements v2j0 {
    private static final EsPrefs$SetParams DEFAULT_INSTANCE;
    public static final int ENTRIES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private qng0 entries_ = qng0.b;

    static {
        EsPrefs$SetParams esPrefs$SetParams = new EsPrefs$SetParams();
        DEFAULT_INSTANCE = esPrefs$SetParams;
        h.registerDefaultInstance(EsPrefs$SetParams.class, esPrefs$SetParams);
    }

    private EsPrefs$SetParams() {
    }

    public static fqz p() {
        return (fqz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"entries_", gqz.a});
        }
        if (iOrdinal == 3) {
            return new EsPrefs$SetParams();
        }
        if (iOrdinal == 4) {
            return new fqz(DEFAULT_INSTANCE);
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
        synchronized (EsPrefs$SetParams.class) {
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

    public final int n() {
        return this.entries_.size();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final qng0 o() {
        qng0 qng0Var = this.entries_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.entries_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
