package com.spotify.app.music.scaffolds.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.se41;
import p.te41;
import p.ue41;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class SavedStateSizeTelemetry extends h implements v2j0 {
    private static final SavedStateSizeTelemetry DEFAULT_INSTANCE;
    public static final int NAVIGATION_DIAGNOSTICS_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int REGISTRY_KEY_SIZES_FIELD_NUMBER = 4;
    public static final int THRESHOLD_TYPE_FIELD_NUMBER = 2;
    public static final int TOP_LEVEL_KEY_SIZES_FIELD_NUMBER = 3;
    public static final int TOTAL_SIZE_BYTES_FIELD_NUMBER = 1;
    private int bitField0_;
    private String navigationDiagnostics_;
    private qng0 registryKeySizes_;
    private String thresholdType_;
    private qng0 topLevelKeySizes_;
    private long totalSizeBytes_;

    static {
        SavedStateSizeTelemetry savedStateSizeTelemetry = new SavedStateSizeTelemetry();
        DEFAULT_INSTANCE = savedStateSizeTelemetry;
        h.registerDefaultInstance(SavedStateSizeTelemetry.class, savedStateSizeTelemetry);
    }

    private SavedStateSizeTelemetry() {
        qng0 qng0Var = qng0.b;
        this.topLevelKeySizes_ = qng0Var;
        this.registryKeySizes_ = qng0Var;
        this.thresholdType_ = "";
        this.navigationDiagnostics_ = "";
    }

    public static se41 p() {
        return (se41) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0002\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u00032\u00042\u0005ဈ\u0002", new Object[]{"bitField0_", "totalSizeBytes_", "thresholdType_", "topLevelKeySizes_", ue41.a, "registryKeySizes_", te41.a, "navigationDiagnostics_"});
        }
        if (iOrdinal == 3) {
            return new SavedStateSizeTelemetry();
        }
        if (iOrdinal == 4) {
            return new se41(DEFAULT_INSTANCE);
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
        synchronized (SavedStateSizeTelemetry.class) {
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
        qng0 qng0Var = this.registryKeySizes_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.registryKeySizes_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final qng0 o() {
        qng0 qng0Var = this.topLevelKeySizes_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.topLevelKeySizes_ = qng0VarH;
        return qng0VarH;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.navigationDiagnostics_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 2;
        this.thresholdType_ = str;
    }

    public final void s(long j) {
        this.bitField0_ |= 1;
        this.totalSizeBytes_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
