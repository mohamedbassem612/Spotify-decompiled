package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor$Companion;
import p.bf40;
import p.h1f1;
import p.j0z;
import p.jf40;
import p.nzd1;
import p.plx0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tzy;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class TimelineEntry extends h implements v2j0 {
    public static final int ACCENT_COLOR_FIELD_NUMBER = 13;
    public static final int ACTION_FIELD_NUMBER = 14;
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 16;
    public static final int BADGE_FIELD_NUMBER = 12;
    private static final TimelineEntry DEFAULT_INSTANCE;
    public static final int ENTRY_FOOTER_ACTION_FIELD_NUMBER = 17;
    public static final int ENTRY_FOOTER_FIELD_NUMBER = 15;
    public static final int KIND_FIELD_NUMBER = 2;
    public static final int LEGAL_HTML_FIELD_NUMBER = 18;
    public static final int MEDIA_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int PRETITLE_FIELD_NUMBER = 5;
    public static final int PROMINENCE_FIELD_NUMBER = 10;
    public static final int SOURCE_FIELD_NUMBER = 4;
    public static final int STATE_FIELD_NUMBER = 3;
    public static final int SUBTITLE_FIELD_NUMBER = 7;
    public static final int SUPPORTING_TEXT_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 6;
    public static final int TONE_FIELD_NUMBER = 11;
    private TimelineAction action_;
    private PlaceHolderText badge_;
    private int bitField0_;
    private TimelineAction entryFooterAction_;
    private PlaceHolderText entryFooter_;
    private int kind_;
    private EntryMedia media_;
    private PlaceHolderText pretitle_;
    private int prominence_;
    private SourceReference source_;
    private int state_;
    private PlaceHolderText subtitle_;
    private PlaceHolderText supportingText_;
    private PlaceHolderText title_;
    private int tone_;
    private String accentColor_ = "";
    private String backgroundColor_ = "";
    private String legalHtml_ = "";

    static {
        TimelineEntry timelineEntry = new TimelineEntry();
        DEFAULT_INSTANCE = timelineEntry;
        h.registerDefaultInstance(TimelineEntry.class, timelineEntry);
    }

    private TimelineEntry() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final PlaceHolderText A() {
        PlaceHolderText placeHolderText = this.subtitle_;
        return placeHolderText == null ? PlaceHolderText.n() : placeHolderText;
    }

    public final PlaceHolderText B() {
        PlaceHolderText placeHolderText = this.supportingText_;
        return placeHolderText == null ? PlaceHolderText.n() : placeHolderText;
    }

    public final PlaceHolderText C() {
        PlaceHolderText placeHolderText = this.title_;
        return placeHolderText == null ? PlaceHolderText.n() : placeHolderText;
    }

    public final h1f1 D() {
        h1f1 h1f1Var;
        int i = this.tone_;
        if (i == 0) {
            h1f1Var = h1f1.TONE_UNSPECIFIED;
        } else if (i == 1) {
            h1f1Var = h1f1.TONE_NEUTRAL;
        } else if (i == 2) {
            h1f1Var = h1f1.TONE_ON_SALE;
        } else if (i != 3) {
            h1f1Var = i != 4 ? null : h1f1.TONE_CRITICAL;
        } else {
            h1f1Var = h1f1.TONE_WARNING;
        }
        return h1f1Var == null ? h1f1.UNRECOGNIZED : h1f1Var;
    }

    public final boolean E() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean G() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final boolean H() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean I() {
        return (this.bitField0_ & NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0;
    }

    public final boolean J() {
        return (this.bitField0_ & 2048) != 0;
    }

    public final boolean K() {
        return (this.bitField0_ & 4096) != 0;
    }

    public final boolean L() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean M() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean N() {
        return (this.bitField0_ & 16) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0001\u0002\u0012\u0011\u0000\u0000\u0000\u0002\f\u0003\f\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005\n\f\u000b\f\fဉ\u0006\rለ\u0007\u000eဉ\b\u000fဉ\t\u0010ለ\n\u0011ဉ\u000b\u0012ለ\f", new Object[]{"bitField0_", "kind_", "state_", "source_", "pretitle_", "title_", "subtitle_", "supportingText_", "media_", "prominence_", "tone_", "badge_", "accentColor_", "action_", "entryFooter_", "backgroundColor_", "entryFooterAction_", "legalHtml_"});
        }
        if (iOrdinal == 3) {
            return new TimelineEntry();
        }
        if (iOrdinal == 4) {
            return new nzd1(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (TimelineEntry.class) {
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

    public final boolean hasSource() {
        return (this.bitField0_ & 1) != 0;
    }

    public final String n() {
        return this.accentColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final TimelineAction o() {
        TimelineAction timelineAction = this.action_;
        return timelineAction == null ? TimelineAction.o() : timelineAction;
    }

    public final String p() {
        return this.backgroundColor_;
    }

    public final PlaceHolderText q() {
        PlaceHolderText placeHolderText = this.badge_;
        return placeHolderText == null ? PlaceHolderText.n() : placeHolderText;
    }

    public final PlaceHolderText r() {
        PlaceHolderText placeHolderText = this.entryFooter_;
        return placeHolderText == null ? PlaceHolderText.n() : placeHolderText;
    }

    public final TimelineAction s() {
        TimelineAction timelineAction = this.entryFooterAction_;
        return timelineAction == null ? TimelineAction.o() : timelineAction;
    }

    public final tzy t() {
        tzy tzyVar;
        int i = this.kind_;
        if (i == 0) {
            tzyVar = tzy.ENTRY_KIND_UNSPECIFIED;
        } else if (i == 1) {
            tzyVar = tzy.ENTRY_KIND_RESERVATION;
        } else if (i == 2) {
            tzyVar = tzy.ENTRY_KIND_PRESALE;
        } else if (i != 3) {
            tzyVar = i != 4 ? null : tzy.ENTRY_KIND_MILESTONE;
        } else {
            tzyVar = tzy.ENTRY_KIND_GENERAL_SALE;
        }
        return tzyVar == null ? tzy.UNRECOGNIZED : tzyVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.legalHtml_;
    }

    public final EntryMedia v() {
        EntryMedia entryMedia = this.media_;
        return entryMedia == null ? EntryMedia.n() : entryMedia;
    }

    public final PlaceHolderText w() {
        PlaceHolderText placeHolderText = this.pretitle_;
        return placeHolderText == null ? PlaceHolderText.n() : placeHolderText;
    }

    public final plx0 x() {
        plx0 plx0Var;
        int i = this.prominence_;
        if (i == 0) {
            plx0Var = plx0.PROMINENCE_UNSPECIFIED;
        } else if (i == 1) {
            plx0Var = plx0.PROMINENCE_DEFAULT;
        } else if (i != 2) {
            plx0Var = i != 3 ? null : plx0.PROMINENCE_SUBDUED;
        } else {
            plx0Var = plx0.PROMINENCE_HIGHLIGHTED;
        }
        return plx0Var == null ? plx0.UNRECOGNIZED : plx0Var;
    }

    public final SourceReference y() {
        SourceReference sourceReference = this.source_;
        return sourceReference == null ? SourceReference.p() : sourceReference;
    }

    public final j0z z() {
        j0z j0zVar;
        switch (this.state_) {
            case 0:
                j0zVar = j0z.ENTRY_STATE_UNSPECIFIED;
                break;
            case 1:
                j0zVar = j0z.ENTRY_STATE_UPCOMING;
                break;
            case 2:
                j0zVar = j0z.ENTRY_STATE_ACTIVE;
                break;
            case 3:
                j0zVar = j0z.ENTRY_STATE_ENDED;
                break;
            case 4:
                j0zVar = j0z.ENTRY_STATE_SOLD_OUT;
                break;
            case 5:
                j0zVar = j0z.ENTRY_STATE_CANCELLED;
                break;
            case 6:
                j0zVar = j0z.ENTRY_STATE_PURCHASED;
                break;
            default:
                j0zVar = null;
                break;
        }
        return j0zVar == null ? j0z.UNRECOGNIZED : j0zVar;
    }
}
