package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.gtq0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class PastEventRow extends h implements v2j0 {
    public static final int CTA_FIELD_NUMBER = 3;
    private static final PastEventRow DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TARGET_URI_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private String text_ = "";
    private String cta_ = "";
    private String targetUri_ = "";

    static {
        PastEventRow pastEventRow = new PastEventRow();
        DEFAULT_INSTANCE = pastEventRow;
        h.registerDefaultInstance(PastEventRow.class, pastEventRow);
    }

    private PastEventRow() {
    }

    public static PastEventRow o() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"title_", "text_", "cta_", "targetUri_"});
        }
        if (iOrdinal == 3) {
            return new PastEventRow();
        }
        if (iOrdinal == 4) {
            return new gtq0(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (PastEventRow.class) {
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

    public final String n() {
        return this.cta_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.targetUri_;
    }

    public final String q() {
        return this.text_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
