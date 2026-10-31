package com.spotify.share.logging.impl.events.proto;

import com.google.protobuf.h;
import p.a471;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ShareDebugError extends h implements v2j0 {
    public static final int COMPRESSED_ERROR_DATA_FIELD_NUMBER = 5;
    private static final ShareDebugError DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 4;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 2;
    public static final int ERROR_STACKTRACE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TAG_FIELD_NUMBER = 1;
    private int bitField0_;
    private int errorCode_;
    private String tag_ = "";
    private String errorDescription_ = "";
    private String errorStacktrace_ = "";
    private h290 compressedErrorData_ = h.emptyProtobufList();

    static {
        ShareDebugError shareDebugError = new ShareDebugError();
        DEFAULT_INSTANCE = shareDebugError;
        h.registerDefaultInstance(ShareDebugError.class, shareDebugError);
    }

    private ShareDebugError() {
    }

    public static a471 n() {
        return (a471) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005\u001c", new Object[]{"bitField0_", "tag_", "errorDescription_", "errorStacktrace_", "errorCode_", "compressedErrorData_"});
        }
        if (iOrdinal == 3) {
            return new ShareDebugError();
        }
        if (iOrdinal == 4) {
            return new a471(DEFAULT_INSTANCE);
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
        synchronized (ShareDebugError.class) {
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

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.errorDescription_ = str;
    }

    public final void setTag(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.tag_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
