package com.spotify.socialprompting.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ia20;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class FilterPill extends h implements v2j0 {
    private static final FilterPill DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SESSION_FIELD_NUMBER = 1;
    public static final int SUGGESTED_FIELD_NUMBER = 2;
    private int pillCase_ = 0;
    private Object pill_;

    static {
        FilterPill filterPill = new FilterPill();
        DEFAULT_INSTANCE = filterPill;
        h.registerDefaultInstance(FilterPill.class, filterPill);
    }

    private FilterPill() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"pill_", "pillCase_", SocialPromptSession.class, SuggestedPrompt.class});
        }
        if (iOrdinal == 3) {
            return new FilterPill();
        }
        if (iOrdinal == 4) {
            return new ia20(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (FilterPill.class) {
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

    public final int n() {
        int i = this.pillCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final SocialPromptSession o() {
        return this.pillCase_ == 1 ? (SocialPromptSession) this.pill_ : SocialPromptSession.n();
    }

    public final SuggestedPrompt p() {
        return this.pillCase_ == 2 ? (SuggestedPrompt) this.pill_ : SuggestedPrompt.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
