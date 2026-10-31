package com.spotify.promptablesection.feedback.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.p1y0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PromptedContentFeedbackEvent extends h implements v2j0 {
    public static final int CATEGORY_FIELD_NUMBER = 7;
    public static final int CONTENT_DESCRIPTION_FIELD_NUMBER = 4;
    private static final PromptedContentFeedbackEvent DEFAULT_INSTANCE;
    public static final int ITEMS_IN_RESPONSE_FIELD_NUMBER = 5;
    public static final int LIKED_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int TEXT_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int USER_PROMPT_FIELD_NUMBER = 2;
    private int category_;
    private boolean liked_;
    private String requestId_ = "";
    private String userPrompt_ = "";
    private String title_ = "";
    private String contentDescription_ = "";
    private h290 itemsInResponse_ = h.emptyProtobufList();
    private String text_ = "";

    static {
        PromptedContentFeedbackEvent promptedContentFeedbackEvent = new PromptedContentFeedbackEvent();
        DEFAULT_INSTANCE = promptedContentFeedbackEvent;
        h.registerDefaultInstance(PromptedContentFeedbackEvent.class, promptedContentFeedbackEvent);
    }

    private PromptedContentFeedbackEvent() {
    }

    public static p1y0 o() {
        return (p1y0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ț\u0006\u0007\u0007\u0004\bȈ", new Object[]{"requestId_", "userPrompt_", "title_", "contentDescription_", "itemsInResponse_", "liked_", "category_", "text_"});
        }
        if (iOrdinal == 3) {
            return new PromptedContentFeedbackEvent();
        }
        if (iOrdinal == 4) {
            return new p1y0(DEFAULT_INSTANCE);
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
        synchronized (PromptedContentFeedbackEvent.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.itemsInResponse_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.itemsInResponse_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(int i) {
        this.category_ = i;
    }

    public final void q(String str) {
        this.contentDescription_ = str;
    }

    public final void r(boolean z) {
        this.liked_ = z;
    }

    public final void s(String str) {
        this.requestId_ = str;
    }

    public final void t(String str) {
        this.text_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.title_ = str;
    }

    public final void v(String str) {
        this.userPrompt_ = str;
    }
}
