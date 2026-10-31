package com.spotify.p4p.ucp.seedsearch.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.pg51;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.ul51;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class SeedSearchResult extends h implements v2j0 {
    public static final int ARTISTS_FIELD_NUMBER = 4;
    public static final int COLLABORATORS_FIELD_NUMBER = 5;
    private static final SeedSearchResult DEFAULT_INSTANCE;
    public static final int ENTITY_TYPE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private int entityType_;
    private String uri_ = "";
    private String name_ = "";
    private h290 artists_ = h.emptyProtobufList();
    private h290 collaborators_ = h.emptyProtobufList();

    static {
        SeedSearchResult seedSearchResult = new SeedSearchResult();
        DEFAULT_INSTANCE = seedSearchResult;
        h.registerDefaultInstance(SeedSearchResult.class, seedSearchResult);
    }

    private SeedSearchResult() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004\u001b\u0005\u001b", new Object[]{"uri_", "entityType_", "name_", "artists_", SeedSearchArtist.class, "collaborators_", Contributor.class});
        }
        if (iOrdinal == 3) {
            return new SeedSearchResult();
        }
        if (iOrdinal == 4) {
            return new pg51(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (SeedSearchResult.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final ul51 n() {
        ul51 ul51VarA = ul51.a(this.entityType_);
        return ul51VarA == null ? ul51.UNRECOGNIZED : ul51VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
