package com.spotify.player.esperanto.proto;

import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qrz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsSetQueueRequest$SetQueueRequest extends com.google.protobuf.h implements v2j0 {
    private static final EsSetQueueRequest$SetQueueRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 5;
    public static final int NEXT_TRACKS_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PREV_TRACKS_FIELD_NUMBER = 2;
    public static final int QUEUE_REVISION_FIELD_NUMBER = 3;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private long queueRevision_;
    private h290 nextTracks_ = com.google.protobuf.h.emptyProtobufList();
    private h290 prevTracks_ = com.google.protobuf.h.emptyProtobufList();

    static {
        EsSetQueueRequest$SetQueueRequest esSetQueueRequest$SetQueueRequest = new EsSetQueueRequest$SetQueueRequest();
        DEFAULT_INSTANCE = esSetQueueRequest$SetQueueRequest;
        com.google.protobuf.h.registerDefaultInstance(EsSetQueueRequest$SetQueueRequest.class, esSetQueueRequest$SetQueueRequest);
    }

    private EsSetQueueRequest$SetQueueRequest() {
    }

    public static qrz p() {
        return (qrz) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u0003\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"bitField0_", "nextTracks_", EsProvidedTrack.ProvidedTrack.class, "prevTracks_", EsProvidedTrack.ProvidedTrack.class, "queueRevision_", "options_", "loggingParams_"});
        }
        if (iOrdinal == 3) {
            return new EsSetQueueRequest$SetQueueRequest();
        }
        if (iOrdinal == 4) {
            return new qrz(DEFAULT_INSTANCE);
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
        synchronized (EsSetQueueRequest$SetQueueRequest.class) {
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
        h290 h290VarMutableCopy = this.nextTracks_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.nextTracks_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.prevTracks_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.prevTracks_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final void q(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        this.loggingParams_ = esLoggingParams$LoggingParams;
        this.bitField0_ |= 2;
    }

    public final void r(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        this.options_ = esCommandOptions$CommandOptions;
        this.bitField0_ |= 1;
    }

    public final void s(long j) {
        this.queueRevision_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
