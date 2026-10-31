package com.spotify.deeplinkimpl.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.l181;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ShortlinkOpenResult extends h implements v2j0 {
    private static final ShortlinkOpenResult DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 5;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 6;
    public static final int ORIGINAL_LINK_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int RESOLVED_URL_FIELD_NUMBER = 3;
    public static final int SHORTLINK_SESSION_ID_FIELD_NUMBER = 1;
    public static final int SUCCESS_FIELD_NUMBER = 2;
    private int bitField0_;
    private int errorCode_;
    private boolean success_;
    private String shortlinkSessionId_ = "";
    private String resolvedUrl_ = "";
    private String originalLink_ = "";
    private String errorMessage_ = "";

    static {
        ShortlinkOpenResult shortlinkOpenResult = new ShortlinkOpenResult();
        DEFAULT_INSTANCE = shortlinkOpenResult;
        h.registerDefaultInstance(ShortlinkOpenResult.class, shortlinkOpenResult);
    }

    private ShortlinkOpenResult() {
    }

    public static l181 n() {
        return (l181) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "shortlinkSessionId_", "success_", "resolvedUrl_", "originalLink_", "errorCode_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new ShortlinkOpenResult();
        }
        if (iOrdinal == 4) {
            return new l181(DEFAULT_INSTANCE);
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
        synchronized (ShortlinkOpenResult.class) {
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
        this.bitField0_ |= 16;
        this.errorCode_ = i;
    }

    public final void p(String str) {
        this.bitField0_ |= 32;
        this.errorMessage_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.originalLink_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 4;
        this.resolvedUrl_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.shortlinkSessionId_ = str;
    }

    public final void t(boolean z) {
        this.bitField0_ |= 2;
        this.success_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
