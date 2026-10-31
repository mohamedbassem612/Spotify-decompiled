package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.t7h;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Color extends h implements v2j0 {
    private static final Color DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PRIMARY_COLOR_HEX_FIELD_NUMBER = 1;
    public static final int SECONDARY_COLOR_HEX_FIELD_NUMBER = 2;
    private int bitField0_;
    private String primaryColorHex_ = "";
    private String secondaryColorHex_ = "";

    static {
        Color color = new Color();
        DEFAULT_INSTANCE = color;
        h.registerDefaultInstance(Color.class, color);
    }

    private Color() {
    }

    public static Color n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static t7h q() {
        return (t7h) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"bitField0_", "primaryColorHex_", "secondaryColorHex_"});
        }
        if (iOrdinal == 3) {
            return new Color();
        }
        if (iOrdinal == 4) {
            return new t7h(DEFAULT_INSTANCE);
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
        synchronized (Color.class) {
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

    public final String o() {
        return this.primaryColorHex_;
    }

    public final String p() {
        return this.secondaryColorHex_;
    }

    public final void r(String str) {
        this.primaryColorHex_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.secondaryColorHex_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
