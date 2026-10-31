package com.spotify.extendedmetadata.extensions.concept.proto;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.d6k;
import p.h290;
import p.jf40;
import p.n5k;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ConceptProto$Concept extends h implements v2j0 {
    public static final int CONCEPT_CLASS_FIELD_NUMBER = 4;
    private static final ConceptProto$Concept DEFAULT_INSTANCE;
    public static final int IMAGE_URI_FIELD_NUMBER = 3;
    public static final int LIBRARYCLASS_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TRANSLATION_MAP_FIELD_NUMBER = 6;
    private int bitField0_;
    private ConceptProto$ConceptClass libraryClass_;
    private qng0 translationMap_ = qng0.b;
    private String name_ = "";
    private String imageUri_ = "";
    private h290 conceptClass_ = h.emptyProtobufList();

    static {
        ConceptProto$Concept conceptProto$Concept = new ConceptProto$Concept();
        DEFAULT_INSTANCE = conceptProto$Concept;
        h.registerDefaultInstance(ConceptProto$Concept.class, conceptProto$Concept);
    }

    private ConceptProto$Concept() {
    }

    public static ConceptProto$Concept o(byte[] bArr) {
        return (ConceptProto$Concept) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0001\u0000\u0001Ȉ\u0003Ȉ\u0004\u001b\u0005ဉ\u0000\u00062", new Object[]{"bitField0_", "name_", "imageUri_", "conceptClass_", ConceptProto$ConceptClass.class, "libraryClass_", "translationMap_", d6k.a});
        }
        if (iOrdinal == 3) {
            return new ConceptProto$Concept();
        }
        if (iOrdinal == 4) {
            return new n5k(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (ConceptProto$Concept.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final Map n() {
        return Collections.unmodifiableMap(this.translationMap_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
