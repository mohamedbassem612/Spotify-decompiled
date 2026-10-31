package com.spotify.allcap.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vzw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ProgressBarSegment extends h implements v2j0 {
    private static final ProgressBarSegment DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PROGRESS_BAR_COLOR_FIELD_NUMBER = 3;
    public static final int USED_PERCENTAGE_FIELD_NUMBER = 1;
    public static final int WIDTH_PERCENTAGE_FIELD_NUMBER = 4;
    private int bitField0_;
    private String label_ = "";
    private String progressBarColor_ = "";
    private float usedPercentage_;
    private float widthPercentage_;

    static {
        ProgressBarSegment progressBarSegment = new ProgressBarSegment();
        DEFAULT_INSTANCE = progressBarSegment;
        h.registerDefaultInstance(ProgressBarSegment.class, progressBarSegment);
    }

    private ProgressBarSegment() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002Ȉ\u0003ለ\u0000\u0004ခ\u0001", new Object[]{"bitField0_", "usedPercentage_", "label_", "progressBarColor_", "widthPercentage_"});
        }
        if (iOrdinal == 3) {
            return new ProgressBarSegment();
        }
        if (iOrdinal == 4) {
            return new vzw0(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (ProgressBarSegment.class) {
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

    public final String n() {
        return this.label_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.progressBarColor_;
    }

    public final float p() {
        return this.usedPercentage_;
    }

    public final float q() {
        return this.widthPercentage_;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
