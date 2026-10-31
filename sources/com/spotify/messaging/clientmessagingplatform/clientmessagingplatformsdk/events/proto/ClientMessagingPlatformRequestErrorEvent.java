package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yjg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ClientMessagingPlatformRequestErrorEvent extends h implements v2j0 {
    private static final ClientMessagingPlatformRequestErrorEvent DEFAULT_INSTANCE;
    public static final int ERROR_DETAILS_FIELD_NUMBER = 4;
    public static final int ERROR_REASON_FIELD_NUMBER = 3;
    public static final int OPPORTUNITY_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TRIGGER_FIELD_NUMBER = 2;
    private int bitField0_;
    private String opportunityId_ = "";
    private String trigger_ = "";
    private String errorReason_ = "";
    private String errorDetails_ = "";

    static {
        ClientMessagingPlatformRequestErrorEvent clientMessagingPlatformRequestErrorEvent = new ClientMessagingPlatformRequestErrorEvent();
        DEFAULT_INSTANCE = clientMessagingPlatformRequestErrorEvent;
        h.registerDefaultInstance(ClientMessagingPlatformRequestErrorEvent.class, clientMessagingPlatformRequestErrorEvent);
    }

    private ClientMessagingPlatformRequestErrorEvent() {
    }

    public static yjg n() {
        return (yjg) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "opportunityId_", "trigger_", "errorReason_", "errorDetails_"});
        }
        if (iOrdinal == 3) {
            return new ClientMessagingPlatformRequestErrorEvent();
        }
        if (iOrdinal == 4) {
            return new yjg(DEFAULT_INSTANCE);
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
        synchronized (ClientMessagingPlatformRequestErrorEvent.class) {
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

    public final void o(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.errorDetails_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 4;
        this.errorReason_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 1;
        this.opportunityId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.trigger_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
