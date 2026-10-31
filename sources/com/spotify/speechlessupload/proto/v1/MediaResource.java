package com.spotify.speechlessupload.proto.v1;

import com.google.protobuf.Duration;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rxh1;
import p.s2j0;
import p.suh0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class MediaResource extends h implements v2j0 {
    private static final MediaResource DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 4;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int UPLOAD_SOURCE_FIELD_NUMBER = 5;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private int bitField0_;
    private Duration duration_;
    private int height_;
    private int uploadSource_;
    private String url_ = "";
    private int width_;

    static {
        MediaResource mediaResource = new MediaResource();
        DEFAULT_INSTANCE = mediaResource;
        h.registerDefaultInstance(MediaResource.class, mediaResource);
    }

    private MediaResource() {
    }

    public static suh0 n() {
        return (suh0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004ဉ\u0000\u0005\f", new Object[]{"bitField0_", "url_", "width_", "height_", "duration_", "uploadSource_"});
        }
        if (iOrdinal == 3) {
            return new MediaResource();
        }
        if (iOrdinal == 4) {
            return new suh0(DEFAULT_INSTANCE);
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
        synchronized (MediaResource.class) {
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

    public final void o(Duration duration) {
        duration.getClass();
        this.duration_ = duration;
        this.bitField0_ |= 1;
    }

    public final void p(int i) {
        this.height_ = i;
    }

    public final void q(rxh1 rxh1Var) {
        this.uploadSource_ = rxh1Var.getNumber();
    }

    public final void r(String str) {
        str.getClass();
        this.url_ = str;
    }

    public final void s(int i) {
        this.width_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
