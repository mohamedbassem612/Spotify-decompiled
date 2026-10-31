package com.spotify.addonconsideration.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yo30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class GetAddonConsiderationResponse extends h implements v2j0 {
    private static final GetAddonConsiderationResponse DEFAULT_INSTANCE;
    public static final int PAGE_TITLE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SHOWCASE_LAYOUT_FIELD_NUMBER = 2;
    private Object layout_;
    private int layoutCase_ = 0;
    private String pageTitle_ = "";

    static {
        GetAddonConsiderationResponse getAddonConsiderationResponse = new GetAddonConsiderationResponse();
        DEFAULT_INSTANCE = getAddonConsiderationResponse;
        h.registerDefaultInstance(GetAddonConsiderationResponse.class, getAddonConsiderationResponse);
    }

    private GetAddonConsiderationResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"layout_", "layoutCase_", "pageTitle_", ShowcaseLayout.class});
        }
        if (iOrdinal == 3) {
            return new GetAddonConsiderationResponse();
        }
        if (iOrdinal == 4) {
            return new yo30(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (GetAddonConsiderationResponse.class) {
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
        if (i != 0) {
            return i != 2 ? 0 : 1;
        }
        return 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ShowcaseLayout o() {
        return this.layoutCase_ == 2 ? (ShowcaseLayout) this.layout_ : ShowcaseLayout.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
