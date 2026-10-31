package com.spotify.campfire.contribution.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lld;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CapabilitiesTarget extends h implements v2j0 {
    private static final CapabilitiesTarget DEFAULT_INSTANCE;
    public static final int ENTITY_TARGET_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int targetCase_ = 0;
    private Object target_;

    static {
        CapabilitiesTarget capabilitiesTarget = new CapabilitiesTarget();
        DEFAULT_INSTANCE = capabilitiesTarget;
        h.registerDefaultInstance(CapabilitiesTarget.class, capabilitiesTarget);
    }

    private CapabilitiesTarget() {
    }

    public static lld n() {
        return (lld) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"target_", "targetCase_", EntityTarget.class});
        }
        if (iOrdinal == 3) {
            return new CapabilitiesTarget();
        }
        if (iOrdinal == 4) {
            return new lld(DEFAULT_INSTANCE);
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
        synchronized (CapabilitiesTarget.class) {
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

    public final void o(EntityTarget entityTarget) {
        entityTarget.getClass();
        this.target_ = entityTarget;
        this.targetCase_ = 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
