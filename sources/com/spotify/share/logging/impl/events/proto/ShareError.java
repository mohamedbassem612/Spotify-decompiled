package com.spotify.share.logging.impl.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h771;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ShareError extends h implements v2j0 {
    public static final int CAPABILITY_FIELD_NUMBER = 3;
    private static final ShareError DEFAULT_INSTANCE;
    public static final int DESTINATION_ID_FIELD_NUMBER = 2;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int ERROR_CODE_FIELD_NUMBER = 7;
    public static final int ERROR_IS_RECOVERABLE_FIELD_NUMBER = 10;
    public static final int ERROR_LONG_DESCRIPTION_FIELD_NUMBER = 9;
    public static final int ERROR_SHORT_DESCRIPTION_FIELD_NUMBER = 8;
    public static final int INTEGRATION_FIELD_NUMBER = 4;
    public static final int INTERACTION_ID_FIELD_NUMBER = 12;
    public static final int IS_OFFLINE_FIELD_NUMBER = 13;
    private static volatile qzr0 PARSER = null;
    public static final int SEVERITY_LEVEL_FIELD_NUMBER = 11;
    public static final int SOURCE_PAGE_FIELD_NUMBER = 6;
    public static final int SOURCE_PAGE_URI_FIELD_NUMBER = 5;
    private int bitField0_;
    private int errorCode_;
    private boolean errorIsRecoverable_;
    private boolean isOffline_;
    private int severityLevel_;
    private String entityUri_ = "";
    private String destinationId_ = "";
    private String capability_ = "";
    private String integration_ = "";
    private String sourcePageUri_ = "";
    private String sourcePage_ = "";
    private String errorShortDescription_ = "";
    private String errorLongDescription_ = "";
    private String interactionId_ = "";

    static {
        ShareError shareError = new ShareError();
        DEFAULT_INSTANCE = shareError;
        h.registerDefaultInstance(ShareError.class, shareError);
    }

    private ShareError() {
    }

    public static h771 n() {
        return (h771) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007င\u0006\bဈ\u0007\tဈ\b\nဇ\t\u000bင\n\fဈ\u000b\rဇ\f", new Object[]{"bitField0_", "entityUri_", "destinationId_", "capability_", "integration_", "sourcePageUri_", "sourcePage_", "errorCode_", "errorShortDescription_", "errorLongDescription_", "errorIsRecoverable_", "severityLevel_", "interactionId_", "isOffline_"});
        }
        if (iOrdinal == 3) {
            return new ShareError();
        }
        if (iOrdinal == 4) {
            return new h771(DEFAULT_INSTANCE);
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
        synchronized (ShareError.class) {
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
        this.bitField0_ |= 4;
        this.capability_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 2;
        this.destinationId_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 1;
        this.entityUri_ = str;
    }

    public final void r(int i) {
        this.bitField0_ |= 64;
        this.errorCode_ = i;
    }

    public final void s(boolean z) {
        this.bitField0_ |= 512;
        this.errorIsRecoverable_ = z;
    }

    public final void t(String str) {
        this.bitField0_ |= 256;
        this.errorLongDescription_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.errorShortDescription_ = str;
    }

    public final void v(String str) {
        this.bitField0_ |= 8;
        this.integration_ = str;
    }

    public final void w(boolean z) {
        this.bitField0_ |= 4096;
        this.isOffline_ = z;
    }

    public final void x(int i) {
        this.bitField0_ |= 1024;
        this.severityLevel_ = i;
    }

    public final void y(String str) {
        this.bitField0_ |= 32;
        this.sourcePage_ = str;
    }

    public final void z(String str) {
        this.bitField0_ |= 16;
        this.sourcePageUri_ = str;
    }
}
