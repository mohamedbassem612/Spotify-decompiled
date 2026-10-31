package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x341;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$ArtistCardsContent$Sidebar extends com.google.protobuf.h implements v2j0 {
    public static final int BACKGROUND_COLORS_FIELD_NUMBER = 5;
    public static final int BOTTOM_LABEL_FIELD_NUMBER = 3;
    private static final SceneTemplate$ArtistCardsContent$Sidebar DEFAULT_INSTANCE;
    public static final int DIVIDER_COLOR_FIELD_NUMBER = 7;
    public static final int MIDDLE_LABEL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_COLORS_FIELD_NUMBER = 6;
    private String middleLabel_ = "";
    private String bottomLabel_ = "";
    private h290 backgroundColors_ = com.google.protobuf.h.emptyProtobufList();
    private h290 textColors_ = com.google.protobuf.h.emptyProtobufList();
    private String dividerColor_ = "";

    static {
        SceneTemplate$ArtistCardsContent$Sidebar sceneTemplate$ArtistCardsContent$Sidebar = new SceneTemplate$ArtistCardsContent$Sidebar();
        DEFAULT_INSTANCE = sceneTemplate$ArtistCardsContent$Sidebar;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$ArtistCardsContent$Sidebar.class, sceneTemplate$ArtistCardsContent$Sidebar);
    }

    private SceneTemplate$ArtistCardsContent$Sidebar() {
    }

    public static SceneTemplate$ArtistCardsContent$Sidebar p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0002\u0007\u0005\u0000\u0002\u0000\u0002Ȉ\u0003Ȉ\u0005Ț\u0006Ț\u0007Ȉ", new Object[]{"middleLabel_", "bottomLabel_", "backgroundColors_", "textColors_", "dividerColor_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$ArtistCardsContent$Sidebar();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (SceneTemplate$ArtistCardsContent$Sidebar.class) {
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

    public final h290 n() {
        return this.backgroundColors_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.bottomLabel_;
    }

    public final String q() {
        return this.dividerColor_;
    }

    public final String r() {
        return this.middleLabel_;
    }

    public final h290 s() {
        return this.textColors_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
