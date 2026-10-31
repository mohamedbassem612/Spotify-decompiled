package com.spotify.betamax.offlinecoordinator.proto;

import p.bf40;
import p.djp0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class OfflinePlugin$TargetFormat extends com.google.protobuf.h implements v2j0 {
    public static final int BITRATE_FIELD_NUMBER = 1;
    private static final OfflinePlugin$TargetFormat DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int bitrate_;

    static {
        OfflinePlugin$TargetFormat offlinePlugin$TargetFormat = new OfflinePlugin$TargetFormat();
        DEFAULT_INSTANCE = offlinePlugin$TargetFormat;
        com.google.protobuf.h.registerDefaultInstance(OfflinePlugin$TargetFormat.class, offlinePlugin$TargetFormat);
    }

    private OfflinePlugin$TargetFormat() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"bitrate_"});
        }
        if (iOrdinal == 3) {
            return new OfflinePlugin$TargetFormat();
        }
        if (iOrdinal == 4) {
            return new djp0(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (OfflinePlugin$TargetFormat.class) {
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
