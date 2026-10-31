package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum HierarchyClass implements v190 {
    HIERARCHY_CLASS_UNSPECIFIED(0),
    HIERARCHY_CLASS_CHANNEL(1),
    HIERARCHY_CLASS_MEMBER(2),
    HIERARCHY_CLASS_ANNOTATION(3),
    HIERARCHY_CLASS_AGENT(4),
    UNRECOGNIZED(-1);

    public static final int HIERARCHY_CLASS_AGENT_VALUE = 4;
    public static final int HIERARCHY_CLASS_ANNOTATION_VALUE = 3;
    public static final int HIERARCHY_CLASS_CHANNEL_VALUE = 1;
    public static final int HIERARCHY_CLASS_MEMBER_VALUE = 2;
    public static final int HIERARCHY_CLASS_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.HierarchyClass.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public HierarchyClass m374findValueByNumber(int i) {
            return HierarchyClass.forNumber(i);
        }
    };
    private final int value;

    public static final class HierarchyClassVerifier implements z190 {
        static final z190 INSTANCE = new HierarchyClassVerifier();

        private HierarchyClassVerifier() {
        }

        public boolean isInRange(int i) {
            return HierarchyClass.forNumber(i) != null;
        }
    }

    HierarchyClass(int i) {
        this.value = i;
    }

    public static HierarchyClass forNumber(int i) {
        if (i == 0) {
            return HIERARCHY_CLASS_UNSPECIFIED;
        }
        if (i == 1) {
            return HIERARCHY_CLASS_CHANNEL;
        }
        if (i == 2) {
            return HIERARCHY_CLASS_MEMBER;
        }
        if (i == 3) {
            return HIERARCHY_CLASS_ANNOTATION;
        }
        if (i != 4) {
            return null;
        }
        return HIERARCHY_CLASS_AGENT;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return HierarchyClassVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static HierarchyClass valueOf(int i) {
        return forNumber(i);
    }
}
