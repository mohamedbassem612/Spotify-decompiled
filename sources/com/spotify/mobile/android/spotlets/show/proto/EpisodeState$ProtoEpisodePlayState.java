package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.libs.proto.PlayabilityRestriction;
import p.bf40;
import p.fxy;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class EpisodeState$ProtoEpisodePlayState extends h implements v2j0 {
    private static final EpisodeState$ProtoEpisodePlayState DEFAULT_INSTANCE;
    public static final int IS_PLAYABLE_FIELD_NUMBER = 2;
    public static final int IS_PLAYED_FIELD_NUMBER = 3;
    public static final int LAST_PLAYED_AT_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYABILITY_RESTRICTION_FIELD_NUMBER = 5;
    public static final int TIME_LEFT_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isPlayable_;
    private boolean isPlayed_;
    private long lastPlayedAt_;
    private int playabilityRestriction_;
    private int timeLeft_;

    static {
        EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayState = new EpisodeState$ProtoEpisodePlayState();
        DEFAULT_INSTANCE = episodeState$ProtoEpisodePlayState;
        h.registerDefaultInstance(EpisodeState$ProtoEpisodePlayState.class, episodeState$ProtoEpisodePlayState);
    }

    private EpisodeState$ProtoEpisodePlayState() {
    }

    public static EpisodeState$ProtoEpisodePlayState n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဃ\u0003\u0005᠌\u0004", new Object[]{"bitField0_", "timeLeft_", "isPlayable_", "isPlayed_", "lastPlayedAt_", "playabilityRestriction_", PlayabilityRestriction.internalGetVerifier()});
        }
        if (iOrdinal == 3) {
            return new EpisodeState$ProtoEpisodePlayState();
        }
        if (iOrdinal == 4) {
            return new fxy(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (EpisodeState$ProtoEpisodePlayState.class) {
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

    public final boolean getIsPlayable() {
        return this.isPlayable_;
    }

    public final boolean getIsPlayed() {
        return this.isPlayed_;
    }

    public final int getTimeLeft() {
        return this.timeLeft_;
    }

    public final boolean hasTimeLeft() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.lastPlayedAt_;
    }

    public final PlayabilityRestriction p() {
        PlayabilityRestriction playabilityRestrictionForNumber = PlayabilityRestriction.forNumber(this.playabilityRestriction_);
        return playabilityRestrictionForNumber == null ? PlayabilityRestriction.UNKNOWN : playabilityRestrictionForNumber;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
