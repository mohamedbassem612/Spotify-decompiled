package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum GroupMemberStatus implements v190 {
    UNSPECIFIED(0),
    OPTED_OUT(1),
    PENDING(2),
    LEFT(3),
    UNRECOGNIZED(-1);

    public static final int LEFT_VALUE = 3;
    public static final int OPTED_OUT_VALUE = 1;
    public static final int PENDING_VALUE = 2;
    public static final int UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.GroupMemberStatus.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public GroupMemberStatus m358findValueByNumber(int i) {
            return GroupMemberStatus.forNumber(i);
        }
    };
    private final int value;

    public static final class GroupMemberStatusVerifier implements z190 {
        static final z190 INSTANCE = new GroupMemberStatusVerifier();

        private GroupMemberStatusVerifier() {
        }

        public boolean isInRange(int i) {
            return GroupMemberStatus.forNumber(i) != null;
        }
    }

    GroupMemberStatus(int i) {
        this.value = i;
    }

    public static GroupMemberStatus forNumber(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return OPTED_OUT;
        }
        if (i == 2) {
            return PENDING;
        }
        if (i != 3) {
            return null;
        }
        return LEFT;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return GroupMemberStatusVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static GroupMemberStatus valueOf(int i) {
        return forNumber(i);
    }
}
