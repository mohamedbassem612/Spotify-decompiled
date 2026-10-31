package com.spotify.listeningactivity.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rn7;
import p.s2j0;
import p.v2j0;
import p.zg7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class AudienceUser extends h implements v2j0 {
    private static final AudienceUser DEFAULT_INSTANCE;
    public static final int HIDDEN_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int RESTRICTED_FIELD_NUMBER = 2;
    public static final int SOURCE_FIELD_NUMBER = 3;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private boolean hidden_;
    private boolean restricted_;
    private int source_;
    private String username_ = "";

    static {
        AudienceUser audienceUser = new AudienceUser();
        DEFAULT_INSTANCE = audienceUser;
        h.registerDefaultInstance(AudienceUser.class, audienceUser);
    }

    private AudienceUser() {
    }

    public static AudienceUser n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\f\u0004\u0007", new Object[]{"username_", "restricted_", "source_", "hidden_"});
        }
        if (iOrdinal == 3) {
            return new AudienceUser();
        }
        if (iOrdinal == 4) {
            return new zg7(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (AudienceUser.class) {
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

    public final String getUsername() {
        return this.username_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.restricted_;
    }

    public final rn7 p() {
        rn7 rn7Var;
        int i = this.source_;
        if (i == 0) {
            rn7Var = rn7.AUDIENCE_SOURCE_UNSPECIFIED;
        } else if (i != 1) {
            rn7Var = i != 2 ? null : rn7.AUDIENCE_SOURCE_GROUP;
        } else {
            rn7Var = rn7.AUDIENCE_SOURCE_DM;
        }
        return rn7Var == null ? rn7.UNRECOGNIZED : rn7Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
