package com.spotify.gander.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.q6i1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class UserAndEntityImage extends h implements v2j0 {
    private static final UserAndEntityImage DEFAULT_INSTANCE;
    public static final int ENTITY_IMAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int USER_IMAGE_FIELD_NUMBER = 1;
    private int bitField0_;
    private EntityImage entityImage_;
    private UserImage userImage_;

    static {
        UserAndEntityImage userAndEntityImage = new UserAndEntityImage();
        DEFAULT_INSTANCE = userAndEntityImage;
        h.registerDefaultInstance(UserAndEntityImage.class, userAndEntityImage);
    }

    private UserAndEntityImage() {
    }

    public static UserAndEntityImage n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static q6i1 q() {
        return (q6i1) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "userImage_", "entityImage_"});
        }
        if (iOrdinal == 3) {
            return new UserAndEntityImage();
        }
        if (iOrdinal == 4) {
            return new q6i1(DEFAULT_INSTANCE);
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
        synchronized (UserAndEntityImage.class) {
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
        EntityImage entityImage = this.entityImage_;
        return entityImage == null ? EntityImage.n() : entityImage;
    }

    public final UserImage p() {
        UserImage userImage = this.userImage_;
        return userImage == null ? UserImage.n() : userImage;
    }

    public final void r(EntityImage entityImage) {
        entityImage.getClass();
        this.entityImage_ = entityImage;
        this.bitField0_ |= 2;
    }

    public final void s(UserImage userImage) {
        userImage.getClass();
        this.userImage_ = userImage;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
