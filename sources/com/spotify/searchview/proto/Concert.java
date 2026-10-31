package com.spotify.searchview.proto;

import p.bf40;
import p.jf40;
import p.n5k;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Concert extends com.google.protobuf.h implements v2j0 {
    public static final int DATE_FIELD_NUMBER = 2;
    private static final Concert DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private DateWithOffset date_;
    private String uri_ = "";
    private String title_ = "";
    private String subtitle_ = "";

    static {
        Concert concert = new Concert();
        DEFAULT_INSTANCE = concert;
        com.google.protobuf.h.registerDefaultInstance(Concert.class, concert);
    }

    private Concert() {
    }

    public static Concert o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ", new Object[]{"bitField0_", "uri_", "date_", "title_", "subtitle_"});
        }
        if (iOrdinal == 3) {
            return new Concert();
        }
        if (iOrdinal == 4) {
            return new n5k(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (Concert.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final DateWithOffset n() {
        DateWithOffset dateWithOffset = this.date_;
        return dateWithOffset == null ? DateWithOffset.o() : dateWithOffset;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
