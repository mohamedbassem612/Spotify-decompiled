package com.spotify.addonconsideration.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.l981;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ShowcaseLayout extends h implements v2j0 {
    private static final ShowcaseLayout DEFAULT_INSTANCE;
    public static final int DESCRIPTION_LIST_FIELD_NUMBER = 2;
    public static final int DISCLAIMER_FIELD_NUMBER = 3;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private h290 descriptionList_ = h.emptyProtobufList();
    private String disclaimer_ = "";
    private ShowcaseHeader header_;

    static {
        ShowcaseLayout showcaseLayout = new ShowcaseLayout();
        DEFAULT_INSTANCE = showcaseLayout;
        h.registerDefaultInstance(ShowcaseLayout.class, showcaseLayout);
    }

    private ShowcaseLayout() {
    }

    public static ShowcaseLayout n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ለ\u0001", new Object[]{"bitField0_", "header_", "descriptionList_", ShowcaseDescriptionList.class, "disclaimer_"});
        }
        if (iOrdinal == 3) {
            return new ShowcaseLayout();
        }
        if (iOrdinal == 4) {
            return new l981(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (ShowcaseLayout.class) {
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

    public final h290 o() {
        return this.descriptionList_;
    }

    public final String p() {
        return this.disclaimer_;
    }

    public final ShowcaseHeader q() {
        ShowcaseHeader showcaseHeader = this.header_;
        return showcaseHeader == null ? ShowcaseHeader.p() : showcaseHeader;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
