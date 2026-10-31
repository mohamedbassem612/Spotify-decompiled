package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum HierarchyUserRole implements v190 {
    HIERARCHY_USER_ROLE_UNSPECIFIED(0),
    HIERARCHY_USER_ROLE_MEMBER(1),
    HIERARCHY_USER_ROLE_ADMIN(2),
    UNRECOGNIZED(-1);

    public static final int HIERARCHY_USER_ROLE_ADMIN_VALUE = 2;
    public static final int HIERARCHY_USER_ROLE_MEMBER_VALUE = 1;
    public static final int HIERARCHY_USER_ROLE_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.HierarchyUserRole.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public HierarchyUserRole m420findValueByNumber(int i) {
            return HierarchyUserRole.forNumber(i);
        }
    };
    private final int value;

    public static final class HierarchyUserRoleVerifier implements z190 {
        static final z190 INSTANCE = new HierarchyUserRoleVerifier();

        private HierarchyUserRoleVerifier() {
        }

        public boolean isInRange(int i) {
            return HierarchyUserRole.forNumber(i) != null;
        }
    }

    HierarchyUserRole(int i) {
        this.value = i;
    }

    public static HierarchyUserRole forNumber(int i) {
        if (i == 0) {
            return HIERARCHY_USER_ROLE_UNSPECIFIED;
        }
        if (i == 1) {
            return HIERARCHY_USER_ROLE_MEMBER;
        }
        if (i != 2) {
            return null;
        }
        return HIERARCHY_USER_ROLE_ADMIN;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return HierarchyUserRoleVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static HierarchyUserRole valueOf(int i) {
        return forNumber(i);
    }
}
