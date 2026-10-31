package com.spotify.liveroom.listeningparty.proto;

import p.b290;
import p.bf40;
import p.c290;
import p.jf40;
import p.mka;
import p.p2o;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class CurrentUser extends com.google.protobuf.h implements v2j0 {
    private static final CurrentUser DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
    public static final int FEATURES_FIELD_NUMBER = 5;
    public static final int IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int USER_IDENTIFIER_FIELD_NUMBER = 2;
    private static final c290 features_converter_ = new mka((byte) 4);
    private int bitField0_;
    private int featuresMemoizedSerializedSize;
    private UserIdentifier userIdentifier_;
    private String username_ = "";
    private String displayName_ = "";
    private String imageUrl_ = "";
    private b290 features_ = com.google.protobuf.h.emptyIntList();

    static {
        CurrentUser currentUser = new CurrentUser();
        DEFAULT_INSTANCE = currentUser;
        com.google.protobuf.h.registerDefaultInstance(CurrentUser.class, currentUser);
    }

    private CurrentUser() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005,", new Object[]{"bitField0_", "username_", "userIdentifier_", "displayName_", "imageUrl_", "features_"});
        }
        if (iOrdinal == 3) {
            return new CurrentUser();
        }
        if (iOrdinal == 4) {
            return new p2o(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (CurrentUser.class) {
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
