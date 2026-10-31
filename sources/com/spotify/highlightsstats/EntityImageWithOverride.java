package com.spotify.highlightsstats;

import com.google.protobuf.h;
import p.bf40;
import p.c8x;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EntityImageWithOverride extends h implements v2j0 {
    public static final int DEFAULT_FIELD_NUMBER = 1;
    private static final EntityImageWithOverride DEFAULT_INSTANCE;
    public static final int FALLBACK_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private EntityImage default_;
    private EntityImage fallback_;

    static {
        EntityImageWithOverride entityImageWithOverride = new EntityImageWithOverride();
        DEFAULT_INSTANCE = entityImageWithOverride;
        h.registerDefaultInstance(EntityImageWithOverride.class, entityImageWithOverride);
    }

    private EntityImageWithOverride() {
    }

    public static EntityImageWithOverride o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "default_", "fallback_"});
        }
        if (iOrdinal == 3) {
            return new EntityImageWithOverride();
        }
        if (iOrdinal == 4) {
            return new c8x(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (EntityImageWithOverride.class) {
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

    public final EntityImage n() {
        EntityImage entityImage = this.default_;
        return entityImage == null ? EntityImage.n() : entityImage;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EntityImage p() {
        EntityImage entityImage = this.fallback_;
        return entityImage == null ? EntityImage.n() : entityImage;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
