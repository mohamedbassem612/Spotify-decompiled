package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum OffplatformShareSource implements v190 {
    OFFPLATFORM_SHARE_SOURCE_UNSPECIFIED(0),
    OFFPLATFORM_SHARE_SOURCE_PUBSUB(1),
    OFFPLATFORM_SHARE_SOURCE_BACKFILL(2),
    OFFPLATFORM_SHARE_SOURCE_OPEN(3),
    UNRECOGNIZED(-1);

    public static final int OFFPLATFORM_SHARE_SOURCE_BACKFILL_VALUE = 2;
    public static final int OFFPLATFORM_SHARE_SOURCE_OPEN_VALUE = 3;
    public static final int OFFPLATFORM_SHARE_SOURCE_PUBSUB_VALUE = 1;
    public static final int OFFPLATFORM_SHARE_SOURCE_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.OffplatformShareSource.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public OffplatformShareSource m562findValueByNumber(int i) {
            return OffplatformShareSource.forNumber(i);
        }
    };
    private final int value;

    public static final class OffplatformShareSourceVerifier implements z190 {
        static final z190 INSTANCE = new OffplatformShareSourceVerifier();

        private OffplatformShareSourceVerifier() {
        }

        public boolean isInRange(int i) {
            return OffplatformShareSource.forNumber(i) != null;
        }
    }

    OffplatformShareSource(int i) {
        this.value = i;
    }

    public static OffplatformShareSource forNumber(int i) {
        if (i == 0) {
            return OFFPLATFORM_SHARE_SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return OFFPLATFORM_SHARE_SOURCE_PUBSUB;
        }
        if (i == 2) {
            return OFFPLATFORM_SHARE_SOURCE_BACKFILL;
        }
        if (i != 3) {
            return null;
        }
        return OFFPLATFORM_SHARE_SOURCE_OPEN;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return OffplatformShareSourceVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static OffplatformShareSource valueOf(int i) {
        return forNumber(i);
    }
}
