package com.spotify.player.esperanto.proto;

import java.util.ArrayList;
import p.bf40;
import p.cmz;
import p.dmz;
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
public final class EsContext$Context extends com.google.protobuf.h implements v2j0 {
    private static final EsContext$Context DEFAULT_INSTANCE;
    public static final int IS_LOADING_FIELD_NUMBER = 5;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int PAGES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RESTRICTIONS_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean isLoading_;
    private EsRestrictions.Restrictions restrictions_;
    private qng0 metadata_ = qng0.b;
    private h290 pages_ = com.google.protobuf.h.emptyProtobufList();
    private String uri_ = "";
    private String url_ = "";

    static {
        EsContext$Context esContext$Context = new EsContext$Context();
        DEFAULT_INSTANCE = esContext$Context;
        com.google.protobuf.h.registerDefaultInstance(EsContext$Context.class, esContext$Context);
    }

    private EsContext$Context() {
    }

    public static cmz p() {
        return (cmz) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0001\u0000\u0001\u001b\u00022\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006ဉ\u0000", new Object[]{"bitField0_", "pages_", EsContextPage$ContextPage.class, "metadata_", dmz.a, "uri_", "url_", "isLoading_", "restrictions_"});
        }
        if (iOrdinal == 3) {
            return new EsContext$Context();
        }
        if (iOrdinal == 4) {
            return new cmz(DEFAULT_INSTANCE);
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
        synchronized (EsContext$Context.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.pages_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.pages_ = h290VarMutableCopy;
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

    public final void r(EsRestrictions.Restrictions restrictions) {
        this.restrictions_ = restrictions;
        this.bitField0_ |= 1;
    }

    public final void s(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.url_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
