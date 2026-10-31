package com.spotify.canvas.settings.canvas.impl.events.proto;

import com.google.protobuf.h;
import p.akd;
import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zjd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CanvasPreference extends h implements v2j0 {
    private static final CanvasPreference DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 4;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 3;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private qng0 details_ = qng0.b;
    private String identifier_ = "";
    private String value_ = "";
    private String source_ = "";

    static {
        CanvasPreference canvasPreference = new CanvasPreference();
        DEFAULT_INSTANCE = canvasPreference;
        h.registerDefaultInstance(CanvasPreference.class, canvasPreference);
    }

    private CanvasPreference() {
    }

    public static zjd n() {
        return (zjd) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u00042", new Object[]{"bitField0_", "identifier_", "value_", "source_", "details_", akd.a});
        }
        if (iOrdinal == 3) {
            return new CanvasPreference();
        }
        if (iOrdinal == 4) {
            return new zjd(DEFAULT_INSTANCE);
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
        synchronized (CanvasPreference.class) {
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

    public final void o() {
        this.bitField0_ |= 1;
        this.identifier_ = "settings_toggle";
    }

    public final void p(String str) {
        this.bitField0_ |= 2;
        this.value_ = str;
    }

    public final void setSource(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.source_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
