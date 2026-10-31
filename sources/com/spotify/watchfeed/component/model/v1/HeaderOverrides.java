package com.spotify.watchfeed.component.model.v1;

import com.google.protobuf.Any;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zp50;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class HeaderOverrides extends h implements v2j0 {
    public static final int BODY_FIELD_NUMBER = 1;
    public static final int BUTTON_APPEARANCE_FIELD_NUMBER = 4;
    private static final HeaderOverrides DEFAULT_INSTANCE;
    public static final int HIDE_BODY_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TINT_COLOR_FIELD_NUMBER = 2;
    private int bitField0_;
    private Any body_;
    private HeaderButtonAppearance buttonAppearance_;
    private boolean hideBody_;
    private String tintColor_ = "";

    static {
        HeaderOverrides headerOverrides = new HeaderOverrides();
        DEFAULT_INSTANCE = headerOverrides;
        h.registerDefaultInstance(HeaderOverrides.class, headerOverrides);
    }

    private HeaderOverrides() {
    }

    public static HeaderOverrides p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\u0007\u0004ဉ\u0001", new Object[]{"bitField0_", "body_", "tintColor_", "hideBody_", "buttonAppearance_"});
        }
        if (iOrdinal == 3) {
            return new HeaderOverrides();
        }
        if (iOrdinal == 4) {
            return new zp50(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (HeaderOverrides.class) {
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

    public final Any n() {
        Any any = this.body_;
        return any == null ? Any.o() : any;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final HeaderButtonAppearance o() {
        HeaderButtonAppearance headerButtonAppearance = this.buttonAppearance_;
        return headerButtonAppearance == null ? HeaderButtonAppearance.n() : headerButtonAppearance;
    }

    public final boolean q() {
        return this.hideBody_;
    }

    public final String r() {
        return this.tintColor_;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
