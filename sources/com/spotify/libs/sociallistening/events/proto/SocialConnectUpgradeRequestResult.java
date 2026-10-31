package com.spotify.libs.sociallistening.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.py91;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class SocialConnectUpgradeRequestResult extends h implements v2j0 {
    public static final int ATTEMPT_ID_FIELD_NUMBER = 7;
    private static final SocialConnectUpgradeRequestResult DEFAULT_INSTANCE;
    public static final int ERROR_CATEGORY_FIELD_NUMBER = 6;
    public static final int ERROR_DATA_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SURFACE_FIELD_NUMBER = 4;
    public static final int TRIGGER_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String sessionId_ = "";
    private String type_ = "";
    private String trigger_ = "";
    private String surface_ = "";
    private String errorData_ = "";
    private String errorCategory_ = "";
    private String attemptId_ = "";

    static {
        SocialConnectUpgradeRequestResult socialConnectUpgradeRequestResult = new SocialConnectUpgradeRequestResult();
        DEFAULT_INSTANCE = socialConnectUpgradeRequestResult;
        h.registerDefaultInstance(SocialConnectUpgradeRequestResult.class, socialConnectUpgradeRequestResult);
    }

    private SocialConnectUpgradeRequestResult() {
    }

    public static py91 n() {
        return (py91) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "sessionId_", "type_", "trigger_", "surface_", "errorData_", "errorCategory_", "attemptId_"});
        }
        if (iOrdinal == 3) {
            return new SocialConnectUpgradeRequestResult();
        }
        if (iOrdinal == 4) {
            return new py91(DEFAULT_INSTANCE);
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
        synchronized (SocialConnectUpgradeRequestResult.class) {
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
        str.getClass();
        this.bitField0_ |= 64;
        this.attemptId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 32;
        this.errorCategory_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 16;
        this.errorData_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    public final void s() {
        this.bitField0_ |= 8;
        this.surface_ = "manage-requests-sheet";
    }

    public final void t(String str) {
        this.bitField0_ |= 4;
        this.trigger_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.bitField0_ |= 2;
        this.type_ = str;
    }
}
