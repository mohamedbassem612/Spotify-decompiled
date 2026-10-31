package com.spotify.profile.profile.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vzw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ProfilelistResponse$SmallProfileList extends h implements v2j0 {
    private static final ProfilelistResponse$SmallProfileList DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PROFILES_FIELD_NUMBER = 1;
    private h290 profiles_ = h.emptyProtobufList();

    static {
        ProfilelistResponse$SmallProfileList profilelistResponse$SmallProfileList = new ProfilelistResponse$SmallProfileList();
        DEFAULT_INSTANCE = profilelistResponse$SmallProfileList;
        h.registerDefaultInstance(ProfilelistResponse$SmallProfileList.class, profilelistResponse$SmallProfileList);
    }

    private ProfilelistResponse$SmallProfileList() {
    }

    public static ProfilelistResponse$SmallProfileList n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"profiles_", ProfilelistResponse.SmallProfile.class});
        }
        if (iOrdinal == 3) {
            return new ProfilelistResponse$SmallProfileList();
        }
        if (iOrdinal == 4) {
            return new vzw0(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (ProfilelistResponse$SmallProfileList.class) {
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

    public final h290 o() {
        return this.profiles_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
