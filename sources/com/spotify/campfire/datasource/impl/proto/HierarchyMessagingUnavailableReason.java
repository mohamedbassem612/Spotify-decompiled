package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum HierarchyMessagingUnavailableReason implements v190 {
    HIERARCHY_MESSAGING_UNAVAILABLE_REASON_UNSPECIFIED(0),
    HIERARCHY_MESSAGING_UNAVAILABLE_REASON_CURRENT_USER_BLOCKING_OTHER_USER(1),
    HIERARCHY_MESSAGING_UNAVAILABLE_REASON_OTHER_USER_OPTED_OUT(2),
    HIERARCHY_MESSAGING_UNAVAILABLE_REASON_AWAITING_ACCEPTANCE(3),
    HIERARCHY_MESSAGING_UNAVAILABLE_REASON_ACCEPTANCE_REQUIRED(4),
    HIERARCHY_MESSAGING_UNAVAILABLE_REASON_NOT_FRIENDS(5),
    HIERARCHY_MESSAGING_UNAVAILABLE_REASON_HIERARCHY_INACTIVE(6),
    HIERARCHY_MESSAGING_UNAVAILABLE_REASON_START_REQUIRED(7),
    UNRECOGNIZED(-1);

    public static final int HIERARCHY_MESSAGING_UNAVAILABLE_REASON_ACCEPTANCE_REQUIRED_VALUE = 4;
    public static final int HIERARCHY_MESSAGING_UNAVAILABLE_REASON_AWAITING_ACCEPTANCE_VALUE = 3;
    public static final int HIERARCHY_MESSAGING_UNAVAILABLE_REASON_CURRENT_USER_BLOCKING_OTHER_USER_VALUE = 1;
    public static final int HIERARCHY_MESSAGING_UNAVAILABLE_REASON_HIERARCHY_INACTIVE_VALUE = 6;
    public static final int HIERARCHY_MESSAGING_UNAVAILABLE_REASON_NOT_FRIENDS_VALUE = 5;
    public static final int HIERARCHY_MESSAGING_UNAVAILABLE_REASON_OTHER_USER_OPTED_OUT_VALUE = 2;
    public static final int HIERARCHY_MESSAGING_UNAVAILABLE_REASON_START_REQUIRED_VALUE = 7;
    public static final int HIERARCHY_MESSAGING_UNAVAILABLE_REASON_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.HierarchyMessagingUnavailableReason.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public HierarchyMessagingUnavailableReason m400findValueByNumber(int i) {
            return HierarchyMessagingUnavailableReason.forNumber(i);
        }
    };
    private final int value;

    public static final class HierarchyMessagingUnavailableReasonVerifier implements z190 {
        static final z190 INSTANCE = new HierarchyMessagingUnavailableReasonVerifier();

        private HierarchyMessagingUnavailableReasonVerifier() {
        }

        public boolean isInRange(int i) {
            return HierarchyMessagingUnavailableReason.forNumber(i) != null;
        }
    }

    HierarchyMessagingUnavailableReason(int i) {
        this.value = i;
    }

    public static HierarchyMessagingUnavailableReason forNumber(int i) {
        switch (i) {
            case 0:
                return HIERARCHY_MESSAGING_UNAVAILABLE_REASON_UNSPECIFIED;
            case 1:
                return HIERARCHY_MESSAGING_UNAVAILABLE_REASON_CURRENT_USER_BLOCKING_OTHER_USER;
            case 2:
                return HIERARCHY_MESSAGING_UNAVAILABLE_REASON_OTHER_USER_OPTED_OUT;
            case 3:
                return HIERARCHY_MESSAGING_UNAVAILABLE_REASON_AWAITING_ACCEPTANCE;
            case 4:
                return HIERARCHY_MESSAGING_UNAVAILABLE_REASON_ACCEPTANCE_REQUIRED;
            case 5:
                return HIERARCHY_MESSAGING_UNAVAILABLE_REASON_NOT_FRIENDS;
            case 6:
                return HIERARCHY_MESSAGING_UNAVAILABLE_REASON_HIERARCHY_INACTIVE;
            case 7:
                return HIERARCHY_MESSAGING_UNAVAILABLE_REASON_START_REQUIRED;
            default:
                return null;
        }
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return HierarchyMessagingUnavailableReasonVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static HierarchyMessagingUnavailableReason valueOf(int i) {
        return forNumber(i);
    }
}
