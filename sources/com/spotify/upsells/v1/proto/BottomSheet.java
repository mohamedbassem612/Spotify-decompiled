package com.spotify.upsells.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lka;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class BottomSheet extends h implements v2j0 {
    public static final int BADGE_FIELD_NUMBER = 2;
    public static final int BODY_TEXT_FIELD_NUMBER = 5;
    private static final BottomSheet DEFAULT_INSTANCE;
    public static final int LIMIT_MESSAGE_FIELD_NUMBER = 4;
    public static final int MEDIA_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int PRIMARY_CTA_FIELD_NUMBER = 6;
    public static final int SECONDARY_CTA_FIELD_NUMBER = 7;
    public static final int SIGNIFIER_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 3;
    private Badge badge_;
    private int bitField0_;
    private LimitMessage limitMessage_;
    private Media media_;
    private CTA primaryCta_;
    private CTA secondaryCta_;
    private SignifierDisplay signifier_;
    private String title_ = "";
    private String bodyText_ = "";

    static {
        BottomSheet bottomSheet = new BottomSheet();
        DEFAULT_INSTANCE = bottomSheet;
        h.registerDefaultInstance(BottomSheet.class, bottomSheet);
    }

    private BottomSheet() {
    }

    public static BottomSheet o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0002\t\b\u0000\u0000\u0000\u0002ဉ\u0000\u0003Ȉ\u0004ဉ\u0001\u0005Ȉ\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005", new Object[]{"bitField0_", "badge_", "title_", "limitMessage_", "bodyText_", "primaryCta_", "secondaryCta_", "signifier_", "media_"});
        }
        if (iOrdinal == 3) {
            return new BottomSheet();
        }
        if (iOrdinal == 4) {
            return new lka(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (BottomSheet.class) {
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
        return this.bodyText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Media p() {
        Media media = this.media_;
        return media == null ? Media.o() : media;
    }

    public final CTA q() {
        CTA cta = this.primaryCta_;
        return cta == null ? CTA.n() : cta;
    }

    public final CTA r() {
        CTA cta = this.secondaryCta_;
        return cta == null ? CTA.n() : cta;
    }

    public final SignifierDisplay s() {
        SignifierDisplay signifierDisplay = this.signifier_;
        return signifierDisplay == null ? SignifierDisplay.o() : signifierDisplay;
    }

    public final boolean t() {
        return (this.bitField0_ & 8) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
