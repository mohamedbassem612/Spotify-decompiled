package com.spotify.upcomingreleases.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.lyv0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Prerelease extends h implements v2j0 {
    public static final int ALBUM_URI_FIELD_NUMBER = 2;
    public static final int ARTISTS_FIELD_NUMBER = 6;
    public static final int COVER_URL_FIELD_NUMBER = 3;
    private static final Prerelease DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYABLE_TRACK_URIS_FIELD_NUMBER = 7;
    public static final int PRESAVE_COUNT_FIELD_NUMBER = 8;
    public static final int RELEASE_DATE_FIELD_NUMBER = 5;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private long presaveCount_;
    private Timestamp releaseDate_;
    private String uri_ = "";
    private String albumUri_ = "";
    private String coverUrl_ = "";
    private String name_ = "";
    private h290 artists_ = h.emptyProtobufList();
    private h290 playableTrackUris_ = h.emptyProtobufList();

    static {
        Prerelease prerelease = new Prerelease();
        DEFAULT_INSTANCE = prerelease;
        h.registerDefaultInstance(Prerelease.class, prerelease);
    }

    private Prerelease() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000\u0006\u001b\u0007Ț\bဂ\u0001", new Object[]{"bitField0_", "uri_", "albumUri_", "coverUrl_", "name_", "releaseDate_", "artists_", Artist.class, "playableTrackUris_", "presaveCount_"});
        }
        if (iOrdinal == 3) {
            return new Prerelease();
        }
        if (iOrdinal == 4) {
            return new lyv0(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (Prerelease.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final String n() {
        return this.albumUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.coverUrl_;
    }

    public final h290 p() {
        return this.playableTrackUris_;
    }

    public final long q() {
        return this.presaveCount_;
    }

    public final Timestamp r() {
        Timestamp timestamp = this.releaseDate_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
