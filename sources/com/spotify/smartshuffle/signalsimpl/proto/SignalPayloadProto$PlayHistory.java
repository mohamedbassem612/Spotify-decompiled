package com.spotify.smartshuffle.signalsimpl.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.am81;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class SignalPayloadProto$PlayHistory extends h implements v2j0 {
    public static final int CURRENT_FIELD_NUMBER = 1;
    private static final SignalPayloadProto$PlayHistory DEFAULT_INSTANCE;
    public static final int HISTORY_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private SignalPayloadProto$CurrentItem current_;
    private h290 history_ = h.emptyProtobufList();

    static {
        SignalPayloadProto$PlayHistory signalPayloadProto$PlayHistory = new SignalPayloadProto$PlayHistory();
        DEFAULT_INSTANCE = signalPayloadProto$PlayHistory;
        h.registerDefaultInstance(SignalPayloadProto$PlayHistory.class, signalPayloadProto$PlayHistory);
    }

    private SignalPayloadProto$PlayHistory() {
    }

    public static am81 o() {
        return (am81) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "current_", "history_", SignalPayloadProto$HistoryItem.class});
        }
        if (iOrdinal == 3) {
            return new SignalPayloadProto$PlayHistory();
        }
        if (iOrdinal == 4) {
            return new am81(DEFAULT_INSTANCE);
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
        synchronized (SignalPayloadProto$PlayHistory.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.history_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.history_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(SignalPayloadProto$CurrentItem signalPayloadProto$CurrentItem) {
        signalPayloadProto$CurrentItem.getClass();
        this.current_ = signalPayloadProto$CurrentItem;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
