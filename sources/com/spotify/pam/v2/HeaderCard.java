package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zp50;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class HeaderCard extends h implements v2j0 {
    public static final int BACKGROUND_URI_FIELD_NUMBER = 5;
    private static final HeaderCard DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PRIMARY_ACTION_FIELD_NUMBER = 6;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_COLOR_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Action primaryAction_;
    private String title_ = "";
    private String titleColor_ = "";
    private String subtitle_ = "";
    private String description_ = "";
    private String backgroundUri_ = "";

    static {
        HeaderCard headerCard = new HeaderCard();
        DEFAULT_INSTANCE = headerCard;
        h.registerDefaultInstance(HeaderCard.class, headerCard);
    }

    private HeaderCard() {
    }

    public static HeaderCard o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0000", new Object[]{"bitField0_", "title_", "titleColor_", "subtitle_", "description_", "backgroundUri_", "primaryAction_"});
        }
        if (iOrdinal == 3) {
            return new HeaderCard();
        }
        if (iOrdinal == 4) {
            return new zp50(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (HeaderCard.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.backgroundUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Action p() {
        Action action = this.primaryAction_;
        return action == null ? Action.o() : action;
    }

    public final String q() {
        return this.titleColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
