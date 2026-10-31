package com.spotify.campfire.contribution.proto.v1;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.dgb;
import p.dvm;
import p.er80;
import p.i9;
import p.jf40;
import p.kqm;
import p.nfb;
import p.pvm;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ContributionFilters extends h implements v2j0 {
    private static final ContributionFilters DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SOURCES_FIELD_NUMBER = 2;
    public static final int TIME_FILTER_FIELD_NUMBER = 3;
    public static final int TYPES_FIELD_NUMBER = 1;
    private int bitField0_;
    private int sourcesMemoizedSerializedSize;
    private TimeFilter timeFilter_;
    private int typesMemoizedSerializedSize;
    private static final c290 types_converter_ = new nfb((byte) 3, false);
    private static final c290 sources_converter_ = new dgb((byte) 3);
    private b290 types_ = h.emptyIntList();
    private b290 sources_ = h.emptyIntList();

    static {
        ContributionFilters contributionFilters = new ContributionFilters();
        DEFAULT_INSTANCE = contributionFilters;
        h.registerDefaultInstance(ContributionFilters.class, contributionFilters);
    }

    private ContributionFilters() {
    }

    public static kqm p() {
        return (kqm) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001,\u0002,\u0003ဉ\u0000", new Object[]{"bitField0_", "types_", "sources_", "timeFilter_"});
        }
        if (iOrdinal == 3) {
            return new ContributionFilters();
        }
        if (iOrdinal == 4) {
            return new kqm(DEFAULT_INSTANCE);
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
        synchronized (ContributionFilters.class) {
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

    public final void n(dvm dvmVar) {
        b290 b290VarMutableCopy = this.sources_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.sources_ = b290VarMutableCopy;
        }
        ((er80) b290VarMutableCopy).c(dvmVar.getNumber());
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(pvm pvmVar) {
        b290 b290VarMutableCopy = this.types_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.types_ = b290VarMutableCopy;
        }
        ((er80) b290VarMutableCopy).c(pvmVar.getNumber());
    }

    public final void q(TimeFilter timeFilter) {
        timeFilter.getClass();
        this.timeFilter_ = timeFilter;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
