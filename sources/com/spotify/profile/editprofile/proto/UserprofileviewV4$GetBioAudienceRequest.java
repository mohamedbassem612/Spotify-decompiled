package com.spotify.profile.editprofile.proto;

import com.google.protobuf.h;
import p.bf40;
import p.eki1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class UserprofileviewV4$GetBioAudienceRequest extends h implements v2j0 {
    private static final UserprofileviewV4$GetBioAudienceRequest DEFAULT_INSTANCE;
    public static final int FORCE_REFRESH_FIELD_NUMBER = 1;
    public static final int HTTP_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private boolean forceRefresh_;
    private boolean http_;

    static {
        UserprofileviewV4$GetBioAudienceRequest userprofileviewV4$GetBioAudienceRequest = new UserprofileviewV4$GetBioAudienceRequest();
        DEFAULT_INSTANCE = userprofileviewV4$GetBioAudienceRequest;
        h.registerDefaultInstance(UserprofileviewV4$GetBioAudienceRequest.class, userprofileviewV4$GetBioAudienceRequest);
    }

    private UserprofileviewV4$GetBioAudienceRequest() {
    }

    public static eki1 n() {
        return (eki1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"forceRefresh_", "http_"});
        }
        if (iOrdinal == 3) {
            return new UserprofileviewV4$GetBioAudienceRequest();
        }
        if (iOrdinal == 4) {
            return new eki1(DEFAULT_INSTANCE);
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
        synchronized (UserprofileviewV4$GetBioAudienceRequest.class) {
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

    public final void o() {
        this.http_ = true;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
