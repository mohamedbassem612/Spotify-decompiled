package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jhc0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Line extends h implements v2j0 {
    private static final Line DEFAULT_INSTANCE;
    public static final int ORIGINAL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TRANSLATION_FIELD_NUMBER = 2;
    private int bitField0_;
    private String original_ = "";
    private String translation_ = "";

    static {
        Line line = new Line();
        DEFAULT_INSTANCE = line;
        h.registerDefaultInstance(Line.class, line);
    }

    private Line() {
    }

    public static jhc0 p() {
        return (jhc0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"bitField0_", "original_", "translation_"});
        }
        if (iOrdinal == 3) {
            return new Line();
        }
        if (iOrdinal == 4) {
            return new jhc0(DEFAULT_INSTANCE);
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
        synchronized (Line.class) {
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
        return this.original_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.translation_;
    }

    public final void q(String str) {
        str.getClass();
        this.original_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.translation_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
