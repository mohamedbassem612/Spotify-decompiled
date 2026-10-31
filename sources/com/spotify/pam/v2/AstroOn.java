package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zg7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class AstroOn extends h implements v2j0 {
    public static final int ACTION_MAP_FIELD_NUMBER = 9;
    private static final AstroOn DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    public static final int FULL_TITLE_FIELD_NUMBER = 12;
    public static final int GROUPING_FIELD_NUMBER = 10;
    public static final int ICON_FIELD_NUMBER = 6;
    public static final int IS_ACTIVE_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 5;
    public static final int SCHEDULE_FIELD_NUMBER = 11;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TITLE_TEXT_COLOR_FIELD_NUMBER = 3;
    public static final int URI_FIELD_NUMBER = 4;
    private boolean isActive_;
    private int schedule_;
    private String title_ = "";
    private String subtitle_ = "";
    private String titleTextColor_ = "";
    private String uri_ = "";
    private String price_ = "";
    private String icon_ = "";
    private String description_ = "";
    private h290 actionMap_ = h.emptyProtobufList();
    private String grouping_ = "";
    private String fullTitle_ = "";

    static {
        AstroOn astroOn = new AstroOn();
        DEFAULT_INSTANCE = astroOn;
        h.registerDefaultInstance(AstroOn.class, astroOn);
    }

    private AstroOn() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0007\t\u001b\nȈ\u000b\f\fȈ", new Object[]{"title_", "subtitle_", "titleTextColor_", "uri_", "price_", "icon_", "description_", "isActive_", "actionMap_", ActionTypeMap.class, "grouping_", "schedule_", "fullTitle_"});
        }
        if (iOrdinal == 3) {
            return new AstroOn();
        }
        if (iOrdinal == 4) {
            return new zg7(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (AstroOn.class) {
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

    public final h290 n() {
        return this.actionMap_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.fullTitle_;
    }

    public final String p() {
        return this.icon_;
    }

    public final boolean q() {
        return this.isActive_;
    }

    public final String r() {
        return this.price_;
    }

    public final String s() {
        return this.titleTextColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
