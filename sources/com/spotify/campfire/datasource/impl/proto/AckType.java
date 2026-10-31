package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum AckType implements v190 {
    ACKTYPE_UNDEFINED(0),
    ACKTYPE_USER_SEEN(1),
    ACKTYPE_SYSTEM_PROCESSED(3),
    UNRECOGNIZED(-1);

    public static final int ACKTYPE_SYSTEM_PROCESSED_VALUE = 3;
    public static final int ACKTYPE_UNDEFINED_VALUE = 0;
    public static final int ACKTYPE_USER_SEEN_VALUE = 1;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.AckType.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public AckType m5findValueByNumber(int i) {
            return AckType.forNumber(i);
        }
    };
    private final int value;

    public static final class AckTypeVerifier implements z190 {
        static final z190 INSTANCE = new AckTypeVerifier();

        private AckTypeVerifier() {
        }

        public boolean isInRange(int i) {
            return AckType.forNumber(i) != null;
        }
    }

    AckType(int i) {
        this.value = i;
    }

    public static AckType forNumber(int i) {
        if (i == 0) {
            return ACKTYPE_UNDEFINED;
        }
        if (i == 1) {
            return ACKTYPE_USER_SEEN;
        }
        if (i != 3) {
            return null;
        }
        return ACKTYPE_SYSTEM_PROCESSED;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return AckTypeVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static AckType valueOf(int i) {
        return forNumber(i);
    }
}
