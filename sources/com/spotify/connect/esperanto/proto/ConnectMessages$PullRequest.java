package com.spotify.connect.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.q4l;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ConnectMessages$PullRequest extends h implements v2j0 {
    private static final ConnectMessages$PullRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PULL_TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private CommonMessages$LoggingParams loggingParams_;
    private int pullType_;

    static {
        ConnectMessages$PullRequest connectMessages$PullRequest = new ConnectMessages$PullRequest();
        DEFAULT_INSTANCE = connectMessages$PullRequest;
        h.registerDefaultInstance(ConnectMessages$PullRequest.class, connectMessages$PullRequest);
    }

    private ConnectMessages$PullRequest() {
    }

    public static q4l n() {
        return (q4l) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "loggingParams_", "pullType_"});
        }
        if (iOrdinal == 3) {
            return new ConnectMessages$PullRequest();
        }
        if (iOrdinal == 4) {
            return new q4l(DEFAULT_INSTANCE);
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
        synchronized (ConnectMessages$PullRequest.class) {
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

    public final void o(CommonMessages$LoggingParams commonMessages$LoggingParams) {
        this.loggingParams_ = commonMessages$LoggingParams;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
