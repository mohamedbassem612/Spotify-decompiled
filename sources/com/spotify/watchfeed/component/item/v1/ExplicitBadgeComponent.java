package com.spotify.watchfeed.component.item.v1;

import p.bf40;
import p.jf40;
import p.lrz;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ExplicitBadgeComponent extends com.google.protobuf.h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 3;
    private static final ExplicitBadgeComponent DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_19_PLUS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private boolean is19Plus_;
    private String id_ = "";
    private String accessibilityText_ = "";

    static {
        ExplicitBadgeComponent explicitBadgeComponent = new ExplicitBadgeComponent();
        DEFAULT_INSTANCE = explicitBadgeComponent;
        com.google.protobuf.h.registerDefaultInstance(ExplicitBadgeComponent.class, explicitBadgeComponent);
    }

    private ExplicitBadgeComponent() {
    }

    public static ExplicitBadgeComponent p(phc phcVar) {
        return (ExplicitBadgeComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003Ȉ", new Object[]{"id_", "is19Plus_", "accessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new ExplicitBadgeComponent();
        }
        if (iOrdinal == 4) {
            return new lrz(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (ExplicitBadgeComponent.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String n() {
        return this.accessibilityText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.is19Plus_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
