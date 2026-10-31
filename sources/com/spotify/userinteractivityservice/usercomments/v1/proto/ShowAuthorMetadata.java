package com.spotify.userinteractivityservice.usercomments.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mn71;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ShowAuthorMetadata extends h implements v2j0 {
    private static final ShowAuthorMetadata DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_COVER_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int SHOW_FULL_NAME_FIELD_NUMBER = 2;
    public static final int SHOW_URI_FIELD_NUMBER = 1;
    private String showUri_ = "";
    private String showFullName_ = "";
    private String showCoverImageUrl_ = "";

    static {
        ShowAuthorMetadata showAuthorMetadata = new ShowAuthorMetadata();
        DEFAULT_INSTANCE = showAuthorMetadata;
        h.registerDefaultInstance(ShowAuthorMetadata.class, showAuthorMetadata);
    }

    private ShowAuthorMetadata() {
    }

    public static ShowAuthorMetadata n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"showUri_", "showFullName_", "showCoverImageUrl_"});
        }
        if (iOrdinal == 3) {
            return new ShowAuthorMetadata();
        }
        if (iOrdinal == 4) {
            return new mn71(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (ShowAuthorMetadata.class) {
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

    public final String o() {
        return this.showCoverImageUrl_;
    }

    public final String p() {
        return this.showFullName_;
    }

    public final String q() {
        return this.showUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
