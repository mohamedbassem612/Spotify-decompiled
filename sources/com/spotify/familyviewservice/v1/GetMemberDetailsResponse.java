package com.spotify.familyviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.io40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class GetMemberDetailsResponse extends h implements v2j0 {
    private static final GetMemberDetailsResponse DEFAULT_INSTANCE;
    public static final int GEN_ALPHA_MANAGED_FIELD_NUMBER = 3;
    public static final int LEGACY_MANAGED_FIELD_NUMBER = 4;
    public static final int MEMBER_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAN_CAPACITY_FIELD_NUMBER = 11;
    public static final int PLAN_NAME_FIELD_NUMBER = 10;
    public static final int REMOVE_ACCOUNT_URL_FIELD_NUMBER = 12;
    public static final int SELF_MANAGED_FIELD_NUMBER = 2;
    private int bitField0_;
    private Object pageData_;
    private int planCapacity_;
    private int pageDataCase_ = 0;
    private String memberId_ = "";
    private String planName_ = "";
    private String removeAccountUrl_ = "";

    static {
        GetMemberDetailsResponse getMemberDetailsResponse = new GetMemberDetailsResponse();
        DEFAULT_INSTANCE = getMemberDetailsResponse;
        h.registerDefaultInstance(GetMemberDetailsResponse.class, getMemberDetailsResponse);
    }

    private GetMemberDetailsResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\f\u0007\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\nȈ\u000b\u0004\fለ\u0000", new Object[]{"pageData_", "pageDataCase_", "bitField0_", "memberId_", SelfManaged.class, GenAlphaManaged.class, LegacyManaged.class, "planName_", "planCapacity_", "removeAccountUrl_"});
        }
        if (iOrdinal == 3) {
            return new GetMemberDetailsResponse();
        }
        if (iOrdinal == 4) {
            return new io40(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (GetMemberDetailsResponse.class) {
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

    public final String getMemberId() {
        return this.memberId_;
    }

    public final String getPlanName() {
        return this.planName_;
    }

    public final GenAlphaManaged n() {
        return this.pageDataCase_ == 3 ? (GenAlphaManaged) this.pageData_ : GenAlphaManaged.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final LegacyManaged o() {
        return this.pageDataCase_ == 4 ? (LegacyManaged) this.pageData_ : LegacyManaged.n();
    }

    public final int p() {
        int i = this.pageDataCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    public final int q() {
        return this.planCapacity_;
    }

    public final String r() {
        return this.removeAccountUrl_;
    }

    public final SelfManaged s() {
        return this.pageDataCase_ == 2 ? (SelfManaged) this.pageData_ : SelfManaged.t();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
