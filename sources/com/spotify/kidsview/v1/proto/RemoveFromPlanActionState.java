package com.spotify.kidsview.v1.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum RemoveFromPlanActionState implements v190 {
    REMOVE_FROM_PLAN_ACTION_STATE_UNSPECIFIED(0),
    REMOVE_FROM_PLAN_ACTION_STATE_ENABLED(1),
    REMOVE_FROM_PLAN_ACTION_STATE_DISABLED_GENERIC(2),
    UNRECOGNIZED(-1);

    public static final int REMOVE_FROM_PLAN_ACTION_STATE_DISABLED_GENERIC_VALUE = 2;
    public static final int REMOVE_FROM_PLAN_ACTION_STATE_ENABLED_VALUE = 1;
    public static final int REMOVE_FROM_PLAN_ACTION_STATE_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.kidsview.v1.proto.RemoveFromPlanActionState.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public RemoveFromPlanActionState m378findValueByNumber(int i) {
            return RemoveFromPlanActionState.forNumber(i);
        }
    };
    private final int value;

    public static final class RemoveFromPlanActionStateVerifier implements z190 {
        static final z190 INSTANCE = new RemoveFromPlanActionStateVerifier();

        private RemoveFromPlanActionStateVerifier() {
        }

        public boolean isInRange(int i) {
            return RemoveFromPlanActionState.forNumber(i) != null;
        }
    }

    RemoveFromPlanActionState(int i) {
        this.value = i;
    }

    public static RemoveFromPlanActionState forNumber(int i) {
        if (i == 0) {
            return REMOVE_FROM_PLAN_ACTION_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return REMOVE_FROM_PLAN_ACTION_STATE_ENABLED;
        }
        if (i != 2) {
            return null;
        }
        return REMOVE_FROM_PLAN_ACTION_STATE_DISABLED_GENERIC;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return RemoveFromPlanActionStateVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static RemoveFromPlanActionState valueOf(int i) {
        return forNumber(i);
    }
}
