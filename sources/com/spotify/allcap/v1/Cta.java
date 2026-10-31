package com.spotify.allcap.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.p2o;
import p.pfc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Cta extends h implements v2j0 {
    public static final int BUTTON_TYPE_FIELD_NUMBER = 3;
    private static final Cta DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 5;
    public static final int URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private int buttonType_;
    private String label_ = "";
    private String uri_ = "";
    private String subtitle_ = "";

    static {
        Cta cta = new Cta();
        DEFAULT_INSTANCE = cta;
        h.registerDefaultInstance(Cta.class, cta);
    }

    private Cta() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဌ\u0000\u0005Ȉ", new Object[]{"bitField0_", "label_", "uri_", "buttonType_", "subtitle_"});
        }
        if (iOrdinal == 3) {
            return new Cta();
        }
        if (iOrdinal == 4) {
            return new p2o(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (Cta.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final pfc n() {
        pfc pfcVar;
        int i = this.buttonType_;
        if (i == 0) {
            pfcVar = pfc.PRIMARY;
        } else if (i != 1) {
            pfcVar = i != 2 ? null : pfc.TERTIARY;
        } else {
            pfcVar = pfc.SECONDARY;
        }
        return pfcVar == null ? pfc.UNRECOGNIZED : pfcVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.label_;
    }

    public final boolean p() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
