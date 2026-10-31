package com.spotify.metadata.classic.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qij0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Metadata$Disc extends h implements v2j0 {
    private static final Metadata$Disc DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUMBER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TRACK_FIELD_NUMBER = 3;
    private int bitField0_;
    private int number_;
    private String name_ = "";
    private h290 track_ = h.emptyProtobufList();

    static {
        Metadata$Disc metadata$Disc = new Metadata$Disc();
        DEFAULT_INSTANCE = metadata$Disc;
        h.registerDefaultInstance(Metadata$Disc.class, metadata$Disc);
    }

    private Metadata$Disc() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဏ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"bitField0_", "number_", "name_", "track_", Metadata$Track.class});
        }
        if (iOrdinal == 3) {
            return new Metadata$Disc();
        }
        if (iOrdinal == 4) {
            return new qij0(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (Metadata$Disc.class) {
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

    public final h290 n() {
        return this.track_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
