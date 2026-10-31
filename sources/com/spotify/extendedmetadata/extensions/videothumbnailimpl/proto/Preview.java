package com.spotify.extendedmetadata.extensions.videothumbnailimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lyv0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Preview extends h implements v2j0 {
    public static final int AUDIO_PREVIEW_FIELD_NUMBER = 3;
    private static final Preview DEFAULT_INSTANCE;
    public static final int IMAGE_PREVIEW_FIELD_NUMBER = 2;
    public static final int ORIGIN_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PREVIEW_ID_FIELD_NUMBER = 5;
    public static final int VIDEO_PREVIEW_FIELD_NUMBER = 1;
    private int origin_;
    private int previewCase_ = 0;
    private String previewId_ = "";
    private Object preview_;

    static {
        Preview preview = new Preview();
        DEFAULT_INSTANCE = preview;
        h.registerDefaultInstance(Preview.class, preview);
    }

    private Preview() {
    }

    public static Preview n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\f\u0005Ȉ", new Object[]{"preview_", "previewCase_", Video.class, Image.class, Audio.class, "origin_", "previewId_"});
        }
        if (iOrdinal == 3) {
            return new Preview();
        }
        if (iOrdinal == 4) {
            return new lyv0(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (Preview.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Image o() {
        return this.previewCase_ == 2 ? (Image) this.preview_ : Image.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
