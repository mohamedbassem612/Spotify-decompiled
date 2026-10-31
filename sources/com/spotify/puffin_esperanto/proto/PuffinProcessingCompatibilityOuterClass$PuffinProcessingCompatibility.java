package com.spotify.puffin_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h1y0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PuffinProcessingCompatibilityOuterClass$PuffinProcessingCompatibility extends h implements v2j0 {
    private static final PuffinProcessingCompatibilityOuterClass$PuffinProcessingCompatibility DEFAULT_INSTANCE;
    public static final int IS_COMPATIBLE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private boolean isCompatible_;

    static {
        PuffinProcessingCompatibilityOuterClass$PuffinProcessingCompatibility puffinProcessingCompatibilityOuterClass$PuffinProcessingCompatibility = new PuffinProcessingCompatibilityOuterClass$PuffinProcessingCompatibility();
        DEFAULT_INSTANCE = puffinProcessingCompatibilityOuterClass$PuffinProcessingCompatibility;
        h.registerDefaultInstance(PuffinProcessingCompatibilityOuterClass$PuffinProcessingCompatibility.class, puffinProcessingCompatibilityOuterClass$PuffinProcessingCompatibility);
    }

    private PuffinProcessingCompatibilityOuterClass$PuffinProcessingCompatibility() {
    }

    public static PuffinProcessingCompatibilityOuterClass$PuffinProcessingCompatibility o(byte[] bArr) {
        return (PuffinProcessingCompatibilityOuterClass$PuffinProcessingCompatibility) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isCompatible_"});
        }
        if (iOrdinal == 3) {
            return new PuffinProcessingCompatibilityOuterClass$PuffinProcessingCompatibility();
        }
        if (iOrdinal == 4) {
            return new h1y0(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (PuffinProcessingCompatibilityOuterClass$PuffinProcessingCompatibility.class) {
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

    public final boolean n() {
        return this.isCompatible_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
