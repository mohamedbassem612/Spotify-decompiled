package com.spotify.casita.v1.resolved.dj;

import com.google.protobuf.h;
import p.bf40;
import p.eku;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class DjVisualMetadata extends h implements v2j0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 1;
    public static final int BACKGROUND_IMAGE_FIELD_NUMBER = 2;
    private static final DjVisualMetadata DEFAULT_INSTANCE;
    public static final int JELLYFISH_BOTTOM_COLOR_FIELD_NUMBER = 5;
    public static final int JELLYFISH_MID_COLOR_FIELD_NUMBER = 4;
    public static final int JELLYFISH_TOP_COLOR_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TAG_COLOR_FIELD_NUMBER = 6;
    public static final int TEXT_COLOR_FIELD_NUMBER = 7;
    private String backgroundColor_ = "";
    private String backgroundImage_ = "";
    private String jellyfishTopColor_ = "";
    private String jellyfishMidColor_ = "";
    private String jellyfishBottomColor_ = "";
    private String tagColor_ = "";
    private String textColor_ = "";

    static {
        DjVisualMetadata djVisualMetadata = new DjVisualMetadata();
        DEFAULT_INSTANCE = djVisualMetadata;
        h.registerDefaultInstance(DjVisualMetadata.class, djVisualMetadata);
    }

    private DjVisualMetadata() {
    }

    public static DjVisualMetadata p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"backgroundColor_", "backgroundImage_", "jellyfishTopColor_", "jellyfishMidColor_", "jellyfishBottomColor_", "tagColor_", "textColor_"});
        }
        if (iOrdinal == 3) {
            return new DjVisualMetadata();
        }
        if (iOrdinal == 4) {
            return new eku(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (DjVisualMetadata.class) {
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

    public final String n() {
        return this.backgroundColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.backgroundImage_;
    }

    public final String q() {
        return this.textColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
