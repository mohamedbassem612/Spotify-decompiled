package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import com.spotify.highlightsstats.EntityImageWithOverride;
import com.spotify.highlightsstats.TextWithOverride;
import p.bf40;
import p.bn81;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SocialAvailablePeriod extends h implements v2j0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 6;
    public static final int ADDITIONAL_TEXT_FIELD_NUMBER = 5;
    private static final SocialAvailablePeriod DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 3;
    private TextWithOverride accessibilityDescription_;
    private int bitField0_;
    private EntityImageWithOverride image_;
    private TextWithOverride subtitle_;
    private Timestamp timestamp_;
    private String title_ = "";
    private String additionalText_ = "";

    static {
        SocialAvailablePeriod socialAvailablePeriod = new SocialAvailablePeriod();
        DEFAULT_INSTANCE = socialAvailablePeriod;
        h.registerDefaultInstance(SocialAvailablePeriod.class, socialAvailablePeriod);
    }

    private SocialAvailablePeriod() {
    }

    public static SocialAvailablePeriod p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002\u0005Ȉ\u0006ဉ\u0003", new Object[]{"bitField0_", "timestamp_", "image_", "title_", "subtitle_", "additionalText_", "accessibilityDescription_"});
        }
        if (iOrdinal == 3) {
            return new SocialAvailablePeriod();
        }
        if (iOrdinal == 4) {
            return new bn81(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (SocialAvailablePeriod.class) {
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

    public final TextWithOverride n() {
        TextWithOverride textWithOverride = this.accessibilityDescription_;
        return textWithOverride == null ? TextWithOverride.o() : textWithOverride;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.additionalText_;
    }

    public final EntityImageWithOverride q() {
        EntityImageWithOverride entityImageWithOverride = this.image_;
        return entityImageWithOverride == null ? EntityImageWithOverride.o() : entityImageWithOverride;
    }

    public final TextWithOverride r() {
        TextWithOverride textWithOverride = this.subtitle_;
        return textWithOverride == null ? TextWithOverride.o() : textWithOverride;
    }

    public final Timestamp s() {
        Timestamp timestamp = this.timestamp_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
