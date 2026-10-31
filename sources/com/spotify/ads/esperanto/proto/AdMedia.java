package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.j;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class AdMedia extends h implements v2j0 {
    public static final int AUDIO_FILE_ID_FIELD_NUMBER = 7;
    public static final int BITRATE_FIELD_NUMBER = 2;
    private static final AdMedia DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 3;
    public static final int HEIGHT_FIELD_NUMBER = 5;
    public static final int IMAGE_FILE_ID_FIELD_NUMBER = 8;
    public static final int MIME_TYPE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 6;
    public static final int VIDEO_MANIFEST_ID_FIELD_NUMBER = 10;
    public static final int WIDTH_FIELD_NUMBER = 4;
    private int bitrate_;
    private long duration_;
    private int height_;
    private Object mediaFile_;
    private int width_;
    private int mediaFileCase_ = 0;
    private String mimeType_ = "";

    static {
        AdMedia adMedia = new AdMedia();
        DEFAULT_INSTANCE = adMedia;
        h.registerDefaultInstance(AdMedia.class, adMedia);
    }

    private AdMedia() {
    }

    public static AdMedia o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0003\u0004\u0004\u0005\u0004\u0006Ȼ\u0000\u0007Ȼ\u0000\bȻ\u0000\tȻ\u0000\nȻ\u0000", new Object[]{"mediaFile_", "mediaFileCase_", "mimeType_", "bitrate_", "duration_", "width_", "height_"});
        }
        if (iOrdinal == 3) {
            return new AdMedia();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (AdMedia.class) {
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

    public final String getUrl() {
        return this.mediaFileCase_ == 6 ? (String) this.mediaFile_ : "";
    }

    public final boolean hasUrl() {
        return this.mediaFileCase_ == 6;
    }

    public final int n() {
        return this.bitrate_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long p() {
        return this.duration_;
    }

    public final int q() {
        return this.height_;
    }

    public final String r() {
        return this.mediaFileCase_ == 8 ? (String) this.mediaFile_ : "";
    }

    public final String s() {
        return this.mimeType_;
    }

    public final String t() {
        return this.mediaFileCase_ == 9 ? (String) this.mediaFile_ : "";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.mediaFileCase_ == 10 ? (String) this.mediaFile_ : "";
    }

    public final int v() {
        return this.width_;
    }

    public final boolean w() {
        return this.mediaFileCase_ == 8;
    }

    public final boolean x() {
        return this.mediaFileCase_ == 10;
    }
}
