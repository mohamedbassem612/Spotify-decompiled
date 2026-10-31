package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qvg1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sug1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class Trigger extends h implements v2j0 {
    private static final Trigger DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PATTERN_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String pattern_ = "";
    private int type_;

    static {
        Trigger trigger = new Trigger();
        DEFAULT_INSTANCE = trigger;
        h.registerDefaultInstance(Trigger.class, trigger);
    }

    private Trigger() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"type_", "pattern_"});
        }
        if (iOrdinal == 3) {
            return new Trigger();
        }
        if (iOrdinal == 4) {
            return new sug1((byte) 0);
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
        synchronized (Trigger.class) {
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

    public final String o() {
        return this.pattern_;
    }

    public final qvg1 p() {
        qvg1 qvg1Var;
        int i = this.type_;
        if (i == 0) {
            qvg1Var = qvg1.TRIGGER_TYPE_UNKNOWN;
        } else if (i == 1) {
            qvg1Var = qvg1.URI;
        } else if (i != 2) {
            qvg1Var = i != 3 ? null : qvg1.PLAYBACK_STARTED;
        } else {
            qvg1Var = qvg1.CLIENT_EVENT;
        }
        return qvg1Var == null ? qvg1.UNRECOGNIZED : qvg1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
