package com.spotify.accountswitching.v1;

import com.google.protobuf.h;
import p.bf40;
import p.j;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Account extends h implements v2j0 {
    private static final Account DEFAULT_INSTANCE;
    public static final int MANAGED_ACCOUNT_FIELD_NUMBER = 103;
    public static final int MANAGED_PLAN_MEMBER_FIELD_NUMBER = 102;
    private static volatile qzr0 PARSER = null;
    public static final int PROFILE_FIELD_NUMBER = 2;
    public static final int SELF_MANAGED_ACCOUNT_FIELD_NUMBER = 104;
    public static final int SELF_MANAGED_PLAN_MEMBER_FIELD_NUMBER = 101;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private Object accountType_;
    private int bitField0_;
    private AccountProfile profile_;
    private int accountTypeCase_ = 0;
    private String username_ = "";

    static {
        Account account = new Account();
        DEFAULT_INSTANCE = account;
        h.registerDefaultInstance(Account.class, account);
    }

    private Account() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001h\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000e<\u0000f<\u0000g<\u0000h<\u0000", new Object[]{"accountType_", "accountTypeCase_", "bitField0_", "username_", "profile_", SelfManagedPlanMember.class, ManagedPlanMember.class, ManagedAccount.class, SelfManagedAccount.class});
        }
        if (iOrdinal == 3) {
            return new Account();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (Account.class) {
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

    public final int n() {
        int i = this.accountTypeCase_;
        if (i == 0) {
            return 5;
        }
        switch (i) {
            case 101:
                return 1;
            case 102:
                return 2;
            case MANAGED_ACCOUNT_FIELD_NUMBER /* 103 */:
                return 3;
            case SELF_MANAGED_ACCOUNT_FIELD_NUMBER /* 104 */:
                return 4;
            default:
                return 0;
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ManagedAccount o() {
        return this.accountTypeCase_ == 103 ? (ManagedAccount) this.accountType_ : ManagedAccount.n();
    }

    public final ManagedPlanMember p() {
        return this.accountTypeCase_ == 102 ? (ManagedPlanMember) this.accountType_ : ManagedPlanMember.n();
    }

    public final AccountProfile q() {
        AccountProfile accountProfile = this.profile_;
        return accountProfile == null ? AccountProfile.n() : accountProfile;
    }

    public final SelfManagedAccount r() {
        return this.accountTypeCase_ == 104 ? (SelfManagedAccount) this.accountType_ : SelfManagedAccount.n();
    }

    public final SelfManagedPlanMember s() {
        return this.accountTypeCase_ == 101 ? (SelfManagedPlanMember) this.accountType_ : SelfManagedPlanMember.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
