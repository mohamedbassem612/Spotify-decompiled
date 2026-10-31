package com.spotify.listentitymusic.page.lastvisited;

import com.google.protobuf.h;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.jf40;
import p.jgb0;
import p.kgb0;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class LastVisitedProto$LastVisitedStore extends h implements v2j0 {
    private static final LastVisitedProto$LastVisitedStore DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int USER_VISITS_FIELD_NUMBER = 1;
    private qng0 userVisits_ = qng0.b;

    static {
        LastVisitedProto$LastVisitedStore lastVisitedProto$LastVisitedStore = new LastVisitedProto$LastVisitedStore();
        DEFAULT_INSTANCE = lastVisitedProto$LastVisitedStore;
        h.registerDefaultInstance(LastVisitedProto$LastVisitedStore.class, lastVisitedProto$LastVisitedStore);
    }

    private LastVisitedProto$LastVisitedStore() {
    }

    public static LastVisitedProto$LastVisitedStore n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static LastVisitedProto$LastVisitedStore q(FileInputStream fileInputStream) {
        return (LastVisitedProto$LastVisitedStore) h.parseFrom(DEFAULT_INSTANCE, fileInputStream);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"userVisits_", kgb0.a});
        }
        if (iOrdinal == 3) {
            return new LastVisitedProto$LastVisitedStore();
        }
        if (iOrdinal == 4) {
            return new jgb0(DEFAULT_INSTANCE);
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
        synchronized (LastVisitedProto$LastVisitedStore.class) {
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

    public final Map o() {
        return Collections.unmodifiableMap(this.userVisits_);
    }

    public final qng0 p() {
        qng0 qng0Var = this.userVisits_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.userVisits_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
