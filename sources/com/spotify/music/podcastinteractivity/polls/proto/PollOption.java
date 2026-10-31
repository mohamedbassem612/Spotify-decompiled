package com.spotify.music.podcastinteractivity.polls.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r4v0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PollOption extends h implements v2j0 {
    private static final PollOption DEFAULT_INSTANCE;
    public static final int OPTION_FIELD_NUMBER = 1;
    public static final int OPTION_ID_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int POLL_ID_FIELD_NUMBER = 3;
    public static final int TOTAL_VOTES_FIELD_NUMBER = 2;
    private int optionId_;
    private String option_ = "";
    private int pollId_;
    private int totalVotes_;

    static {
        PollOption pollOption = new PollOption();
        DEFAULT_INSTANCE = pollOption;
        h.registerDefaultInstance(PollOption.class, pollOption);
    }

    private PollOption() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"option_", "totalVotes_", "pollId_", "optionId_"});
        }
        if (iOrdinal == 3) {
            return new PollOption();
        }
        if (iOrdinal == 4) {
            return new r4v0(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (PollOption.class) {
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
        return this.option_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.optionId_;
    }

    public final int p() {
        return this.totalVotes_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
