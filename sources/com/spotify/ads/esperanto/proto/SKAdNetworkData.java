package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u831;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SKAdNetworkData extends h implements v2j0 {
    public static final int ADVERTISED_APP_IDENTIFIER_FIELD_NUMBER = 9;
    private static final SKAdNetworkData DEFAULT_INSTANCE;
    public static final int NETWORK_IDENTIFIER_FIELD_NUMBER = 4;
    public static final int NONCE_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int SIGNATURE_STORE_KIT_FIELD_NUMBER = 1;
    public static final int SIGNATURE_VIEW_THROUGH_FIELD_NUMBER = 2;
    public static final int SOURCE_APP_IDENTIFIER_FIELD_NUMBER = 8;
    public static final int SOURCE_IDENTIFIER_FIELD_NUMBER = 5;
    public static final int TIMESTAMP_FIELD_NUMBER = 6;
    public static final int VERSION_FIELD_NUMBER = 3;
    private long timestamp_;
    private String signatureStoreKit_ = "";
    private String signatureViewThrough_ = "";
    private String version_ = "";
    private String networkIdentifier_ = "";
    private String sourceIdentifier_ = "";
    private String nonce_ = "";
    private String sourceAppIdentifier_ = "";
    private String advertisedAppIdentifier_ = "";

    static {
        SKAdNetworkData sKAdNetworkData = new SKAdNetworkData();
        DEFAULT_INSTANCE = sKAdNetworkData;
        h.registerDefaultInstance(SKAdNetworkData.class, sKAdNetworkData);
    }

    private SKAdNetworkData() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0002\u0007Ȉ\bȈ\tȈ", new Object[]{"signatureStoreKit_", "signatureViewThrough_", "version_", "networkIdentifier_", "sourceIdentifier_", "timestamp_", "nonce_", "sourceAppIdentifier_", "advertisedAppIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new SKAdNetworkData();
        }
        if (iOrdinal == 4) {
            return new u831(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (SKAdNetworkData.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
