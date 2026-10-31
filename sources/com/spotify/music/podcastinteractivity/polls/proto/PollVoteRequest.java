package com.spotify.music.podcastinteractivity.polls.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bcv0;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class PollVoteRequest extends h implements v2j0 {
    private static final PollVoteRequest DEFAULT_INSTANCE;
    public static final int OPTIONS_SELECTED_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int POLL_ID_FIELD_NUMBER = 1;
    private h290 optionsSelected_ = h.emptyProtobufList();
    private int pollId_;

    static {
        PollVoteRequest pollVoteRequest = new PollVoteRequest();
        DEFAULT_INSTANCE = pollVoteRequest;
        h.registerDefaultInstance(PollVoteRequest.class, pollVoteRequest);
    }

    private PollVoteRequest() {
    }

    public static bcv0 o() {
        return (bcv0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"pollId_", "optionsSelected_", PollOption.class});
        }
        if (iOrdinal == 3) {
            return new PollVoteRequest();
        }
        if (iOrdinal == 4) {
            return new bcv0(DEFAULT_INSTANCE);
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
        synchronized (PollVoteRequest.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.optionsSelected_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.optionsSelected_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(int i) {
        this.pollId_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
