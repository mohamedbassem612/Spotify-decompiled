package com.spotify.playlist.policy.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qyg;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class CollaboratorPolicy extends h implements v2j0 {
    private static final CollaboratorPolicy DEFAULT_INSTANCE;
    public static final int IS_OWNER_FIELD_NUMBER = 5;
    public static final int NUMBER_OF_EPISODES_FIELD_NUMBER = 4;
    public static final int NUMBER_OF_ITEMS_FIELD_NUMBER = 2;
    public static final int NUMBER_OF_TRACKS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int USER_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isOwner_;
    private boolean numberOfEpisodes_;
    private boolean numberOfItems_;
    private boolean numberOfTracks_;
    private UserDecorationPolicy user_;

    static {
        CollaboratorPolicy collaboratorPolicy = new CollaboratorPolicy();
        DEFAULT_INSTANCE = collaboratorPolicy;
        h.registerDefaultInstance(CollaboratorPolicy.class, collaboratorPolicy);
    }

    private CollaboratorPolicy() {
    }

    public static CollaboratorPolicy n() {
        return DEFAULT_INSTANCE;
    }

    public static qyg p() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"bitField0_", "user_", "numberOfItems_", "numberOfTracks_", "numberOfEpisodes_", "isOwner_"});
        }
        if (iOrdinal == 3) {
            return new CollaboratorPolicy();
        }
        if (iOrdinal == 4) {
            return new qyg(DEFAULT_INSTANCE);
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
        synchronized (CollaboratorPolicy.class) {
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

    public final UserDecorationPolicy o() {
        UserDecorationPolicy userDecorationPolicy = this.user_;
        return userDecorationPolicy == null ? UserDecorationPolicy.n() : userDecorationPolicy;
    }

    public final void q() {
        this.isOwner_ = true;
    }

    public final void r() {
        this.numberOfEpisodes_ = true;
    }

    public final void s() {
        this.numberOfTracks_ = true;
    }

    public final void t(UserDecorationPolicy userDecorationPolicy) {
        userDecorationPolicy.getClass();
        this.user_ = userDecorationPolicy;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
