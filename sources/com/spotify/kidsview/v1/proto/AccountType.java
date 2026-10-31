package com.spotify.kidsview.v1.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum AccountType implements v190 {
    ACCOUNT_TYPE_UNSPECIFIED(0),
    ACCOUNT_TYPE_PREMIUM_MANAGED(1),
    ACCOUNT_TYPE_FREE_MANAGED(2),
    ACCOUNT_TYPE_LEGACY_KIDS(3),
    ACCOUNT_TYPE_TEEN(4),
    UNRECOGNIZED(-1);

    public static final int ACCOUNT_TYPE_FREE_MANAGED_VALUE = 2;
    public static final int ACCOUNT_TYPE_LEGACY_KIDS_VALUE = 3;
    public static final int ACCOUNT_TYPE_PREMIUM_MANAGED_VALUE = 1;
    public static final int ACCOUNT_TYPE_TEEN_VALUE = 4;
    public static final int ACCOUNT_TYPE_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.kidsview.v1.proto.AccountType.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public AccountType m374findValueByNumber(int i) {
            return AccountType.forNumber(i);
        }
    };
    private final int value;

    public static final class AccountTypeVerifier implements z190 {
        static final z190 INSTANCE = new AccountTypeVerifier();

        private AccountTypeVerifier() {
        }

        public boolean isInRange(int i) {
            return AccountType.forNumber(i) != null;
        }
    }

    AccountType(int i) {
        this.value = i;
    }

    public static AccountType forNumber(int i) {
        if (i == 0) {
            return ACCOUNT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ACCOUNT_TYPE_PREMIUM_MANAGED;
        }
        if (i == 2) {
            return ACCOUNT_TYPE_FREE_MANAGED;
        }
        if (i == 3) {
            return ACCOUNT_TYPE_LEGACY_KIDS;
        }
        if (i != 4) {
            return null;
        }
        return ACCOUNT_TYPE_TEEN;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return AccountTypeVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static AccountType valueOf(int i) {
        return forNumber(i);
    }
}
