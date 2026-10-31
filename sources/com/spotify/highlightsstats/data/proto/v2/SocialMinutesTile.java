package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import com.spotify.highlightsstats.TextWithOverride;
import com.spotify.wrapped.v1.proto.Paragraph;
import p.bf40;
import p.bn81;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class SocialMinutesTile extends h implements v2j0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 4;
    private static final SocialMinutesTile DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int NO_FRIEND_DATA_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private TextWithOverride accessibilityDescription_;
    private int bitField0_;
    private String header_ = "";
    private boolean noFriendData_;
    private Paragraph subtitle_;
    private Paragraph title_;

    static {
        SocialMinutesTile socialMinutesTile = new SocialMinutesTile();
        DEFAULT_INSTANCE = socialMinutesTile;
        h.registerDefaultInstance(SocialMinutesTile.class, socialMinutesTile);
    }

    private SocialMinutesTile() {
    }

    public static SocialMinutesTile o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u0007", new Object[]{"bitField0_", "header_", "title_", "subtitle_", "accessibilityDescription_", "noFriendData_"});
        }
        if (iOrdinal == 3) {
            return new SocialMinutesTile();
        }
        if (iOrdinal == 4) {
            return new bn81(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (SocialMinutesTile.class) {
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

    public final TextWithOverride n() {
        TextWithOverride textWithOverride = this.accessibilityDescription_;
        return textWithOverride == null ? TextWithOverride.o() : textWithOverride;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.header_;
    }

    public final boolean q() {
        return this.noFriendData_;
    }

    public final Paragraph r() {
        Paragraph paragraph = this.subtitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph s() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
