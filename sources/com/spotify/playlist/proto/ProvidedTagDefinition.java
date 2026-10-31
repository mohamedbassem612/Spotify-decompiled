package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h1y0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ProvidedTagDefinition extends h implements v2j0 {
    public static final int COUNT_FIELD_NUMBER = 4;
    private static final ProvidedTagDefinition DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TAG_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private int count_;
    private String id_ = "";
    private String name_ = "";
    private int tagId_;

    static {
        ProvidedTagDefinition providedTagDefinition = new ProvidedTagDefinition();
        DEFAULT_INSTANCE = providedTagDefinition;
        h.registerDefaultInstance(ProvidedTagDefinition.class, providedTagDefinition);
    }

    private ProvidedTagDefinition() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"bitField0_", "id_", "name_", "tagId_", "count_"});
        }
        if (iOrdinal == 3) {
            return new ProvidedTagDefinition();
        }
        if (iOrdinal == 4) {
            return new h1y0(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (ProvidedTagDefinition.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getName() {
        return this.name_;
    }

    public final int n() {
        return this.count_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.tagId_;
    }

    public final boolean p() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean r() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
