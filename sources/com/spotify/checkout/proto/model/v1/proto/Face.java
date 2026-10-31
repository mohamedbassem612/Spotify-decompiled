package com.spotify.checkout.proto.model.v1.proto;

import p.bf40;
import p.jf40;
import p.pd10;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class Face extends com.google.protobuf.h implements v2j0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 4;
    private static final Face DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 2;
    private int backgroundColor_;
    private String imageUrl_ = "";
    private String username_ = "";
    private String displayName_ = "";

    static {
        Face face = new Face();
        DEFAULT_INSTANCE = face;
        com.google.protobuf.h.registerDefaultInstance(Face.class, face);
    }

    private Face() {
    }

    public static Face o() {
        return DEFAULT_INSTANCE;
    }

    public static pd10 p() {
        return (pd10) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004", new Object[]{"imageUrl_", "username_", "displayName_", "backgroundColor_"});
        }
        if (iOrdinal == 3) {
            return new Face();
        }
        if (iOrdinal == 4) {
            return new pd10(DEFAULT_INSTANCE);
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
        synchronized (Face.class) {
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

    public final String getDisplayName() {
        return this.displayName_;
    }

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getUsername() {
        return this.username_;
    }

    public final int n() {
        return this.backgroundColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void q() {
        this.backgroundColor_ = 16711680;
    }

    public final void r() {
        this.displayName_ = "Smaug";
    }

    public final void s() {
        this.username_ = "763q4f763t4r";
    }

    public final void setImageUrl(String str) {
        this.imageUrl_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
