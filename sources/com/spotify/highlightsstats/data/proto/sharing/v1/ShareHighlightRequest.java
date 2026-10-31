package com.spotify.highlightsstats.data.proto.sharing.v1;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.jf40;
import p.l871;
import p.m4c;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wxd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ShareHighlightRequest extends h implements v2j0 {
    private static final ShareHighlightRequest DEFAULT_INSTANCE;
    public static final int HIGHLIGHTS_TYPE_FIELD_NUMBER = 3;
    public static final int HIGHLIGHT_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TEMPLATE_VERSION_FIELD_NUMBER = 4;
    public static final int TIME_ZONE_FIELD_NUMBER = 2;
    private static final c290 highlightsType_converter_ = new m4c((byte) 24);
    private int highlightsTypeMemoizedSerializedSize;
    private int templateVersion_;
    private String highlightId_ = "";
    private String timeZone_ = "";
    private b290 highlightsType_ = h.emptyIntList();

    static {
        ShareHighlightRequest shareHighlightRequest = new ShareHighlightRequest();
        DEFAULT_INSTANCE = shareHighlightRequest;
        h.registerDefaultInstance(ShareHighlightRequest.class, shareHighlightRequest);
    }

    private ShareHighlightRequest() {
    }

    public static l871 n() {
        return (l871) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003,\u0004\f", new Object[]{"highlightId_", "timeZone_", "highlightsType_", "templateVersion_"});
        }
        if (iOrdinal == 3) {
            return new ShareHighlightRequest();
        }
        if (iOrdinal == 4) {
            return new l871(DEFAULT_INSTANCE);
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
        synchronized (ShareHighlightRequest.class) {
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

    public final void o(String str) {
        str.getClass();
        this.highlightId_ = str;
    }

    public final void p(wxd1 wxd1Var) {
        this.templateVersion_ = wxd1Var.getNumber();
    }

    public final void q(String str) {
        this.timeZone_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
