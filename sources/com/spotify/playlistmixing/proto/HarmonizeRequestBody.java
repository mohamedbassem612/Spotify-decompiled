package com.spotify.playlistmixing.proto;

import com.google.protobuf.h;
import p.bf40;
import p.it50;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class HarmonizeRequestBody extends h implements v2j0 {
    public static final int CHAINS_FIELD_NUMBER = 5;
    private static final HarmonizeRequestBody DEFAULT_INSTANCE;
    public static final int EXCLUSIONS_FIELD_NUMBER = 3;
    public static final int MANUALOPS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Chains chains_;
    private Exclusions exclusions_;
    private ManualOps manualOps_;
    private String uri_ = "";

    static {
        HarmonizeRequestBody harmonizeRequestBody = new HarmonizeRequestBody();
        DEFAULT_INSTANCE = harmonizeRequestBody;
        h.registerDefaultInstance(HarmonizeRequestBody.class, harmonizeRequestBody);
    }

    private HarmonizeRequestBody() {
    }

    public static it50 n() {
        return (it50) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "uri_", "exclusions_", "manualOps_", "chains_"});
        }
        if (iOrdinal == 3) {
            return new HarmonizeRequestBody();
        }
        if (iOrdinal == 4) {
            return new it50(DEFAULT_INSTANCE);
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
        synchronized (HarmonizeRequestBody.class) {
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

    public final void o(Chains chains) {
        this.chains_ = chains;
        this.bitField0_ |= 4;
    }

    public final void p(Exclusions exclusions) {
        exclusions.getClass();
        this.exclusions_ = exclusions;
        this.bitField0_ |= 1;
    }

    public final void q(ManualOps manualOps) {
        this.manualOps_ = manualOps;
        this.bitField0_ |= 2;
    }

    public final void r(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
