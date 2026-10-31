package com.spotify.pses.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ht80;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class IntentLedLayout extends h implements v2j0 {
    public static final int AUTHENTICATION_FIELD_NUMBER = 3;
    private static final IntentLedLayout DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int VALUE_PROPOSITION_FIELD_NUMBER = 4;
    private Authentication authentication_;
    private int bitField0_;
    private Header header_;
    private String name_ = "";
    private ValueProposition valueProposition_;

    static {
        IntentLedLayout intentLedLayout = new IntentLedLayout();
        DEFAULT_INSTANCE = intentLedLayout;
        h.registerDefaultInstance(IntentLedLayout.class, intentLedLayout);
    }

    private IntentLedLayout() {
    }

    public static IntentLedLayout p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ht80 s() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "header_", "name_", "authentication_", "valueProposition_"});
        }
        if (iOrdinal == 3) {
            return new IntentLedLayout();
        }
        if (iOrdinal == 4) {
            return new ht80();
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
        synchronized (IntentLedLayout.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Authentication o() {
        Authentication authentication = this.authentication_;
        return authentication == null ? Authentication.r() : authentication;
    }

    public final Header q() {
        Header header = this.header_;
        return header == null ? Header.o() : header;
    }

    public final ValueProposition r() {
        ValueProposition valueProposition = this.valueProposition_;
        return valueProposition == null ? ValueProposition.o() : valueProposition;
    }

    public final void t(Authentication authentication) {
        authentication.getClass();
        this.authentication_ = authentication;
        this.bitField0_ |= 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(ValueProposition valueProposition) {
        valueProposition.getClass();
        this.valueProposition_ = valueProposition;
        this.bitField0_ |= 4;
    }
}
