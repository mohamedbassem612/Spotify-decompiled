package com.spotify.highlightsstats;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class Person extends h implements v2j0 {
    private static final Person DEFAULT_INSTANCE;
    public static final int IS_SELF_FIELD_NUMBER = 3;
    public static final int LEADERBOARD_NAME_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PROFILE_PICTURE_FIELD_NUMBER = 1;
    public static final int PROFILE_URI_FIELD_NUMBER = 4;
    private boolean isSelf_;
    private String profilePicture_ = "";
    private String name_ = "";
    private String profileUri_ = "";
    private String leaderboardName_ = "";

    static {
        Person person = new Person();
        DEFAULT_INSTANCE = person;
        h.registerDefaultInstance(Person.class, person);
    }

    private Person() {
    }

    public static Person n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005Ȉ", new Object[]{"profilePicture_", "name_", "isSelf_", "profileUri_", "leaderboardName_"});
        }
        if (iOrdinal == 3) {
            return new Person();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (Person.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.isSelf_;
    }

    public final String p() {
        return this.leaderboardName_;
    }

    public final String q() {
        return this.profilePicture_;
    }

    public final String r() {
        return this.profileUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
