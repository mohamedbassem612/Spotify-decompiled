package com.spotify.extendedmetadata.extensions.gatedentityrelationsimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GatedEntityRelations extends h implements v2j0 {
    private static final GatedEntityRelations DEFAULT_INSTANCE;
    public static final int ENTITIES_WITH_VALUE_PROPS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 entitiesWithValueProps_ = h.emptyProtobufList();

    public static final class Entity extends h implements v2j0 {
        private static final Entity DEFAULT_INSTANCE;
        public static final int FALLBACK_NAVIGATION_FIELD_NUMBER = 4;
        private static volatile qzr0 PARSER = null;
        public static final int SUMMARY_FIELD_NUMBER = 3;
        public static final int URI_FIELD_NUMBER = 1;
        public static final int VALUE_PROPS_FIELD_NUMBER = 2;
        private int bitField0_;
        private FallbackNavigation fallbackNavigation_;
        private ValuePropSummary summary_;
        private String uri_ = "";
        private h290 valueProps_ = h.emptyProtobufList();

        static {
            Entity entity = new Entity();
            DEFAULT_INSTANCE = entity;
            h.registerDefaultInstance(Entity.class, entity);
        }

        private Entity() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "uri_", "valueProps_", ValueProp.class, "summary_", "fallbackNavigation_"});
            }
            if (iOrdinal == 3) {
                return new Entity();
            }
            if (iOrdinal == 4) {
                return new b(DEFAULT_INSTANCE);
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
            synchronized (Entity.class) {
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

        public final String getUri() {
            return this.uri_;
        }

        public final FallbackNavigation n() {
            FallbackNavigation fallbackNavigation = this.fallbackNavigation_;
            return fallbackNavigation == null ? FallbackNavigation.n() : fallbackNavigation;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final ValuePropSummary o() {
            ValuePropSummary valuePropSummary = this.summary_;
            return valuePropSummary == null ? ValuePropSummary.n() : valuePropSummary;
        }

        public final h290 p() {
            return this.valueProps_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        GatedEntityRelations gatedEntityRelations = new GatedEntityRelations();
        DEFAULT_INSTANCE = gatedEntityRelations;
        h.registerDefaultInstance(GatedEntityRelations.class, gatedEntityRelations);
    }

    private GatedEntityRelations() {
    }

    public static GatedEntityRelations o(byte[] bArr) {
        return (GatedEntityRelations) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"entitiesWithValueProps_", Entity.class});
        }
        if (iOrdinal == 3) {
            return new GatedEntityRelations();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (GatedEntityRelations.class) {
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

    public final h290 n() {
        return this.entitiesWithValueProps_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
