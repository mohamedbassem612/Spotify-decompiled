package com.spotify.deeplinkimpl.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vcr;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class DeeplinkOpenError extends h implements v2j0 {
    private static final DeeplinkOpenError DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 4;
    public static final int ERROR_IS_WARNING_FIELD_NUMBER = 5;
    public static final int ERROR_REASON_FIELD_NUMBER = 3;
    public static final int LINK_DESCRIPTION_FIELD_NUMBER = 2;
    public static final int LINK_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SHORTLINK_SESSION_ID_FIELD_NUMBER = 6;
    private int bitField0_;
    private int errorCode_;
    private boolean errorIsWarning_;
    private String link_ = "";
    private String linkDescription_ = "";
    private String errorReason_ = "";
    private String shortlinkSessionId_ = "";

    static {
        DeeplinkOpenError deeplinkOpenError = new DeeplinkOpenError();
        DEFAULT_INSTANCE = deeplinkOpenError;
        h.registerDefaultInstance(DeeplinkOpenError.class, deeplinkOpenError);
    }

    private DeeplinkOpenError() {
    }

    public static vcr n() {
        return (vcr) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "link_", "linkDescription_", "errorReason_", "errorCode_", "errorIsWarning_", "shortlinkSessionId_"});
        }
        if (iOrdinal == 3) {
            return new DeeplinkOpenError();
        }
        if (iOrdinal == 4) {
            return new vcr(DEFAULT_INSTANCE);
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
        synchronized (DeeplinkOpenError.class) {
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

    public final void o(int i) {
        this.bitField0_ |= 8;
        this.errorCode_ = i;
    }

    public final void p() {
        this.bitField0_ |= 16;
        this.errorIsWarning_ = false;
    }

    public final void q(String str) {
        this.bitField0_ |= 4;
        this.errorReason_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.link_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 2;
        this.linkDescription_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
