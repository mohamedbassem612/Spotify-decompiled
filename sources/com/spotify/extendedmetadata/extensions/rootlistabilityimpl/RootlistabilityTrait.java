package com.spotify.extendedmetadata.extensions.rootlistabilityimpl;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u831;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class RootlistabilityTrait extends h implements v2j0 {
    private static final RootlistabilityTrait DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int ROOTLISTABLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean rootlistable_;

    static {
        RootlistabilityTrait rootlistabilityTrait = new RootlistabilityTrait();
        DEFAULT_INSTANCE = rootlistabilityTrait;
        h.registerDefaultInstance(RootlistabilityTrait.class, rootlistabilityTrait);
    }

    private RootlistabilityTrait() {
    }

    public static RootlistabilityTrait o(byte[] bArr) {
        return (RootlistabilityTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "rootlistable_"});
        }
        if (iOrdinal == 3) {
            return new RootlistabilityTrait();
        }
        if (iOrdinal == 4) {
            return new u831(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (RootlistabilityTrait.class) {
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
        return this.rootlistable_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
