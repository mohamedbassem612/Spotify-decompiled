package com.spotify.upsells.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.szh1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class UpsellMigrationParity extends h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int CTA_COMPARISON_FIELD_NUMBER = 7;
    private static final UpsellMigrationParity DEFAULT_INSTANCE;
    public static final int FEATURE_ID_FIELD_NUMBER = 1;
    public static final int LATENCY_MS_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 3;
    public static final int REQUESTED_PRESENTATION_FIELD_NUMBER = 4;
    public static final int RESULT_FIELD_NUMBER = 5;
    public static final int SHADOW_TEST_VERSION_FIELD_NUMBER = 8;
    private int bitField0_;
    private long latencyMs_;
    private int shadowTestVersion_;
    private String featureId_ = "";
    private String action_ = "";
    private String reason_ = "";
    private String requestedPresentation_ = "";
    private String result_ = "";
    private String ctaComparison_ = "";

    static {
        UpsellMigrationParity upsellMigrationParity = new UpsellMigrationParity();
        DEFAULT_INSTANCE = upsellMigrationParity;
        h.registerDefaultInstance(UpsellMigrationParity.class, upsellMigrationParity);
    }

    private UpsellMigrationParity() {
    }

    public static szh1 n() {
        return (szh1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bင\u0007", new Object[]{"bitField0_", "featureId_", "action_", "reason_", "requestedPresentation_", "result_", "latencyMs_", "ctaComparison_", "shadowTestVersion_"});
        }
        if (iOrdinal == 3) {
            return new UpsellMigrationParity();
        }
        if (iOrdinal == 4) {
            return new szh1(DEFAULT_INSTANCE);
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
        synchronized (UpsellMigrationParity.class) {
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
        this.action_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.ctaComparison_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.featureId_ = str;
    }

    public final void r(long j) {
        this.bitField0_ |= 32;
        this.latencyMs_ = j;
    }

    public final void s(String str) {
        this.bitField0_ |= 4;
        this.reason_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.requestedPresentation_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.result_ = str;
    }

    public final void v() {
        this.bitField0_ |= 128;
        this.shadowTestVersion_ = 1;
    }
}
