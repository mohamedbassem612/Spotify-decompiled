package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.i3a;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uv9;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class Banner extends h implements v2j0 {
    public static final int BASE_BANNER_FIELD_NUMBER = 6;
    public static final int BASIC_BANNER_FIELD_NUMBER = 1;
    public static final int BUTTONS_FIELD_NUMBER = 4;
    private static final Banner DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RICH_BANNER_FIELD_NUMBER = 2;
    public static final int SIGNIFIER_BANNER_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 5;
    private Object bannerTemplate_;
    private int bannerTemplateCase_ = 0;
    private h290 buttons_ = h.emptyProtobufList();
    private String type_ = "";

    static {
        Banner banner = new Banner();
        DEFAULT_INSTANCE = banner;
        h.registerDefaultInstance(Banner.class, banner);
    }

    private Banner() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Banner s() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u001b\u0005Ȉ\u0006<\u0000", new Object[]{"bannerTemplate_", "bannerTemplateCase_", BasicBanner.class, RichBanner.class, SignifierBanner.class, "buttons_", Button.class, "type_", BaseBanner.class});
        }
        if (iOrdinal == 3) {
            return new Banner();
        }
        if (iOrdinal == 4) {
            return new uv9((byte) 16);
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
        synchronized (Banner.class) {
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

    public final int o() {
        return i3a.a(this.bannerTemplateCase_);
    }

    public final BaseBanner p() {
        return this.bannerTemplateCase_ == 6 ? (BaseBanner) this.bannerTemplate_ : BaseBanner.s();
    }

    public final BasicBanner q() {
        return this.bannerTemplateCase_ == 1 ? (BasicBanner) this.bannerTemplate_ : BasicBanner.q();
    }

    public final h290 r() {
        return this.buttons_;
    }

    public final RichBanner t() {
        return this.bannerTemplateCase_ == 2 ? (RichBanner) this.bannerTemplate_ : RichBanner.r();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final SignifierBanner u() {
        return this.bannerTemplateCase_ == 3 ? (SignifierBanner) this.bannerTemplate_ : SignifierBanner.q();
    }
}
