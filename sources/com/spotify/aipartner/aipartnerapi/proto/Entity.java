package com.spotify.aipartner.aipartnerapi.proto;

import com.google.protobuf.h;
import java.util.List;
import p.b290;
import p.bf40;
import p.c290;
import p.c8x;
import p.d290;
import p.hfb;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class Entity extends h implements v2j0 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 3;
    private static final Entity DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int NATURAL_LANGUAGE_URI_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private static final c290 attributes_converter_ = new hfb((byte) 9);
    private int attributesMemoizedSerializedSize;
    private int bitField0_;
    private Metadata metadata_;
    private String naturalLanguageUri_ = "";
    private b290 attributes_ = h.emptyIntList();

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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ለ\u0000\u0002ဉ\u0001\u0003,", new Object[]{"bitField0_", "naturalLanguageUri_", "metadata_", "attributes_"});
        }
        if (iOrdinal == 3) {
            return new Entity();
        }
        if (iOrdinal == 4) {
            return new c8x(DEFAULT_INSTANCE, (byte) 10);
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

    public final List n() {
        return new d290(this.attributes_, attributes_converter_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Metadata o() {
        Metadata metadata = this.metadata_;
        return metadata == null ? Metadata.s() : metadata;
    }

    public final String p() {
        return this.naturalLanguageUri_;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
