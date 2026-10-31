package com.spotify.party.mobile.v2;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.h4s0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uid0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ListeningPartyStatus extends h implements v2j0 {
    public static final int CLOSED_AT_FIELD_NUMBER = 4;
    public static final int CLOSED_AT_MILLIS_FIELD_NUMBER = 5;
    private static final ListeningPartyStatus DEFAULT_INSTANCE;
    public static final int LIVE_AT_FIELD_NUMBER = 2;
    public static final int LIVE_AT_MILLIS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private long closedAtMillis_;
    private Timestamp closedAt_;
    private long liveAtMillis_;
    private Timestamp liveAt_;
    private int status_;

    static {
        ListeningPartyStatus listeningPartyStatus = new ListeningPartyStatus();
        DEFAULT_INSTANCE = listeningPartyStatus;
        h.registerDefaultInstance(ListeningPartyStatus.class, listeningPartyStatus);
    }

    private ListeningPartyStatus() {
    }

    public static ListeningPartyStatus n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003\u0002\u0004ဉ\u0001\u0005\u0002", new Object[]{"bitField0_", "status_", "liveAt_", "liveAtMillis_", "closedAt_", "closedAtMillis_"});
        }
        if (iOrdinal == 3) {
            return new ListeningPartyStatus();
        }
        if (iOrdinal == 4) {
            return new uid0(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (ListeningPartyStatus.class) {
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

    public final h4s0 o() {
        h4s0 h4s0Var;
        switch (this.status_) {
            case 0:
                h4s0Var = h4s0.UNKNOWN_PARTY_STATUS;
                break;
            case 1:
                h4s0Var = h4s0.SCHEDULED;
                break;
            case 2:
                h4s0Var = h4s0.UPCOMING;
                break;
            case 3:
                h4s0Var = h4s0.READY;
                break;
            case 4:
                h4s0Var = h4s0.LIVE;
                break;
            case 5:
                h4s0Var = h4s0.CLOSED;
                break;
            case 6:
                h4s0Var = h4s0.ARCHIVED;
                break;
            case 7:
                h4s0Var = h4s0.SCRAPPED;
                break;
            default:
                h4s0Var = null;
                break;
        }
        return h4s0Var == null ? h4s0.UNRECOGNIZED : h4s0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
