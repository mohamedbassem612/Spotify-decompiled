package com.spotify.extendedmetadata.extensions.relatedentitiesimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xe11;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class RelatedEntity extends h implements v2j0 {
    private static final RelatedEntity DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RELATED_ENTITY_URI_FIELD_NUMBER = 1;
    public static final int RELATIONS_FIELD_NUMBER = 2;
    private String relatedEntityUri_ = "";
    private h290 relations_ = h.emptyProtobufList();

    static {
        RelatedEntity relatedEntity = new RelatedEntity();
        DEFAULT_INSTANCE = relatedEntity;
        h.registerDefaultInstance(RelatedEntity.class, relatedEntity);
    }

    private RelatedEntity() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"relatedEntityUri_", "relations_", Relation.class});
        }
        if (iOrdinal == 3) {
            return new RelatedEntity();
        }
        if (iOrdinal == 4) {
            return new xe11(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (RelatedEntity.class) {
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

    public final String n() {
        return this.relatedEntityUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.relations_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
