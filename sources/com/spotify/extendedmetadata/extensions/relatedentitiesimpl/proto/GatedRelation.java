package com.spotify.extendedmetadata.extensions.relatedentitiesimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yo30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GatedRelation extends h implements v2j0 {
    private static final GatedRelation DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VALUE_ENTITY_URI_FIELD_NUMBER = 1;
    public static final int VALUE_PROPS_FIELD_NUMBER = 2;
    private String valueEntityUri_ = "";
    private h290 valueProps_ = h.emptyProtobufList();

    static {
        GatedRelation gatedRelation = new GatedRelation();
        DEFAULT_INSTANCE = gatedRelation;
        h.registerDefaultInstance(GatedRelation.class, gatedRelation);
    }

    private GatedRelation() {
    }

    public static GatedRelation n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"valueEntityUri_", "valueProps_", ValueProp.class});
        }
        if (iOrdinal == 3) {
            return new GatedRelation();
        }
        if (iOrdinal == 4) {
            return new yo30(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (GatedRelation.class) {
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

    public final String o() {
        return this.valueEntityUri_;
    }

    public final h290 p() {
        return this.valueProps_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
