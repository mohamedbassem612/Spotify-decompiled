package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.msz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zjy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsTrafficEvents$TrafficEvent extends h implements v2j0 {
    public static final int BYTES_RECEIVED_FIELD_NUMBER = 6;
    public static final int BYTES_SENT_FIELD_NUMBER = 5;
    private static final EsTrafficEvents$TrafficEvent DEFAULT_INSTANCE;
    public static final int FAILED_FIELD_NUMBER = 9;
    public static final int FINISHED_FIELD_NUMBER = 8;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_READY_FIELD_NUMBER = 4;
    public static final int RESPONSE_RECEIVED_FIELD_NUMBER = 7;
    public static final int STARTED_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private Object event_;
    private long timestamp_;
    private int eventCase_ = 0;
    private String id_ = "";

    static {
        EsTrafficEvents$TrafficEvent esTrafficEvents$TrafficEvent = new EsTrafficEvents$TrafficEvent();
        DEFAULT_INSTANCE = esTrafficEvents$TrafficEvent;
        h.registerDefaultInstance(EsTrafficEvents$TrafficEvent.class, esTrafficEvents$TrafficEvent);
    }

    private EsTrafficEvents$TrafficEvent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static msz v() {
        return (msz) DEFAULT_INSTANCE.createBuilder();
    }

    public static EsTrafficEvents$TrafficEvent w(byte[] bArr) {
        return (EsTrafficEvents$TrafficEvent) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final void A(EsTrafficEvents$FinishedEvent esTrafficEvents$FinishedEvent) {
        esTrafficEvents$FinishedEvent.getClass();
        this.event_ = esTrafficEvents$FinishedEvent;
        this.eventCase_ = 8;
    }

    public final void B(String str) {
        str.getClass();
        this.id_ = str;
    }

    public final void C(EsTrafficEvents$RequestReadyEvent esTrafficEvents$RequestReadyEvent) {
        esTrafficEvents$RequestReadyEvent.getClass();
        this.event_ = esTrafficEvents$RequestReadyEvent;
        this.eventCase_ = 4;
    }

    public final void D(EsTrafficEvents$ResponseReceivedEvent esTrafficEvents$ResponseReceivedEvent) {
        esTrafficEvents$ResponseReceivedEvent.getClass();
        this.event_ = esTrafficEvents$ResponseReceivedEvent;
        this.eventCase_ = 7;
    }

    public final void E(EsTrafficEvents$StartedEvent esTrafficEvents$StartedEvent) {
        esTrafficEvents$StartedEvent.getClass();
        this.event_ = esTrafficEvents$StartedEvent;
        this.eventCase_ = 3;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"event_", "eventCase_", "id_", "timestamp_", EsTrafficEvents$StartedEvent.class, EsTrafficEvents$RequestReadyEvent.class, EsTrafficEvents$BytesSentEvent.class, EsTrafficEvents$BytesReceivedEvent.class, EsTrafficEvents$ResponseReceivedEvent.class, EsTrafficEvents$FinishedEvent.class, EsTrafficEvents$FailedEvent.class});
        }
        if (iOrdinal == 3) {
            return new EsTrafficEvents$TrafficEvent();
        }
        if (iOrdinal == 4) {
            return new msz(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficEvents$TrafficEvent.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getId() {
        return this.id_;
    }

    public final long getTimestamp() {
        return this.timestamp_;
    }

    public final EsTrafficEvents$BytesReceivedEvent n() {
        return this.eventCase_ == 6 ? (EsTrafficEvents$BytesReceivedEvent) this.event_ : EsTrafficEvents$BytesReceivedEvent.o();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EsTrafficEvents$BytesSentEvent o() {
        return this.eventCase_ == 5 ? (EsTrafficEvents$BytesSentEvent) this.event_ : EsTrafficEvents$BytesSentEvent.o();
    }

    public final int p() {
        return zjy.e(this.eventCase_);
    }

    public final EsTrafficEvents$FailedEvent q() {
        return this.eventCase_ == 9 ? (EsTrafficEvents$FailedEvent) this.event_ : EsTrafficEvents$FailedEvent.n();
    }

    public final EsTrafficEvents$FinishedEvent r() {
        return this.eventCase_ == 8 ? (EsTrafficEvents$FinishedEvent) this.event_ : EsTrafficEvents$FinishedEvent.n();
    }

    public final EsTrafficEvents$RequestReadyEvent s() {
        return this.eventCase_ == 4 ? (EsTrafficEvents$RequestReadyEvent) this.event_ : EsTrafficEvents$RequestReadyEvent.o();
    }

    public final void setTimestamp(long j) {
        this.timestamp_ = j;
    }

    public final EsTrafficEvents$ResponseReceivedEvent t() {
        return this.eventCase_ == 7 ? (EsTrafficEvents$ResponseReceivedEvent) this.event_ : EsTrafficEvents$ResponseReceivedEvent.n();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final EsTrafficEvents$StartedEvent u() {
        return this.eventCase_ == 3 ? (EsTrafficEvents$StartedEvent) this.event_ : EsTrafficEvents$StartedEvent.n();
    }

    public final void x(EsTrafficEvents$BytesReceivedEvent esTrafficEvents$BytesReceivedEvent) {
        esTrafficEvents$BytesReceivedEvent.getClass();
        this.event_ = esTrafficEvents$BytesReceivedEvent;
        this.eventCase_ = 6;
    }

    public final void y(EsTrafficEvents$BytesSentEvent esTrafficEvents$BytesSentEvent) {
        esTrafficEvents$BytesSentEvent.getClass();
        this.event_ = esTrafficEvents$BytesSentEvent;
        this.eventCase_ = 5;
    }

    public final void z(EsTrafficEvents$FailedEvent esTrafficEvents$FailedEvent) {
        esTrafficEvents$FailedEvent.getClass();
        this.event_ = esTrafficEvents$FailedEvent;
        this.eventCase_ = 9;
    }
}
