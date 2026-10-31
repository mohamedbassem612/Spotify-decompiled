package com.spotify.passkeys.v1;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.hhc;
import p.jf40;
import p.ji20;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zov0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FinishRegistrationRequest extends h implements v2j0 {
    public static final int ATTESTATION_OBJECT_FIELD_NUMBER = 5;
    public static final int CLIENT_DATA_JSON_FIELD_NUMBER = 4;
    public static final int CREDENTIAL_ID_FIELD_NUMBER = 3;
    private static final FinishRegistrationRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SIGNALS_FIELD_NUMBER = 1;
    public static final int TRANSPORTS_FIELD_NUMBER = 6;
    private static final c290 transports_converter_ = new zov0((byte) 15);
    private phc attestationObject_;
    private int bitField0_;
    private phc clientDataJson_;
    private phc credentialId_;
    private String sessionId_ = "";
    private Signals signals_;
    private int transportsMemoizedSerializedSize;
    private b290 transports_;

    static {
        FinishRegistrationRequest finishRegistrationRequest = new FinishRegistrationRequest();
        DEFAULT_INSTANCE = finishRegistrationRequest;
        h.registerDefaultInstance(FinishRegistrationRequest.class, finishRegistrationRequest);
    }

    private FinishRegistrationRequest() {
        hhc hhcVar = phc.b;
        this.credentialId_ = hhcVar;
        this.clientDataJson_ = hhcVar;
        this.attestationObject_ = hhcVar;
        this.transports_ = h.emptyIntList();
    }

    public static ji20 o() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\n\u0004\n\u0005\n\u0006,", new Object[]{"bitField0_", "signals_", "sessionId_", "credentialId_", "clientDataJson_", "attestationObject_", "transports_"});
        }
        if (iOrdinal == 3) {
            return new FinishRegistrationRequest();
        }
        if (iOrdinal == 4) {
            return new ji20();
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
        synchronized (FinishRegistrationRequest.class) {
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

    public final void p(hhc hhcVar) {
        this.attestationObject_ = hhcVar;
    }

    public final void q(hhc hhcVar) {
        this.clientDataJson_ = hhcVar;
    }

    public final void r(hhc hhcVar) {
        this.credentialId_ = hhcVar;
    }

    public final void s(String str) {
        this.sessionId_ = str;
    }

    public final void t(Signals signals) {
        signals.getClass();
        this.signals_ = signals;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
