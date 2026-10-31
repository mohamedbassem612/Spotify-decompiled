package com.spotify.player.esperanto.proto;

import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;
import p.vpz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest extends com.google.protobuf.h implements v2j0 {
    private static final EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TRACKS_FIELD_NUMBER = 1;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private h290 tracks_ = com.google.protobuf.h.emptyProtobufList();

    static {
        EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest = new EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest();
        DEFAULT_INSTANCE = esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest;
        com.google.protobuf.h.registerDefaultInstance(EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest.class, esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest);
    }

    private EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest() {
    }

    public static vpz o() {
        return (vpz) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "tracks_", EsContextTrack.ContextTrack.class, "options_", "loggingParams_"});
        }
        if (iOrdinal == 3) {
            return new EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest();
        }
        if (iOrdinal == 4) {
            return new vpz(DEFAULT_INSTANCE);
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
        synchronized (EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest.class) {
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
        h290 h290VarMutableCopy = this.tracks_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.tracks_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        this.loggingParams_ = esLoggingParams$LoggingParams;
        this.bitField0_ |= 2;
    }

    public final void q(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        this.options_ = esCommandOptions$CommandOptions;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
