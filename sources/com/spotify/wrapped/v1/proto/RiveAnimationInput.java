package com.spotify.wrapped.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u831;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class RiveAnimationInput extends h implements v2j0 {
    private static final RiveAnimationInput DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PATH_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String path_ = "";
    private RiveProperty value_;

    static {
        RiveAnimationInput riveAnimationInput = new RiveAnimationInput();
        DEFAULT_INSTANCE = riveAnimationInput;
        h.registerDefaultInstance(RiveAnimationInput.class, riveAnimationInput);
    }

    private RiveAnimationInput() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "path_", "value_"});
        }
        if (iOrdinal == 3) {
            return new RiveAnimationInput();
        }
        if (iOrdinal == 4) {
            return new u831(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (RiveAnimationInput.class) {
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

    public final String getPath() {
        return this.path_;
    }

    public final RiveProperty n() {
        RiveProperty riveProperty = this.value_;
        return riveProperty == null ? RiveProperty.o() : riveProperty;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
