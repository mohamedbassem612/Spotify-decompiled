package com.spotify.fandomcollectibles.protos;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lub1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Story extends h implements v2j0 {
    public static final int BOX_REVEAL_STORY_FIELD_NUMBER = 19;
    private static final Story DEFAULT_INSTANCE;
    public static final int ENTITY_BUTTON_STORY_FIELD_NUMBER = 17;
    public static final int ENTITY_LIST_STORY_FIELD_NUMBER = 13;
    public static final int FAN_STAMP_CARD_STORY_FIELD_NUMBER = 18;
    public static final int FREE_ACHIEVEMENT_CARD_STORY_FIELD_NUMBER = 15;
    public static final int GLOBE_STORY_FIELD_NUMBER = 12;
    public static final int IMAGE_TITLE_SUBTITLE_STORY_FIELD_NUMBER = 11;
    public static final int INTRO_STORY_FIELD_NUMBER = 5;
    public static final int LISTENING_PARTY_CARD_STORY_FIELD_NUMBER = 14;
    public static final int LOTTIE_STORY_FIELD_NUMBER = 9;
    public static final int MEDIA_ACHIEVEMENT_CARD_STORY_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int SINGLE_ENTITY_STORY_FIELD_NUMBER = 16;
    public static final int TITLE_STORY_FIELD_NUMBER = 8;
    private int storyCase_ = 0;
    private Object story_;

    static {
        Story story = new Story();
        DEFAULT_INSTANCE = story;
        h.registerDefaultInstance(Story.class, story);
    }

    private Story() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final TitleStory A() {
        return this.storyCase_ == 8 ? (TitleStory) this.story_ : TitleStory.p();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0001\u0000\u0005\u0013\r\u0000\u0000\u0000\u0005<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000", new Object[]{"story_", "storyCase_", IntroStory.class, TitleStory.class, LottieStory.class, MediaAchievementCardStory.class, ImageTitleSubtitleStory.class, GlobeStory.class, EntityListStory.class, ListeningPartyCardStory.class, FreeAchievementCardStory.class, SingleEntityStory.class, EntityButtonStory.class, FanStampCardStory.class, BoxRevealStory.class});
        }
        if (iOrdinal == 3) {
            return new Story();
        }
        if (iOrdinal == 4) {
            return new lub1(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (Story.class) {
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

    public final BoxRevealStory n() {
        return this.storyCase_ == 19 ? (BoxRevealStory) this.story_ : BoxRevealStory.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EntityButtonStory o() {
        return this.storyCase_ == 17 ? (EntityButtonStory) this.story_ : EntityButtonStory.q();
    }

    public final EntityListStory p() {
        return this.storyCase_ == 13 ? (EntityListStory) this.story_ : EntityListStory.p();
    }

    public final FanStampCardStory q() {
        return this.storyCase_ == 18 ? (FanStampCardStory) this.story_ : FanStampCardStory.s();
    }

    public final FreeAchievementCardStory r() {
        return this.storyCase_ == 15 ? (FreeAchievementCardStory) this.story_ : FreeAchievementCardStory.w();
    }

    public final GlobeStory s() {
        return this.storyCase_ == 12 ? (GlobeStory) this.story_ : GlobeStory.p();
    }

    public final ImageTitleSubtitleStory t() {
        return this.storyCase_ == 11 ? (ImageTitleSubtitleStory) this.story_ : ImageTitleSubtitleStory.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final IntroStory u() {
        return this.storyCase_ == 5 ? (IntroStory) this.story_ : IntroStory.p();
    }

    public final ListeningPartyCardStory v() {
        return this.storyCase_ == 14 ? (ListeningPartyCardStory) this.story_ : ListeningPartyCardStory.v();
    }

    public final LottieStory w() {
        return this.storyCase_ == 9 ? (LottieStory) this.story_ : LottieStory.o();
    }

    public final MediaAchievementCardStory x() {
        return this.storyCase_ == 10 ? (MediaAchievementCardStory) this.story_ : MediaAchievementCardStory.y();
    }

    public final SingleEntityStory y() {
        return this.storyCase_ == 16 ? (SingleEntityStory) this.story_ : SingleEntityStory.p();
    }

    public final int z() {
        int i = this.storyCase_;
        if (i == 0) {
            return 14;
        }
        if (i == 5) {
            return 1;
        }
        switch (i) {
            case 8:
                return 2;
            case 9:
                return 3;
            case 10:
                return 4;
            case 11:
                return 5;
            case 12:
                return 6;
            case 13:
                return 7;
            case 14:
                return 8;
            case 15:
                return 9;
            case 16:
                return 10;
            case 17:
                return 11;
            case 18:
                return 12;
            case 19:
                return 13;
            default:
                return 0;
        }
    }
}
