package com.spotify.libs.connect.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.n4e;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class CastTransferSteps extends h implements v2j0 {
    private static final CastTransferSteps DEFAULT_INSTANCE;
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE_FIELD_NUMBER = 3;
    public static final int INTERACTION_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TRANSFER_STEP_FIELD_NUMBER = 2;
    private int bitField0_;
    private long googlePlayServicesVersionCode_;
    private String interactionId_ = "";
    private String transferStep_ = "";

    static {
        CastTransferSteps castTransferSteps = new CastTransferSteps();
        DEFAULT_INSTANCE = castTransferSteps;
        h.registerDefaultInstance(CastTransferSteps.class, castTransferSteps);
    }

    private CastTransferSteps() {
    }

    public static n4e n() {
        return (n4e) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "interactionId_", "transferStep_", "googlePlayServicesVersionCode_"});
        }
        if (iOrdinal == 3) {
            return new CastTransferSteps();
        }
        if (iOrdinal == 4) {
            return new n4e(DEFAULT_INSTANCE);
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
        synchronized (CastTransferSteps.class) {
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

    public final void o(long j) {
        this.bitField0_ |= 4;
        this.googlePlayServicesVersionCode_ = j;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.interactionId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.transferStep_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
