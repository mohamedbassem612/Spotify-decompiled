package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.gyc;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u831;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class RichCallToAction extends h implements v2j0 {
    public static final int CALL_TO_ACTION_TEXT_FIELD_NUMBER = 5;
    private static final RichCallToAction DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    public static final int IS_DISMISSIBLE_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private boolean isDismissible_;
    private int type_;
    private String imageUrl_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String callToActionText_ = "";

    static {
        RichCallToAction richCallToAction = new RichCallToAction();
        DEFAULT_INSTANCE = richCallToAction;
        h.registerDefaultInstance(RichCallToAction.class, richCallToAction);
    }

    private RichCallToAction() {
    }

    public static RichCallToAction o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0007", new Object[]{"type_", "imageUrl_", "title_", "subtitle_", "callToActionText_", "isDismissible_"});
        }
        if (iOrdinal == 3) {
            return new RichCallToAction();
        }
        if (iOrdinal == 4) {
            return new u831(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (RichCallToAction.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.callToActionText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean p() {
        return this.isDismissible_;
    }

    public final gyc q() {
        gyc gycVarA = gyc.a(this.type_);
        return gycVarA == null ? gyc.g : gycVarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
