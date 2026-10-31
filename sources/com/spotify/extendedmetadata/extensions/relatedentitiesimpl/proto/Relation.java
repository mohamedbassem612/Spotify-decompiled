package com.spotify.extendedmetadata.extensions.relatedentitiesimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xe11;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Relation extends h implements v2j0 {
    private static final Relation DEFAULT_INSTANCE;
    public static final int GATED_RELATION_FIELD_NUMBER = 1;
    public static final int GUEST_RELATION_FIELD_NUMBER = 2;
    public static final int MVA_RELATION_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SAME_PERSON_RELATION_FIELD_NUMBER = 3;
    public static final int TOPIC_RELATION_FIELD_NUMBER = 4;
    private int relationTypeCase_ = 0;
    private Object relationType_;

    static {
        Relation relation = new Relation();
        DEFAULT_INSTANCE = relation;
        h.registerDefaultInstance(Relation.class, relation);
    }

    private Relation() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"relationType_", "relationTypeCase_", GatedRelation.class, GuestRelation.class, SamePersonRelation.class, TopicRelation.class, MusicVideoRelatedAssociation.class});
        }
        if (iOrdinal == 3) {
            return new Relation();
        }
        if (iOrdinal == 4) {
            return new xe11(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (Relation.class) {
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

    public final GatedRelation n() {
        return this.relationTypeCase_ == 1 ? (GatedRelation) this.relationType_ : GatedRelation.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final GuestRelation o() {
        return this.relationTypeCase_ == 2 ? (GuestRelation) this.relationType_ : GuestRelation.n();
    }

    public final MusicVideoRelatedAssociation p() {
        return this.relationTypeCase_ == 5 ? (MusicVideoRelatedAssociation) this.relationType_ : MusicVideoRelatedAssociation.n();
    }

    public final int q() {
        int i = this.relationTypeCase_;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public final TopicRelation r() {
        return this.relationTypeCase_ == 4 ? (TopicRelation) this.relationType_ : TopicRelation.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
