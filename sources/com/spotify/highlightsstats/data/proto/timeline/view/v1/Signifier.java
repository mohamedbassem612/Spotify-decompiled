package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import p.bf40;
import p.bn81;
import p.hn81;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Signifier extends h implements v2j0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 3;
    private static final Signifier DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SIGNIFIERTYPE_FIELD_NUMBER = 2;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int signifierType_;
    private String text_ = "";
    private String accessibilityDescription_ = "";

    static {
        Signifier signifier = new Signifier();
        DEFAULT_INSTANCE = signifier;
        h.registerDefaultInstance(Signifier.class, signifier);
    }

    private Signifier() {
    }

    public static Signifier o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"text_", "signifierType_", "accessibilityDescription_"});
        }
        if (iOrdinal == 3) {
            return new Signifier();
        }
        if (iOrdinal == 4) {
            return new bn81(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (Signifier.class) {
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

    public final String n() {
        return this.accessibilityDescription_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final hn81 p() {
        hn81 hn81Var;
        int i = this.signifierType_;
        if (i == 0) {
            hn81Var = hn81.UNSPECIFIED_TYPE;
        } else if (i == 1) {
            hn81Var = hn81.LOCAL;
        } else if (i != 2) {
            hn81Var = i != 3 ? null : hn81.CHART;
        } else {
            hn81Var = hn81.GLOBAL;
        }
        return hn81Var == null ? hn81.UNRECOGNIZED : hn81Var;
    }

    public final String q() {
        return this.text_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
