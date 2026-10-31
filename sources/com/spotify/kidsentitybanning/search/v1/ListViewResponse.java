package com.spotify.kidsentitybanning.search.v1;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.ghc0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ListViewResponse extends h implements v2j0 {
    public static final int ARTISTS_FIELD_NUMBER = 4;
    public static final int CHILD_DISPLAY_NAME_FIELD_NUMBER = 1;
    private static final ListViewResponse DEFAULT_INSTANCE;
    public static final int IS_EXPLICIT_ALLOWED_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TRACKS_FIELD_NUMBER = 3;
    private boolean isExplicitAllowed_;
    private String childDisplayName_ = "";
    private h290 tracks_ = h.emptyProtobufList();
    private h290 artists_ = h.emptyProtobufList();

    static {
        ListViewResponse listViewResponse = new ListViewResponse();
        DEFAULT_INSTANCE = listViewResponse;
        h.registerDefaultInstance(ListViewResponse.class, listViewResponse);
    }

    private ListViewResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002\u0007\u0003\u001b\u0004\u001b", new Object[]{"childDisplayName_", "isExplicitAllowed_", "tracks_", HubTrack.class, "artists_", HubArtist.class});
        }
        if (iOrdinal == 3) {
            return new ListViewResponse();
        }
        if (iOrdinal == 4) {
            return new ghc0(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (ListViewResponse.class) {
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

    public final List getArtistsList() {
        return this.artists_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final List getTracksList() {
        return this.tracks_;
    }

    public final String n() {
        return this.childDisplayName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.isExplicitAllowed_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
