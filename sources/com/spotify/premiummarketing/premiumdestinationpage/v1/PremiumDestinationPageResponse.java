package com.spotify.premiummarketing.premiumdestinationpage.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r4v0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PremiumDestinationPageResponse extends h implements v2j0 {
    public static final int BODY_COMPONENTS_FIELD_NUMBER = 3;
    private static final PremiumDestinationPageResponse DEFAULT_INSTANCE;
    public static final int EXPERIMENTS_FIELD_NUMBER = 4;
    public static final int HEADER_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private PdpExperiments experiments_;
    private PDPComponent header_;
    private String id_ = "";
    private h290 bodyComponents_ = h.emptyProtobufList();

    static {
        PremiumDestinationPageResponse premiumDestinationPageResponse = new PremiumDestinationPageResponse();
        DEFAULT_INSTANCE = premiumDestinationPageResponse;
        h.registerDefaultInstance(PremiumDestinationPageResponse.class, premiumDestinationPageResponse);
    }

    private PremiumDestinationPageResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004ဉ\u0001", new Object[]{"bitField0_", "id_", "header_", "bodyComponents_", PDPComponent.class, "experiments_"});
        }
        if (iOrdinal == 3) {
            return new PremiumDestinationPageResponse();
        }
        if (iOrdinal == 4) {
            return new r4v0(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (PremiumDestinationPageResponse.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final h290 n() {
        return this.bodyComponents_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final PdpExperiments o() {
        PdpExperiments pdpExperiments = this.experiments_;
        return pdpExperiments == null ? PdpExperiments.n() : pdpExperiments;
    }

    public final PDPComponent p() {
        PDPComponent pDPComponent = this.header_;
        return pDPComponent == null ? PDPComponent.p() : pDPComponent;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
