package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.bid;
import p.c290;
import p.d290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xpv0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class Capping extends h implements v2j0 {
    private static final Capping DEFAULT_INSTANCE;
    public static final int EVENTS_TO_CAP_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private static final c290 eventsToCap_converter_ = new xpv0(12);
    private int eventsToCapMemoizedSerializedSize;
    private b290 eventsToCap_ = h.emptyIntList();

    static {
        Capping capping = new Capping();
        DEFAULT_INSTANCE = capping;
        h.registerDefaultInstance(Capping.class, capping);
    }

    private Capping() {
    }

    public static Capping o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"eventsToCap_"});
        }
        if (iOrdinal == 3) {
            return new Capping();
        }
        if (iOrdinal == 4) {
            return new bid((byte) 6);
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
        synchronized (Capping.class) {
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

    public final d290 p() {
        return new d290(this.eventsToCap_, eventsToCap_converter_);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
