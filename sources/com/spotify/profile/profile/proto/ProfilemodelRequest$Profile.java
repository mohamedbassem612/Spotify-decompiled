package com.spotify.profile.profile.proto;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.h290;
import p.jf40;
import p.mta;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vzw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ProfilemodelRequest$Profile extends h implements v2j0 {
    public static final int ACCOUNT_ID_FIELD_NUMBER = 35;
    public static final int ALLOW_FOLLOWS_FIELD_NUMBER = 23;
    public static final int BIO_FIELD_NUMBER = 27;
    public static final int COLOR_FIELD_NUMBER = 16;
    private static final ProfilemodelRequest$Profile DEFAULT_INSTANCE;
    public static final int EDITABLE_FEATURES_FIELD_NUMBER = 34;
    public static final int EDIT_IMAGE_DISABLED_FIELD_NUMBER = 30;
    public static final int EDIT_NAME_DISABLED_FIELD_NUMBER = 29;
    public static final int EDIT_PROFILE_DISABLED_FIELD_NUMBER = 12;
    public static final int FOLLOWERS_COUNT_FIELD_NUMBER = 4;
    public static final int FOLLOWING_COUNT_FIELD_NUMBER = 5;
    public static final int FOLLOW_DISABLED_FIELD_NUMBER = 21;
    public static final int HAS_SPOTIFY_IMAGE_FIELD_NUMBER = 15;
    public static final int HAS_SPOTIFY_NAME_FIELD_NUMBER = 14;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int IS_CURRENT_USER_FIELD_NUMBER = 10;
    public static final int IS_DISMISSED_FIELD_NUMBER = 17;
    public static final int IS_FOLLOWING_FIELD_NUMBER = 6;
    public static final int IS_KID_FIELD_NUMBER = 32;
    public static final int IS_VERIFIED_FIELD_NUMBER = 11;
    public static final int LOCATION_FIELD_NUMBER = 26;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PRONOUNS_FIELD_NUMBER = 25;
    public static final int PUBLIC_PLAYLISTS_FIELD_NUMBER = 8;
    public static final int RECENTLY_PLAYED_ARTISTS_FIELD_NUMBER = 7;
    public static final int REPORT_ABUSE_DISABLED_FIELD_NUMBER = 13;
    public static final int SHOW_FOLLOWS_FIELD_NUMBER = 24;
    public static final int SOCIAL_HANDLE_FIELD_NUMBER = 33;
    public static final int SOCIAL_HANDLE_INFO_FIELD_NUMBER = 36;
    public static final int TOTAL_PUBLIC_PLAYLISTS_COUNT_FIELD_NUMBER = 9;
    public static final int URI_FIELD_NUMBER = 1;
    private static final c290 editableFeatures_converter_ = new mta((byte) 21);
    private boolean allowFollows_;
    private int bitField0_;
    private int color_;
    private boolean editImageDisabled_;
    private boolean editNameDisabled_;
    private boolean editProfileDisabled_;
    private int editableFeaturesMemoizedSerializedSize;
    private boolean followDisabled_;
    private int followersCount_;
    private int followingCount_;
    private boolean hasSpotifyImage_;
    private boolean hasSpotifyName_;
    private boolean isCurrentUser_;
    private boolean isDismissed_;
    private boolean isFollowing_;
    private boolean isKid_;
    private boolean isVerified_;
    private boolean reportAbuseDisabled_;
    private boolean showFollows_;
    private ProfilemodelRequest.SocialHandleInfo socialHandleInfo_;
    private int totalPublicPlaylistsCount_;
    private String uri_ = "";
    private String name_ = "";
    private String imageUrl_ = "";
    private h290 recentlyPlayedArtists_ = h.emptyProtobufList();
    private h290 publicPlaylists_ = h.emptyProtobufList();
    private String pronouns_ = "";
    private String location_ = "";
    private String bio_ = "";
    private String socialHandle_ = "";
    private b290 editableFeatures_ = h.emptyIntList();
    private String accountId_ = "";

    static {
        ProfilemodelRequest$Profile profilemodelRequest$Profile = new ProfilemodelRequest$Profile();
        DEFAULT_INSTANCE = profilemodelRequest$Profile;
        h.registerDefaultInstance(ProfilemodelRequest$Profile.class, profilemodelRequest$Profile);
    }

    private ProfilemodelRequest$Profile() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final h290 A() {
        return this.recentlyPlayedArtists_;
    }

    public final boolean B() {
        return this.reportAbuseDisabled_;
    }

    public final String C() {
        return this.socialHandle_;
    }

    public final ProfilemodelRequest.SocialHandleInfo D() {
        ProfilemodelRequest.SocialHandleInfo socialHandleInfo = this.socialHandleInfo_;
        return socialHandleInfo == null ? ProfilemodelRequest.SocialHandleInfo.n() : socialHandleInfo;
    }

    public final int E() {
        return this.totalPublicPlaylistsCount_;
    }

    public final boolean F() {
        return (this.bitField0_ & 1) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001e\u0000\u0001\u0001$\u001e\u0000\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\u0004\u0006\u0007\u0007\u001b\b\u001b\t\u0004\n\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0007\u000f\u0007\u0010\u0004\u0011\u0007\u0015\u0007\u0017\u0007\u0018\u0007\u0019Ȉ\u001aȈ\u001bȈ\u001d\u0007\u001e\u0007 \u0007!Ȉ\",#Ȉ$ဉ\u0000", new Object[]{"bitField0_", "uri_", "name_", "imageUrl_", "followersCount_", "followingCount_", "isFollowing_", "recentlyPlayedArtists_", ArtistlistResponse$Artist.class, "publicPlaylists_", PlaylistlistResponse$Playlist.class, "totalPublicPlaylistsCount_", "isCurrentUser_", "isVerified_", "editProfileDisabled_", "reportAbuseDisabled_", "hasSpotifyName_", "hasSpotifyImage_", "color_", "isDismissed_", "followDisabled_", "allowFollows_", "showFollows_", "pronouns_", "location_", "bio_", "editNameDisabled_", "editImageDisabled_", "isKid_", "socialHandle_", "editableFeatures_", "accountId_", "socialHandleInfo_"});
        }
        if (iOrdinal == 3) {
            return new ProfilemodelRequest$Profile();
        }
        if (iOrdinal == 4) {
            return new vzw0(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (ProfilemodelRequest$Profile.class) {
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

    public final int getColor() {
        return this.color_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final boolean getIsFollowing() {
        return this.isFollowing_;
    }

    public final String getName() {
        return this.name_;
    }

    public final boolean getShowFollows() {
        return this.showFollows_;
    }

    public final String n() {
        return this.accountId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.bio_;
    }

    public final boolean p() {
        return this.editProfileDisabled_;
    }

    public final d290 q() {
        return new d290(this.editableFeatures_, editableFeatures_converter_);
    }

    public final boolean r() {
        return this.followDisabled_;
    }

    public final int s() {
        return this.followersCount_;
    }

    public final int t() {
        return this.followingCount_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.hasSpotifyImage_;
    }

    public final boolean v() {
        return this.isDismissed_;
    }

    public final boolean w() {
        return this.isKid_;
    }

    public final boolean x() {
        return this.isVerified_;
    }

    public final String y() {
        return this.location_;
    }

    public final String z() {
        return this.pronouns_;
    }
}
