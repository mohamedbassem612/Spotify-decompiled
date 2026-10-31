package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.po01;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class RecentlyPlayedEntity extends h implements v2j0 {
    private static final RecentlyPlayedEntity DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TRACK_FIELD_NUMBER = 1;
    private int entityCase_ = 0;
    private Object entity_;

    static {
        RecentlyPlayedEntity recentlyPlayedEntity = new RecentlyPlayedEntity();
        DEFAULT_INSTANCE = recentlyPlayedEntity;
        h.registerDefaultInstance(RecentlyPlayedEntity.class, recentlyPlayedEntity);
    }

    private RecentlyPlayedEntity() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"entity_", "entityCase_", RecentlyPlayedTrack.class, RecentlyPlayedEpisode.class});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedEntity();
        }
        if (iOrdinal == 4) {
            return new po01(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (RecentlyPlayedEntity.class) {
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

    public final RecentlyPlayedTrack n() {
        return this.entityCase_ == 1 ? (RecentlyPlayedTrack) this.entity_ : RecentlyPlayedTrack.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.entityCase_ == 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
