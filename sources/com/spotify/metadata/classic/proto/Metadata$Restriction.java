package com.spotify.metadata.classic.proto;

import com.google.protobuf.h;
import p.a01;
import p.b290;
import p.bf40;
import p.c290;
import p.dgb;
import p.h290;
import p.jf40;
import p.qij0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Metadata$Restriction extends h implements v2j0 {
    public static final int CATALOGUE_FIELD_NUMBER = 1;
    public static final int CATALOGUE_STR_FIELD_NUMBER = 5;
    public static final int COUNTRIES_ALLOWED_FIELD_NUMBER = 2;
    public static final int COUNTRIES_FORBIDDEN_FIELD_NUMBER = 3;
    private static final Metadata$Restriction DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 4;
    private static final c290 catalogue_converter_ = new dgb((byte) 16);
    private int bitField0_;
    private Object countryRestriction_;
    private int type_;
    private int countryRestrictionCase_ = 0;
    private b290 catalogue_ = h.emptyIntList();
    private h290 catalogueStr_ = h.emptyProtobufList();

    static {
        Metadata$Restriction metadata$Restriction = new Metadata$Restriction();
        DEFAULT_INSTANCE = metadata$Restriction;
        h.registerDefaultInstance(Metadata$Restriction.class, metadata$Restriction);
    }

    private Metadata$Restriction() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ࠞ\u0002;\u0000\u0003;\u0000\u0004᠌\u0000\u0005\u001a", new Object[]{"countryRestriction_", "countryRestrictionCase_", "bitField0_", "catalogue_", a01.A, "type_", a01.C, "catalogueStr_"});
        }
        if (iOrdinal == 3) {
            return new Metadata$Restriction();
        }
        if (iOrdinal == 4) {
            return new qij0(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (Metadata$Restriction.class) {
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
