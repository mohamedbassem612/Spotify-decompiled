package com.spotify.wrapped.v1.proto;

import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.jf40;
import p.pf;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class AccessibilityDefinition extends com.google.protobuf.h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final AccessibilityDefinition DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int VALUE_MAP_FIELD_NUMBER = 3;
    private int bitField0_;
    private qng0 valueMap_ = qng0.b;
    private String description_ = "";
    private String action_ = "";

    static {
        AccessibilityDefinition accessibilityDefinition = new AccessibilityDefinition();
        DEFAULT_INSTANCE = accessibilityDefinition;
        com.google.protobuf.h.registerDefaultInstance(AccessibilityDefinition.class, accessibilityDefinition);
    }

    private AccessibilityDefinition() {
    }

    public static AccessibilityDefinition o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u00032", new Object[]{"bitField0_", "description_", "action_", "valueMap_", pf.a});
        }
        if (iOrdinal == 3) {
            return new AccessibilityDefinition();
        }
        if (iOrdinal == 4) {
            return new p.j(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (AccessibilityDefinition.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final boolean hasDescription() {
        return (this.bitField0_ & 1) != 0;
    }

    public final String n() {
        return this.action_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Map p() {
        return Collections.unmodifiableMap(this.valueMap_);
    }

    public final boolean q() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
