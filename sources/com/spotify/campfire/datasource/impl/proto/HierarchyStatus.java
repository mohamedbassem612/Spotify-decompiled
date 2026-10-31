package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum HierarchyStatus implements v190 {
    HIERARCHY_STATUS_UNSPECIFIED(0),
    HIERARCHY_STATUS_DRAFT(1),
    HIERARCHY_STATUS_ACTIVE(2),
    HIERARCHY_STATUS_CANCELED(3),
    HIERARCHY_STATUS_DELETED(4),
    HIERARCHY_STATUS_REJECTED(5),
    HIERARCHY_STATUS_BLOCKED(6),
    HIERARCHY_STATUS_INACTIVE(7),
    UNRECOGNIZED(-1);

    public static final int HIERARCHY_STATUS_ACTIVE_VALUE = 2;
    public static final int HIERARCHY_STATUS_BLOCKED_VALUE = 6;
    public static final int HIERARCHY_STATUS_CANCELED_VALUE = 3;
    public static final int HIERARCHY_STATUS_DELETED_VALUE = 4;
    public static final int HIERARCHY_STATUS_DRAFT_VALUE = 1;
    public static final int HIERARCHY_STATUS_INACTIVE_VALUE = 7;
    public static final int HIERARCHY_STATUS_REJECTED_VALUE = 5;
    public static final int HIERARCHY_STATUS_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.HierarchyStatus.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public HierarchyStatus m417findValueByNumber(int i) {
            return HierarchyStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class HierarchyStatusVerifier implements z190 {
        static final z190 INSTANCE = new HierarchyStatusVerifier();

        private HierarchyStatusVerifier() {
        }

        public boolean isInRange(int i) {
            return HierarchyStatus.forNumber(i) != null;
        }
    }

    HierarchyStatus(int i) {
        this.value = i;
    }

    public static HierarchyStatus forNumber(int i) {
        switch (i) {
            case 0:
                return HIERARCHY_STATUS_UNSPECIFIED;
            case 1:
                return HIERARCHY_STATUS_DRAFT;
            case 2:
                return HIERARCHY_STATUS_ACTIVE;
            case 3:
                return HIERARCHY_STATUS_CANCELED;
            case 4:
                return HIERARCHY_STATUS_DELETED;
            case 5:
                return HIERARCHY_STATUS_REJECTED;
            case 6:
                return HIERARCHY_STATUS_BLOCKED;
            case 7:
                return HIERARCHY_STATUS_INACTIVE;
            default:
                return null;
        }
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return HierarchyStatusVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static HierarchyStatus valueOf(int i) {
        return forNumber(i);
    }
}
