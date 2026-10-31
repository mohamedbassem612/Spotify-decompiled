package com.spotify.extendedmetadata.extensions.mixabilitytraitimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ljj0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class MixabilityTrait extends h implements v2j0 {
    public static final int ALLOW_MIXING_FIELD_NUMBER = 1;
    private static final MixabilityTrait DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private boolean allowMixing_;
    private int bitField0_;

    static {
        MixabilityTrait mixabilityTrait = new MixabilityTrait();
        DEFAULT_INSTANCE = mixabilityTrait;
        h.registerDefaultInstance(MixabilityTrait.class, mixabilityTrait);
    }

    private MixabilityTrait() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static MixabilityTrait q(byte[] bArr) {
        return (MixabilityTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "allowMixing_"});
        }
        if (iOrdinal == 3) {
            return new MixabilityTrait();
        }
        if (iOrdinal == 4) {
            return new ljj0((byte) 8);
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
        synchronized (MixabilityTrait.class) {
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

    public final boolean o() {
        return this.allowMixing_;
    }

    public final boolean p() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
