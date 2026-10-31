package com.spotify.lens.model.proto;

import com.google.protobuf.h;
import p.bf40;
import p.c3c0;
import p.d3c0;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class LensModelProto$LensState extends h implements d3c0 {
    private static final LensModelProto$LensState DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REVISION_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 3;
    private int bitField0_;
    private String identifier_ = "";
    private phc revision_ = phc.b;
    private LensModelProto$LensStatus status_;

    static {
        LensModelProto$LensState lensModelProto$LensState = new LensModelProto$LensState();
        DEFAULT_INSTANCE = lensModelProto$LensState;
        h.registerDefaultInstance(LensModelProto$LensState.class, lensModelProto$LensState);
    }

    private LensModelProto$LensState() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "identifier_", "revision_", "status_"});
        }
        if (iOrdinal == 3) {
            return new LensModelProto$LensState();
        }
        if (iOrdinal == 4) {
            return new c3c0(DEFAULT_INSTANCE);
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
        synchronized (LensModelProto$LensState.class) {
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
