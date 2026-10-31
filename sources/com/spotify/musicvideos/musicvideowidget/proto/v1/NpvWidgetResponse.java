package com.spotify.musicvideos.musicvideowidget.proto.v1;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;
import p.z9p0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class NpvWidgetResponse extends h implements v2j0 {
    private static final NpvWidgetResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_ALL_NAV_URI_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VIDEO_CARDS_FIELD_NUMBER = 4;
    public static final int WIDGET_TYPE_FIELD_NUMBER = 2;
    private int widgetType_;
    private String title_ = "";
    private String showAllNavUri_ = "";
    private h290 videoCards_ = h.emptyProtobufList();

    static {
        NpvWidgetResponse npvWidgetResponse = new NpvWidgetResponse();
        DEFAULT_INSTANCE = npvWidgetResponse;
        h.registerDefaultInstance(NpvWidgetResponse.class, npvWidgetResponse);
    }

    private NpvWidgetResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static z9p0 q() {
        return (z9p0) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004\u001b", new Object[]{"title_", "widgetType_", "showAllNavUri_", "videoCards_", VideoCard.class});
        }
        if (iOrdinal == 3) {
            return new NpvWidgetResponse();
        }
        if (iOrdinal == 4) {
            return new z9p0(DEFAULT_INSTANCE);
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
        synchronized (NpvWidgetResponse.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.videoCards_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.videoCards_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.showAllNavUri_;
    }

    public final h290 p() {
        return this.videoCards_;
    }

    public final void r(String str) {
        str.getClass();
        this.showAllNavUri_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.title_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
