package com.spotify.player.esperanto.proto;

import java.util.ArrayList;
import p.bf40;
import p.emz;
import p.fmz;
import p.h290;
import p.i9;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsContextPage$ContextPage extends com.google.protobuf.h implements v2j0 {
    private static final EsContextPage$ContextPage DEFAULT_INSTANCE;
    public static final int IS_LOADING_FIELD_NUMBER = 5;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int NEXT_PAGE_URL_FIELD_NUMBER = 4;
    public static final int PAGE_URL_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TRACKS_FIELD_NUMBER = 1;
    private boolean isLoading_;
    private qng0 metadata_ = qng0.b;
    private h290 tracks_ = com.google.protobuf.h.emptyProtobufList();
    private String pageUrl_ = "";
    private String nextPageUrl_ = "";

    static {
        EsContextPage$ContextPage esContextPage$ContextPage = new EsContextPage$ContextPage();
        DEFAULT_INSTANCE = esContextPage$ContextPage;
        com.google.protobuf.h.registerDefaultInstance(EsContextPage$ContextPage.class, esContextPage$ContextPage);
    }

    private EsContextPage$ContextPage() {
    }

    public static emz p() {
        return (emz) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001\u001b\u00022\u0003Ȉ\u0004Ȉ\u0005\u0007", new Object[]{"tracks_", EsContextTrack.ContextTrack.class, "metadata_", fmz.a, "pageUrl_", "nextPageUrl_", "isLoading_"});
        }
        if (iOrdinal == 3) {
            return new EsContextPage$ContextPage();
        }
        if (iOrdinal == 4) {
            return new emz(DEFAULT_INSTANCE);
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
        synchronized (EsContextPage$ContextPage.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.tracks_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.tracks_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final qng0 o() {
        qng0 qng0Var = this.metadata_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.metadata_ = qng0VarH;
        return qng0VarH;
    }

    public final void q(boolean z) {
        this.isLoading_ = z;
    }

    public final void r(String str) {
        str.getClass();
        this.nextPageUrl_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.pageUrl_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
