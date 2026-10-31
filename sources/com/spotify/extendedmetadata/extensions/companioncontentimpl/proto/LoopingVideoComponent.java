package com.spotify.extendedmetadata.extensions.companioncontentimpl.proto;

import p.bf40;
import p.jf40;
import p.n7f0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vne0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class LoopingVideoComponent extends com.google.protobuf.h implements v2j0 {
    public static final int ALT_TEXT_FIELD_NUMBER = 2;
    public static final int CAPTION_FIELD_NUMBER = 3;
    private static final LoopingVideoComponent DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VIDEO_URL_FIELD_NUMBER = 1;
    public static final int VIEW_MODE_FIELD_NUMBER = 4;
    private int bitField0_;
    private int viewMode_;
    private String videoUrl_ = "";
    private String altText_ = "";
    private String caption_ = "";

    static {
        LoopingVideoComponent loopingVideoComponent = new LoopingVideoComponent();
        DEFAULT_INSTANCE = loopingVideoComponent;
        com.google.protobuf.h.registerDefaultInstance(LoopingVideoComponent.class, loopingVideoComponent);
    }

    private LoopingVideoComponent() {
    }

    public static LoopingVideoComponent p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004\f", new Object[]{"bitField0_", "videoUrl_", "altText_", "caption_", "viewMode_"});
        }
        if (iOrdinal == 3) {
            return new LoopingVideoComponent();
        }
        if (iOrdinal == 4) {
            return new vne0(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (LoopingVideoComponent.class) {
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

    public final String o() {
        return this.caption_;
    }

    public final String q() {
        return this.videoUrl_;
    }

    public final n7f0 r() {
        n7f0 n7f0Var;
        int i = this.viewMode_;
        if (i == 0) {
            n7f0Var = n7f0.UNSPECIFIED;
        } else if (i != 1) {
            n7f0Var = i != 2 ? null : n7f0.FULL_SCREEN;
        } else {
            n7f0Var = n7f0.ARTWORK;
        }
        return n7f0Var == null ? n7f0.UNRECOGNIZED : n7f0Var;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
