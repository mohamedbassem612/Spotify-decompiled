package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.a01;
import p.bf40;
import p.cjj0;
import p.eog0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r730;
import p.s2j0;
import p.v2j0;
import p.vls0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class Member extends h implements v2j0 {
    private static final Member DEFAULT_INSTANCE;
    public static final int FOLLOW_STATE_FIELD_NUMBER = 5;
    public static final int IS_OWNER_FIELD_NUMBER = 2;
    public static final int NUM_EPISODES_FIELD_NUMBER = 4;
    public static final int NUM_TRACKS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PERMISSION_LEVEL_FIELD_NUMBER = 6;
    public static final int USER_FIELD_NUMBER = 1;
    private int bitField0_;
    private int followState_;
    private boolean isOwner_;
    private int numEpisodes_;
    private int numTracks_;
    private int permissionLevel_;
    private User user_;

    static {
        Member member = new Member();
        DEFAULT_INSTANCE = member;
        h.registerDefaultInstance(Member.class, member);
    }

    private Member() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"bitField0_", "user_", "isOwner_", "numTracks_", "numEpisodes_", "followState_", a01.i, "permissionLevel_", cjj0.l});
        }
        if (iOrdinal == 3) {
            return new Member();
        }
        if (iOrdinal == 4) {
            return new eog0(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (Member.class) {
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

    public final int getNumEpisodes() {
        return this.numEpisodes_;
    }

    public final r730 n() {
        r730 r730VarA = r730.a(this.followState_);
        return r730VarA == null ? r730.b : r730VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.isOwner_;
    }

    public final int p() {
        return this.numTracks_;
    }

    public final vls0 q() {
        vls0 vls0VarA = vls0.a(this.permissionLevel_);
        return vls0VarA == null ? vls0.b : vls0VarA;
    }

    public final User r() {
        User user = this.user_;
        return user == null ? User.o() : user;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
