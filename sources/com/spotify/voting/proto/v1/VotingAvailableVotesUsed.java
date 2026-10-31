package com.spotify.voting.proto.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ofj1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class VotingAvailableVotesUsed extends h implements v2j0 {
    public static final int BUTTON_REDIRECT_URI_FIELD_NUMBER = 3;
    private static final VotingAvailableVotesUsed DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PREMIUM_UPSELL_FIELD_NUMBER = 4;
    public static final int VOTING_ENDS_UTC_FIELD_NUMBER = 2;
    public static final int VOTING_SECTION_TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String buttonRedirectUri_ = "";
    private PremiumUpsell premiumUpsell_;
    private Timestamp votingEndsUtc_;
    private VotingSectionText votingSectionText_;

    static {
        VotingAvailableVotesUsed votingAvailableVotesUsed = new VotingAvailableVotesUsed();
        DEFAULT_INSTANCE = votingAvailableVotesUsed;
        h.registerDefaultInstance(VotingAvailableVotesUsed.class, votingAvailableVotesUsed);
    }

    private VotingAvailableVotesUsed() {
    }

    public static VotingAvailableVotesUsed o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002", new Object[]{"bitField0_", "votingSectionText_", "votingEndsUtc_", "buttonRedirectUri_", "premiumUpsell_"});
        }
        if (iOrdinal == 3) {
            return new VotingAvailableVotesUsed();
        }
        if (iOrdinal == 4) {
            return new ofj1(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (VotingAvailableVotesUsed.class) {
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

    public final String n() {
        return this.buttonRedirectUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final PremiumUpsell p() {
        PremiumUpsell premiumUpsell = this.premiumUpsell_;
        return premiumUpsell == null ? PremiumUpsell.n() : premiumUpsell;
    }

    public final VotingSectionText q() {
        VotingSectionText votingSectionText = this.votingSectionText_;
        return votingSectionText == null ? VotingSectionText.o() : votingSectionText;
    }

    public final boolean r() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
