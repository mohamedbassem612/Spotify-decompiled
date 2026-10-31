package com.spotify.extendedmetadata.extensions.entitycappingimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.c8x;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rdy;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EntityCapping extends h implements v2j0 {
    public static final int CAPPING_GROUP_FIELD_NUMBER = 1;
    private static final EntityCapping DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int cappingGroup_;

    static {
        EntityCapping entityCapping = new EntityCapping();
        DEFAULT_INSTANCE = entityCapping;
        h.registerDefaultInstance(EntityCapping.class, entityCapping);
    }

    private EntityCapping() {
    }

    public static EntityCapping o(byte[] bArr) {
        return (EntityCapping) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"cappingGroup_"});
        }
        if (iOrdinal == 3) {
            return new EntityCapping();
        }
        if (iOrdinal == 4) {
            return new c8x(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (EntityCapping.class) {
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

    public final rdy n() {
        rdy rdyVar;
        int i = this.cappingGroup_;
        if (i != 0) {
            rdyVar = i != 1 ? null : rdy.ABP;
        } else {
            rdyVar = rdy.NO_CAPPING;
        }
        return rdyVar == null ? rdy.UNRECOGNIZED : rdyVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
