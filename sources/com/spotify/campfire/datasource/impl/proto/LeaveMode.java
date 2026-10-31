package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum LeaveMode implements v190 {
    LEAVE_MODE_UNSPECIFIED(0),
    READ_ONLY(1),
    DELETE(2),
    UNRECOGNIZED(-1);

    public static final int DELETE_VALUE = 2;
    public static final int LEAVE_MODE_UNSPECIFIED_VALUE = 0;
    public static final int READ_ONLY_VALUE = 1;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.LeaveMode.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public LeaveMode m481findValueByNumber(int i) {
            return LeaveMode.forNumber(i);
        }
    };
    private final int value;

    public static final class LeaveModeVerifier implements z190 {
        static final z190 INSTANCE = new LeaveModeVerifier();

        private LeaveModeVerifier() {
        }

        public boolean isInRange(int i) {
            return LeaveMode.forNumber(i) != null;
        }
    }

    LeaveMode(int i) {
        this.value = i;
    }

    public static LeaveMode forNumber(int i) {
        if (i == 0) {
            return LEAVE_MODE_UNSPECIFIED;
        }
        if (i == 1) {
            return READ_ONLY;
        }
        if (i != 2) {
            return null;
        }
        return DELETE;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return LeaveModeVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static LeaveMode valueOf(int i) {
        return forNumber(i);
    }
}
