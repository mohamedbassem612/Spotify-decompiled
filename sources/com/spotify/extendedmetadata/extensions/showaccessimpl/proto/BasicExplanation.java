package com.spotify.extendedmetadata.extensions.showaccessimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uca;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class BasicExplanation extends h implements v2j0 {
    public static final int BODY_FIELD_NUMBER = 2;
    public static final int CTA_FIELD_NUMBER = 3;
    private static final BasicExplanation DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private String body_ = "";
    private String cta_ = "";

    static {
        BasicExplanation basicExplanation = new BasicExplanation();
        DEFAULT_INSTANCE = basicExplanation;
        h.registerDefaultInstance(BasicExplanation.class, basicExplanation);
    }

    private BasicExplanation() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static BasicExplanation q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"title_", "body_", "cta_"});
        }
        if (iOrdinal == 3) {
            return new BasicExplanation();
        }
        if (iOrdinal == 4) {
            return new uca((byte) 4);
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
        synchronized (BasicExplanation.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.body_;
    }

    public final String p() {
        return this.cta_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
