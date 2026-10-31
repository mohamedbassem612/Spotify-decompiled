package com.spotify.corex.reading.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.nzd1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Timeline extends h implements v2j0 {
    private static final Timeline DEFAULT_INSTANCE;
    public static final int END_MS_FIELD_NUMBER = 2;
    public static final int NEXT_SUB_URI_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PREV_SUB_URI_FIELD_NUMBER = 4;
    public static final int START_MS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int endMs_;
    private String nextSubUri_ = "";
    private String prevSubUri_ = "";
    private int startMs_;

    static {
        Timeline timeline = new Timeline();
        DEFAULT_INSTANCE = timeline;
        h.registerDefaultInstance(Timeline.class, timeline);
    }

    private Timeline() {
    }

    public static Timeline n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003ለ\u0000\u0004ለ\u0001", new Object[]{"bitField0_", "startMs_", "endMs_", "nextSubUri_", "prevSubUri_"});
        }
        if (iOrdinal == 3) {
            return new Timeline();
        }
        if (iOrdinal == 4) {
            return new nzd1(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (Timeline.class) {
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
        return this.endMs_;
    }

    public final String p() {
        return this.nextSubUri_;
    }

    public final String q() {
        return this.prevSubUri_;
    }

    public final int r() {
        return this.startMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
