package com.spotify.player.esperanto.proto;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xoz;
import p.yqz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsRestrictions$ModeRestrictions extends h implements v2j0 {
    private static final EsRestrictions$ModeRestrictions DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private qng0 values_ = qng0.b;

    static {
        EsRestrictions$ModeRestrictions esRestrictions$ModeRestrictions = new EsRestrictions$ModeRestrictions();
        DEFAULT_INSTANCE = esRestrictions$ModeRestrictions;
        h.registerDefaultInstance(EsRestrictions$ModeRestrictions.class, esRestrictions$ModeRestrictions);
    }

    private EsRestrictions$ModeRestrictions() {
    }

    public static EsRestrictions$ModeRestrictions o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"values_", yqz.a});
        }
        if (iOrdinal == 3) {
            return new EsRestrictions$ModeRestrictions();
        }
        if (iOrdinal == 4) {
            return new xoz((byte) 28);
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
        synchronized (EsRestrictions$ModeRestrictions.class) {
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

    public final Map p() {
        return Collections.unmodifiableMap(this.values_);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
