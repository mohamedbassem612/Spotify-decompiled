package com.spotify.share.logging.impl.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.v771;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ShareFormatError extends h implements v2j0 {
    private static final ShareFormatError DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    public static final int ERROR_CODE_FIELD_NUMBER = 3;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 4;
    public static final int ERROR_STACKTRACE_FIELD_NUMBER = 5;
    public static final int IS_OFFLINE_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_FORMAT_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private int errorCode_;
    private boolean isOffline_;
    private String shareFormatId_ = "";
    private String entityUri_ = "";
    private String errorDescription_ = "";
    private String errorStacktrace_ = "";

    static {
        ShareFormatError shareFormatError = new ShareFormatError();
        DEFAULT_INSTANCE = shareFormatError;
        h.registerDefaultInstance(ShareFormatError.class, shareFormatError);
    }

    private ShareFormatError() {
    }

    public static v771 n() {
        return (v771) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "shareFormatId_", "entityUri_", "errorCode_", "errorDescription_", "errorStacktrace_", "isOffline_"});
        }
        if (iOrdinal == 3) {
            return new ShareFormatError();
        }
        if (iOrdinal == 4) {
            return new v771(DEFAULT_INSTANCE);
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
        synchronized (ShareFormatError.class) {
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
        this.bitField0_ |= 2;
        this.entityUri_ = str;
    }

    public final void p(int i) {
        this.bitField0_ |= 4;
        this.errorCode_ = i;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.errorDescription_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 16;
        this.errorStacktrace_ = str;
    }

    public final void s(boolean z) {
        this.bitField0_ |= 32;
        this.isOffline_ = z;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.shareFormatId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
