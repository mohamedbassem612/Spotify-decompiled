package com.spotify.voting.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ofj1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class VotingPlaylistData extends h implements v2j0 {
    private static final VotingPlaylistData DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VOTING_AVAILABLE_FIELD_NUMBER = 2;
    public static final int VOTING_AVAILABLE_VOTES_USED_FIELD_NUMBER = 3;
    public static final int VOTING_CLOSED_FIELD_NUMBER = 4;
    public static final int VOTING_INELIGIBLE_FIELD_NUMBER = 6;
    public static final int VOTING_PRE_RELEASE_FIELD_NUMBER = 1;
    public static final int VOTING_RESULTS_FIELD_NUMBER = 5;
    private int valueCase_ = 0;
    private Object value_;

    static {
        VotingPlaylistData votingPlaylistData = new VotingPlaylistData();
        DEFAULT_INSTANCE = votingPlaylistData;
        h.registerDefaultInstance(VotingPlaylistData.class, votingPlaylistData);
    }

    private VotingPlaylistData() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static VotingPlaylistData t(byte[] bArr) {
        return (VotingPlaylistData) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"value_", "valueCase_", VotingPreRelease.class, VotingAvailable.class, VotingAvailableVotesUsed.class, VotingClosed.class, VotingResults.class, VotingIneligible.class});
        }
        if (iOrdinal == 3) {
            return new VotingPlaylistData();
        }
        if (iOrdinal == 4) {
            return new ofj1(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (VotingPlaylistData.class) {
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

    public final int n() {
        switch (this.valueCase_) {
            case 0:
                return 7;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final VotingAvailable o() {
        return this.valueCase_ == 2 ? (VotingAvailable) this.value_ : VotingAvailable.o();
    }

    public final VotingAvailableVotesUsed p() {
        return this.valueCase_ == 3 ? (VotingAvailableVotesUsed) this.value_ : VotingAvailableVotesUsed.o();
    }

    public final VotingClosed q() {
        return this.valueCase_ == 4 ? (VotingClosed) this.value_ : VotingClosed.o();
    }

    public final VotingPreRelease r() {
        return this.valueCase_ == 1 ? (VotingPreRelease) this.value_ : VotingPreRelease.n();
    }

    public final VotingResults s() {
        return this.valueCase_ == 5 ? (VotingResults) this.value_ : VotingResults.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
