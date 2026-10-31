package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum CurrentUserHierarchyPhase implements v190 {
    CURRENT_USER_HIERARCHY_PHASE_UNSPECIFIED(0),
    CURRENT_USER_HIERARCHY_PHASE_ACTIVE(1),
    CURRENT_USER_HIERARCHY_PHASE_INCOMING_REQUEST(2),
    CURRENT_USER_HIERARCHY_PHASE_OUTGOING_REQUEST(3),
    CURRENT_USER_HIERARCHY_PHASE_INACTIVE(4),
    CURRENT_USER_HIERARCHY_PHASE_INCOMING_INVITE(5),
    CURRENT_USER_HIERARCHY_PHASE_START_REQUIRED(6),
    UNRECOGNIZED(-1);

    public static final int CURRENT_USER_HIERARCHY_PHASE_ACTIVE_VALUE = 1;
    public static final int CURRENT_USER_HIERARCHY_PHASE_INACTIVE_VALUE = 4;
    public static final int CURRENT_USER_HIERARCHY_PHASE_INCOMING_INVITE_VALUE = 5;
    public static final int CURRENT_USER_HIERARCHY_PHASE_INCOMING_REQUEST_VALUE = 2;
    public static final int CURRENT_USER_HIERARCHY_PHASE_OUTGOING_REQUEST_VALUE = 3;
    public static final int CURRENT_USER_HIERARCHY_PHASE_START_REQUIRED_VALUE = 6;
    public static final int CURRENT_USER_HIERARCHY_PHASE_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.CurrentUserHierarchyPhase.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public CurrentUserHierarchyPhase m173findValueByNumber(int i) {
            return CurrentUserHierarchyPhase.forNumber(i);
        }
    };
    private final int value;

    public static final class CurrentUserHierarchyPhaseVerifier implements z190 {
        static final z190 INSTANCE = new CurrentUserHierarchyPhaseVerifier();

        private CurrentUserHierarchyPhaseVerifier() {
        }

        public boolean isInRange(int i) {
            return CurrentUserHierarchyPhase.forNumber(i) != null;
        }
    }

    CurrentUserHierarchyPhase(int i) {
        this.value = i;
    }

    public static CurrentUserHierarchyPhase forNumber(int i) {
        switch (i) {
            case 0:
                return CURRENT_USER_HIERARCHY_PHASE_UNSPECIFIED;
            case 1:
                return CURRENT_USER_HIERARCHY_PHASE_ACTIVE;
            case 2:
                return CURRENT_USER_HIERARCHY_PHASE_INCOMING_REQUEST;
            case 3:
                return CURRENT_USER_HIERARCHY_PHASE_OUTGOING_REQUEST;
            case 4:
                return CURRENT_USER_HIERARCHY_PHASE_INACTIVE;
            case 5:
                return CURRENT_USER_HIERARCHY_PHASE_INCOMING_INVITE;
            case 6:
                return CURRENT_USER_HIERARCHY_PHASE_START_REQUIRED;
            default:
                return null;
        }
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return CurrentUserHierarchyPhaseVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static CurrentUserHierarchyPhase valueOf(int i) {
        return forNumber(i);
    }
}
