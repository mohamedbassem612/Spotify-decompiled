package com.spotify.searchview.proto;

import com.google.protobuf.Timestamp;
import p.a53;
import p.bf40;
import p.e53;
import p.g53;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Album extends com.google.protobuf.h implements v2j0 {
    public static final int ALBUM_ARTISTS_FIELD_NUMBER = 7;
    public static final int ARTIST_NAMES_FIELD_NUMBER = 1;
    private static final Album DEFAULT_INSTANCE;
    public static final int EXPLICIT_FIELD_NUMBER = 10;
    public static final int FOLLOWERSCOUNT_FIELD_NUMBER = 8;
    public static final int MOGEF19_FIELD_NUMBER = 12;
    private static volatile qzr0 PARSER = null;
    public static final int PREMIUM_ONLY_FIELD_NUMBER = 9;
    public static final int RELEASE_SIGNIFIER_TEXT_FIELD_NUMBER = 11;
    public static final int RELEASE_TIME_FIELD_NUMBER = 5;
    public static final int RELEASE_YEAR_FIELD_NUMBER = 3;
    public static final int STATE_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int USER_COUNTRY_RELEASE_ISO_TIME_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean explicit_;
    private long followersCount_;
    private boolean mogef19_;
    private boolean premiumOnly_;
    private Timestamp releaseTime_;
    private int releaseYear_;
    private int state_;
    private int type_;
    private h290 artistNames_ = com.google.protobuf.h.emptyProtobufList();
    private String userCountryReleaseIsoTime_ = "";
    private h290 albumArtists_ = com.google.protobuf.h.emptyProtobufList();
    private String releaseSignifierText_ = "";

    static {
        Album album = new Album();
        DEFAULT_INSTANCE = album;
        com.google.protobuf.h.registerDefaultInstance(Album.class, album);
    }

    private Album() {
    }

    public static Album o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0002\u0000\u0001Ț\u0002\f\u0003\u0004\u0004\f\u0005ဉ\u0000\u0006Ȉ\u0007\u001b\b\u0002\t\u0007\n\u0007\u000bȈ\f\u0007", new Object[]{"bitField0_", "artistNames_", "type_", "releaseYear_", "state_", "releaseTime_", "userCountryReleaseIsoTime_", "albumArtists_", RelatedEntity.class, "followersCount_", "premiumOnly_", "explicit_", "releaseSignifierText_", "mogef19_"});
        }
        if (iOrdinal == 3) {
            return new Album();
        }
        if (iOrdinal == 4) {
            return new a53(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (Album.class) {
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

    public final h290 n() {
        return this.albumArtists_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean p() {
        return this.explicit_;
    }

    public final boolean q() {
        return this.mogef19_;
    }

    public final boolean r() {
        return this.premiumOnly_;
    }

    public final e53 s() {
        e53 e53Var;
        int i = this.state_;
        if (i == 0) {
            e53Var = e53.UNKNOWN;
        } else if (i != 1) {
            e53Var = i != 2 ? null : e53.LIVE;
        } else {
            e53Var = e53.PRERELEASE;
        }
        return e53Var == null ? e53.UNRECOGNIZED : e53Var;
    }

    public final g53 t() {
        g53 g53Var;
        switch (this.type_) {
            case 0:
                g53Var = g53.UNDEFINED;
                break;
            case 1:
                g53Var = g53.ALBUM;
                break;
            case 2:
                g53Var = g53.SINGLE;
                break;
            case 3:
                g53Var = g53.COMPILATION;
                break;
            case 4:
                g53Var = g53.EP;
                break;
            case 5:
                g53Var = g53.AUDIOBOOK;
                break;
            case 6:
                g53Var = g53.PODCAST;
                break;
            default:
                g53Var = null;
                break;
        }
        return g53Var == null ? g53.UNRECOGNIZED : g53Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.userCountryReleaseIsoTime_;
    }
}
