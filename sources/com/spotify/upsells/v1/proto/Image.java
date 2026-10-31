package com.spotify.upsells.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.w37;
import p.y070;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class Image extends h implements v2j0 {
    public static final int ALT_TEXT_FIELD_NUMBER = 3;
    public static final int ARTWORK_ROLE_FIELD_NUMBER = 1;
    private static final Image DEFAULT_INSTANCE;
    public static final int INSTANCES_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int artworkRole_;
    private int bitField0_;
    private h290 instances_ = h.emptyProtobufList();
    private String altText_ = "";

    static {
        Image image = new Image();
        DEFAULT_INSTANCE = image;
        h.registerDefaultInstance(Image.class, image);
    }

    private Image() {
    }

    public static Image p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003ለ\u0000", new Object[]{"bitField0_", "artworkRole_", "instances_", ImageInstance.class, "altText_"});
        }
        if (iOrdinal == 3) {
            return new Image();
        }
        if (iOrdinal == 4) {
            return new y070(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (Image.class) {
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
        return this.altText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final w37 o() {
        w37 w37Var;
        int i = this.artworkRole_;
        if (i == 0) {
            w37Var = w37.ARTWORK_ROLE_UNSPECIFIED;
        } else if (i != 1) {
            w37Var = i != 2 ? null : w37.ARTWORK_ROLE_SIXTEEN_BY_NINE_COVER;
        } else {
            w37Var = w37.ARTWORK_ROLE_SQUARE_COVER;
        }
        return w37Var == null ? w37.UNRECOGNIZED : w37Var;
    }

    public final h290 q() {
        return this.instances_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
