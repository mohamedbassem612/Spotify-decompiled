package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum RequestSource implements v190 {
    REQUEST_SOURCE_UNSPECIFIED(0),
    REQUEST_SOURCE_CLIENT(1),
    REQUEST_SOURCE_BACKEND(2),
    REQUEST_SOURCE_EVOLUTION(3),
    REQUEST_SOURCE_BACKEND_SHARE_HISTORY(4),
    UNRECOGNIZED(-1);

    public static final int REQUEST_SOURCE_BACKEND_SHARE_HISTORY_VALUE = 4;
    public static final int REQUEST_SOURCE_BACKEND_VALUE = 2;
    public static final int REQUEST_SOURCE_CLIENT_VALUE = 1;
    public static final int REQUEST_SOURCE_EVOLUTION_VALUE = 3;
    public static final int REQUEST_SOURCE_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.RequestSource.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public RequestSource m661findValueByNumber(int i) {
            return RequestSource.forNumber(i);
        }
    };
    private final int value;

    public static final class RequestSourceVerifier implements z190 {
        static final z190 INSTANCE = new RequestSourceVerifier();

        private RequestSourceVerifier() {
        }

        public boolean isInRange(int i) {
            return RequestSource.forNumber(i) != null;
        }
    }

    RequestSource(int i) {
        this.value = i;
    }

    public static RequestSource forNumber(int i) {
        if (i == 0) {
            return REQUEST_SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return REQUEST_SOURCE_CLIENT;
        }
        if (i == 2) {
            return REQUEST_SOURCE_BACKEND;
        }
        if (i == 3) {
            return REQUEST_SOURCE_EVOLUTION;
        }
        if (i != 4) {
            return null;
        }
        return REQUEST_SOURCE_BACKEND_SHARE_HISTORY;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return RequestSourceVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static RequestSource valueOf(int i) {
        return forNumber(i);
    }
}
