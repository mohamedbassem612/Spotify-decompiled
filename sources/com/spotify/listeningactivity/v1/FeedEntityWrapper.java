package com.spotify.listeningactivity.v1;

import com.google.protobuf.h;
import p.bf40;
import p.fs00;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class FeedEntityWrapper extends h implements v2j0 {
    private static final FeedEntityWrapper DEFAULT_INSTANCE;
    public static final int FOLLOW_ENTITY_FIELD_NUMBER = 2;
    public static final int GROUP_ENTITY_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int USER_ENTITY_FIELD_NUMBER = 1;
    private int entityCase_ = 0;
    private Object entity_;

    static {
        FeedEntityWrapper feedEntityWrapper = new FeedEntityWrapper();
        DEFAULT_INSTANCE = feedEntityWrapper;
        h.registerDefaultInstance(FeedEntityWrapper.class, feedEntityWrapper);
    }

    private FeedEntityWrapper() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"entity_", "entityCase_", UserFeedEntity.class, FollowFeedEntity.class, GroupFeedEntity.class});
        }
        if (iOrdinal == 3) {
            return new FeedEntityWrapper();
        }
        if (iOrdinal == 4) {
            return new fs00(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (FeedEntityWrapper.class) {
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

    public final FollowFeedEntity n() {
        return this.entityCase_ == 2 ? (FollowFeedEntity) this.entity_ : FollowFeedEntity.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final GroupFeedEntity o() {
        return this.entityCase_ == 3 ? (GroupFeedEntity) this.entity_ : GroupFeedEntity.o();
    }

    public final UserFeedEntity p() {
        return this.entityCase_ == 1 ? (UserFeedEntity) this.entity_ : UserFeedEntity.o();
    }

    public final boolean q() {
        return this.entityCase_ == 2;
    }

    public final boolean r() {
        return this.entityCase_ == 3;
    }

    public final boolean s() {
        return this.entityCase_ == 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
