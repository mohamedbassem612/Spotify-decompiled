package spotify.profile_esperanto.proto;

import com.google.protobuf.h;
import com.spotify.identity.proto.v3.IdentityV3$UserProfile;
import p.bf40;
import p.h290;
import p.io40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class GetProfilesResponse extends h implements v2j0 {
    private static final GetProfilesResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PROFILES_FIELD_NUMBER = 1;
    public static final int STATUS_CODE_FIELD_NUMBER = 2;
    private h290 profiles_ = h.emptyProtobufList();
    private int statusCode_;

    static {
        GetProfilesResponse getProfilesResponse = new GetProfilesResponse();
        DEFAULT_INSTANCE = getProfilesResponse;
        h.registerDefaultInstance(GetProfilesResponse.class, getProfilesResponse);
    }

    private GetProfilesResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static GetProfilesResponse r(byte[] bArr) {
        return (GetProfilesResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"profiles_", IdentityV3$UserProfile.class, "statusCode_"});
        }
        if (iOrdinal == 3) {
            return new GetProfilesResponse();
        }
        if (iOrdinal == 4) {
            return new io40();
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
        synchronized (GetProfilesResponse.class) {
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

    public final int getStatusCode() {
        return this.statusCode_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final IdentityV3$UserProfile o() {
        return (IdentityV3$UserProfile) this.profiles_.get(0);
    }

    public final int p() {
        return this.profiles_.size();
    }

    public final h290 q() {
        return this.profiles_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
