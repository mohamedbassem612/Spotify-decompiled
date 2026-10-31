package com.spotify.bumblebee.playability.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ets0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xst0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class Playability extends h implements v2j0 {
    private static final Playability DEFAULT_INSTANCE;
    public static final int IS_PLAYABLE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private boolean isPlayable_;
    private int reason_;

    static {
        Playability playability = new Playability();
        DEFAULT_INSTANCE = playability;
        h.registerDefaultInstance(Playability.class, playability);
    }

    private Playability() {
    }

    public static Playability p(byte[] bArr) {
        return (Playability) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\f", new Object[]{"isPlayable_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new Playability();
        }
        if (iOrdinal == 4) {
            return new ets0((byte) 23);
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
        synchronized (Playability.class) {
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

    public final boolean getIsPlayable() {
        return this.isPlayable_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final xst0 o() {
        xst0 xst0VarA = xst0.a(this.reason_);
        return xst0VarA == null ? xst0.g : xst0VarA;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
