package com.spotify.libs.connect.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.k4e;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class CastTransferErrors extends h implements v2j0 {
    private static final CastTransferErrors DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 5;
    public static final int ERROR_TYPE_FIELD_NUMBER = 4;
    public static final int INTERACTION_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int ROUTE_ID_FIELD_NUMBER = 1;
    public static final int TRANSFER_STATE_REACHED_FIELD_NUMBER = 3;
    private int bitField0_;
    private String routeId_ = "";
    private String interactionId_ = "";
    private String transferStateReached_ = "";
    private String errorType_ = "";
    private String errorMessage_ = "";

    static {
        CastTransferErrors castTransferErrors = new CastTransferErrors();
        DEFAULT_INSTANCE = castTransferErrors;
        h.registerDefaultInstance(CastTransferErrors.class, castTransferErrors);
    }

    private CastTransferErrors() {
    }

    public static k4e n() {
        return (k4e) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "routeId_", "interactionId_", "transferStateReached_", "errorType_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new CastTransferErrors();
        }
        if (iOrdinal == 4) {
            return new k4e(DEFAULT_INSTANCE);
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
        synchronized (CastTransferErrors.class) {
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

    public final void o(String str) {
        this.bitField0_ |= 16;
        this.errorMessage_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 8;
        this.errorType_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 2;
        this.interactionId_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 1;
        this.routeId_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 4;
        this.transferStateReached_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
