package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import java.util.List;
import p.az91;
import p.bf40;
import p.h290;
import p.ia20;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class FriendsLeaderboard extends h implements v2j0 {
    public static final int CURRENT_USER_ITEM_FIELD_NUMBER = 2;
    public static final int DATA_TYPE_FIELD_NUMBER = 3;
    private static final FriendsLeaderboard DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private LeaderboardItem currentUserItem_;
    private int dataType_;
    private h290 items_ = h.emptyProtobufList();

    static {
        FriendsLeaderboard friendsLeaderboard = new FriendsLeaderboard();
        DEFAULT_INSTANCE = friendsLeaderboard;
        h.registerDefaultInstance(FriendsLeaderboard.class, friendsLeaderboard);
    }

    private FriendsLeaderboard() {
    }

    public static FriendsLeaderboard p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003\f", new Object[]{"bitField0_", "items_", LeaderboardItem.class, "currentUserItem_", "dataType_"});
        }
        if (iOrdinal == 3) {
            return new FriendsLeaderboard();
        }
        if (iOrdinal == 4) {
            return new ia20(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (FriendsLeaderboard.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    public final LeaderboardItem n() {
        LeaderboardItem leaderboardItem = this.currentUserItem_;
        return leaderboardItem == null ? LeaderboardItem.p() : leaderboardItem;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final az91 o() {
        az91 az91VarA = az91.a(this.dataType_);
        return az91VarA == null ? az91.UNRECOGNIZED : az91VarA;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
