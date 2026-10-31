package com.spotify.extendedmetadata.extensions.companioncontentimpl.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wah;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Component extends com.google.protobuf.h implements v2j0 {
    private static final Component DEFAULT_INSTANCE;
    public static final int END_MS_FIELD_NUMBER = 2;
    public static final int ENTITY_COMPONENT_FIELD_NUMBER = 5;
    public static final int EXTERNAL_LINK_FIELD_NUMBER = 6;
    public static final int IMAGE_FIELD_NUMBER = 3;
    public static final int LOOPING_VIDEO_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int START_MS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int bodyCase_ = 0;
    private Object body_;
    private int endMs_;
    private int startMs_;

    static {
        Component component = new Component();
        DEFAULT_INSTANCE = component;
        com.google.protobuf.h.registerDefaultInstance(Component.class, component);
    }

    private Component() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002င\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"body_", "bodyCase_", "bitField0_", "startMs_", "endMs_", ImageComponent.class, LoopingVideoComponent.class, EntityComponent.class, ExternalLinkComponent.class});
        }
        if (iOrdinal == 3) {
            return new Component();
        }
        if (iOrdinal == 4) {
            return new wah(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (Component.class) {
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
        int i = this.bodyCase_;
        if (i == 0) {
            return 5;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i != 5) {
            return i != 6 ? 0 : 4;
        }
        return 3;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.endMs_;
    }

    public final EntityComponent p() {
        return this.bodyCase_ == 5 ? (EntityComponent) this.body_ : EntityComponent.o();
    }

    public final ExternalLinkComponent q() {
        return this.bodyCase_ == 6 ? (ExternalLinkComponent) this.body_ : ExternalLinkComponent.n();
    }

    public final ImageComponent r() {
        return this.bodyCase_ == 3 ? (ImageComponent) this.body_ : ImageComponent.q();
    }

    public final LoopingVideoComponent s() {
        return this.bodyCase_ == 4 ? (LoopingVideoComponent) this.body_ : LoopingVideoComponent.p();
    }

    public final int t() {
        return this.startMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }
}
