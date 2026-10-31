package com.spotify.subscriptionviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.io40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class GetPageResponse extends h implements v2j0 {
    private static final GetPageResponse DEFAULT_INSTANCE;
    public static final int PAGE_TITLE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SECTIONED_FIELD_NUMBER = 2;
    public static final int TABBED_FIELD_NUMBER = 3;
    private Object layout_;
    private int layoutCase_ = 0;
    private String pageTitle_ = "";

    static {
        GetPageResponse getPageResponse = new GetPageResponse();
        DEFAULT_INSTANCE = getPageResponse;
        h.registerDefaultInstance(GetPageResponse.class, getPageResponse);
    }

    private GetPageResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000", new Object[]{"layout_", "layoutCase_", "pageTitle_", SectionedLayout.class, TabbedLayout.class});
        }
        if (iOrdinal == 3) {
            return new GetPageResponse();
        }
        if (iOrdinal == 4) {
            return new io40(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (GetPageResponse.class) {
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
        int i = this.layoutCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.pageTitle_;
    }

    public final SectionedLayout p() {
        return this.layoutCase_ == 2 ? (SectionedLayout) this.layout_ : SectionedLayout.n();
    }

    public final TabbedLayout q() {
        return this.layoutCase_ == 3 ? (TabbedLayout) this.layout_ : TabbedLayout.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
