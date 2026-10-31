package com.spotify.scrollsita.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Heading extends h implements v2j0 {
    private static final Heading DEFAULT_INSTANCE;
    public static final int IDENTITY_NAME_FORMAT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int styleCase_ = 0;
    private Object style_;

    static {
        Heading heading = new Heading();
        DEFAULT_INSTANCE = heading;
        h.registerDefaultInstance(Heading.class, heading);
    }

    private Heading() {
    }

    public static Heading n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static a q() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002<\u0000", new Object[]{"style_", "styleCase_", FormatHeading.class});
        }
        if (iOrdinal == 3) {
            return new Heading();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (Heading.class) {
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
        return this.styleCase_ == 1 ? (String) this.style_ : "";
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final FormatHeading o() {
        return this.styleCase_ == 2 ? (FormatHeading) this.style_ : FormatHeading.n();
    }

    public final int p() {
        int i = this.styleCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final void r(String str) {
        this.styleCase_ = 1;
        this.style_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
