package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.hye1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class TopSuggestion extends h implements v2j0 {
    public static final int CONTENT_FIELD_NUMBER = 3;
    private static final TopSuggestion DEFAULT_INSTANCE;
    public static final int DISPLAY_TEXT_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String id_ = "";
    private String title_ = "";
    private String content_ = "";
    private String displayText_ = "";

    static {
        TopSuggestion topSuggestion = new TopSuggestion();
        DEFAULT_INSTANCE = topSuggestion;
        h.registerDefaultInstance(TopSuggestion.class, topSuggestion);
    }

    private TopSuggestion() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"id_", "title_", "content_", "displayText_"});
        }
        if (iOrdinal == 3) {
            return new TopSuggestion();
        }
        if (iOrdinal == 4) {
            return new hye1(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (TopSuggestion.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.content_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
