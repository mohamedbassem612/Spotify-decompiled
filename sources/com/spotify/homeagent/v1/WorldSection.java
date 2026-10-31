package com.spotify.homeagent.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ixk1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class WorldSection extends h implements v2j0 {
    private static final WorldSection DEFAULT_INSTANCE;
    public static final int MULTI_ITEM_BASIC_FIELD_NUMBER = 1;
    public static final int MULTI_ITEM_CONCERT_FIELD_NUMBER = 7;
    public static final int MULTI_ITEM_GRID_FIELD_NUMBER = 9;
    public static final int MULTI_ITEM_VERTICAL_LIST_FIELD_NUMBER = 2;
    public static final int MULTI_ITEM_VIDEO_MUSIC_FIELD_NUMBER = 3;
    public static final int MULTI_ITEM_VIDEO_PODCAST_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SINGLE_ITEM_CONCERT_FIELD_NUMBER = 8;
    public static final int SINGLE_ITEM_PREVIEWABLE_AUDIO_FIELD_NUMBER = 5;
    public static final int SINGLE_ITEM_PREVIEWABLE_VIDEO_FIELD_NUMBER = 6;
    public static final int USER_PROMPT_ENTRY_FIELD_NUMBER = 10;
    private int sectionTypeCase_ = 0;
    private Object sectionType_;

    static {
        WorldSection worldSection = new WorldSection();
        DEFAULT_INSTANCE = worldSection;
        h.registerDefaultInstance(WorldSection.class, worldSection);
    }

    private WorldSection() {
    }

    public static WorldSection p(byte[] bArr) {
        return (WorldSection) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"sectionType_", "sectionTypeCase_", MultiItemBasic.class, MultiItemVerticalList.class, MultiItemVideoMusic.class, MultiItemVideoPodcast.class, SingleItemPreviewableAudio.class, SingleItemPreviewableVideo.class, MultiItemConcert.class, SingleItemConcert.class, MultiItemGrid.class, UserPromptEntry.class});
        }
        if (iOrdinal == 3) {
            return new WorldSection();
        }
        if (iOrdinal == 4) {
            return new ixk1(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (WorldSection.class) {
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

    public final int n() {
        switch (this.sectionTypeCase_) {
            case 0:
                return 11;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            default:
                return 0;
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final UserPromptEntry o() {
        return this.sectionTypeCase_ == 10 ? (UserPromptEntry) this.sectionType_ : UserPromptEntry.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
