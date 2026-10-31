package com.spotify.listentitymusic.page.lastvisited;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ngb0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class LastVisitedProto$Visits extends h implements v2j0 {
    private static final LastVisitedProto$Visits DEFAULT_INSTANCE;
    public static final int LATEST_VISIT_AT_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PREVIOUS_VISIT_AT_FIELD_NUMBER = 2;
    private int bitField0_;
    private long latestVisitAt_;
    private long previousVisitAt_;

    static {
        LastVisitedProto$Visits lastVisitedProto$Visits = new LastVisitedProto$Visits();
        DEFAULT_INSTANCE = lastVisitedProto$Visits;
        h.registerDefaultInstance(LastVisitedProto$Visits.class, lastVisitedProto$Visits);
    }

    private LastVisitedProto$Visits() {
    }

    public static LastVisitedProto$Visits n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ngb0 r() {
        return (ngb0) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002ဂ\u0000", new Object[]{"bitField0_", "latestVisitAt_", "previousVisitAt_"});
        }
        if (iOrdinal == 3) {
            return new LastVisitedProto$Visits();
        }
        if (iOrdinal == 4) {
            return new ngb0(DEFAULT_INSTANCE);
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
        synchronized (LastVisitedProto$Visits.class) {
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

    public final long o() {
        return this.latestVisitAt_;
    }

    public final long p() {
        return this.previousVisitAt_;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void s(long j) {
        this.latestVisitAt_ = j;
    }

    public final void t(long j) {
        this.bitField0_ |= 1;
        this.previousVisitAt_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
