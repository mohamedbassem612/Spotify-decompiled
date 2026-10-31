package com.spotify.playlist.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sug1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class User extends h implements v2j0 {
    public static final int COLOR_FIELD_NUMBER = 6;
    private static final User DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
    public static final int IMAGE_URI_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int THUMBNAIL_URI_FIELD_NUMBER = 5;
    public static final int USERNAME_FIELD_NUMBER = 2;
    private int bitField0_;
    private int color_;
    private String link_ = "";
    private String username_ = "";
    private String displayName_ = "";
    private String imageUri_ = "";
    private String thumbnailUri_ = "";

    static {
        User user = new User();
        DEFAULT_INSTANCE = user;
        h.registerDefaultInstance(User.class, user);
    }

    private User() {
    }

    public static User o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006င\u0005", new Object[]{"bitField0_", "link_", "username_", "displayName_", "imageUri_", "thumbnailUri_", "color_"});
        }
        if (iOrdinal == 3) {
            return new User();
        }
        if (iOrdinal == 4) {
            return new sug1((byte) 28);
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
        synchronized (User.class) {
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

    public final int getColor() {
        return this.color_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getDisplayName() {
        return this.displayName_;
    }

    public final String getLink() {
        return this.link_;
    }

    public final String getUsername() {
        return this.username_;
    }

    public final boolean hasColor() {
        return (this.bitField0_ & 32) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.imageUri_;
    }

    public final String q() {
        return this.thumbnailUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
