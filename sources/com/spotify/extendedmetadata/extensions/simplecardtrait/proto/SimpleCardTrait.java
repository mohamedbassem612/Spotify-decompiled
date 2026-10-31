package com.spotify.extendedmetadata.extensions.simplecardtrait.proto;

import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.bn81;
import p.e131;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SimpleCardTrait extends h implements v2j0 {
    public static final int ACCESSIBILITY_FIELD_NUMBER = 6;
    public static final int ANIMATION_URL_FIELD_NUMBER = 11;
    public static final int CREATORS_FIELD_NUMBER = 8;
    private static final SimpleCardTrait DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 10;
    public static final int IMAGE_URI_FIELD_NUMBER = 1;
    public static final int LABELS_FIELD_NUMBER = 5;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PUBLISH_TIME_FIELD_NUMBER = 9;
    public static final int RESTRICTION_FIELD_NUMBER = 7;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TITLE_TEXT_COLOR_FIELD_NUMBER = 12;
    private int bitField0_;
    private Duration duration_;
    private Timestamp publishTime_;
    private int restriction_;
    private String imageUri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String navigationUri_ = "";
    private h290 labels_ = h.emptyProtobufList();
    private String accessibility_ = "";
    private h290 creators_ = h.emptyProtobufList();
    private String animationUrl_ = "";
    private String titleTextColor_ = "";

    static {
        SimpleCardTrait simpleCardTrait = new SimpleCardTrait();
        DEFAULT_INSTANCE = simpleCardTrait;
        h.registerDefaultInstance(SimpleCardTrait.class, simpleCardTrait);
    }

    private SimpleCardTrait() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static SimpleCardTrait y(byte[] bArr) {
        return (SimpleCardTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u001b\u0006Ȉ\u0007\f\b\u001b\tဉ\u0000\nဉ\u0001\u000bለ\u0002\fለ\u0003", new Object[]{"bitField0_", "imageUri_", "title_", "subtitle_", "navigationUri_", "labels_", Label.class, "accessibility_", "restriction_", "creators_", Creator.class, "publishTime_", "duration_", "animationUrl_", "titleTextColor_"});
        }
        if (iOrdinal == 3) {
            return new SimpleCardTrait();
        }
        if (iOrdinal == 4) {
            return new bn81((byte) 7);
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
        synchronized (SimpleCardTrait.class) {
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

    public final Duration getDuration() {
        Duration duration = this.duration_;
        return duration == null ? Duration.n() : duration;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.accessibility_;
    }

    public final String p() {
        return this.animationUrl_;
    }

    public final h290 q() {
        return this.creators_;
    }

    public final String r() {
        return this.imageUri_;
    }

    public final h290 s() {
        return this.labels_;
    }

    public final String t() {
        return this.navigationUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Timestamp u() {
        Timestamp timestamp = this.publishTime_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final e131 v() {
        e131 e131Var;
        int i = this.restriction_;
        if (i == 0) {
            e131Var = e131.NONE;
        } else if (i != 1) {
            e131Var = i != 2 ? null : e131.IS_19_PLUS;
        } else {
            e131Var = e131.IS_EXPLICIT;
        }
        return e131Var == null ? e131.UNRECOGNIZED : e131Var;
    }

    public final String w() {
        return this.titleTextColor_;
    }

    public final boolean x() {
        return (this.bitField0_ & 8) != 0;
    }
}
