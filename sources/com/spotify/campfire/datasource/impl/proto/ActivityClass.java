package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum ActivityClass implements v190 {
    ACTIVITY_CLASS_UNSPECIFIED(0),
    ACTIVITY_CLASS_REACTION(1),
    ACTIVITY_CLASS_RECEIPT(2),
    ACTIVITY_CLASS_ACK(3),
    UNRECOGNIZED(-1);

    public static final int ACTIVITY_CLASS_ACK_VALUE = 3;
    public static final int ACTIVITY_CLASS_REACTION_VALUE = 1;
    public static final int ACTIVITY_CLASS_RECEIPT_VALUE = 2;
    public static final int ACTIVITY_CLASS_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.ActivityClass.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public ActivityClass m6findValueByNumber(int i) {
            return ActivityClass.forNumber(i);
        }
    };
    private final int value;

    public static final class ActivityClassVerifier implements z190 {
        static final z190 INSTANCE = new ActivityClassVerifier();

        private ActivityClassVerifier() {
        }

        public boolean isInRange(int i) {
            return ActivityClass.forNumber(i) != null;
        }
    }

    ActivityClass(int i) {
        this.value = i;
    }

    public static ActivityClass forNumber(int i) {
        if (i == 0) {
            return ACTIVITY_CLASS_UNSPECIFIED;
        }
        if (i == 1) {
            return ACTIVITY_CLASS_REACTION;
        }
        if (i == 2) {
            return ACTIVITY_CLASS_RECEIPT;
        }
        if (i != 3) {
            return null;
        }
        return ACTIVITY_CLASS_ACK;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return ActivityClassVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static ActivityClass valueOf(int i) {
        return forNumber(i);
    }
}
