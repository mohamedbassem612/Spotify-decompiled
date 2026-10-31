package com.spotify.microsoftcontinuity.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.krj0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class MicrosoftContinuityConnected extends h implements v2j0 {
    public static final int CONNECTED_FIELD_NUMBER = 1;
    private static final MicrosoftContinuityConnected DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private boolean connected_;

    static {
        MicrosoftContinuityConnected microsoftContinuityConnected = new MicrosoftContinuityConnected();
        DEFAULT_INSTANCE = microsoftContinuityConnected;
        h.registerDefaultInstance(MicrosoftContinuityConnected.class, microsoftContinuityConnected);
    }

    private MicrosoftContinuityConnected() {
    }

    public static krj0 n() {
        return (krj0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "connected_"});
        }
        if (iOrdinal == 3) {
            return new MicrosoftContinuityConnected();
        }
        if (iOrdinal == 4) {
            return new krj0(DEFAULT_INSTANCE);
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
        synchronized (MicrosoftContinuityConnected.class) {
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

    public final void o() {
        this.bitField0_ |= 1;
        this.connected_ = true;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
