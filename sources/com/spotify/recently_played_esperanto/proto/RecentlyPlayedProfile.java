package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.po01;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class RecentlyPlayedProfile extends h implements v2j0 {
    public static final int ADD_TIME_FIELD_NUMBER = 6;
    private static final RecentlyPlayedProfile DEFAULT_INSTANCE;
    public static final int IMAGE_URI_FIELD_NUMBER = 3;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int OFFLINE_STATE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int TYPE_STR_FIELD_NUMBER = 7;
    private int addTime_;
    private int offlineState_;
    private int type_;
    private String link_ = "";
    private String name_ = "";
    private String imageUri_ = "";
    private String typeStr_ = "";

    static {
        RecentlyPlayedProfile recentlyPlayedProfile = new RecentlyPlayedProfile();
        DEFAULT_INSTANCE = recentlyPlayedProfile;
        h.registerDefaultInstance(RecentlyPlayedProfile.class, recentlyPlayedProfile);
    }

    private RecentlyPlayedProfile() {
    }

    public static RecentlyPlayedProfile n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u000b\u0005\u000b\u0006\u000b\u0007Ȉ", new Object[]{"link_", "name_", "imageUri_", "offlineState_", "type_", "addTime_", "typeStr_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedProfile();
        }
        if (iOrdinal == 4) {
            return new po01(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (RecentlyPlayedProfile.class) {
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

    public final String getLink() {
        return this.link_;
    }

    public final String getName() {
        return this.name_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.imageUri_;
    }

    public final int p() {
        return this.offlineState_;
    }

    public final String q() {
        return this.typeStr_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
