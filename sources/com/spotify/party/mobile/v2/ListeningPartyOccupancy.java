package com.spotify.party.mobile.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uid0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ListeningPartyOccupancy extends h implements v2j0 {
    private static final ListeningPartyOccupancy DEFAULT_INSTANCE;
    public static final int INTERACTIVE_OCCUPANCY_FIELD_NUMBER = 3;
    public static final int LEANBACK_OCCUPANCY_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TOTAL_OCCUPANCY_FIELD_NUMBER = 1;
    private int interactiveOccupancy_;
    private int leanbackOccupancy_;
    private int totalOccupancy_;

    static {
        ListeningPartyOccupancy listeningPartyOccupancy = new ListeningPartyOccupancy();
        DEFAULT_INSTANCE = listeningPartyOccupancy;
        h.registerDefaultInstance(ListeningPartyOccupancy.class, listeningPartyOccupancy);
    }

    private ListeningPartyOccupancy() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"totalOccupancy_", "leanbackOccupancy_", "interactiveOccupancy_"});
        }
        if (iOrdinal == 3) {
            return new ListeningPartyOccupancy();
        }
        if (iOrdinal == 4) {
            return new uid0(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (ListeningPartyOccupancy.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
