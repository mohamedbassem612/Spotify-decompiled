package com.spotify.metadata.proto;

import com.google.protobuf.h;
import p.bf40;
import p.eij0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Metadata$Availability extends h implements v2j0 {
    public static final int CATALOGUE_STR_FIELD_NUMBER = 1;
    private static final Metadata$Availability DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int START_FIELD_NUMBER = 2;
    private int bitField0_;
    private h290 catalogueStr_ = h.emptyProtobufList();
    private Metadata$Date start_;

    static {
        Metadata$Availability metadata$Availability = new Metadata$Availability();
        DEFAULT_INSTANCE = metadata$Availability;
        h.registerDefaultInstance(Metadata$Availability.class, metadata$Availability);
    }

    private Metadata$Availability() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"bitField0_", "catalogueStr_", "start_"});
        }
        if (iOrdinal == 3) {
            return new Metadata$Availability();
        }
        if (iOrdinal == 4) {
            return new eij0(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (Metadata$Availability.class) {
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
