package com.spotify.contentagnostic.v2;

import com.google.protobuf.h;
import p.bf40;
import p.gvi1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class Verification extends h implements v2j0 {
    public static final int AI_PERSONA_FIELD_NUMBER = 3;
    private static final Verification DEFAULT_INSTANCE;
    public static final int IS_REGISTERED_FIELD_NUMBER = 1;
    public static final int IS_VERIFIED_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private AiPersona aiPersona_;
    private int bitField0_;
    private boolean isRegistered_;
    private boolean isVerified_;

    static {
        Verification verification = new Verification();
        DEFAULT_INSTANCE = verification;
        h.registerDefaultInstance(Verification.class, verification);
    }

    private Verification() {
    }

    public static Verification p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003ဉ\u0000", new Object[]{"bitField0_", "isRegistered_", "isVerified_", "aiPersona_"});
        }
        if (iOrdinal == 3) {
            return new Verification();
        }
        if (iOrdinal == 4) {
            return new gvi1((byte) 6);
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
        synchronized (Verification.class) {
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

    public final AiPersona o() {
        AiPersona aiPersona = this.aiPersona_;
        return aiPersona == null ? AiPersona.p() : aiPersona;
    }

    public final boolean q() {
        return this.isRegistered_;
    }

    public final boolean r() {
        return this.isVerified_;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
