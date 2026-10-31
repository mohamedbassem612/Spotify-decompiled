package com.spotify.notifications.datasource.proto;

import com.google.protobuf.h;
import p.bf40;
import p.eog0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class MediaContent extends h implements v2j0 {
    public static final int ALT_TEXT_FIELD_NUMBER = 5;
    private static final MediaContent DEFAULT_INSTANCE;
    public static final int MIME_TYPE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int THUMBNAIL_URL_FIELD_NUMBER = 4;
    public static final int TTL_SECONDS_FIELD_NUMBER = 2;
    public static final int URL_FIELD_NUMBER = 1;
    private int ttlSeconds_;
    private String url_ = "";
    private String mimeType_ = "";
    private String thumbnailUrl_ = "";
    private String altText_ = "";

    static {
        MediaContent mediaContent = new MediaContent();
        DEFAULT_INSTANCE = mediaContent;
        h.registerDefaultInstance(MediaContent.class, mediaContent);
    }

    private MediaContent() {
    }

    public static MediaContent o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"url_", "ttlSeconds_", "mimeType_", "thumbnailUrl_", "altText_"});
        }
        if (iOrdinal == 3) {
            return new MediaContent();
        }
        if (iOrdinal == 4) {
            return new eog0(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (MediaContent.class) {
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
        return this.url_;
    }

    public final String n() {
        return this.altText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.mimeType_;
    }

    public final String q() {
        return this.thumbnailUrl_;
    }

    public final int r() {
        return this.ttlSeconds_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
