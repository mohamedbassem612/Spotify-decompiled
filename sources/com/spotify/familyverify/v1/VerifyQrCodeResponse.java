package com.spotify.familyverify.v1;

import com.google.protobuf.h;
import p.bf40;
import p.gvi1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class VerifyQrCodeResponse extends h implements v2j0 {
    private static final VerifyQrCodeResponse DEFAULT_INSTANCE;
    public static final int PAGE_CONTENTS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private VerifyQrCodeResultPageContents pageContents_;

    static {
        VerifyQrCodeResponse verifyQrCodeResponse = new VerifyQrCodeResponse();
        DEFAULT_INSTANCE = verifyQrCodeResponse;
        h.registerDefaultInstance(VerifyQrCodeResponse.class, verifyQrCodeResponse);
    }

    private VerifyQrCodeResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "pageContents_"});
        }
        if (iOrdinal == 3) {
            return new VerifyQrCodeResponse();
        }
        if (iOrdinal == 4) {
            return new gvi1(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (VerifyQrCodeResponse.class) {
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

    public final VerifyQrCodeResultPageContents n() {
        VerifyQrCodeResultPageContents verifyQrCodeResultPageContents = this.pageContents_;
        return verifyQrCodeResultPageContents == null ? VerifyQrCodeResultPageContents.n() : verifyQrCodeResultPageContents;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
