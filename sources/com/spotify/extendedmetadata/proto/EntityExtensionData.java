package com.spotify.extendedmetadata.proto;

import com.google.protobuf.Any;
import com.google.protobuf.h;
import p.bf40;
import p.c8x;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class EntityExtensionData extends h implements v2j0 {
    private static final EntityExtensionData DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    public static final int EXTENSION_DATA_FIELD_NUMBER = 3;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String entityUri_ = "";
    private Any extensionData_;
    private EntityExtensionDataHeader header_;

    static {
        EntityExtensionData entityExtensionData = new EntityExtensionData();
        DEFAULT_INSTANCE = entityExtensionData;
        h.registerDefaultInstance(EntityExtensionData.class, entityExtensionData);
    }

    private EntityExtensionData() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001", new Object[]{"bitField0_", "header_", "entityUri_", "extensionData_"});
        }
        if (iOrdinal == 3) {
            return new EntityExtensionData();
        }
        if (iOrdinal == 4) {
            return new c8x(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (EntityExtensionData.class) {
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

    public final String getEntityUri() {
        return this.entityUri_;
    }

    public final Any n() {
        Any any = this.extensionData_;
        return any == null ? Any.o() : any;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EntityExtensionDataHeader o() {
        EntityExtensionDataHeader entityExtensionDataHeader = this.header_;
        return entityExtensionDataHeader == null ? EntityExtensionDataHeader.n() : entityExtensionDataHeader;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
