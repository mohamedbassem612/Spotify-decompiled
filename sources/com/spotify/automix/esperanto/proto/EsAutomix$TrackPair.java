package com.spotify.automix.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.nlz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsAutomix$TrackPair extends h implements v2j0 {
    private static final EsAutomix$TrackPair DEFAULT_INSTANCE;
    public static final int ITEM_SPEED_A_FIELD_NUMBER = 3;
    public static final int ITEM_SPEED_B_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TRACK_A_URI_FIELD_NUMBER = 1;
    public static final int TRACK_B_URI_FIELD_NUMBER = 2;
    private double itemSpeedA_;
    private double itemSpeedB_;
    private String trackAUri_ = "";
    private String trackBUri_ = "";

    static {
        EsAutomix$TrackPair esAutomix$TrackPair = new EsAutomix$TrackPair();
        DEFAULT_INSTANCE = esAutomix$TrackPair;
        h.registerDefaultInstance(EsAutomix$TrackPair.class, esAutomix$TrackPair);
    }

    private EsAutomix$TrackPair() {
    }

    public static nlz n() {
        return (nlz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0000\u0004\u0000", new Object[]{"trackAUri_", "trackBUri_", "itemSpeedA_", "itemSpeedB_"});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$TrackPair();
        }
        if (iOrdinal == 4) {
            return new nlz(DEFAULT_INSTANCE);
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
        synchronized (EsAutomix$TrackPair.class) {
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

    public final void o(double d) {
        this.itemSpeedA_ = d;
    }

    public final void p(double d) {
        this.itemSpeedB_ = d;
    }

    public final void q(String str) {
        str.getClass();
        this.trackAUri_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.trackBUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
