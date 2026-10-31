package com.spotify.kidsaccount.api.v2.proto;

import com.google.protobuf.Int32Value;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lyv0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class Profile extends h implements v2j0 {
    public static final int ALLOWED_IN_MUSIC_APP_FIELD_NUMBER = 3;
    public static final int AVATAR_FIELD_NUMBER = 4;
    public static final int COLOR_FIELD_NUMBER = 6;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 2;
    private static final Profile DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int V2_AVATAR_FIELD_NUMBER = 5;
    private boolean allowedInMusicApp_;
    private int bitField0_;
    private Int32Value color_;
    private int v2Avatar_;
    private String name_ = "";
    private String dateOfBirth_ = "";
    private String avatar_ = "";

    static {
        Profile profile = new Profile();
        DEFAULT_INSTANCE = profile;
        h.registerDefaultInstance(Profile.class, profile);
    }

    private Profile() {
    }

    public static Profile n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005ဌ\u0000\u0006ဉ\u0001", new Object[]{"bitField0_", "name_", "dateOfBirth_", "allowedInMusicApp_", "avatar_", "v2Avatar_", "color_"});
        }
        if (iOrdinal == 3) {
            return new Profile();
        }
        if (iOrdinal == 4) {
            return new lyv0(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (Profile.class) {
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

    public final boolean getAllowedInMusicApp() {
        return this.allowedInMusicApp_;
    }

    public final Int32Value getColor() {
        Int32Value int32Value = this.color_;
        return int32Value == null ? Int32Value.o() : int32Value;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getName() {
        return this.name_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
