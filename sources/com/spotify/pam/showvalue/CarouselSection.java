package com.spotify.pam.showvalue;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class CarouselSection extends h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 7;
    private static final CarouselSection DEFAULT_INSTANCE;
    public static final int HEADING_SUBTITLE_FIELD_NUMBER = 2;
    public static final int HEADING_TITLE_FIELD_NUMBER = 1;
    public static final int NAVIGATION_ACTION_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TRAILING_ACTION_FIELD_NUMBER = 5;
    public static final int URIS_FIELD_NUMBER = 3;
    private Action action_;
    private int bitField0_;
    private CarouselAction navigationAction_;
    private CarouselAction trailingAction_;
    private String headingTitle_ = "";
    private String headingSubtitle_ = "";
    private h290 uris_ = h.emptyProtobufList();

    static {
        CarouselSection carouselSection = new CarouselSection();
        DEFAULT_INSTANCE = carouselSection;
        h.registerDefaultInstance(CarouselSection.class, carouselSection);
    }

    private CarouselSection() {
    }

    public static CarouselSection o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002ለ\u0000\u0003Ț\u0004ဉ\u0001\u0005ဉ\u0002\u0007ဉ\u0003", new Object[]{"bitField0_", "headingTitle_", "headingSubtitle_", "uris_", "navigationAction_", "trailingAction_", "action_"});
        }
        if (iOrdinal == 3) {
            return new CarouselSection();
        }
        if (iOrdinal == 4) {
            return new b(DEFAULT_INSTANCE);
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
        synchronized (CarouselSection.class) {
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

    public final List getUrisList() {
        return this.uris_;
    }

    public final Action n() {
        Action action = this.action_;
        return action == null ? Action.n() : action;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.headingSubtitle_;
    }

    public final String q() {
        return this.headingTitle_;
    }

    public final CarouselAction r() {
        CarouselAction carouselAction = this.navigationAction_;
        return carouselAction == null ? CarouselAction.n() : carouselAction;
    }

    public final CarouselAction s() {
        CarouselAction carouselAction = this.trailingAction_;
        return carouselAction == null ? CarouselAction.n() : carouselAction;
    }

    public final boolean t() {
        return (this.bitField0_ & 8) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 4) != 0;
    }
}
