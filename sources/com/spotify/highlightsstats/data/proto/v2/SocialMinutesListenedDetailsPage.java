package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import p.bf40;
import p.bn81;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SocialMinutesListenedDetailsPage extends h implements v2j0 {
    private static final SocialMinutesListenedDetailsPage DEFAULT_INSTANCE;
    public static final int FRIENDS_LEADERBOARD_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private FriendsLeaderboard friendsLeaderboard_;

    static {
        SocialMinutesListenedDetailsPage socialMinutesListenedDetailsPage = new SocialMinutesListenedDetailsPage();
        DEFAULT_INSTANCE = socialMinutesListenedDetailsPage;
        h.registerDefaultInstance(SocialMinutesListenedDetailsPage.class, socialMinutesListenedDetailsPage);
    }

    private SocialMinutesListenedDetailsPage() {
    }

    public static SocialMinutesListenedDetailsPage n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "friendsLeaderboard_"});
        }
        if (iOrdinal == 3) {
            return new SocialMinutesListenedDetailsPage();
        }
        if (iOrdinal == 4) {
            return new bn81(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (SocialMinutesListenedDetailsPage.class) {
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

    public final FriendsLeaderboard o() {
        FriendsLeaderboard friendsLeaderboard = this.friendsLeaderboard_;
        return friendsLeaderboard == null ? FriendsLeaderboard.p() : friendsLeaderboard;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
