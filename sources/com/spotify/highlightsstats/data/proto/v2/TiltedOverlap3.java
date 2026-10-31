package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import com.spotify.highlightsstats.EntityImage;
import p.bf40;
import p.jf40;
import p.nzd1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class TiltedOverlap3 extends h implements v2j0 {
    private static final TiltedOverlap3 DEFAULT_INSTANCE;
    public static final int IMAGE_1_FIELD_NUMBER = 1;
    public static final int IMAGE_2_FIELD_NUMBER = 2;
    public static final int IMAGE_3_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private EntityImage image1_;
    private EntityImage image2_;
    private EntityImage image3_;

    static {
        TiltedOverlap3 tiltedOverlap3 = new TiltedOverlap3();
        DEFAULT_INSTANCE = tiltedOverlap3;
        h.registerDefaultInstance(TiltedOverlap3.class, tiltedOverlap3);
    }

    private TiltedOverlap3() {
    }

    public static TiltedOverlap3 n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "image1_", "image2_", "image3_"});
        }
        if (iOrdinal == 3) {
            return new TiltedOverlap3();
        }
        if (iOrdinal == 4) {
            return new nzd1(DEFAULT_INSTANCE, (byte) 15);
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
        synchronized (TiltedOverlap3.class) {
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

    public final EntityImage o() {
        EntityImage entityImage = this.image1_;
        return entityImage == null ? EntityImage.n() : entityImage;
    }

    public final EntityImage p() {
        EntityImage entityImage = this.image2_;
        return entityImage == null ? EntityImage.n() : entityImage;
    }

    public final EntityImage q() {
        EntityImage entityImage = this.image3_;
        return entityImage == null ? EntityImage.n() : entityImage;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
