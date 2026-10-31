package p;

import com.spotify.kidsview.v1.proto.AccountType;
import com.spotify.kidsview.v1.proto.AddToPlanActionState;
import com.spotify.kidsview.v1.proto.DeleteActionState;
import com.spotify.kidsview.v1.proto.RemoveFromPlanActionState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract /* synthetic */ class wag0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[AccountType.values().length];
        try {
            iArr[AccountType.ACCOUNT_TYPE_UNSPECIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AccountType.ACCOUNT_TYPE_PREMIUM_MANAGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AccountType.ACCOUNT_TYPE_FREE_MANAGED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AccountType.ACCOUNT_TYPE_LEGACY_KIDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AccountType.ACCOUNT_TYPE_TEEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AccountType.UNRECOGNIZED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[DeleteActionState.values().length];
        try {
            iArr2[DeleteActionState.DELETE_ACTION_STATE_UNSPECIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DeleteActionState.DELETE_ACTION_STATE_ENABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[DeleteActionState.DELETE_ACTION_STATE_DISABLED_GENERIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[DeleteActionState.DELETE_ACTION_STATE_DISABLED_REMOVE_MEMBER_FIRST.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[DeleteActionState.UNRECOGNIZED.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        b = iArr2;
        int[] iArr3 = new int[RemoveFromPlanActionState.values().length];
        try {
            iArr3[RemoveFromPlanActionState.REMOVE_FROM_PLAN_ACTION_STATE_UNSPECIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[RemoveFromPlanActionState.REMOVE_FROM_PLAN_ACTION_STATE_ENABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[RemoveFromPlanActionState.REMOVE_FROM_PLAN_ACTION_STATE_DISABLED_GENERIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[RemoveFromPlanActionState.UNRECOGNIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        c = iArr3;
        int[] iArr4 = new int[AddToPlanActionState.values().length];
        try {
            iArr4[AddToPlanActionState.ADD_TO_PLAN_ACTION_STATE_UNSPECIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[AddToPlanActionState.ADD_TO_PLAN_ACTION_STATE_ENABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[AddToPlanActionState.ADD_TO_PLAN_ACTION_STATE_DISABLED_GENERIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[AddToPlanActionState.ADD_TO_PLAN_ACTION_STATE_DISABLED_PLAN_IS_FULL.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[AddToPlanActionState.ADD_TO_PLAN_ACTION_STATE_DISABLED_NO_ADDRESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr4[AddToPlanActionState.UNRECOGNIZED.ordinal()] = 6;
        } catch (NoSuchFieldError unused21) {
        }
        d = iArr4;
    }
}
