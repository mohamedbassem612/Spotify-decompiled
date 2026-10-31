package com.spotify.culturalmoments.stories.v1;

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
    private static final Story DEFAULT_INSTANCE;
    public static final int FEATURED_CARD_STORY_FIELD_NUMBER = 2;
    public static final int FULLSCREEN_VIDEO_STORY_FIELD_NUMBER = 3;
    public static final int IMAGE_ON_IMAGE_STORY_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_STORY_FIELD_NUMBER = 4;
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

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"story_", "storyCase_", ImageOnImageStory.class, FeaturedCardStory.class, FullscreenVideoStory.class, PlaylistStory.class});
        }
        if (iOrdinal == 3) {
            return new Story();
        }
        if (iOrdinal == 4) {
            return new lub1(DEFAULT_INSTANCE, (byte) 8);
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

    public final FeaturedCardStory n() {
        return this.storyCase_ == 2 ? (FeaturedCardStory) this.story_ : FeaturedCardStory.q();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final FullscreenVideoStory o() {
        return this.storyCase_ == 3 ? (FullscreenVideoStory) this.story_ : FullscreenVideoStory.o();
    }

    public final ImageOnImageStory p() {
        return this.storyCase_ == 1 ? (ImageOnImageStory) this.story_ : ImageOnImageStory.p();
    }

    public final PlaylistStory q() {
        return this.storyCase_ == 4 ? (PlaylistStory) this.story_ : PlaylistStory.q();
    }

    public final int r() {
        int i = this.storyCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
