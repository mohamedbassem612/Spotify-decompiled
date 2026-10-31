package com.spotify.searchview.proto;

import p.bf40;
import p.c8x;
import p.jf40;
import p.qgy;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class EntityFilter extends com.google.protobuf.h implements v2j0 {
    private static final EntityFilter DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    static {
        EntityFilter entityFilter = new EntityFilter();
        DEFAULT_INSTANCE = entityFilter;
        com.google.protobuf.h.registerDefaultInstance(EntityFilter.class, entityFilter);
    }

    private EntityFilter() {
    }

    public static EntityFilter n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"type_"});
        }
        if (iOrdinal == 3) {
            return new EntityFilter();
        }
        if (iOrdinal == 4) {
            return new c8x(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (EntityFilter.class) {
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

    public final qgy o() {
        qgy qgyVar;
        switch (this.type_) {
            case 0:
                qgyVar = qgy.ENTITY_FILTER_TYPE_UNKNOWN;
                break;
            case 1:
                qgyVar = qgy.ENTITY_FILTER_TYPE_ARTIST;
                break;
            case 2:
                qgyVar = qgy.ENTITY_FILTER_TYPE_TRACK;
                break;
            case 3:
                qgyVar = qgy.ENTITY_FILTER_TYPE_ALBUM;
                break;
            case 4:
                qgyVar = qgy.ENTITY_FILTER_TYPE_PLAYLIST;
                break;
            case 5:
                qgyVar = qgy.ENTITY_FILTER_TYPE_GENRE;
                break;
            case 6:
                qgyVar = qgy.ENTITY_FILTER_TYPE_PROFILE;
                break;
            case 7:
                qgyVar = qgy.ENTITY_FILTER_TYPE_AUDIOBOOK;
                break;
            default:
                qgyVar = null;
                break;
        }
        return qgyVar == null ? qgy.UNRECOGNIZED : qgyVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
