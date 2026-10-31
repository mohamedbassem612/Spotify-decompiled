package com.spotify.profile.editprofile.proto;

import com.google.protobuf.h;
import p.bf40;
import p.cki1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8i1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class UserprofileviewV4$SetBioAudienceResponse extends h implements v2j0 {
    public static final int AUDIENCE_FIELD_NUMBER = 1;
    private static final UserprofileviewV4$SetBioAudienceResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int audience_;

    static {
        UserprofileviewV4$SetBioAudienceResponse userprofileviewV4$SetBioAudienceResponse = new UserprofileviewV4$SetBioAudienceResponse();
        DEFAULT_INSTANCE = userprofileviewV4$SetBioAudienceResponse;
        h.registerDefaultInstance(UserprofileviewV4$SetBioAudienceResponse.class, userprofileviewV4$SetBioAudienceResponse);
    }

    private UserprofileviewV4$SetBioAudienceResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"audience_"});
        }
        if (iOrdinal == 3) {
            return new UserprofileviewV4$SetBioAudienceResponse();
        }
        if (iOrdinal == 4) {
            return new s8i1(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (UserprofileviewV4$SetBioAudienceResponse.class) {
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

    public final cki1 n() {
        cki1 cki1VarA = cki1.a(this.audience_);
        return cki1VarA == null ? cki1.UNRECOGNIZED : cki1VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
