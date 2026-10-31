package com.spotify.corex.readalongtranscript.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vne0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class LoopingVideoSection extends h implements v2j0 {
    public static final int ALT_TEXT_FIELD_NUMBER = 2;
    public static final int ASPECT_RATIO_FIELD_NUMBER = 4;
    public static final int CAPTION_FIELD_NUMBER = 3;
    private static final LoopingVideoSection DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VIDEO_URL_FIELD_NUMBER = 1;
    private double aspectRatio_;
    private int bitField0_;
    private String videoUrl_ = "";
    private String altText_ = "";
    private String caption_ = "";

    static {
        LoopingVideoSection loopingVideoSection = new LoopingVideoSection();
        DEFAULT_INSTANCE = loopingVideoSection;
        h.registerDefaultInstance(LoopingVideoSection.class, loopingVideoSection);
    }

    private LoopingVideoSection() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static LoopingVideoSection q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004က\u0001", new Object[]{"bitField0_", "videoUrl_", "altText_", "caption_", "aspectRatio_"});
        }
        if (iOrdinal == 3) {
            return new LoopingVideoSection();
        }
        if (iOrdinal == 4) {
            return new vne0(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (LoopingVideoSection.class) {
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
        return this.altText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final double o() {
        return this.aspectRatio_;
    }

    public final String p() {
        return this.caption_;
    }

    public final String r() {
        return this.videoUrl_;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
