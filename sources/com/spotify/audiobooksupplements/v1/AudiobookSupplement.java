package com.spotify.audiobooksupplements.v1;

import com.google.protobuf.h;
import p.bf40;
import p.hw7;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class AudiobookSupplement extends h implements v2j0 {
    private static final AudiobookSupplement DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 2;
    public static final int FILE_SIZE_FIELD_NUMBER = 4;
    public static final int MIME_TYPE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private int fileSize_;
    private String url_ = "";
    private String fileName_ = "";
    private String mimeType_ = "";

    static {
        AudiobookSupplement audiobookSupplement = new AudiobookSupplement();
        DEFAULT_INSTANCE = audiobookSupplement;
        h.registerDefaultInstance(AudiobookSupplement.class, audiobookSupplement);
    }

    private AudiobookSupplement() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004", new Object[]{"url_", "fileName_", "mimeType_", "fileSize_"});
        }
        if (iOrdinal == 3) {
            return new AudiobookSupplement();
        }
        if (iOrdinal == 4) {
            return new hw7(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (AudiobookSupplement.class) {
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
        return this.fileName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.fileSize_;
    }

    public final String p() {
        return this.mimeType_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
