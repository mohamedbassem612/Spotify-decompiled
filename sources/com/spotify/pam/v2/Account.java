package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.ixv0;
import p.j;
import p.jf40;
import p.kcs0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class Account extends h implements v2j0 {
    public static final int AVAILABLE_INVITES_FIELD_NUMBER = 6;
    public static final int BILLING_DESCRIPTION_FIELD_NUMBER = 1;
    private static final Account DEFAULT_INSTANCE;
    public static final int EXPIRATION_DATE_FIELD_NUMBER = 4;
    public static final int FLAGS_FIELD_NUMBER = 8;
    public static final int IS_ADDRESS_SET_FIELD_NUMBER = 2;
    public static final int IS_GRACE_PERIOD_FIELD_NUMBER = 3;
    public static final int MAX_CAPACITY_FIELD_NUMBER = 12;
    public static final int MEMBERSHIPVERIFICATION_FIELD_NUMBER = 13;
    public static final int MEMBERS_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PLAN_SUBTITLE_FIELD_NUMBER = 11;
    public static final int PREPAID_COUNT_FIELD_NUMBER = 9;
    public static final int PREPAID_UNIT_FIELD_NUMBER = 10;
    public static final int SCHEDULE_FIELD_NUMBER = 7;
    private long availableInvites_;
    private int bitField0_;
    private long expirationDate_;
    private AccountFlags flags_;
    private boolean isAddressSet_;
    private boolean isGracePeriod_;
    private int maxCapacity_;
    private MembershipVerification membershipVerification_;
    private int prepaidCount_;
    private int prepaidUnit_;
    private int schedule_;
    private String billingDescription_ = "";
    private h290 members_ = h.emptyProtobufList();
    private String planSubtitle_ = "";

    static {
        Account account = new Account();
        DEFAULT_INSTANCE = account;
        h.registerDefaultInstance(Account.class, account);
    }

    private Account() {
    }

    public static Account p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final kcs0 A() {
        kcs0 kcs0Var;
        int i = this.schedule_;
        if (i == 0) {
            kcs0Var = kcs0.TRIAL;
        } else if (i != 1) {
            kcs0Var = i != 2 ? null : kcs0.RECURRING;
        } else {
            kcs0Var = kcs0.PREPAID;
        }
        return kcs0Var == null ? kcs0.UNRECOGNIZED : kcs0Var;
    }

    public final boolean B() {
        return (this.bitField0_ & 4) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004\u0003\u0005\u001b\u0006\u0002\u0007\f\bဉ\u0000\t\u0004\n\f\u000bለ\u0001\f\u0004\rဉ\u0002", new Object[]{"bitField0_", "billingDescription_", "isAddressSet_", "isGracePeriod_", "expirationDate_", "members_", Member.class, "availableInvites_", "schedule_", "flags_", "prepaidCount_", "prepaidUnit_", "planSubtitle_", "maxCapacity_", "membershipVerification_"});
        }
        if (iOrdinal == 3) {
            return new Account();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE, (byte) 5);
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

    public final long n() {
        return this.availableInvites_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.billingDescription_;
    }

    public final long q() {
        return this.expirationDate_;
    }

    public final AccountFlags r() {
        AccountFlags accountFlags = this.flags_;
        return accountFlags == null ? AccountFlags.u() : accountFlags;
    }

    public final boolean s() {
        return this.isAddressSet_;
    }

    public final boolean t() {
        return this.isGracePeriod_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final int u() {
        return this.maxCapacity_;
    }

    public final h290 v() {
        return this.members_;
    }

    public final MembershipVerification w() {
        MembershipVerification membershipVerification = this.membershipVerification_;
        return membershipVerification == null ? MembershipVerification.p() : membershipVerification;
    }

    public final String x() {
        return this.planSubtitle_;
    }

    public final int y() {
        return this.prepaidCount_;
    }

    public final ixv0 z() {
        ixv0 ixv0Var;
        int i = this.prepaidUnit_;
        if (i == 0) {
            ixv0Var = ixv0.DAY;
        } else if (i == 1) {
            ixv0Var = ixv0.WEEK;
        } else if (i != 2) {
            ixv0Var = i != 3 ? null : ixv0.YEAR;
        } else {
            ixv0Var = ixv0.MONTH;
        }
        return ixv0Var == null ? ixv0.UNRECOGNIZED : ixv0Var;
    }
}
