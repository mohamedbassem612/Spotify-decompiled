package com.spotify.listentitymusic.page.lastvisited;

import com.google.protobuf.h;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.jf40;
import p.lgb0;
import p.mgb0;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class LastVisitedProto$UserVisits extends h implements v2j0 {
    private static final LastVisitedProto$UserVisits DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VISITS_FIELD_NUMBER = 1;
    private qng0 visits_ = qng0.b;

    static {
        LastVisitedProto$UserVisits lastVisitedProto$UserVisits = new LastVisitedProto$UserVisits();
        DEFAULT_INSTANCE = lastVisitedProto$UserVisits;
        h.registerDefaultInstance(LastVisitedProto$UserVisits.class, lastVisitedProto$UserVisits);
    }

    private LastVisitedProto$UserVisits() {
    }

    public static LastVisitedProto$UserVisits n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"visits_", mgb0.a});
        }
        if (iOrdinal == 3) {
            return new LastVisitedProto$UserVisits();
        }
        if (iOrdinal == 4) {
            return new lgb0(DEFAULT_INSTANCE);
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
        synchronized (LastVisitedProto$UserVisits.class) {
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

    public final int o() {
        return this.visits_.size();
    }

    public final Map p() {
        return Collections.unmodifiableMap(this.visits_);
    }

    public final qng0 q() {
        qng0 qng0Var = this.visits_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.visits_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
