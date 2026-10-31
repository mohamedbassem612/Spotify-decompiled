package com.spotify.profile.profile.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vzw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ProfilelistResponse$SmallProfile extends h implements v2j0 {
    public static final int COLOR_FIELD_NUMBER = 11;
    private static final ProfilelistResponse$SmallProfile DEFAULT_INSTANCE;
    public static final int FOLLOWERS_COUNT_FIELD_NUMBER = 4;
    public static final int FOLLOWING_COUNT_FIELD_NUMBER = 5;
    public static final int FOLLOW_DISABLED_FIELD_NUMBER = 10;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    public static final int IS_DISMISSED_FIELD_NUMBER = 8;
    public static final int IS_FOLLOWED_FIELD_NUMBER = 6;
    public static final int IS_FOLLOWING_FIELD_NUMBER = 7;
    public static final int IS_VERIFIED_FIELD_NUMBER = 9;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private int color_;
    private boolean followDisabled_;
    private int followersCount_;
    private int followingCount_;
    private boolean isDismissed_;
    private boolean isFollowed_;
    private boolean isFollowing_;
    private boolean isVerified_;
    private String uri_ = "";
    private String name_ = "";
    private String imageUrl_ = "";

    static {
        ProfilelistResponse$SmallProfile profilelistResponse$SmallProfile = new ProfilelistResponse$SmallProfile();
        DEFAULT_INSTANCE = profilelistResponse$SmallProfile;
        h.registerDefaultInstance(ProfilelistResponse$SmallProfile.class, profilelistResponse$SmallProfile);
    }

    private ProfilelistResponse$SmallProfile() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\u0004\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0004", new Object[]{"uri_", "name_", "imageUrl_", "followersCount_", "followingCount_", "isFollowed_", "isFollowing_", "isDismissed_", "isVerified_", "followDisabled_", "color_"});
        }
        if (iOrdinal == 3) {
            return new ProfilelistResponse$SmallProfile();
        }
        if (iOrdinal == 4) {
            return new vzw0(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (ProfilelistResponse$SmallProfile.class) {
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

    public final boolean getIsFollowing() {
        return this.isFollowing_;
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

    public final int o() {
        return this.followingCount_;
    }

    public final boolean p() {
        return this.isDismissed_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
