package com.spotify.searchview.proto;

import p.bf40;
import p.fs00;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Filter extends com.google.protobuf.h implements v2j0 {
    public static final int CONTENT_FILTER_FIELD_NUMBER = 2;
    private static final Filter DEFAULT_INSTANCE;
    public static final int ENTITY_FILTER_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int UPLOAD_DATE_FILTER_FIELD_NUMBER = 3;
    private Object filter_;
    private int filterCase_ = 0;
    private String id_ = "";

    static {
        Filter filter = new Filter();
        DEFAULT_INSTANCE = filter;
        com.google.protobuf.h.registerDefaultInstance(Filter.class, filter);
    }

    private Filter() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"filter_", "filterCase_", "id_", ContentFilter.class, UploadDateFilter.class, EntityFilter.class});
        }
        if (iOrdinal == 3) {
            return new Filter();
        }
        if (iOrdinal == 4) {
            return new fs00(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (Filter.class) {
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

    public final ContentFilter n() {
        return this.filterCase_ == 2 ? (ContentFilter) this.filter_ : ContentFilter.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EntityFilter o() {
        return this.filterCase_ == 4 ? (EntityFilter) this.filter_ : EntityFilter.n();
    }

    public final int p() {
        int i = this.filterCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    public final UploadDateFilter q() {
        return this.filterCase_ == 3 ? (UploadDateFilter) this.filter_ : UploadDateFilter.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
