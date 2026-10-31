package com.spotify.messages;

import com.google.protobuf.h;
import java.util.TreeSet;
import p.ad00;
import p.b290;
import p.bf40;
import p.e290;
import p.er80;
import p.h290;
import p.hhc;
import p.i9;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.t4f0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EventSenderStats2NonAuth extends h implements v2j0 {
    private static final EventSenderStats2NonAuth DEFAULT_INSTANCE;
    public static final int DROP_LIST_COUNTS_TOTAL_FIELD_NUMBER = 12;
    public static final int DROP_LIST_COUNTS_UNREPORTED_FIELD_NUMBER = 13;
    public static final int DROP_LIST_EVENT_NAME_INDEX_FIELD_NUMBER = 11;
    public static final int DROP_LIST_NUM_ENTRIES_PER_SEQUENCE_ID_FIELD_NUMBER = 10;
    public static final int EVENT_NAMES_FIELD_NUMBER = 2;
    public static final int LOSS_STATS_EVENT_NAME_INDEX_FIELD_NUMBER = 4;
    public static final int LOSS_STATS_NUM_ENTRIES_PER_SEQUENCE_ID_FIELD_NUMBER = 3;
    public static final int LOSS_STATS_SEQUENCE_NUMBER_MINS_FIELD_NUMBER = 6;
    public static final int LOSS_STATS_SEQUENCE_NUMBER_NEXTS_FIELD_NUMBER = 7;
    public static final int LOSS_STATS_STORAGE_SIZES_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int RATELIMITER_STATS_DROP_COUNT_FIELD_NUMBER = 9;
    public static final int RATELIMITER_STATS_EVENT_NAME_INDEX_FIELD_NUMBER = 8;
    public static final int SEQUENCE_IDS_FIELD_NUMBER = 1;
    public static final int STATES_LIST_DELETED_COUNTS_TOTAL_FIELD_NUMBER = 22;
    public static final int STATES_LIST_DELIVERED_COUNTS_TOTAL_FIELD_NUMBER = 21;
    public static final int STATES_LIST_DROPPED_COUNTS_TOTAL_FIELD_NUMBER = 18;
    public static final int STATES_LIST_ENTERED_COUNTS_TOTAL_FIELD_NUMBER = 16;
    public static final int STATES_LIST_EVENT_NAME_INDEX_FIELD_NUMBER = 15;
    public static final int STATES_LIST_PERSISTED_COUNTS_TOTAL_FIELD_NUMBER = 19;
    public static final int STATES_LIST_REJECTED_BACKEND_COUNTS_TOTAL_FIELD_NUMBER = 20;
    public static final int STATES_LIST_REJECTED_CLIENT_COUNTS_TOTAL_FIELD_NUMBER = 17;
    private h290 sequenceIds_ = h.emptyProtobufList();
    private h290 eventNames_ = h.emptyProtobufList();
    private b290 lossStatsNumEntriesPerSequenceId_ = h.emptyIntList();
    private b290 lossStatsEventNameIndex_ = h.emptyIntList();
    private e290 lossStatsStorageSizes_ = h.emptyLongList();
    private e290 lossStatsSequenceNumberMins_ = h.emptyLongList();
    private e290 lossStatsSequenceNumberNexts_ = h.emptyLongList();
    private b290 ratelimiterStatsEventNameIndex_ = h.emptyIntList();
    private e290 ratelimiterStatsDropCount_ = h.emptyLongList();
    private b290 dropListNumEntriesPerSequenceId_ = h.emptyIntList();
    private b290 dropListEventNameIndex_ = h.emptyIntList();
    private e290 dropListCountsTotal_ = h.emptyLongList();
    private e290 dropListCountsUnreported_ = h.emptyLongList();
    private b290 statesListEventNameIndex_ = h.emptyIntList();
    private e290 statesListEnteredCountsTotal_ = h.emptyLongList();
    private e290 statesListRejectedClientCountsTotal_ = h.emptyLongList();
    private e290 statesListDroppedCountsTotal_ = h.emptyLongList();
    private e290 statesListPersistedCountsTotal_ = h.emptyLongList();
    private e290 statesListRejectedBackendCountsTotal_ = h.emptyLongList();
    private e290 statesListDeliveredCountsTotal_ = h.emptyLongList();
    private e290 statesListDeletedCountsTotal_ = h.emptyLongList();

    static {
        EventSenderStats2NonAuth eventSenderStats2NonAuth = new EventSenderStats2NonAuth();
        DEFAULT_INSTANCE = eventSenderStats2NonAuth;
        h.registerDefaultInstance(EventSenderStats2NonAuth.class, eventSenderStats2NonAuth);
    }

    private EventSenderStats2NonAuth() {
    }

    public static ad00 a0() {
        return (ad00) DEFAULT_INSTANCE.createBuilder();
    }

    public static EventSenderStats2NonAuth b0(phc phcVar) {
        return (EventSenderStats2NonAuth) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(int i) {
        b290 b290VarMutableCopy = this.statesListEventNameIndex_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.statesListEventNameIndex_ = b290VarMutableCopy;
        }
        ((er80) b290VarMutableCopy).c(i);
    }

    public final void B(long j) {
        e290 e290VarMutableCopy = this.statesListPersistedCountsTotal_;
        if (!((i9) e290VarMutableCopy).a) {
            e290VarMutableCopy = h.mutableCopy(e290VarMutableCopy);
            this.statesListPersistedCountsTotal_ = e290VarMutableCopy;
        }
        ((t4f0) e290VarMutableCopy).c(j);
    }

    public final void C(long j) {
        e290 e290VarMutableCopy = this.statesListRejectedBackendCountsTotal_;
        if (!((i9) e290VarMutableCopy).a) {
            e290VarMutableCopy = h.mutableCopy(e290VarMutableCopy);
            this.statesListRejectedBackendCountsTotal_ = e290VarMutableCopy;
        }
        ((t4f0) e290VarMutableCopy).c(j);
    }

    public final void D(long j) {
        e290 e290VarMutableCopy = this.statesListRejectedClientCountsTotal_;
        if (!((i9) e290VarMutableCopy).a) {
            e290VarMutableCopy = h.mutableCopy(e290VarMutableCopy);
            this.statesListRejectedClientCountsTotal_ = e290VarMutableCopy;
        }
        ((t4f0) e290VarMutableCopy).c(j);
    }

    public final int E() {
        return this.dropListCountsTotal_.size();
    }

    public final h290 F() {
        return this.eventNames_;
    }

    public final b290 G() {
        return this.lossStatsEventNameIndex_;
    }

    public final int H() {
        return this.lossStatsNumEntriesPerSequenceId_.size();
    }

    public final b290 I() {
        return this.lossStatsNumEntriesPerSequenceId_;
    }

    public final e290 J() {
        return this.lossStatsSequenceNumberMins_;
    }

    public final e290 K() {
        return this.lossStatsSequenceNumberNexts_;
    }

    public final e290 L() {
        return this.lossStatsStorageSizes_;
    }

    public final int M() {
        return this.ratelimiterStatsDropCount_.size();
    }

    public final e290 N() {
        return this.ratelimiterStatsDropCount_;
    }

    public final b290 O() {
        return this.ratelimiterStatsEventNameIndex_;
    }

    public final int P() {
        return this.sequenceIds_.size();
    }

    public final h290 Q() {
        return this.sequenceIds_;
    }

    public final e290 R() {
        return this.statesListDeletedCountsTotal_;
    }

    public final e290 S() {
        return this.statesListDeliveredCountsTotal_;
    }

    public final e290 T() {
        return this.statesListDroppedCountsTotal_;
    }

    public final e290 U() {
        return this.statesListEnteredCountsTotal_;
    }

    public final int V() {
        return this.statesListEventNameIndex_.size();
    }

    public final b290 W() {
        return this.statesListEventNameIndex_;
    }

    public final e290 X() {
        return this.statesListPersistedCountsTotal_;
    }

    public final e290 Y() {
        return this.statesListRejectedBackendCountsTotal_;
    }

    public final e290 Z() {
        return this.statesListRejectedClientCountsTotal_;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0000\u0001\u0016\u0015\u0000\u0015\u0000\u0001\u001c\u0002\u001a\u0003\u0016\u0004\u0016\u0005\u0014\u0006\u0014\u0007\u0014\b\u0016\t\u0014\n\u0016\u000b\u0016\f\u0014\r\u0014\u000f\u0016\u0010\u0014\u0011\u0014\u0012\u0014\u0013\u0014\u0014\u0014\u0015\u0014\u0016\u0014", new Object[]{"sequenceIds_", "eventNames_", "lossStatsNumEntriesPerSequenceId_", "lossStatsEventNameIndex_", "lossStatsStorageSizes_", "lossStatsSequenceNumberMins_", "lossStatsSequenceNumberNexts_", "ratelimiterStatsEventNameIndex_", "ratelimiterStatsDropCount_", "dropListNumEntriesPerSequenceId_", "dropListEventNameIndex_", "dropListCountsTotal_", "dropListCountsUnreported_", "statesListEventNameIndex_", "statesListEnteredCountsTotal_", "statesListRejectedClientCountsTotal_", "statesListDroppedCountsTotal_", "statesListPersistedCountsTotal_", "statesListRejectedBackendCountsTotal_", "statesListDeliveredCountsTotal_", "statesListDeletedCountsTotal_"});
        }
        if (iOrdinal == 3) {
            return new EventSenderStats2NonAuth();
        }
        if (iOrdinal == 4) {
            return new ad00(DEFAULT_INSTANCE);
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
        synchronized (EventSenderStats2NonAuth.class) {
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

    public final void n(TreeSet treeSet) {
        h290 h290VarMutableCopy = this.eventNames_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.eventNames_ = h290VarMutableCopy;
        }
        s8.addAll(treeSet, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(int i) {
        b290 b290VarMutableCopy = this.lossStatsEventNameIndex_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.lossStatsEventNameIndex_ = b290VarMutableCopy;
        }
        ((er80) b290VarMutableCopy).c(i);
    }

    public final void p(int i) {
        b290 b290VarMutableCopy = this.lossStatsNumEntriesPerSequenceId_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.lossStatsNumEntriesPerSequenceId_ = b290VarMutableCopy;
        }
        ((er80) b290VarMutableCopy).c(i);
    }

    public final void q(long j) {
        e290 e290VarMutableCopy = this.lossStatsSequenceNumberMins_;
        if (!((i9) e290VarMutableCopy).a) {
            e290VarMutableCopy = h.mutableCopy(e290VarMutableCopy);
            this.lossStatsSequenceNumberMins_ = e290VarMutableCopy;
        }
        ((t4f0) e290VarMutableCopy).c(j);
    }

    public final void r(long j) {
        e290 e290VarMutableCopy = this.lossStatsSequenceNumberNexts_;
        if (!((i9) e290VarMutableCopy).a) {
            e290VarMutableCopy = h.mutableCopy(e290VarMutableCopy);
            this.lossStatsSequenceNumberNexts_ = e290VarMutableCopy;
        }
        ((t4f0) e290VarMutableCopy).c(j);
    }

    public final void s(long j) {
        e290 e290VarMutableCopy = this.lossStatsStorageSizes_;
        if (!((i9) e290VarMutableCopy).a) {
            e290VarMutableCopy = h.mutableCopy(e290VarMutableCopy);
            this.lossStatsStorageSizes_ = e290VarMutableCopy;
        }
        ((t4f0) e290VarMutableCopy).c(j);
    }

    public final void t(long j) {
        e290 e290VarMutableCopy = this.ratelimiterStatsDropCount_;
        if (!((i9) e290VarMutableCopy).a) {
            e290VarMutableCopy = h.mutableCopy(e290VarMutableCopy);
            this.ratelimiterStatsDropCount_ = e290VarMutableCopy;
        }
        ((t4f0) e290VarMutableCopy).c(j);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(int i) {
        b290 b290VarMutableCopy = this.ratelimiterStatsEventNameIndex_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.ratelimiterStatsEventNameIndex_ = b290VarMutableCopy;
        }
        ((er80) b290VarMutableCopy).c(i);
    }

    public final void v(hhc hhcVar) {
        h290 h290VarMutableCopy = this.sequenceIds_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.sequenceIds_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(hhcVar);
    }

    public final void w(long j) {
        e290 e290VarMutableCopy = this.statesListDeletedCountsTotal_;
        if (!((i9) e290VarMutableCopy).a) {
            e290VarMutableCopy = h.mutableCopy(e290VarMutableCopy);
            this.statesListDeletedCountsTotal_ = e290VarMutableCopy;
        }
        ((t4f0) e290VarMutableCopy).c(j);
    }

    public final void x(long j) {
        e290 e290VarMutableCopy = this.statesListDeliveredCountsTotal_;
        if (!((i9) e290VarMutableCopy).a) {
            e290VarMutableCopy = h.mutableCopy(e290VarMutableCopy);
            this.statesListDeliveredCountsTotal_ = e290VarMutableCopy;
        }
        ((t4f0) e290VarMutableCopy).c(j);
    }

    public final void y(long j) {
        e290 e290VarMutableCopy = this.statesListDroppedCountsTotal_;
        if (!((i9) e290VarMutableCopy).a) {
            e290VarMutableCopy = h.mutableCopy(e290VarMutableCopy);
            this.statesListDroppedCountsTotal_ = e290VarMutableCopy;
        }
        ((t4f0) e290VarMutableCopy).c(j);
    }

    public final void z(long j) {
        e290 e290VarMutableCopy = this.statesListEnteredCountsTotal_;
        if (!((i9) e290VarMutableCopy).a) {
            e290VarMutableCopy = h.mutableCopy(e290VarMutableCopy);
            this.statesListEnteredCountsTotal_ = e290VarMutableCopy;
        }
        ((t4f0) e290VarMutableCopy).c(j);
    }
}
