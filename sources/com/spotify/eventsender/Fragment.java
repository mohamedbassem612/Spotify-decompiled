package com.spotify.eventsender;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wf30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class Fragment extends h implements v2j0 {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final Fragment DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String name_ = "";
    private phc data_ = phc.b;

    static {
        Fragment fragment = new Fragment();
        DEFAULT_INSTANCE = fragment;
        h.registerDefaultInstance(Fragment.class, fragment);
    }

    private Fragment() {
    }

    public static wf30 n() {
        return (wf30) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"bitField0_", "name_", "data_"});
        }
        if (iOrdinal == 3) {
            return new Fragment();
        }
        if (iOrdinal == 4) {
            return new wf30(DEFAULT_INSTANCE);
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
        synchronized (Fragment.class) {
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

    public final phc getData() {
        return this.data_;
    }

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(phc phcVar) {
        phcVar.getClass();
        this.bitField0_ |= 2;
        this.data_ = phcVar;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
