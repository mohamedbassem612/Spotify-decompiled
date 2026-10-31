package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum PayloadFormat implements v190 {
    PAYLOAD_FORMAT_UNSPECIFIED(0),
    PAYLOAD_FORMAT_PROTO(1),
    PAYLOAD_FORMAT_JSON(2),
    UNRECOGNIZED(-1);

    public static final int PAYLOAD_FORMAT_JSON_VALUE = 2;
    public static final int PAYLOAD_FORMAT_PROTO_VALUE = 1;
    public static final int PAYLOAD_FORMAT_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.PayloadFormat.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public PayloadFormat m568findValueByNumber(int i) {
            return PayloadFormat.forNumber(i);
        }
    };
    private final int value;

    public static final class PayloadFormatVerifier implements z190 {
        static final z190 INSTANCE = new PayloadFormatVerifier();

        private PayloadFormatVerifier() {
        }

        public boolean isInRange(int i) {
            return PayloadFormat.forNumber(i) != null;
        }
    }

    PayloadFormat(int i) {
        this.value = i;
    }

    public static PayloadFormat forNumber(int i) {
        if (i == 0) {
            return PAYLOAD_FORMAT_UNSPECIFIED;
        }
        if (i == 1) {
            return PAYLOAD_FORMAT_PROTO;
        }
        if (i != 2) {
            return null;
        }
        return PAYLOAD_FORMAT_JSON;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return PayloadFormatVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static PayloadFormat valueOf(int i) {
        return forNumber(i);
    }
}
