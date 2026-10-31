package com.spotify.userinteractivityservice.usercomments.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s6i1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class UserAuthorMetadata extends h implements v2j0 {
    private static final UserAuthorMetadata DEFAULT_INSTANCE;
    public static final int DISPLAY_MEMBERSHIP_BADGE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int USER_COVER_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int USER_FULL_NAME_FIELD_NUMBER = 2;
    private boolean displayMembershipBadge_;
    private String username_ = "";
    private String userFullName_ = "";
    private String userCoverImageUrl_ = "";

    static {
        UserAuthorMetadata userAuthorMetadata = new UserAuthorMetadata();
        DEFAULT_INSTANCE = userAuthorMetadata;
        h.registerDefaultInstance(UserAuthorMetadata.class, userAuthorMetadata);
    }

    private UserAuthorMetadata() {
    }

    public static UserAuthorMetadata n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static s6i1 r() {
        return (s6i1) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007", new Object[]{"username_", "userFullName_", "userCoverImageUrl_", "displayMembershipBadge_"});
        }
        if (iOrdinal == 3) {
            return new UserAuthorMetadata();
        }
        if (iOrdinal == 4) {
            return new s6i1(DEFAULT_INSTANCE);
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
        synchronized (UserAuthorMetadata.class) {
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

    public final String getUsername() {
        return this.username_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.displayMembershipBadge_;
    }

    public final String p() {
        return this.userCoverImageUrl_;
    }

    public final String q() {
        return this.userFullName_;
    }

    public final void s(String str) {
        this.userCoverImageUrl_ = str;
    }

    public final void t(String str) {
        this.userFullName_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.username_ = str;
    }
}
