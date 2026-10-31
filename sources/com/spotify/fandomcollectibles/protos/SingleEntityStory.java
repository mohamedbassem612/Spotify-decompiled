package com.spotify.fandomcollectibles.protos;

import com.google.protobuf.h;
import p.bf40;
import p.bn81;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SingleEntityStory extends h implements v2j0 {
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 4;
    public static final int BASE_FIELD_NUMBER = 1;
    private static final SingleEntityStory DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String backgroundImageUrl_ = "";
    private BaseStory base_;
    private int bitField0_;
    private EntityListItem entity_;
    private Text subtitle_;
    private Text title_;

    static {
        SingleEntityStory singleEntityStory = new SingleEntityStory();
        DEFAULT_INSTANCE = singleEntityStory;
        h.registerDefaultInstance(SingleEntityStory.class, singleEntityStory);
    }

    private SingleEntityStory() {
    }

    public static SingleEntityStory p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ\u0005ဉ\u0003", new Object[]{"bitField0_", "base_", "title_", "subtitle_", "backgroundImageUrl_", "entity_"});
        }
        if (iOrdinal == 3) {
            return new SingleEntityStory();
        }
        if (iOrdinal == 4) {
            return new bn81(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (SingleEntityStory.class) {
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

    public final EntityListItem q() {
        EntityListItem entityListItem = this.entity_;
        return entityListItem == null ? EntityListItem.n() : entityListItem;
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
