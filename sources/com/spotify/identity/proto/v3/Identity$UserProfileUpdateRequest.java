package com.spotify.identity.proto.v3;

import com.google.protobuf.FieldMask;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wn70;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class Identity$UserProfileUpdateRequest extends h implements v2j0 {
    private static final Identity$UserProfileUpdateRequest DEFAULT_INSTANCE;
    public static final int MASK_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int USER_PROFILE_FIELD_NUMBER = 2;
    private int bitField0_;
    private FieldMask mask_;
    private Identity.UserProfile userProfile_;

    static {
        Identity$UserProfileUpdateRequest identity$UserProfileUpdateRequest = new Identity$UserProfileUpdateRequest();
        DEFAULT_INSTANCE = identity$UserProfileUpdateRequest;
        h.registerDefaultInstance(Identity$UserProfileUpdateRequest.class, identity$UserProfileUpdateRequest);
    }

    private Identity$UserProfileUpdateRequest() {
    }

    public static wn70 o() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "mask_", "userProfile_"});
        }
        if (iOrdinal == 3) {
            return new Identity$UserProfileUpdateRequest();
        }
        if (iOrdinal == 4) {
            return new wn70();
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
        synchronized (Identity$UserProfileUpdateRequest.class) {
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

    public final void p(Identity.UserProfile userProfile) {
        userProfile.getClass();
        this.userProfile_ = userProfile;
        this.bitField0_ |= 2;
    }

    public final void setMask(FieldMask fieldMask) {
        fieldMask.getClass();
        this.mask_ = fieldMask;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
