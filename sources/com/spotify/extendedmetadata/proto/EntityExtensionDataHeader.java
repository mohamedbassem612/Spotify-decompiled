package com.spotify.extendedmetadata.proto;

import com.google.protobuf.h;
import p.bf40;
import p.c8x;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EntityExtensionDataHeader extends h implements v2j0 {
    public static final int CACHE_TTL_IN_SECONDS_FIELD_NUMBER = 4;
    private static final EntityExtensionDataHeader DEFAULT_INSTANCE;
    public static final int ETAG_FIELD_NUMBER = 2;
    public static final int LOCALE_FIELD_NUMBER = 3;
    public static final int OFFLINE_TTL_IN_SECONDS_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    private long cacheTtlInSeconds_;
    private String etag_ = "";
    private String locale_ = "";
    private long offlineTtlInSeconds_;
    private int statusCode_;

    static {
        EntityExtensionDataHeader entityExtensionDataHeader = new EntityExtensionDataHeader();
        DEFAULT_INSTANCE = entityExtensionDataHeader;
        h.registerDefaultInstance(EntityExtensionDataHeader.class, entityExtensionDataHeader);
    }

    private EntityExtensionDataHeader() {
    }

    public static EntityExtensionDataHeader n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004\u0002\u0005\u0002", new Object[]{"statusCode_", "etag_", "locale_", "cacheTtlInSeconds_", "offlineTtlInSeconds_"});
        }
        if (iOrdinal == 3) {
            return new EntityExtensionDataHeader();
        }
        if (iOrdinal == 4) {
            return new c8x(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (EntityExtensionDataHeader.class) {
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

    public final int getStatusCode() {
        return this.statusCode_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
