package com.spotify.extendedmetadata.extensions.beatsimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uca;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class BeatsProto$Beat extends h implements v2j0 {
    public static final int BEAT_CONFIDENCE_FIELD_NUMBER = 4;
    private static final BeatsProto$Beat DEFAULT_INSTANCE;
    public static final int DOWNBEAT_CONFIDENCE_FIELD_NUMBER = 5;
    public static final int DURATION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TIME_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 3;
    private float beatConfidence_;
    private float downbeatConfidence_;
    private float duration_;
    private float time_;
    private int value_;

    static {
        BeatsProto$Beat beatsProto$Beat = new BeatsProto$Beat();
        DEFAULT_INSTANCE = beatsProto$Beat;
        h.registerDefaultInstance(BeatsProto$Beat.class, beatsProto$Beat);
    }

    private BeatsProto$Beat() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0004\u0004\u0001\u0005\u0001", new Object[]{"time_", "duration_", "value_", "beatConfidence_", "downbeatConfidence_"});
        }
        if (iOrdinal == 3) {
            return new BeatsProto$Beat();
        }
        if (iOrdinal == 4) {
            return new uca(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (BeatsProto$Beat.class) {
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

    public final int getValue() {
        return this.value_;
    }

    public final float n() {
        return this.beatConfidence_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final float o() {
        return this.downbeatConfidence_;
    }

    public final float p() {
        return this.duration_;
    }

    public final float q() {
        return this.time_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
