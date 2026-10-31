package com.spotify.adonappopen.logger.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.ps0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class AdOnAppOpenClientEvent extends h implements v2j0 {
    public static final int AD_IDS_FIELD_NUMBER = 4;
    public static final int BG_TASK_ID_FIELD_NUMBER = 3;
    public static final int CACHE_EXPIRATION_TIMESTAMP_FIELD_NUMBER = 5;
    private static final AdOnAppOpenClientEvent DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 6;
    public static final int REQUEST_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private long cacheExpirationTimestamp_;
    private String eventType_ = "";
    private String requestId_ = "";
    private String bgTaskId_ = "";
    private h290 adIds_ = h.emptyProtobufList();
    private String payload_ = "";

    static {
        AdOnAppOpenClientEvent adOnAppOpenClientEvent = new AdOnAppOpenClientEvent();
        DEFAULT_INSTANCE = adOnAppOpenClientEvent;
        h.registerDefaultInstance(AdOnAppOpenClientEvent.class, adOnAppOpenClientEvent);
    }

    private AdOnAppOpenClientEvent() {
    }

    public static ps0 o() {
        return (ps0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဂ\u0003\u0006ဈ\u0004", new Object[]{"bitField0_", "eventType_", "requestId_", "bgTaskId_", "adIds_", "cacheExpirationTimestamp_", "payload_"});
        }
        if (iOrdinal == 3) {
            return new AdOnAppOpenClientEvent();
        }
        if (iOrdinal == 4) {
            return new ps0(DEFAULT_INSTANCE);
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
        synchronized (AdOnAppOpenClientEvent.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.adIds_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.adIds_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.eventType_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 16;
        this.payload_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 2;
        this.requestId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
