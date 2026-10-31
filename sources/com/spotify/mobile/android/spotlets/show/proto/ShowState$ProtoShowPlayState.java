package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.h;
import com.spotify.cosmos.util.libs.proto.PlayabilityRestriction;
import p.bf40;
import p.cjj0;
import p.jf40;
import p.l981;
import p.la81;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ShowState$ProtoShowPlayState extends h implements v2j0 {
    private static final ShowState$ProtoShowPlayState DEFAULT_INSTANCE;
    public static final int IS_PLAYABLE_FIELD_NUMBER = 3;
    public static final int LABEL_FIELD_NUMBER = 5;
    public static final int LATEST_PLAYED_EPISODE_LINK_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYABILITY_RESTRICTION_FIELD_NUMBER = 4;
    public static final int PLAYED_PERCENTAGE_FIELD_NUMBER = 6;
    public static final int PLAYED_TIME_FIELD_NUMBER = 2;
    public static final int RESUME_EPISODE_LINK_FIELD_NUMBER = 7;
    private int bitField0_;
    private boolean isPlayable_;
    private int label_;
    private int playabilityRestriction_;
    private int playedPercentage_;
    private long playedTime_;
    private String latestPlayedEpisodeLink_ = "";
    private String resumeEpisodeLink_ = "";

    static {
        ShowState$ProtoShowPlayState showState$ProtoShowPlayState = new ShowState$ProtoShowPlayState();
        DEFAULT_INSTANCE = showState$ProtoShowPlayState;
        h.registerDefaultInstance(ShowState$ProtoShowPlayState.class, showState$ProtoShowPlayState);
    }

    private ShowState$ProtoShowPlayState() {
    }

    public static ShowState$ProtoShowPlayState n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဋ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "latestPlayedEpisodeLink_", "playedTime_", "isPlayable_", "playabilityRestriction_", PlayabilityRestriction.internalGetVerifier(), "label_", cjj0.r, "playedPercentage_", "resumeEpisodeLink_"});
        }
        if (iOrdinal == 3) {
            return new ShowState$ProtoShowPlayState();
        }
        if (iOrdinal == 4) {
            return new l981(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (ShowState$ProtoShowPlayState.class) {
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

    public final String getLatestPlayedEpisodeLink() {
        return this.latestPlayedEpisodeLink_;
    }

    public final int getPlayedPercentage() {
        return this.playedPercentage_;
    }

    public final long getPlayedTime() {
        return this.playedTime_;
    }

    public final String getResumeEpisodeLink() {
        return this.resumeEpisodeLink_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final la81 o() {
        la81 la81VarA = la81.a(this.label_);
        return la81VarA == null ? la81.UNKNOWN_LABEL : la81VarA;
    }

    public final PlayabilityRestriction p() {
        PlayabilityRestriction playabilityRestrictionForNumber = PlayabilityRestriction.forNumber(this.playabilityRestriction_);
        return playabilityRestrictionForNumber == null ? PlayabilityRestriction.UNKNOWN : playabilityRestrictionForNumber;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
