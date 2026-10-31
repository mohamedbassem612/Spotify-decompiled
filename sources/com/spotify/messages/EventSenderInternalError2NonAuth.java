package com.spotify.messages;

import p.b290;
import p.bf40;
import p.er80;
import p.h290;
import p.i9;
import p.jf40;
import p.nc00;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class EventSenderInternalError2NonAuth extends com.google.protobuf.h implements v2j0 {
    private static final EventSenderInternalError2NonAuth DEFAULT_INSTANCE;
    public static final int ERROR_TOTAL_COUNTS_FIELD_NUMBER = 2;
    public static final int ERROR_TYPES_FIELD_NUMBER = 1;
    public static final int ERROR_UNREPORTED_COUNTS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private h290 errorTypes_ = com.google.protobuf.h.emptyProtobufList();
    private b290 errorTotalCounts_ = com.google.protobuf.h.emptyIntList();
    private b290 errorUnreportedCounts_ = com.google.protobuf.h.emptyIntList();

    static {
        EventSenderInternalError2NonAuth eventSenderInternalError2NonAuth = new EventSenderInternalError2NonAuth();
        DEFAULT_INSTANCE = eventSenderInternalError2NonAuth;
        com.google.protobuf.h.registerDefaultInstance(EventSenderInternalError2NonAuth.class, eventSenderInternalError2NonAuth);
    }

    private EventSenderInternalError2NonAuth() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static nc00 u() {
        return (nc00) DEFAULT_INSTANCE.createBuilder();
    }

    public static EventSenderInternalError2NonAuth v(phc phcVar) {
        return (EventSenderInternalError2NonAuth) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001a\u0002\u0016\u0003\u0016", new Object[]{"errorTypes_", "errorTotalCounts_", "errorUnreportedCounts_"});
        }
        if (iOrdinal == 3) {
            return new EventSenderInternalError2NonAuth();
        }
        if (iOrdinal == 4) {
            return new nc00(DEFAULT_INSTANCE);
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
        synchronized (EventSenderInternalError2NonAuth.class) {
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

    public final void n(int i) {
        b290 b290VarMutableCopy = this.errorTotalCounts_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = com.google.protobuf.h.mutableCopy(b290VarMutableCopy);
            this.errorTotalCounts_ = b290VarMutableCopy;
        }
        ((er80) b290VarMutableCopy).c(i);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(String str) {
        h290 h290VarMutableCopy = this.errorTypes_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.errorTypes_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(str);
    }

    public final void p(int i) {
        b290 b290VarMutableCopy = this.errorUnreportedCounts_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = com.google.protobuf.h.mutableCopy(b290VarMutableCopy);
            this.errorUnreportedCounts_ = b290VarMutableCopy;
        }
        ((er80) b290VarMutableCopy).c(i);
    }

    public final int q() {
        return this.errorTotalCounts_.size();
    }

    public final b290 r() {
        return this.errorTotalCounts_;
    }

    public final int s() {
        return this.errorTypes_.size();
    }

    public final h290 t() {
        return this.errorTypes_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
