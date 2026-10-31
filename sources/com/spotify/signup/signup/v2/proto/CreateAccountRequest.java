package com.spotify.signup.signup.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ijn;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CreateAccountRequest extends h implements v2j0 {
    public static final int ACCOUNT_DETAILS_FIELD_NUMBER = 2;
    public static final int CALLBACK_URI_FIELD_NUMBER = 1;
    public static final int CLIENT_INFO_FIELD_NUMBER = 3;
    private static final CreateAccountRequest DEFAULT_INSTANCE;
    public static final int FLOW_ID_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int RECAPTCHA_TOKEN_FIELD_NUMBER = 5;
    public static final int SUBMISSION_ID_FIELD_NUMBER = 7;
    public static final int TRACKING_FIELD_NUMBER = 4;
    private AccountDetails accountDetails_;
    private int bitField0_;
    private ClientInfo clientInfo_;
    private Tracking tracking_;
    private String callbackUri_ = "";
    private String recaptchaToken_ = "";
    private String submissionId_ = "";
    private String flowId_ = "";

    static {
        CreateAccountRequest createAccountRequest = new CreateAccountRequest();
        DEFAULT_INSTANCE = createAccountRequest;
        h.registerDefaultInstance(CreateAccountRequest.class, createAccountRequest);
    }

    private CreateAccountRequest() {
    }

    public static ijn o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0007Ȉ\bȈ", new Object[]{"bitField0_", "callbackUri_", "accountDetails_", "clientInfo_", "tracking_", "recaptchaToken_", "submissionId_", "flowId_"});
        }
        if (iOrdinal == 3) {
            return new CreateAccountRequest();
        }
        if (iOrdinal == 4) {
            return new ijn();
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
        synchronized (CreateAccountRequest.class) {
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

    public final void p(AccountDetails accountDetails) {
        this.accountDetails_ = accountDetails;
        this.bitField0_ |= 1;
    }

    public final void q() {
        this.callbackUri_ = "https://auth-callback.spotify.com/r/android/music/signup";
    }

    public final void r(ClientInfo clientInfo) {
        this.clientInfo_ = clientInfo;
        this.bitField0_ |= 2;
    }

    public final void s(String str) {
        this.flowId_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.recaptchaToken_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(Tracking tracking) {
        this.tracking_ = tracking;
        this.bitField0_ |= 4;
    }
}
