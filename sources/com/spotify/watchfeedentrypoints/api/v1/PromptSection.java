package com.spotify.watchfeedentrypoints.api.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uxx0;
import p.v2j0;
import p.vzw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PromptSection extends h implements v2j0 {
    private static final PromptSection DEFAULT_INSTANCE;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PROMPT_TYPE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int promptType_;
    private String uri_ = "";
    private String title_ = "";
    private String navigationUri_ = "";

    static {
        PromptSection promptSection = new PromptSection();
        DEFAULT_INSTANCE = promptSection;
        h.registerDefaultInstance(PromptSection.class, promptSection);
    }

    private PromptSection() {
    }

    public static PromptSection n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f", new Object[]{"uri_", "title_", "navigationUri_", "promptType_"});
        }
        if (iOrdinal == 3) {
            return new PromptSection();
        }
        if (iOrdinal == 4) {
            return new vzw0(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (PromptSection.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.navigationUri_;
    }

    public final uxx0 p() {
        uxx0 uxx0Var;
        int i = this.promptType_;
        if (i != 0) {
            uxx0Var = i != 1 ? null : uxx0.PODCAST_DISCOVERY;
        } else {
            uxx0Var = uxx0.MUSIC_DISCOVERY;
        }
        return uxx0Var == null ? uxx0.UNRECOGNIZED : uxx0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
