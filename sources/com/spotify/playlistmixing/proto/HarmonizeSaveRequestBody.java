package com.spotify.playlistmixing.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.kt50;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class HarmonizeSaveRequestBody extends h implements v2j0 {
    public static final int CHAINS_FIELD_NUMBER = 5;
    private static final HarmonizeSaveRequestBody DEFAULT_INSTANCE;
    public static final int ETAG_FIELD_NUMBER = 2;
    public static final int EXCLUSIONS_FIELD_NUMBER = 3;
    public static final int MANUALOPS_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Chains chains_;
    private Exclusions exclusions_;
    private ManualOps manualOps_;
    private String uri_ = "";
    private String etag_ = "";

    static {
        HarmonizeSaveRequestBody harmonizeSaveRequestBody = new HarmonizeSaveRequestBody();
        DEFAULT_INSTANCE = harmonizeSaveRequestBody;
        h.registerDefaultInstance(HarmonizeSaveRequestBody.class, harmonizeSaveRequestBody);
    }

    private HarmonizeSaveRequestBody() {
    }

    public static kt50 n() {
        return (kt50) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "uri_", "etag_", "exclusions_", "manualOps_", "chains_"});
        }
        if (iOrdinal == 3) {
            return new HarmonizeSaveRequestBody();
        }
        if (iOrdinal == 4) {
            return new kt50(DEFAULT_INSTANCE);
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
        synchronized (HarmonizeSaveRequestBody.class) {
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

    public final void p(String str) {
        str.getClass();
        this.etag_ = str;
    }

    public final void q(Exclusions exclusions) {
        exclusions.getClass();
        this.exclusions_ = exclusions;
        this.bitField0_ |= 1;
    }

    public final void r(ManualOps manualOps) {
        this.manualOps_ = manualOps;
        this.bitField0_ |= 2;
    }

    public final void s(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
