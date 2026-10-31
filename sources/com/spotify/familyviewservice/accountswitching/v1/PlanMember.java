package com.spotify.familyviewservice.accountswitching.v1;

import com.google.protobuf.h;
import com.spotify.familyviewservice.v1.MemberProfile;
import p.bf40;
import p.ets0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PlanMember extends h implements v2j0 {
    private static final PlanMember DEFAULT_INSTANCE;
    public static final int GEN_ALPHA_MANAGED_FIELD_NUMBER = 102;
    private static volatile qzr0 PARSER = null;
    public static final int PROFILE_FIELD_NUMBER = 2;
    public static final int SELF_MANAGED_FIELD_NUMBER = 101;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private Object memberData_;
    private MemberProfile profile_;
    private int memberDataCase_ = 0;
    private String username_ = "";

    static {
        PlanMember planMember = new PlanMember();
        DEFAULT_INSTANCE = planMember;
        h.registerDefaultInstance(PlanMember.class, planMember);
    }

    private PlanMember() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001f\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000e<\u0000f<\u0000", new Object[]{"memberData_", "memberDataCase_", "bitField0_", "username_", "profile_", SelfManagedPlanMember.class, GenAlphaManagedPlanMember.class});
        }
        if (iOrdinal == 3) {
            return new PlanMember();
        }
        if (iOrdinal == 4) {
            return new ets0(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (PlanMember.class) {
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

    public final GenAlphaManagedPlanMember n() {
        return this.memberDataCase_ == 102 ? (GenAlphaManagedPlanMember) this.memberData_ : GenAlphaManagedPlanMember.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.memberDataCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 101) {
            return i != 102 ? 0 : 2;
        }
        return 1;
    }

    public final MemberProfile p() {
        MemberProfile memberProfile = this.profile_;
        return memberProfile == null ? MemberProfile.n() : memberProfile;
    }

    public final SelfManagedPlanMember q() {
        return this.memberDataCase_ == 101 ? (SelfManagedPlanMember) this.memberData_ : SelfManagedPlanMember.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
