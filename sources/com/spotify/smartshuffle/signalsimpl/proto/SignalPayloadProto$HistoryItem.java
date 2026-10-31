package com.spotify.smartshuffle.signalsimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zl81;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class SignalPayloadProto$HistoryItem extends h implements v2j0 {
    private static final SignalPayloadProto$HistoryItem DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int START_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int TIME_PLAYED_MS_FIELD_NUMBER = 4;
    public static final int TRACK_LENGTH_MS_FIELD_NUMBER = 5;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private long startTimestamp_;
    private long timePlayedMs_;
    private long trackLengthMs_;
    private String uri_ = "";
    private phc itemId_ = phc.b;

    static {
        SignalPayloadProto$HistoryItem signalPayloadProto$HistoryItem = new SignalPayloadProto$HistoryItem();
        DEFAULT_INSTANCE = signalPayloadProto$HistoryItem;
        h.registerDefaultInstance(SignalPayloadProto$HistoryItem.class, signalPayloadProto$HistoryItem);
    }

    private SignalPayloadProto$HistoryItem() {
    }

    public static zl81 n() {
        return (zl81) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003ဂ\u0000\u0004ဂ\u0001\u0005ဂ\u0002", new Object[]{"bitField0_", "uri_", "itemId_", "startTimestamp_", "timePlayedMs_", "trackLengthMs_"});
        }
        if (iOrdinal == 3) {
            return new SignalPayloadProto$HistoryItem();
        }
        if (iOrdinal == 4) {
            return new zl81(DEFAULT_INSTANCE);
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
        synchronized (SignalPayloadProto$HistoryItem.class) {
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

    public final void o(phc phcVar) {
        this.itemId_ = phcVar;
    }

    public final void p(long j) {
        this.bitField0_ |= 1;
        this.startTimestamp_ = j;
    }

    public final void q(long j) {
        this.bitField0_ |= 2;
        this.timePlayedMs_ = j;
    }

    public final void r(long j) {
        this.bitField0_ |= 4;
        this.trackLengthMs_ = j;
    }

    public final void s(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
