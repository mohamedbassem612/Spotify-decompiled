package com.spotify.prereleases.extension;

import com.google.protobuf.h;
import p.bf40;
import p.h4m;
import p.jf40;
import p.m4n;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class Copyright extends h implements v2j0 {
    private static final Copyright DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String text_ = "";
    private int type_;

    static {
        Copyright copyright = new Copyright();
        DEFAULT_INSTANCE = copyright;
        h.registerDefaultInstance(Copyright.class, copyright);
    }

    private Copyright() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "type_", "text_"});
        }
        if (iOrdinal == 3) {
            return new Copyright();
        }
        if (iOrdinal == 4) {
            return new h4m(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (Copyright.class) {
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
        return this.text_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final m4n o() {
        m4n m4nVar;
        int i = this.type_;
        if (i == 0) {
            m4nVar = m4n.COPYRIGHT_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            m4nVar = i != 2 ? null : m4n.COPYRIGHT_TYPE_C;
        } else {
            m4nVar = m4n.COPYRIGHT_TYPE_P;
        }
        return m4nVar == null ? m4n.UNRECOGNIZED : m4nVar;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
