package p;

import com.spotify.kidsview.v1.proto.AccountType;
import com.spotify.kidsview.v1.proto.CreateNewManagedAccountActionState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract /* synthetic */ class dzr0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[AccountType.values().length];
        try {
            iArr[AccountType.ACCOUNT_TYPE_PREMIUM_MANAGED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AccountType.ACCOUNT_TYPE_FREE_MANAGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AccountType.ACCOUNT_TYPE_LEGACY_KIDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AccountType.ACCOUNT_TYPE_TEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[CreateNewManagedAccountActionState.values().length];
        try {
            iArr2[CreateNewManagedAccountActionState.CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CreateNewManagedAccountActionState.CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_LIMIT_REACHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[CreateNewManagedAccountActionState.CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_PLAN_MANAGER_ADDRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[CreateNewManagedAccountActionState.CREATE_NEW_MANAGED_ACCOUNT_ACTION_STATE_DISABLED_PARENTAL_AGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
