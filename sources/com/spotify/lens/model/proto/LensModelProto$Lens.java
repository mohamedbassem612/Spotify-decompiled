package com.spotify.lens.model.proto;

import com.google.protobuf.h;
import p.b3c0;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class LensModelProto$Lens extends h implements v2j0 {
    private static final LensModelProto$Lens DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String identifier_ = "";

    static {
        LensModelProto$Lens lensModelProto$Lens = new LensModelProto$Lens();
        DEFAULT_INSTANCE = lensModelProto$Lens;
        h.registerDefaultInstance(LensModelProto$Lens.class, lensModelProto$Lens);
    }

    private LensModelProto$Lens() {
    }

    public static LensModelProto$Lens n() {
        return DEFAULT_INSTANCE;
    }

    public static b3c0 o(LensModelProto$Lens lensModelProto$Lens) {
        return (b3c0) DEFAULT_INSTANCE.createBuilder(lensModelProto$Lens);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"identifier_"});
        }
        if (iOrdinal == 3) {
            return new LensModelProto$Lens();
        }
        if (iOrdinal == 4) {
            return new b3c0(DEFAULT_INSTANCE);
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
        synchronized (LensModelProto$Lens.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
