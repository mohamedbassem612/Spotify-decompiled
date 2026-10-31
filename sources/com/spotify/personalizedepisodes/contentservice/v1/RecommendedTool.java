package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.po01;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class RecommendedTool extends h implements v2j0 {
    public static final int CONNECTED_FIELD_NUMBER = 2;
    private static final RecommendedTool DEFAULT_INSTANCE;
    public static final int ENABLED_FOR_FEATURE_FIELD_NUMBER = 3;
    public static final int FAVICON_URL_FIELD_NUMBER = 7;
    public static final int ICON_URL_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int WEB_VIEW_URL_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean connected_;
    private boolean enabledForFeature_;
    private String id_ = "";
    private String webViewUrl_ = "";
    private String name_ = "";
    private String iconUrl_ = "";
    private String faviconUrl_ = "";

    static {
        RecommendedTool recommendedTool = new RecommendedTool();
        DEFAULT_INSTANCE = recommendedTool;
        h.registerDefaultInstance(RecommendedTool.class, recommendedTool);
    }

    private RecommendedTool() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007ለ\u0000", new Object[]{"bitField0_", "id_", "connected_", "enabledForFeature_", "webViewUrl_", "name_", "iconUrl_", "faviconUrl_"});
        }
        if (iOrdinal == 3) {
            return new RecommendedTool();
        }
        if (iOrdinal == 4) {
            return new po01(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (RecommendedTool.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getName() {
        return this.name_;
    }

    public final boolean n() {
        return this.connected_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.enabledForFeature_;
    }

    public final String p() {
        return this.iconUrl_;
    }

    public final String q() {
        return this.webViewUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
