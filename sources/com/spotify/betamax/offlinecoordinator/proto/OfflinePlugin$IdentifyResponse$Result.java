package com.spotify.betamax.offlinecoordinator.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class OfflinePlugin$IdentifyResponse$Result extends h implements v2j0 {
    private static final OfflinePlugin$IdentifyResponse$Result DEFAULT_INSTANCE;
    public static final int ESTIMATED_FILE_SIZE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private long estimatedFileSize_;
    private int status_;

    static {
        OfflinePlugin$IdentifyResponse$Result offlinePlugin$IdentifyResponse$Result = new OfflinePlugin$IdentifyResponse$Result();
        DEFAULT_INSTANCE = offlinePlugin$IdentifyResponse$Result;
        h.registerDefaultInstance(OfflinePlugin$IdentifyResponse$Result.class, offlinePlugin$IdentifyResponse$Result);
    }

    private OfflinePlugin$IdentifyResponse$Result() {
    }

    public static OfflinePlugin$IdentifyResponse$Result n() {
        return DEFAULT_INSTANCE;
    }

    public static e o() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"status_", "estimatedFileSize_"});
        }
        if (iOrdinal == 3) {
            return new OfflinePlugin$IdentifyResponse$Result();
        }
        if (iOrdinal == 4) {
            return new e(DEFAULT_INSTANCE);
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
        synchronized (OfflinePlugin$IdentifyResponse$Result.class) {
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

    public final void p(long j) {
        this.estimatedFileSize_ = j;
    }

    public final void q(f fVar) {
        this.status_ = fVar.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
