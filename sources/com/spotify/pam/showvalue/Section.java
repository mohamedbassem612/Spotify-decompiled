package com.spotify.pam.showvalue;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z451;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Section extends h implements v2j0 {
    public static final int BENEFITS_HEADER_FIELD_NUMBER = 6;
    public static final int CAROUSEL_FIELD_NUMBER = 4;
    public static final int CENTERED_BUTTON_FIELD_NUMBER = 10;
    private static final Section DEFAULT_INSTANCE;
    public static final int LISTENING_STATS_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int SECTION_ID_FIELD_NUMBER = 1;
    public static final int SHORTCUTS_FIELD_NUMBER = 3;
    public static final int SONG_DNA_FIELD_NUMBER = 9;
    public static final int SUBSCRIPTION_CARD_FIELD_NUMBER = 2;
    public static final int VIDEO_CAROUSEL_FIELD_NUMBER = 5;
    public static final int WATCH_FEED_FIELD_NUMBER = 8;
    private Object content_;
    private int contentCase_ = 0;
    private String sectionId_ = "";

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        h.registerDefaultInstance(Section.class, section);
    }

    private Section() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"content_", "contentCase_", "sectionId_", SubscriptionCardProto.class, ShortcutsSection.class, CarouselSection.class, VideoCarouselSection.class, BenefitsHeaderSection.class, ListeningStatsSection.class, WatchFeedSection.class, SongDNASection.class, CenteredButtonSection.class});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new z451(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (Section.class) {
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

    public final BenefitsHeaderSection n() {
        return this.contentCase_ == 6 ? (BenefitsHeaderSection) this.content_ : BenefitsHeaderSection.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CarouselSection o() {
        return this.contentCase_ == 4 ? (CarouselSection) this.content_ : CarouselSection.o();
    }

    public final CenteredButtonSection p() {
        return this.contentCase_ == 10 ? (CenteredButtonSection) this.content_ : CenteredButtonSection.n();
    }

    public final int q() {
        int i = this.contentCase_;
        if (i == 0) {
            return 10;
        }
        switch (i) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            default:
                return 0;
        }
    }

    public final ListeningStatsSection r() {
        return this.contentCase_ == 7 ? (ListeningStatsSection) this.content_ : ListeningStatsSection.o();
    }

    public final String s() {
        return this.sectionId_;
    }

    public final ShortcutsSection t() {
        return this.contentCase_ == 3 ? (ShortcutsSection) this.content_ : ShortcutsSection.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final SongDNASection u() {
        return this.contentCase_ == 9 ? (SongDNASection) this.content_ : SongDNASection.o();
    }

    public final SubscriptionCardProto v() {
        return this.contentCase_ == 2 ? (SubscriptionCardProto) this.content_ : SubscriptionCardProto.n();
    }

    public final VideoCarouselSection w() {
        return this.contentCase_ == 5 ? (VideoCarouselSection) this.content_ : VideoCarouselSection.o();
    }

    public final WatchFeedSection x() {
        return this.contentCase_ == 8 ? (WatchFeedSection) this.content_ : WatchFeedSection.o();
    }
}
