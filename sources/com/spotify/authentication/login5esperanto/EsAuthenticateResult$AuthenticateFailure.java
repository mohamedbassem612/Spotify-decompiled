package com.spotify.authentication.login5esperanto;

import com.google.protobuf.h;
import p.alz;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zjy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EsAuthenticateResult$AuthenticateFailure extends h implements v2j0 {
    private static final EsAuthenticateResult$AuthenticateFailure DEFAULT_INSTANCE;
    public static final int FAILURE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int UNKNOWNFAILURE_FIELD_NUMBER = 2;
    private int reasonCase_ = 0;
    private Object reason_;

    static {
        EsAuthenticateResult$AuthenticateFailure esAuthenticateResult$AuthenticateFailure = new EsAuthenticateResult$AuthenticateFailure();
        DEFAULT_INSTANCE = esAuthenticateResult$AuthenticateFailure;
        h.registerDefaultInstance(EsAuthenticateResult$AuthenticateFailure.class, esAuthenticateResult$AuthenticateFailure);
    }

    private EsAuthenticateResult$AuthenticateFailure() {
    }

    public static EsAuthenticateResult$AuthenticateFailure o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"reason_", "reasonCase_", UnknownReason.class});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateResult$AuthenticateFailure();
        }
        if (iOrdinal == 4) {
            return new c();
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
        synchronized (EsAuthenticateResult$AuthenticateFailure.class) {
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

    public final alz p() {
        int i = this.reasonCase_;
        alz alzVar = alz.success;
        if (i == 1) {
            switch (((Integer) this.reason_).intValue()) {
                case 0:
                    break;
                case 1:
                    alzVar = alz.aborted;
                    break;
                case 2:
                    alzVar = alz.unsupportedResponse;
                    break;
                case 3:
                    alzVar = alz.nonSuccessfulResponse;
                    break;
                case 4:
                    alzVar = alz.httpTransportError;
                    break;
                case 5:
                    alzVar = alz.unsupportedAuthenticationMethod;
                    break;
                case 6:
                    alzVar = alz.invalidArguments;
                    break;
                case 7:
                    alzVar = alz.unknownBackendError;
                    break;
                case 8:
                    alzVar = alz.invalidCredentials;
                    break;
                case 9:
                    alzVar = alz.badRequest;
                    break;
                case 10:
                    alzVar = alz.unsupportedLoginProtocol;
                    break;
                case 11:
                    alzVar = alz.timeout;
                    break;
                case 12:
                    alzVar = alz.unknownIdentifier;
                    break;
                case 13:
                    alzVar = alz.tooManyAttempts;
                    break;
                case 14:
                    alzVar = alz.invalidPhoneNumber;
                    break;
                case 15:
                    alzVar = alz.tryAgainLater;
                    break;
                case 16:
                    alzVar = alz.hashMismatch;
                    break;
                case 17:
                    alzVar = alz.notAllowed;
                    break;
                default:
                    alzVar = null;
                    break;
            }
            if (alzVar == null) {
                return alz.UNRECOGNIZED;
            }
        }
        return alzVar;
    }

    public final int q() {
        if (this.reasonCase_ == 1) {
            return ((Integer) this.reason_).intValue();
        }
        return 0;
    }

    public final int r() {
        return zjy.b(this.reasonCase_);
    }

    public final UnknownReason s() {
        return this.reasonCase_ == 2 ? (UnknownReason) this.reason_ : UnknownReason.o();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
