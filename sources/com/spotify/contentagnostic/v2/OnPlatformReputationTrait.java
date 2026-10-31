package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.djp0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class OnPlatformReputationTrait extends h implements v2j0 {
    public static final int CHART_POSITION_FIELD_NUMBER = 7;
    private static final OnPlatformReputationTrait DEFAULT_INSTANCE;
    public static final int MONTHLY_LISTENERS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int RATING_FIELD_NUMBER = 8;
    public static final int TOTAL_ESTABLISHED_USER_RELATIONSHIPS_FIELD_NUMBER = 1;
    public static final int TOTAL_PLAYS_FIELD_NUMBER = 3;
    public static final int VERIFICATION_FIELD_NUMBER = 9;
    private int bitField0_;
    private ChartPosition chartPosition_;
    private long monthlyListeners_;
    private Rating rating_;
    private long totalEstablishedUserRelationships_;
    private long totalPlays_;
    private Verification verification_;

    static {
        OnPlatformReputationTrait onPlatformReputationTrait = new OnPlatformReputationTrait();
        DEFAULT_INSTANCE = onPlatformReputationTrait;
        h.registerDefaultInstance(OnPlatformReputationTrait.class, onPlatformReputationTrait);
    }

    private OnPlatformReputationTrait() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static OnPlatformReputationTrait z(byte[] bArr) {
        return (OnPlatformReputationTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005", new Object[]{"bitField0_", "totalEstablishedUserRelationships_", "totalPlays_", "monthlyListeners_", "chartPosition_", "rating_", "verification_"});
        }
        if (iOrdinal == 3) {
            return new OnPlatformReputationTrait();
        }
        if (iOrdinal == 4) {
            return new djp0((byte) 20);
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
        synchronized (OnPlatformReputationTrait.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ChartPosition o() {
        ChartPosition chartPosition = this.chartPosition_;
        return chartPosition == null ? ChartPosition.p() : chartPosition;
    }

    public final long p() {
        return this.monthlyListeners_;
    }

    public final Rating q() {
        Rating rating = this.rating_;
        return rating == null ? Rating.q() : rating;
    }

    public final long r() {
        return this.totalEstablishedUserRelationships_;
    }

    public final long s() {
        return this.totalPlays_;
    }

    public final Verification t() {
        Verification verification = this.verification_;
        return verification == null ? Verification.p() : verification;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean y() {
        return (this.bitField0_ & 32) != 0;
    }
}
