package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum HierarchyType implements v190 {
    HIERARCHY_TYPE_UNSPECIFIED(0),
    HIERARCHY_TYPE_DM(1),
    HIERARCHY_TYPE_GROUP(2),
    UNRECOGNIZED(-1);

    public static final int HIERARCHY_TYPE_DM_VALUE = 1;
    public static final int HIERARCHY_TYPE_GROUP_VALUE = 2;
    public static final int HIERARCHY_TYPE_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.HierarchyType.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public HierarchyType m418findValueByNumber(int i) {
            return HierarchyType.forNumber(i);
        }
    };
    private final int value;

    public static final class HierarchyTypeVerifier implements z190 {
        static final z190 INSTANCE = new HierarchyTypeVerifier();

        private HierarchyTypeVerifier() {
        }

        public boolean isInRange(int i) {
            return HierarchyType.forNumber(i) != null;
        }
    }

    HierarchyType(int i) {
        this.value = i;
    }

    public static HierarchyType forNumber(int i) {
        if (i == 0) {
            return HIERARCHY_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return HIERARCHY_TYPE_DM;
        }
        if (i != 2) {
            return null;
        }
        return HIERARCHY_TYPE_GROUP;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return HierarchyTypeVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static HierarchyType valueOf(int i) {
        return forNumber(i);
    }
}
