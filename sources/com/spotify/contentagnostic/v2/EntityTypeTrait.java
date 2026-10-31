package com.spotify.contentagnostic.v2;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import p.bf40;
import p.czy;
import p.fxy;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class EntityTypeTrait extends com.google.protobuf.h implements v2j0 {
    private static final EntityTypeTrait DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    static {
        EntityTypeTrait entityTypeTrait = new EntityTypeTrait();
        DEFAULT_INSTANCE = entityTypeTrait;
        com.google.protobuf.h.registerDefaultInstance(EntityTypeTrait.class, entityTypeTrait);
    }

    private EntityTypeTrait() {
    }

    public static EntityTypeTrait o(byte[] bArr) {
        return (EntityTypeTrait) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return new EntityTypeTrait();
        }
        if (iOrdinal == 4) {
            return new fxy(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (EntityTypeTrait.class) {
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

    public final czy n() {
        czy czyVar;
        switch (this.type_) {
            case 0:
                czyVar = czy.ENTITY_TYPE_UNSPECIFIED;
                break;
            case 1:
                czyVar = czy.ENTITY_TYPE_TRACK;
                break;
            case 2:
                czyVar = czy.ENTITY_TYPE_ALBUM;
                break;
            case 3:
                czyVar = czy.ENTITY_TYPE_PODCAST_EPISODE;
                break;
            case 4:
                czyVar = czy.ENTITY_TYPE_PODCAST_SHOW;
                break;
            case 5:
                czyVar = czy.ENTITY_TYPE_AUDIOBOOK_CHAPTER;
                break;
            case 6:
                czyVar = czy.ENTITY_TYPE_AUDIOBOOK;
                break;
            case 7:
                czyVar = czy.ENTITY_TYPE_LEARNING_COURSE;
                break;
            case 8:
                czyVar = czy.ENTITY_TYPE_LEARNING_LESSON;
                break;
            case 9:
                czyVar = czy.ENTITY_TYPE_USER_HIGHLIGHT;
                break;
            case 10:
                czyVar = czy.ENTITY_TYPE_AUTHOR;
                break;
            case 11:
                czyVar = czy.ENTITY_TYPE_ARTIST;
                break;
            case 12:
                czyVar = czy.ENTITY_TYPE_PLAYLIST;
                break;
            case 13:
                czyVar = czy.ENTITY_TYPE_USER;
                break;
            case 14:
                czyVar = czy.ENTITY_TYPE_PODCAST_CHAPTER;
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            default:
                czyVar = null;
                break;
            case 19:
                czyVar = czy.ENTITY_TYPE_EDITOR;
                break;
            case 20:
                czyVar = czy.ENTITY_TYPE_CLASSICAL_ARTIST;
                break;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                czyVar = czy.ENTITY_TYPE_AUDIOBOOK_SERIES;
                break;
            case 22:
                czyVar = czy.ENTITY_TYPE_CLASSICAL_WORK;
                break;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                czyVar = czy.ENTITY_TYPE_CONTRIBUTING_ARTIST;
                break;
        }
        return czyVar == null ? czy.UNRECOGNIZED : czyVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
