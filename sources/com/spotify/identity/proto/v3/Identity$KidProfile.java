package com.spotify.identity.proto.v3;

import com.google.protobuf.Int32Value;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rn70;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class Identity$KidProfile extends h implements v2j0 {
    public static final int AVATAR_FIELD_NUMBER = 7;
    public static final int COLOR_FIELD_NUMBER = 6;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 2;
    private static final Identity$KidProfile DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private Int32Value color_;
    private String name_ = "";
    private String dateOfBirth_ = "";
    private String avatar_ = "";

    static {
        Identity$KidProfile identity$KidProfile = new Identity$KidProfile();
        DEFAULT_INSTANCE = identity$KidProfile;
        h.registerDefaultInstance(Identity$KidProfile.class, identity$KidProfile);
    }

    private Identity$KidProfile() {
    }

    public static rn70 n() {
        return (rn70) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0006ဉ\u0000\u0007ለ\u0001", new Object[]{"bitField0_", "name_", "dateOfBirth_", "color_", "avatar_"});
        }
        if (iOrdinal == 3) {
            return new Identity$KidProfile();
        }
        if (iOrdinal == 4) {
            return new rn70(DEFAULT_INSTANCE);
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
        synchronized (Identity$KidProfile.class) {
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

    public final void setAvatar(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.avatar_ = str;
    }

    public final void setColor(Int32Value int32Value) {
        int32Value.getClass();
        this.color_ = int32Value;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
