package com.spotify.kidsview.v1.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum CreateNewManagedAccountActionState implements v190 {
    CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_UNSPECIFIED(0),
    CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_ENABLED(1),
    CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_GENERIC(2),
    CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_LIMIT_REACHED(3),
    CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_PARENTAL_AGE(4),
    CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_PLAN_MANAGER_ADDRESS(5),
    UNRECOGNIZED(-1);

    public static final int CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_GENERIC_VALUE = 2;
    public static final int CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_LIMIT_REACHED_VALUE = 3;
    public static final int CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_PARENTAL_AGE_VALUE = 4;
    public static final int CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_PLAN_MANAGER_ADDRESS_VALUE = 5;
    public static final int CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_ENABLED_VALUE = 1;
    public static final int CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.kidsview.v1.proto.CreateNewManagedAccountActionState.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public CreateNewManagedAccountActionState m376findValueByNumber(int i) {
            return CreateNewManagedAccountActionState.forNumber(i);
        }
    };
    private final int value;

    public static final class CreateNewManagedAccountActionStateVerifier implements z190 {
        static final z190 INSTANCE = new CreateNewManagedAccountActionStateVerifier();

        private CreateNewManagedAccountActionStateVerifier() {
        }

        public boolean isInRange(int i) {
            return CreateNewManagedAccountActionState.forNumber(i) != null;
        }
    }

    CreateNewManagedAccountActionState(int i) {
        this.value = i;
    }

    public static CreateNewManagedAccountActionState forNumber(int i) {
        if (i == 0) {
            return CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_ENABLED;
        }
        if (i == 2) {
            return CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_GENERIC;
        }
        if (i == 3) {
            return CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_LIMIT_REACHED;
        }
        if (i == 4) {
            return CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_PARENTAL_AGE;
        }
        if (i != 5) {
            return null;
        }
        return CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_PLAN_MANAGER_ADDRESS;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return CreateNewManagedAccountActionStateVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static CreateNewManagedAccountActionState valueOf(int i) {
        return forNumber(i);
    }
}
