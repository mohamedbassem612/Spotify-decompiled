package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x44;
import p.y44;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class AndroidAppExitReasonNonAuth extends com.google.protobuf.h implements v2j0 {
    private static final AndroidAppExitReasonNonAuth DEFAULT_INSTANCE;
    public static final int EXIT_DESC_FIELD_NUMBER = 2;
    public static final int IMPORTANCE_FIELD_NUMBER = 3;
    public static final int METADATA_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PSS_FIELD_NUMBER = 5;
    public static final int REASON_FIELD_NUMBER = 1;
    public static final int RSS_FIELD_NUMBER = 6;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int SUB_REASON_FIELD_NUMBER = 9;
    public static final int TIMESTAMP_FIELD_NUMBER = 8;
    private int bitField0_;
    private long pss_;
    private long rss_;
    private int status_;
    private int subReason_;
    private long timestamp_;
    private qng0 metadata_ = qng0.b;
    private String reason_ = "";
    private String exitDesc_ = "";
    private String importance_ = "";

    static {
        AndroidAppExitReasonNonAuth androidAppExitReasonNonAuth = new AndroidAppExitReasonNonAuth();
        DEFAULT_INSTANCE = androidAppExitReasonNonAuth;
        com.google.protobuf.h.registerDefaultInstance(AndroidAppExitReasonNonAuth.class, androidAppExitReasonNonAuth);
    }

    private AndroidAppExitReasonNonAuth() {
    }

    public static x44 o() {
        return (x44) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u00072\bဂ\u0006\tင\u0007", new Object[]{"bitField0_", "reason_", "exitDesc_", "importance_", "status_", "pss_", "rss_", "metadata_", y44.a, "timestamp_", "subReason_"});
        }
        if (iOrdinal == 3) {
            return new AndroidAppExitReasonNonAuth();
        }
        if (iOrdinal == 4) {
            return new x44(DEFAULT_INSTANCE);
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
        synchronized (AndroidAppExitReasonNonAuth.class) {
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

    public final qng0 n() {
        qng0 qng0Var = this.metadata_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.metadata_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.exitDesc_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.importance_ = str;
    }

    public final void r(long j) {
        this.bitField0_ |= 16;
        this.pss_ = j;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.reason_ = str;
    }

    public final void t(long j) {
        this.bitField0_ |= 32;
        this.rss_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(int i) {
        this.bitField0_ |= 8;
        this.status_ = i;
    }

    public final void v(long j) {
        this.bitField0_ |= 64;
        this.timestamp_ = j;
    }
}
