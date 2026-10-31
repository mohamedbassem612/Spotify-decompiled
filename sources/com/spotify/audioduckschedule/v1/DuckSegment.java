package com.spotify.audioduckschedule.v1;

import com.google.protobuf.h;
import p.bf40;
import p.eku;
import p.jf40;
import p.nev;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class DuckSegment extends h implements v2j0 {
    private static final DuckSegment DEFAULT_INSTANCE;
    public static final int END_SECONDS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int START_SECONDS_FIELD_NUMBER = 1;
    public static final int TAG_FIELD_NUMBER = 3;
    private double endSeconds_;
    private double startSeconds_;
    private int tag_;

    static {
        DuckSegment duckSegment = new DuckSegment();
        DEFAULT_INSTANCE = duckSegment;
        h.registerDefaultInstance(DuckSegment.class, duckSegment);
    }

    private DuckSegment() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\f", new Object[]{"startSeconds_", "endSeconds_", "tag_"});
        }
        if (iOrdinal == 3) {
            return new DuckSegment();
        }
        if (iOrdinal == 4) {
            return new eku(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (DuckSegment.class) {
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

    public final double n() {
        return this.endSeconds_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final double o() {
        return this.startSeconds_;
    }

    public final nev p() {
        nev nevVar;
        int i = this.tag_;
        if (i == 0) {
            nevVar = nev.TAG_UNSPECIFIED;
        } else if (i == 1) {
            nevVar = nev.TAG_MUSIC;
        } else if (i == 2) {
            nevVar = nev.TAG_SPEECH;
        } else if (i != 3) {
            nevVar = i != 4 ? null : nev.TAG_SILENCE;
        } else {
            nevVar = nev.TAG_NOISE;
        }
        return nevVar == null ? nev.UNRECOGNIZED : nevVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
