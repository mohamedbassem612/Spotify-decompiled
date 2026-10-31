package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum SortOrder implements v190 {
    SORT_ORDER_UNSPECIFIED(0),
    SORT_ORDER_ASCENDING_OCCURRED_AT(1),
    SORT_ORDER_DESCENDING_OCCURRED_AT(2),
    UNRECOGNIZED(-1);

    public static final int SORT_ORDER_ASCENDING_OCCURRED_AT_VALUE = 1;
    public static final int SORT_ORDER_DESCENDING_OCCURRED_AT_VALUE = 2;
    public static final int SORT_ORDER_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.SortOrder.1
        @Override // p.y190
        public SortOrder findValueByNumber(int i) {
            return SortOrder.forNumber(i);
        }
    };
    private final int value;

    SortOrder(int i) {
        this.value = i;
    }

    public static SortOrder forNumber(int i) {
        if (i == 0) {
            return SORT_ORDER_UNSPECIFIED;
        }
        if (i == 1) {
            return SORT_ORDER_ASCENDING_OCCURRED_AT;
        }
        if (i != 2) {
            return null;
        }
        return SORT_ORDER_DESCENDING_OCCURRED_AT;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return SortOrderVerifier.INSTANCE;
    }

    @Override // p.v190
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static SortOrder valueOf(int i) {
        return forNumber(i);
    }
}
