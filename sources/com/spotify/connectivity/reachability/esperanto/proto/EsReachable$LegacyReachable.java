package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.h;
import java.util.Iterator;
import p.b290;
import p.bf40;
import p.c290;
import p.er80;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sqz;
import p.v2j0;
import p.ytw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsReachable$LegacyReachable extends h implements v2j0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 1;
    private static final EsReachable$LegacyReachable DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private static final c290 capabilities_converter_ = new ytw0((byte) 14);
    private int capabilitiesMemoizedSerializedSize;
    private b290 capabilities_ = h.emptyIntList();

    static {
        EsReachable$LegacyReachable esReachable$LegacyReachable = new EsReachable$LegacyReachable();
        DEFAULT_INSTANCE = esReachable$LegacyReachable;
        h.registerDefaultInstance(EsReachable$LegacyReachable.class, esReachable$LegacyReachable);
    }

    private EsReachable$LegacyReachable() {
    }

    public static sqz o() {
        return (sqz) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"capabilities_"});
        }
        if (iOrdinal == 3) {
            return new EsReachable$LegacyReachable();
        }
        if (iOrdinal == 4) {
            return new sqz(DEFAULT_INSTANCE);
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
        synchronized (EsReachable$LegacyReachable.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(Iterable iterable) {
        b290 b290Var = this.capabilities_;
        if (!((i9) b290Var).a) {
            this.capabilities_ = h.mutableCopy(b290Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((er80) this.capabilities_).c(((Integer) it.next()).intValue());
        }
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
