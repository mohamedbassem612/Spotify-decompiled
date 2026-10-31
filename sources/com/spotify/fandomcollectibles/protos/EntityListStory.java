package com.spotify.fandomcollectibles.protos;

import com.google.protobuf.h;
import p.bf40;
import p.c8x;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EntityListStory extends h implements v2j0 {
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 4;
    public static final int BASE_FIELD_NUMBER = 1;
    private static final EntityListStory DEFAULT_INSTANCE;
    public static final int ENTITY_LIST_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private BaseStory base_;
    private int bitField0_;
    private Text subtitle_;
    private Text title_;
    private String backgroundImageUrl_ = "";
    private h290 entityList_ = h.emptyProtobufList();

    static {
        EntityListStory entityListStory = new EntityListStory();
        DEFAULT_INSTANCE = entityListStory;
        h.registerDefaultInstance(EntityListStory.class, entityListStory);
    }

    private EntityListStory() {
    }

    public static EntityListStory p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ\u0005\u001b", new Object[]{"bitField0_", "base_", "title_", "subtitle_", "backgroundImageUrl_", "entityList_", EntityListItem.class});
        }
        if (iOrdinal == 3) {
            return new EntityListStory();
        }
        if (iOrdinal == 4) {
            return new c8x(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (EntityListStory.class) {
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

    public final String n() {
        return this.backgroundImageUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final BaseStory o() {
        BaseStory baseStory = this.base_;
        return baseStory == null ? BaseStory.r() : baseStory;
    }

    public final h290 q() {
        return this.entityList_;
    }

    public final Text r() {
        Text text = this.subtitle_;
        return text == null ? Text.n() : text;
    }

    public final Text s() {
        Text text = this.title_;
        return text == null ? Text.n() : text;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
