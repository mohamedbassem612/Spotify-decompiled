package com.spotify.kidsaccount.api.v3.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lrz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ExpectedAccountType extends h implements v2j0 {
    private static final ExpectedAccountType DEFAULT_INSTANCE;
    public static final int FREE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PREMIUM_FIELD_NUMBER = 2;
    private int kindCase_ = 0;
    private Object kind_;

    static {
        ExpectedAccountType expectedAccountType = new ExpectedAccountType();
        DEFAULT_INSTANCE = expectedAccountType;
        h.registerDefaultInstance(ExpectedAccountType.class, expectedAccountType);
    }

    private ExpectedAccountType() {
    }

    public static ExpectedAccountType n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"kind_", "kindCase_", FreeAccount.class, PremiumAccount.class});
        }
        if (iOrdinal == 3) {
            return new ExpectedAccountType();
        }
        if (iOrdinal == 4) {
            return new lrz(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (ExpectedAccountType.class) {
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

    public final int o() {
        int i = this.kindCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final PremiumAccount p() {
        return this.kindCase_ == 2 ? (PremiumAccount) this.kind_ : PremiumAccount.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
