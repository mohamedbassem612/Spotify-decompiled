package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.to40;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class GetPlanOverviewViewRequest extends h implements v2j0 {
    private static final GetPlanOverviewViewRequest DEFAULT_INSTANCE;
    public static final int MUP_ENTRY_CARD_V2_ENABLED_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 1;
    private boolean mupEntryCardV2Enabled_;
    private String payload_ = "";

    static {
        GetPlanOverviewViewRequest getPlanOverviewViewRequest = new GetPlanOverviewViewRequest();
        DEFAULT_INSTANCE = getPlanOverviewViewRequest;
        h.registerDefaultInstance(GetPlanOverviewViewRequest.class, getPlanOverviewViewRequest);
    }

    private GetPlanOverviewViewRequest() {
    }

    public static to40 n() {
        return (to40) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"payload_", "mupEntryCardV2Enabled_"});
        }
        if (iOrdinal == 3) {
            return new GetPlanOverviewViewRequest();
        }
        if (iOrdinal == 4) {
            return new to40(DEFAULT_INSTANCE);
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
        synchronized (GetPlanOverviewViewRequest.class) {
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

    public final void o(boolean z) {
        this.mupEntryCardV2Enabled_ = z;
    }

    public final void p() {
        this.payload_ = "yeet";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
