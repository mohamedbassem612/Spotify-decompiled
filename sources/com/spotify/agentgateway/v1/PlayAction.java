package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.bf40;
import p.cf81;
import p.ets0;
import p.h290;
import p.hjg1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class PlayAction extends h implements v2j0 {
    public static final int CONTEXT_URI_FIELD_NUMBER = 3;
    private static final PlayAction DEFAULT_INSTANCE;
    public static final int FIRST_TRACK_URIS_FIELD_NUMBER = 5;
    public static final int OFFSET_MS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SHUFFLE_MODE_FIELD_NUMBER = 6;
    public static final int TRANSITION_MODE_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private long offsetMs_;
    private int shuffleMode_;
    private int transitionMode_;
    private String uri_ = "";
    private String contextUri_ = "";
    private h290 firstTrackUris_ = h.emptyProtobufList();

    static {
        PlayAction playAction = new PlayAction();
        DEFAULT_INSTANCE = playAction;
        h.registerDefaultInstance(PlayAction.class, playAction);
    }

    private PlayAction() {
    }

    public static PlayAction o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002ဂ\u0000\u0003ለ\u0001\u0004ဌ\u0002\u0005Ț\u0006ဌ\u0003", new Object[]{"bitField0_", "uri_", "offsetMs_", "contextUri_", "transitionMode_", "firstTrackUris_", "shuffleMode_"});
        }
        if (iOrdinal == 3) {
            return new PlayAction();
        }
        if (iOrdinal == 4) {
            return new ets0(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (PlayAction.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final String n() {
        return this.contextUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 p() {
        return this.firstTrackUris_;
    }

    public final long q() {
        return this.offsetMs_;
    }

    public final cf81 r() {
        cf81 cf81Var;
        int i = this.shuffleMode_;
        if (i == 0) {
            cf81Var = cf81.b;
        } else if (i != 1) {
            cf81Var = i != 2 ? null : cf81.d;
        } else {
            cf81Var = cf81.c;
        }
        return cf81Var == null ? cf81.e : cf81Var;
    }

    public final hjg1 s() {
        hjg1 hjg1Var;
        int i = this.transitionMode_;
        if (i == 0) {
            hjg1Var = hjg1.b;
        } else if (i != 1) {
            hjg1Var = i != 2 ? null : hjg1.d;
        } else {
            hjg1Var = hjg1.c;
        }
        return hjg1Var == null ? hjg1.e : hjg1Var;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 4) != 0;
    }
}
