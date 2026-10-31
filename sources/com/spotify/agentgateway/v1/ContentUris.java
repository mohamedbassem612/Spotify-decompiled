package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.h4m;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ContentUris extends h implements v2j0 {
    private static final ContentUris DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_UPDATE_FIELD_NUMBER = 3;
    public static final int TARGET_PLAYLIST_URI_FIELD_NUMBER = 2;
    public static final int URIS_FIELD_NUMBER = 1;
    private Object decoration_;
    private int decorationCase_ = 0;
    private h290 uris_ = h.emptyProtobufList();
    private String targetPlaylistUri_ = "";

    static {
        ContentUris contentUris = new ContentUris();
        DEFAULT_INSTANCE = contentUris;
        h.registerDefaultInstance(ContentUris.class, contentUris);
    }

    private ContentUris() {
    }

    public static ContentUris n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002Ȉ\u0003<\u0000", new Object[]{"decoration_", "decorationCase_", "uris_", "targetPlaylistUri_", PlaylistUpdate.class});
        }
        if (iOrdinal == 3) {
            return new ContentUris();
        }
        if (iOrdinal == 4) {
            return new h4m(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (ContentUris.class) {
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

    public final List getUrisList() {
        return this.uris_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final PlaylistUpdate o() {
        return this.decorationCase_ == 3 ? (PlaylistUpdate) this.decoration_ : PlaylistUpdate.n();
    }

    public final String p() {
        return this.targetPlaylistUri_;
    }

    public final boolean q() {
        return this.decorationCase_ == 3;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
