package com.spotify.audiobookdirectsales.v1;

import com.google.protobuf.h;
import p.bf40;
import p.c8x;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class EngagementUnlock extends h implements v2j0 {
    public static final int ACTION_TYPE_FIELD_NUMBER = 6;
    public static final int BODY_FIELD_NUMBER = 2;
    public static final int BODY_SECONDARY_FIELD_NUMBER = 3;
    public static final int CTA_LABEL_FIELD_NUMBER = 4;
    private static final EngagementUnlock DEFAULT_INSTANCE;
    public static final int DISMISS_LABEL_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private String body_ = "";
    private String bodySecondary_ = "";
    private String ctaLabel_ = "";
    private String dismissLabel_ = "";
    private String actionType_ = "";

    static {
        EngagementUnlock engagementUnlock = new EngagementUnlock();
        DEFAULT_INSTANCE = engagementUnlock;
        h.registerDefaultInstance(EngagementUnlock.class, engagementUnlock);
    }

    private EngagementUnlock() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EngagementUnlock r() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"title_", "body_", "bodySecondary_", "ctaLabel_", "dismissLabel_", "actionType_"});
        }
        if (iOrdinal == 3) {
            return new EngagementUnlock();
        }
        if (iOrdinal == 4) {
            return new c8x(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (EngagementUnlock.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.actionType_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.body_;
    }

    public final String p() {
        return this.bodySecondary_;
    }

    public final String q() {
        return this.ctaLabel_;
    }

    public final String s() {
        return this.dismissLabel_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
