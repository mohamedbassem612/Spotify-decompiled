package com.spotify.savetospotify.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rwt0;
import p.s2j0;
import p.v2j0;
import p.y070;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class HttpGetShowResponse extends h implements v2j0 {
    public static final int COVER_IMAGE_URL_FIELD_NUMBER = 5;
    public static final int CREATED_AT_FIELD_NUMBER = 6;
    private static final HttpGetShowResponse DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int LANGUAGE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_CONTROL_FIELD_NUMBER = 7;
    public static final int SHOW_URI_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private Timestamp createdAt_;
    private int playbackControl_;
    private String showUri_ = "";
    private String title_ = "";
    private String description_ = "";
    private String language_ = "";
    private String coverImageUrl_ = "";

    static {
        HttpGetShowResponse httpGetShowResponse = new HttpGetShowResponse();
        DEFAULT_INSTANCE = httpGetShowResponse;
        h.registerDefaultInstance(HttpGetShowResponse.class, httpGetShowResponse);
    }

    private HttpGetShowResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0000\u0007\f", new Object[]{"bitField0_", "showUri_", "title_", "description_", "language_", "coverImageUrl_", "createdAt_", "playbackControl_"});
        }
        if (iOrdinal == 3) {
            return new HttpGetShowResponse();
        }
        if (iOrdinal == 4) {
            return new y070(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (HttpGetShowResponse.class) {
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

    public final rwt0 n() {
        rwt0 rwt0Var;
        int i = this.playbackControl_;
        if (i == 0) {
            rwt0Var = rwt0.PLAYBACK_CONTROL_UNSPECIFIED;
        } else if (i != 1) {
            rwt0Var = i != 2 ? null : rwt0.PLAYBACK_CONTROL_DEFAULT;
        } else {
            rwt0Var = rwt0.PLAYBACK_CONTROL_CHAPTER_SKIP;
        }
        return rwt0Var == null ? rwt0.UNRECOGNIZED : rwt0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
