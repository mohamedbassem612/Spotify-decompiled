package com.spotify.gamesservice.musicguesser.v1;

import p.bf40;
import p.hk41;
import p.jf40;
import p.jo41;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ScoreThresholdMap extends com.google.protobuf.h implements v2j0 {
    private static final ScoreThresholdMap DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SCORE_THRESHOLD_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int scoreThreshold_;
    private String value_ = "";

    static {
        ScoreThresholdMap scoreThresholdMap = new ScoreThresholdMap();
        DEFAULT_INSTANCE = scoreThresholdMap;
        com.google.protobuf.h.registerDefaultInstance(ScoreThresholdMap.class, scoreThresholdMap);
    }

    private ScoreThresholdMap() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"scoreThreshold_", "value_"});
        }
        if (iOrdinal == 3) {
            return new ScoreThresholdMap();
        }
        if (iOrdinal == 4) {
            return new hk41(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (ScoreThresholdMap.class) {
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

    public final String getValue() {
        return this.value_;
    }

    public final jo41 n() {
        jo41 jo41VarA = jo41.a(this.scoreThreshold_);
        return jo41VarA == null ? jo41.UNRECOGNIZED : jo41VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
