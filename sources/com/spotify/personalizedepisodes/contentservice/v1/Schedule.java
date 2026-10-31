package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import java.util.Iterator;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.dm41;
import p.i9;
import p.jf40;
import p.m7r;
import p.pob;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wk41;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class Schedule extends h implements v2j0 {
    public static final int DAYS_OF_WEEK_FIELD_NUMBER = 2;
    private static final Schedule DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private static final c290 daysOfWeek_converter_ = new pob((byte) 23, false);
    private int daysOfWeekMemoizedSerializedSize;
    private b290 daysOfWeek_ = h.emptyIntList();
    private int type_;

    static {
        Schedule schedule = new Schedule();
        DEFAULT_INSTANCE = schedule;
        h.registerDefaultInstance(Schedule.class, schedule);
    }

    private Schedule() {
    }

    public static Schedule p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static wk41 r() {
        return (wk41) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002,", new Object[]{"type_", "daysOfWeek_"});
        }
        if (iOrdinal == 3) {
            return new Schedule();
        }
        if (iOrdinal == 4) {
            return new wk41(DEFAULT_INSTANCE);
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
        synchronized (Schedule.class) {
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
        i9 i9Var = this.daysOfWeek_;
        if (!i9Var.a) {
            this.daysOfWeek_ = h.mutableCopy(i9Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m7r m7rVar = (m7r) it.next();
            this.daysOfWeek_.c(m7rVar.getNumber());
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final d290 o() {
        return new d290(this.daysOfWeek_, daysOfWeek_converter_);
    }

    public final dm41 q() {
        dm41 dm41Var;
        int i = this.type_;
        if (i == 0) {
            dm41Var = dm41.SCHEDULE_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            dm41Var = dm41.SCHEDULE_TYPE_NONE;
        } else if (i == 2) {
            dm41Var = dm41.SCHEDULE_TYPE_DAILY;
        } else if (i != 3) {
            dm41Var = i != 4 ? null : dm41.SCHEDULE_TYPE_MONTHLY;
        } else {
            dm41Var = dm41.SCHEDULE_TYPE_WEEKLY;
        }
        return dm41Var == null ? dm41.UNRECOGNIZED : dm41Var;
    }

    public final void s(dm41 dm41Var) {
        this.type_ = dm41Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
