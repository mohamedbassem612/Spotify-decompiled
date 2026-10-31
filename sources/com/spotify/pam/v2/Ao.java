package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.a53;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class Ao extends h implements v2j0 {
    public static final int ACTION_URI_FIELD_NUMBER = 9;
    public static final int AO_DETAILS_URI_FIELD_NUMBER = 5;
    public static final int AO_NAME_FIELD_NUMBER = 2;
    public static final int AO_PRICE_FIELD_NUMBER = 3;
    public static final int AO_TYPE_FIELD_NUMBER = 1;
    public static final int BENEFITS_FIELD_NUMBER = 4;
    public static final int COLOR_FIELD_NUMBER = 6;
    private static final Ao DEFAULT_INSTANCE;
    public static final int DISCLAIMER_FIELD_NUMBER = 8;
    public static final int IS_ACTIVE_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER;
    private int aoType_;
    private int bitField0_;
    private boolean isActive_;
    private String aoName_ = "";
    private String aoPrice_ = "";
    private h290 benefits_ = h.emptyProtobufList();
    private String aoDetailsUri_ = "";
    private String color_ = "";
    private String disclaimer_ = "";
    private String actionUri_ = "";

    static {
        Ao ao = new Ao();
        DEFAULT_INSTANCE = ao;
        h.registerDefaultInstance(Ao.class, ao);
    }

    private Ao() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ț\u0005Ȉ\u0006Ȉ\u0007\u0007\bለ\u0000\tȈ", new Object[]{"bitField0_", "aoType_", "aoName_", "aoPrice_", "benefits_", "aoDetailsUri_", "color_", "isActive_", "disclaimer_", "actionUri_"});
        }
        if (iOrdinal == 3) {
            return new Ao();
        }
        if (iOrdinal == 4) {
            return new a53(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (Ao.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
