package com.spotify.familyverify.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h1y0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class QrCodeDisplay extends h implements v2j0 {
    private static final QrCodeDisplay DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TOTP_CONFIG_FIELD_NUMBER = 2;
    public static final int VIEW_CONTENTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private TotpParams totpConfig_;
    private QrCodeDisplayViewContents viewContents_;

    static {
        QrCodeDisplay qrCodeDisplay = new QrCodeDisplay();
        DEFAULT_INSTANCE = qrCodeDisplay;
        h.registerDefaultInstance(QrCodeDisplay.class, qrCodeDisplay);
    }

    private QrCodeDisplay() {
    }

    public static QrCodeDisplay n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "viewContents_", "totpConfig_"});
        }
        if (iOrdinal == 3) {
            return new QrCodeDisplay();
        }
        if (iOrdinal == 4) {
            return new h1y0(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (QrCodeDisplay.class) {
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

    public final TotpParams o() {
        TotpParams totpParams = this.totpConfig_;
        return totpParams == null ? TotpParams.n() : totpParams;
    }

    public final QrCodeDisplayViewContents p() {
        QrCodeDisplayViewContents qrCodeDisplayViewContents = this.viewContents_;
        return qrCodeDisplayViewContents == null ? QrCodeDisplayViewContents.o() : qrCodeDisplayViewContents;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
