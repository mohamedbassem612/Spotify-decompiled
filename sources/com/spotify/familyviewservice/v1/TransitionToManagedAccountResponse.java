package com.spotify.familyviewservice.v1;

import com.google.protobuf.Duration;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zif1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class TransitionToManagedAccountResponse extends h implements v2j0 {
    private static final TransitionToManagedAccountResponse DEFAULT_INSTANCE;
    public static final int MIGRATION_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TIMEOUT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String migrationId_ = "";
    private Duration timeout_;

    static {
        TransitionToManagedAccountResponse transitionToManagedAccountResponse = new TransitionToManagedAccountResponse();
        DEFAULT_INSTANCE = transitionToManagedAccountResponse;
        h.registerDefaultInstance(TransitionToManagedAccountResponse.class, transitionToManagedAccountResponse);
    }

    private TransitionToManagedAccountResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "timeout_", "migrationId_"});
        }
        if (iOrdinal == 3) {
            return new TransitionToManagedAccountResponse();
        }
        if (iOrdinal == 4) {
            return new zif1(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (TransitionToManagedAccountResponse.class) {
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

    public final String getMigrationId() {
        return this.migrationId_;
    }

    public final Duration getTimeout() {
        Duration duration = this.timeout_;
        return duration == null ? Duration.n() : duration;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
