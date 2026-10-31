package com.spotify.watchfeed.component.layout.v1;

import com.google.protobuf.h;
import com.spotify.watchfeed.component.model.v1.proto.HeaderOverrides;
import p.bf40;
import p.ixk1;
import p.jf40;
import p.k6m1;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Wrapped2025IntroOutroLayoutComponent extends h implements v2j0 {
    public static final int BACKGROUND_AUDIO_URL_FIELD_NUMBER = 5;
    private static final Wrapped2025IntroOutroLayoutComponent DEFAULT_INSTANCE;
    public static final int FEATURE_UUID_FIELD_NUMBER = 8;
    public static final int HEADER_OVERRIDES_FIELD_NUMBER = 3;
    public static final int ITEM_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RIVE_ANIMATION_URL_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 6;
    public static final int TEXT_STYLE_FIELD_NUMBER = 7;
    public static final int URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private HeaderOverrides headerOverrides_;
    private int textStyle_;
    private String itemId_ = "";
    private String uri_ = "";
    private String riveAnimationUrl_ = "";
    private String backgroundAudioUrl_ = "";
    private String text_ = "";
    private String featureUuid_ = "";

    static {
        Wrapped2025IntroOutroLayoutComponent wrapped2025IntroOutroLayoutComponent = new Wrapped2025IntroOutroLayoutComponent();
        DEFAULT_INSTANCE = wrapped2025IntroOutroLayoutComponent;
        h.registerDefaultInstance(Wrapped2025IntroOutroLayoutComponent.class, wrapped2025IntroOutroLayoutComponent);
    }

    private Wrapped2025IntroOutroLayoutComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Wrapped2025IntroOutroLayoutComponent v(phc phcVar) {
        return (Wrapped2025IntroOutroLayoutComponent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\f\bȈ", new Object[]{"bitField0_", "itemId_", "uri_", "headerOverrides_", "riveAnimationUrl_", "backgroundAudioUrl_", "text_", "textStyle_", "featureUuid_"});
        }
        if (iOrdinal == 3) {
            return new Wrapped2025IntroOutroLayoutComponent();
        }
        if (iOrdinal == 4) {
            return new ixk1(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (Wrapped2025IntroOutroLayoutComponent.class) {
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

    public final String n() {
        return this.backgroundAudioUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.featureUuid_;
    }

    public final HeaderOverrides p() {
        HeaderOverrides headerOverrides = this.headerOverrides_;
        return headerOverrides == null ? HeaderOverrides.o() : headerOverrides;
    }

    public final String q() {
        return this.itemId_;
    }

    public final String r() {
        return this.riveAnimationUrl_;
    }

    public final String s() {
        return this.text_;
    }

    public final k6m1 t() {
        k6m1 k6m1Var;
        int i = this.textStyle_;
        if (i == 0) {
            k6m1Var = k6m1.BLACK_TEXT_ON_WHITE_BACKGROUND;
        } else if (i == 1) {
            k6m1Var = k6m1.WHITE_TEXT_ON_BLACK_BACKGROUND;
        } else if (i == 2) {
            k6m1Var = k6m1.VIOLET_TEXT;
        } else if (i != 3) {
            k6m1Var = i != 4 ? null : k6m1.GREEN_TEXT;
        } else {
            k6m1Var = k6m1.RED_TEXT;
        }
        return k6m1Var == null ? k6m1.UNRECOGNIZED : k6m1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }
}
