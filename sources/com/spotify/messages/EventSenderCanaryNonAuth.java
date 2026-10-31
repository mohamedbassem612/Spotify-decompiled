package com.spotify.messages;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zb00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EventSenderCanaryNonAuth extends h implements v2j0 {
    public static final int BATCH_SIZE_FIELD_NUMBER = 3;
    public static final int BATCH_START_TIME_MS_FIELD_NUMBER = 6;
    public static final int BATCH_UUID_FIELD_NUMBER = 1;
    public static final int CONFIGURATION_FIELD_NUMBER = 8;
    private static final EventSenderCanaryNonAuth DEFAULT_INSTANCE;
    public static final int EVENT_ID_FIELD_NUMBER = 2;
    public static final int EVENT_TIME_MS_FIELD_NUMBER = 7;
    public static final int EXPECTED_MUTATION_COUNT_FIELD_NUMBER = 11;
    public static final int EXPERIMENT_VARIANT_FIELD_NUMBER = 9;
    public static final int MUTATION_COUNT_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int SENDING_SYSTEM_FIELD_NUMBER = 4;
    public static final int SENT_AS_PENDING_EVENT_FIELD_NUMBER = 5;
    private long batchSize_;
    private long batchStartTimeMs_;
    private int bitField0_;
    private long eventId_;
    private long eventTimeMs_;
    private long expectedMutationCount_;
    private long mutationCount_;
    private boolean sentAsPendingEvent_;
    private String batchUuid_ = "";
    private String sendingSystem_ = "";
    private String configuration_ = "";
    private String experimentVariant_ = "";

    static {
        EventSenderCanaryNonAuth eventSenderCanaryNonAuth = new EventSenderCanaryNonAuth();
        DEFAULT_INSTANCE = eventSenderCanaryNonAuth;
        h.registerDefaultInstance(EventSenderCanaryNonAuth.class, eventSenderCanaryNonAuth);
    }

    private EventSenderCanaryNonAuth() {
    }

    public static zb00 n() {
        return (zb00) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဈ\b\nဂ\t\u000bဂ\n", new Object[]{"bitField0_", "batchUuid_", "eventId_", "batchSize_", "sendingSystem_", "sentAsPendingEvent_", "batchStartTimeMs_", "eventTimeMs_", "configuration_", "experimentVariant_", "mutationCount_", "expectedMutationCount_"});
        }
        if (iOrdinal == 3) {
            return new EventSenderCanaryNonAuth();
        }
        if (iOrdinal == 4) {
            return new zb00(DEFAULT_INSTANCE);
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
        synchronized (EventSenderCanaryNonAuth.class) {
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

    public final void o() {
        this.bitField0_ |= 256;
        this.experimentVariant_ = "heartbeat";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
