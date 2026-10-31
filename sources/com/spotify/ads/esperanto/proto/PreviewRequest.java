package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.alw0;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class PreviewRequest extends h implements v2j0 {
    public static final int AD_ID_FIELD_NUMBER = 1;
    private static final PreviewRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private String adId_ = "";

    static {
        PreviewRequest previewRequest = new PreviewRequest();
        DEFAULT_INSTANCE = previewRequest;
        h.registerDefaultInstance(PreviewRequest.class, previewRequest);
    }

    private PreviewRequest() {
    }

    public static alw0 n() {
        return (alw0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"adId_"});
        }
        if (iOrdinal == 3) {
            return new PreviewRequest();
        }
        if (iOrdinal == 4) {
            return new alw0(DEFAULT_INSTANCE);
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
        synchronized (PreviewRequest.class) {
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
        this.adId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
