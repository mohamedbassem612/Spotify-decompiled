package com.spotify.allboarding.model.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ets0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class PillMore extends h implements v2j0 {
    public static final int COLOR_FIELD_NUMBER = 4;
    private static final PillMore DEFAULT_INSTANCE;
    public static final int EXPANSION_LIMIT_FIELD_NUMBER = 6;
    public static final int LOGGING_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int RELATED_ITEMS_FIELD_NUMBER = 5;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private int expansionLimit_;
    private Logging logging_;
    private String uri_ = "";
    private String text_ = "";
    private String color_ = "";
    private h290 relatedItems_ = h.emptyProtobufList();

    static {
        PillMore pillMore = new PillMore();
        DEFAULT_INSTANCE = pillMore;
        h.registerDefaultInstance(PillMore.class, pillMore);
    }

    private PillMore() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005\u001b\u0006\u0004\u0007ဉ\u0000", new Object[]{"bitField0_", "uri_", "text_", "color_", "relatedItems_", Pill.class, "expansionLimit_", "logging_"});
        }
        if (iOrdinal == 3) {
            return new PillMore();
        }
        if (iOrdinal == 4) {
            return new ets0(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (PillMore.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
