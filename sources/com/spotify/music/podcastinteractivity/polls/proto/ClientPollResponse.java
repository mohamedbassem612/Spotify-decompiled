package com.spotify.music.podcastinteractivity.polls.proto;

import com.google.protobuf.h;
import p.alg;
import p.b290;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ClientPollResponse extends h implements v2j0 {
    private static final ClientPollResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int POLL_FIELD_NUMBER = 1;
    public static final int USER_REPORTED_FIELD_NUMBER = 3;
    public static final int USER_VOTE_OPTION_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private Poll poll_;
    private boolean userReported_;
    private int userVoteOptionIdsMemoizedSerializedSize = -1;
    private b290 userVoteOptionIds_ = h.emptyIntList();

    static {
        ClientPollResponse clientPollResponse = new ClientPollResponse();
        DEFAULT_INSTANCE = clientPollResponse;
        h.registerDefaultInstance(ClientPollResponse.class, clientPollResponse);
    }

    private ClientPollResponse() {
    }

    public static ClientPollResponse n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static alg r(ClientPollResponse clientPollResponse) {
        return (alg) DEFAULT_INSTANCE.createBuilder(clientPollResponse);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002'\u0003\u0007", new Object[]{"bitField0_", "poll_", "userVoteOptionIds_", "userReported_"});
        }
        if (iOrdinal == 3) {
            return new ClientPollResponse();
        }
        if (iOrdinal == 4) {
            return new alg(DEFAULT_INSTANCE);
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
        synchronized (ClientPollResponse.class) {
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

    public final Poll o() {
        Poll poll = this.poll_;
        return poll == null ? Poll.o() : poll;
    }

    public final b290 p() {
        return this.userVoteOptionIds_;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void s(Poll poll) {
        poll.getClass();
        this.poll_ = poll;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
