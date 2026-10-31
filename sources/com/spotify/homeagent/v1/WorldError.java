package com.spotify.homeagent.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ixk1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z5m1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class WorldError extends h implements v2j0 {
    private static final WorldError DEFAULT_INSTANCE;
    public static final int ERROR_TYPE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private int errorType_;
    private String reason_ = "";

    static {
        WorldError worldError = new WorldError();
        DEFAULT_INSTANCE = worldError;
        h.registerDefaultInstance(WorldError.class, worldError);
    }

    private WorldError() {
    }

    public static WorldError n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"errorType_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new WorldError();
        }
        if (iOrdinal == 4) {
            return new ixk1(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (WorldError.class) {
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

    public final z5m1 o() {
        z5m1 z5m1Var;
        int i = this.errorType_;
        if (i == 0) {
            z5m1Var = z5m1.UNDEFINED;
        } else if (i != 1) {
            z5m1Var = i != 2 ? null : z5m1.GENERATION_ERROR;
        } else {
            z5m1Var = z5m1.VALIDATION_ERROR;
        }
        return z5m1Var == null ? z5m1.UNRECOGNIZED : z5m1Var;
    }

    public final String p() {
        return this.reason_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
