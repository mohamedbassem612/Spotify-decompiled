package com.spotify.scrollsita.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Heading$FormatHeading extends h implements v2j0 {
    private static final Heading$FormatHeading DEFAULT_INSTANCE;
    public static final int FORMAT_TEXT_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RESOURCE_URI_FIELD_NUMBER = 2;
    private String formatText_ = "";
    private String resourceUri_ = "";

    static {
        Heading$FormatHeading heading$FormatHeading = new Heading$FormatHeading();
        DEFAULT_INSTANCE = heading$FormatHeading;
        h.registerDefaultInstance(Heading$FormatHeading.class, heading$FormatHeading);
    }

    private Heading$FormatHeading() {
    }

    public static Heading$FormatHeading n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"formatText_", "resourceUri_"});
        }
        if (iOrdinal == 3) {
            return new Heading$FormatHeading();
        }
        if (iOrdinal == 4) {
            return new b(DEFAULT_INSTANCE);
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
        synchronized (Heading$FormatHeading.class) {
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
        return this.formatText_;
    }

    public final String p() {
        return this.resourceUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
