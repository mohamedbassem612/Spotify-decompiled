package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.np70;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ImageGroup$ProtoImageGroup extends h implements v2j0 {
    private static final ImageGroup$ProtoImageGroup DEFAULT_INSTANCE;
    public static final int LARGE_LINK_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SMALL_LINK_FIELD_NUMBER = 2;
    public static final int STANDARD_LINK_FIELD_NUMBER = 1;
    public static final int XLARGE_LINK_FIELD_NUMBER = 4;
    private int bitField0_;
    private String standardLink_ = "";
    private String smallLink_ = "";
    private String largeLink_ = "";
    private String xlargeLink_ = "";

    static {
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = new ImageGroup$ProtoImageGroup();
        DEFAULT_INSTANCE = imageGroup$ProtoImageGroup;
        h.registerDefaultInstance(ImageGroup$ProtoImageGroup.class, imageGroup$ProtoImageGroup);
    }

    private ImageGroup$ProtoImageGroup() {
    }

    public static ImageGroup$ProtoImageGroup n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "standardLink_", "smallLink_", "largeLink_", "xlargeLink_"});
        }
        if (iOrdinal == 3) {
            return new ImageGroup$ProtoImageGroup();
        }
        if (iOrdinal == 4) {
            return new np70(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (ImageGroup$ProtoImageGroup.class) {
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

    public final String getLargeLink() {
        return this.largeLink_;
    }

    public final String getSmallLink() {
        return this.smallLink_;
    }

    public final String getStandardLink() {
        return this.standardLink_;
    }

    public final String getXlargeLink() {
        return this.xlargeLink_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
