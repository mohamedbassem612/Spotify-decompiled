package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.fi31;
import p.gi31;
import p.h290;
import p.i9;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class RiveAnimation extends com.google.protobuf.h implements v2j0 {
    private static final RiveAnimation DEFAULT_INSTANCE;
    public static final int EXPECTED_FONTS_FIELD_NUMBER = 4;
    public static final int NAMETOIMAGEMAP_FIELD_NUMBER = 2;
    public static final int ON_INIT_INPUTS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private qng0 nameToImageMap_ = qng0.b;
    private String url_ = "";
    private h290 onInitInputs_ = com.google.protobuf.h.emptyProtobufList();
    private h290 expectedFonts_ = com.google.protobuf.h.emptyProtobufList();

    static {
        RiveAnimation riveAnimation = new RiveAnimation();
        DEFAULT_INSTANCE = riveAnimation;
        com.google.protobuf.h.registerDefaultInstance(RiveAnimation.class, riveAnimation);
    }

    private RiveAnimation() {
    }

    public static RiveAnimation o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static fi31 r() {
        return (fi31) DEFAULT_INSTANCE.createBuilder();
    }

    public static RiveAnimation s(byte[] bArr) {
        return (RiveAnimation) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0002\u0000\u0001Ȉ\u00022\u0003\u001b\u0004\u001b", new Object[]{"url_", "nameToImageMap_", gi31.a, "onInitInputs_", RiveAnimationInput.class, "expectedFonts_", RiveFont.class});
        }
        if (iOrdinal == 3) {
            return new RiveAnimation();
        }
        if (iOrdinal == 4) {
            return new fi31(DEFAULT_INSTANCE);
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
        synchronized (RiveAnimation.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.onInitInputs_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.onInitInputs_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 p() {
        return this.expectedFonts_;
    }

    public final h290 q() {
        return this.onInitInputs_;
    }

    public final void t(String str) {
        str.getClass();
        this.url_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
