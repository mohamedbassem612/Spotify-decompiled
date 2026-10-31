package com.spotify.player.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.onz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsGetQueueRequest$GetQueueRequest extends h implements v2j0 {
    private static final EsGetQueueRequest$GetQueueRequest DEFAULT_INSTANCE;
    public static final int LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String logicalPlaybackIdentifier_ = "";

    static {
        EsGetQueueRequest$GetQueueRequest esGetQueueRequest$GetQueueRequest = new EsGetQueueRequest$GetQueueRequest();
        DEFAULT_INSTANCE = esGetQueueRequest$GetQueueRequest;
        h.registerDefaultInstance(EsGetQueueRequest$GetQueueRequest.class, esGetQueueRequest$GetQueueRequest);
    }

    private EsGetQueueRequest$GetQueueRequest() {
    }

    public static EsGetQueueRequest$GetQueueRequest o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "logicalPlaybackIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new EsGetQueueRequest$GetQueueRequest();
        }
        if (iOrdinal == 4) {
            return new onz((byte) 3);
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
        synchronized (EsGetQueueRequest$GetQueueRequest.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
