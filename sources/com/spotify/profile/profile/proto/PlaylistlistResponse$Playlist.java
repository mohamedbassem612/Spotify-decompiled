package com.spotify.profile.profile.proto;

import com.google.protobuf.h;
import p.bf40;
import p.iqu0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PlaylistlistResponse$Playlist extends h implements v2j0 {
    private static final PlaylistlistResponse$Playlist DEFAULT_INSTANCE;
    public static final int FOLLOWERS_COUNT_FIELD_NUMBER = 4;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int IS_FOLLOWING_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int OWNER_NAME_FIELD_NUMBER = 5;
    public static final int OWNER_URI_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private int followersCount_;
    private boolean isFollowing_;
    private String uri_ = "";
    private String name_ = "";
    private String imageUrl_ = "";
    private String ownerName_ = "";
    private String ownerUri_ = "";

    static {
        PlaylistlistResponse$Playlist playlistlistResponse$Playlist = new PlaylistlistResponse$Playlist();
        DEFAULT_INSTANCE = playlistlistResponse$Playlist;
        h.registerDefaultInstance(PlaylistlistResponse$Playlist.class, playlistlistResponse$Playlist);
    }

    private PlaylistlistResponse$Playlist() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007\u0007", new Object[]{"uri_", "name_", "imageUrl_", "followersCount_", "ownerName_", "ownerUri_", "isFollowing_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistlistResponse$Playlist();
        }
        if (iOrdinal == 4) {
            return new iqu0(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (PlaylistlistResponse$Playlist.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final int n() {
        return this.followersCount_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.ownerName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
