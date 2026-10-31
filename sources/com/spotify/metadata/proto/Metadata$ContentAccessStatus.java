package com.spotify.metadata.proto;

import com.google.protobuf.h;
import p.bf40;
import p.eij0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Metadata$ContentAccessStatus extends h implements v2j0 {
    private static final Metadata$ContentAccessStatus DEFAULT_INSTANCE;
    public static final int GATED_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int WINDOWING_FIELD_NUMBER = 1;
    private int statusCase_ = 0;
    private Object status_;

    static {
        Metadata$ContentAccessStatus metadata$ContentAccessStatus = new Metadata$ContentAccessStatus();
        DEFAULT_INSTANCE = metadata$ContentAccessStatus;
        h.registerDefaultInstance(Metadata$ContentAccessStatus.class, metadata$ContentAccessStatus);
    }

    private Metadata$ContentAccessStatus() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"status_", "statusCase_", Metadata$ContentWindowing.class, Metadata$ContentGated.class});
        }
        if (iOrdinal == 3) {
            return new Metadata$ContentAccessStatus();
        }
        if (iOrdinal == 4) {
            return new eij0(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (Metadata$ContentAccessStatus.class) {
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
