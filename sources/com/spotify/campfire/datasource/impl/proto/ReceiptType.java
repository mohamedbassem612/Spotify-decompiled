package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum ReceiptType implements v190 {
    RECEIPT_TYPE_UNDEFINED(0),
    RECEIPT_TYPE_PLAYED(1),
    RECEIPT_TYPE_SAVED(2),
    RECEIPT_TYPE_SEEN(3),
    UNRECOGNIZED(-1);

    public static final int RECEIPT_TYPE_PLAYED_VALUE = 1;
    public static final int RECEIPT_TYPE_SAVED_VALUE = 2;
    public static final int RECEIPT_TYPE_SEEN_VALUE = 3;
    public static final int RECEIPT_TYPE_UNDEFINED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.ReceiptType.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public ReceiptType m610findValueByNumber(int i) {
            return ReceiptType.forNumber(i);
        }
    };
    private final int value;

    public static final class ReceiptTypeVerifier implements z190 {
        static final z190 INSTANCE = new ReceiptTypeVerifier();

        private ReceiptTypeVerifier() {
        }

        public boolean isInRange(int i) {
            return ReceiptType.forNumber(i) != null;
        }
    }

    ReceiptType(int i) {
        this.value = i;
    }

    public static ReceiptType forNumber(int i) {
        if (i == 0) {
            return RECEIPT_TYPE_UNDEFINED;
        }
        if (i == 1) {
            return RECEIPT_TYPE_PLAYED;
        }
        if (i == 2) {
            return RECEIPT_TYPE_SAVED;
        }
        if (i != 3) {
            return null;
        }
        return RECEIPT_TYPE_SEEN;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return ReceiptTypeVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static ReceiptType valueOf(int i) {
        return forNumber(i);
    }
}
