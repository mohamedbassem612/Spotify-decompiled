package com.spotify.widgets.colorextractionimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.blg;
import p.fub1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ColorResult extends h implements v2j0 {
    public static final int COLOR_DARK_FIELD_NUMBER = 3;
    public static final int COLOR_LIGHT_FIELD_NUMBER = 2;
    public static final int COLOR_RAW_FIELD_NUMBER = 1;
    private static final ColorResult DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 5;
    public static final int TTL_S_FIELD_NUMBER = 4;
    private int bitField0_;
    private Color colorDark_;
    private Color colorLight_;
    private Color colorRaw_;
    private int status_;
    private int ttlS_;

    static {
        ColorResult colorResult = new ColorResult();
        DEFAULT_INSTANCE = colorResult;
        h.registerDefaultInstance(ColorResult.class, colorResult);
    }

    private ColorResult() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0004\u0005\f", new Object[]{"bitField0_", "colorRaw_", "colorLight_", "colorDark_", "ttlS_", "status_"});
        }
        if (iOrdinal == 3) {
            return new ColorResult();
        }
        if (iOrdinal == 4) {
            return new blg(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (ColorResult.class) {
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

    public final Color n() {
        Color color = this.colorDark_;
        return color == null ? Color.o() : color;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Color o() {
        Color color = this.colorRaw_;
        return color == null ? Color.o() : color;
    }

    public final fub1 p() {
        fub1 fub1Var;
        int i = this.status_;
        if (i == 0) {
            fub1Var = fub1.OK;
        } else if (i == 1) {
            fub1Var = fub1.IN_PROGRESS;
        } else if (i != 2) {
            fub1Var = i != 3 ? null : fub1.INTERNAL;
        } else {
            fub1Var = fub1.INVALID_URL;
        }
        return fub1Var == null ? fub1.UNRECOGNIZED : fub1Var;
    }

    public final boolean q() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
