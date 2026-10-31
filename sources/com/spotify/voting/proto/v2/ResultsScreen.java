package com.spotify.voting.proto.v2;

import com.google.protobuf.h;
import p.bf40;
import p.eu21;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ResultsScreen extends h implements v2j0 {
    public static final int CONFETTI_ARTWORK_FIELD_NUMBER = 8;
    private static final ResultsScreen DEFAULT_INSTANCE;
    public static final int PAGE_ACCESSIBILITY_TEXT_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_BUTTON_ACCESSIBILITY_ACTION_FIELD_NUMBER = 7;
    public static final int SHARE_BUTTON_ACCESSIBILITY_TEXT_FIELD_NUMBER = 6;
    public static final int SHARE_BUTTON_TEXT_FIELD_NUMBER = 5;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int WINNERS_FIELD_NUMBER = 4;
    private int bitField0_;
    private Artwork confettiArtwork_;
    private String title_ = "";
    private String subtitle_ = "";
    private h290 winners_ = h.emptyProtobufList();
    private String shareButtonText_ = "";
    private String shareButtonAccessibilityText_ = "";
    private String shareButtonAccessibilityAction_ = "";
    private String pageAccessibilityText_ = "";

    static {
        ResultsScreen resultsScreen = new ResultsScreen();
        DEFAULT_INSTANCE = resultsScreen;
        h.registerDefaultInstance(ResultsScreen.class, resultsScreen);
    }

    private ResultsScreen() {
    }

    public static ResultsScreen o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\t\b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004\u001b\u0005Ȉ\u0006Ȉ\u0007Ȉ\bဉ\u0000\tȈ", new Object[]{"bitField0_", "title_", "subtitle_", "winners_", Winner.class, "shareButtonText_", "shareButtonAccessibilityText_", "shareButtonAccessibilityAction_", "confettiArtwork_", "pageAccessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new ResultsScreen();
        }
        if (iOrdinal == 4) {
            return new eu21(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (ResultsScreen.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final Artwork n() {
        Artwork artwork = this.confettiArtwork_;
        return artwork == null ? Artwork.n() : artwork;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.pageAccessibilityText_;
    }

    public final String q() {
        return this.shareButtonAccessibilityAction_;
    }

    public final String r() {
        return this.shareButtonAccessibilityText_;
    }

    public final String s() {
        return this.shareButtonText_;
    }

    public final h290 t() {
        return this.winners_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }
}
