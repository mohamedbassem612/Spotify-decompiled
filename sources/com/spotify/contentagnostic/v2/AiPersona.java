package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.c13;
import p.dw0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class AiPersona extends h implements v2j0 {
    public static final int CONFIRMED_FIELD_NUMBER = 1;
    private static final AiPersona DEFAULT_INSTANCE;
    public static final int LIKELY_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int classificationCase_ = 0;
    private Object classification_;

    static {
        AiPersona aiPersona = new AiPersona();
        DEFAULT_INSTANCE = aiPersona;
        h.registerDefaultInstance(AiPersona.class, aiPersona);
    }

    private AiPersona() {
    }

    public static AiPersona p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"classification_", "classificationCase_", AiPersonaConfirmed.class, AiPersonaLikely.class});
        }
        if (iOrdinal == 3) {
            return new AiPersona();
        }
        if (iOrdinal == 4) {
            return new dw0((byte) 21);
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
        synchronized (AiPersona.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return c13.a(this.classificationCase_);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
