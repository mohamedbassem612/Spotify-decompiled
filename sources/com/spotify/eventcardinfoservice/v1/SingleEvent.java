package com.spotify.eventcardinfoservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.bn81;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class SingleEvent extends h implements v2j0 {
    public static final int DATE_FIELD_NUMBER = 3;
    private static final SingleEvent DEFAULT_INSTANCE;
    public static final int EVENTURI_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int VENUELOCATION_FIELD_NUMBER = 2;
    private int bitField0_;
    private DateWithOffset date_;
    private String eventUri_ = "";
    private String venueLocation_ = "";
    private String title_ = "";

    static {
        SingleEvent singleEvent = new SingleEvent();
        DEFAULT_INSTANCE = singleEvent;
        h.registerDefaultInstance(SingleEvent.class, singleEvent);
    }

    private SingleEvent() {
    }

    public static SingleEvent o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ", new Object[]{"bitField0_", "eventUri_", "venueLocation_", "date_", "title_"});
        }
        if (iOrdinal == 3) {
            return new SingleEvent();
        }
        if (iOrdinal == 4) {
            return new bn81(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (SingleEvent.class) {
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

    public final DateWithOffset n() {
        DateWithOffset dateWithOffset = this.date_;
        return dateWithOffset == null ? DateWithOffset.o() : dateWithOffset;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.eventUri_;
    }

    public final String q() {
        return this.venueLocation_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
