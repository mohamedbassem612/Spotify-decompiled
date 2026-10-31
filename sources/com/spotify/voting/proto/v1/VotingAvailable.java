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
public final class VotingAvailable extends h implements v2j0 {
    public static final int BUTTON_REDIRECT_URI_FIELD_NUMBER = 4;
    private static final VotingAvailable DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PREMIUM_UPSELL_FIELD_NUMBER = 6;
    public static final int VOTES_LEFT_FIELD_NUMBER = 3;
    public static final int VOTING_ENDS_HEADER_FIELD_NUMBER = 5;
    public static final int VOTING_ENDS_UTC_FIELD_NUMBER = 2;
    public static final int VOTING_SECTION_TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private PremiumUpsell premiumUpsell_;
    private int votesLeft_;
    private Timestamp votingEndsUtc_;
    private VotingSectionText votingSectionText_;
    private String buttonRedirectUri_ = "";
    private String votingEndsHeader_ = "";

    static {
        VotingAvailable votingAvailable = new VotingAvailable();
        DEFAULT_INSTANCE = votingAvailable;
        h.registerDefaultInstance(VotingAvailable.class, votingAvailable);
    }

    private VotingAvailable() {
    }

    public static VotingAvailable o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0004\u0004Ȉ\u0005Ȉ\u0006ဉ\u0002", new Object[]{"bitField0_", "votingSectionText_", "votingEndsUtc_", "votesLeft_", "buttonRedirectUri_", "votingEndsHeader_", "premiumUpsell_"});
        }
        if (iOrdinal == 3) {
            return new VotingAvailable();
        }
        if (iOrdinal == 4) {
            return new ofj1(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (VotingAvailable.class) {
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

    public final String q() {
        return this.votingEndsHeader_;
    }

    public final Timestamp r() {
        Timestamp timestamp = this.votingEndsUtc_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final VotingSectionText s() {
        VotingSectionText votingSectionText = this.votingSectionText_;
        return votingSectionText == null ? VotingSectionText.o() : votingSectionText;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
