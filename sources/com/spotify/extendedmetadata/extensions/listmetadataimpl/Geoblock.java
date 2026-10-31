package com.spotify.extendedmetadata.extensions.listmetadataimpl;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.jf40;
import p.mhc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yo30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Geoblock extends h implements v2j0 {
    public static final int BLOCKING_TYPES_FIELD_NUMBER = 1;
    private static final Geoblock DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private static final c290 blockingTypes_converter_ = new mhc((byte) 11);
    private int blockingTypesMemoizedSerializedSize;
    private b290 blockingTypes_ = h.emptyIntList();

    static {
        Geoblock geoblock = new Geoblock();
        DEFAULT_INSTANCE = geoblock;
        h.registerDefaultInstance(Geoblock.class, geoblock);
    }

    private Geoblock() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"blockingTypes_"});
        }
        if (iOrdinal == 3) {
            return new Geoblock();
        }
        if (iOrdinal == 4) {
            return new yo30(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (Geoblock.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
