package com.spotify.music.podcastinteractivity.polls.proto;

import com.google.protobuf.h;
import p.bf40;
import p.blg;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ClientPollsForEntityResponse extends h implements v2j0 {
    private static final ClientPollsForEntityResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int POLLS_FIELD_NUMBER = 1;
    private h290 polls_ = h.emptyProtobufList();

    static {
        ClientPollsForEntityResponse clientPollsForEntityResponse = new ClientPollsForEntityResponse();
        DEFAULT_INSTANCE = clientPollsForEntityResponse;
        h.registerDefaultInstance(ClientPollsForEntityResponse.class, clientPollsForEntityResponse);
    }

    private ClientPollsForEntityResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"polls_", ClientPollResponse.class});
        }
        if (iOrdinal == 3) {
            return new ClientPollsForEntityResponse();
        }
        if (iOrdinal == 4) {
            return new blg(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (ClientPollsForEntityResponse.class) {
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

    public final h290 n() {
        return this.polls_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
