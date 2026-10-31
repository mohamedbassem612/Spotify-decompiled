package com.spotify.campfire.datasource.impl.proto;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum ShareSet implements v190 {
    SHARE_SET_UNSPECIFIED(0),
    SHARE_SET_CHAT_VIEW(1),
    UNRECOGNIZED(-1);

    public static final int SHARE_SET_CHAT_VIEW_VALUE = 1;
    public static final int SHARE_SET_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.ShareSet.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public ShareSet m707findValueByNumber(int i) {
            return ShareSet.forNumber(i);
        }
    };
    private final int value;

    public static final class ShareSetVerifier implements z190 {
        static final z190 INSTANCE = new ShareSetVerifier();

        private ShareSetVerifier() {
        }

        public boolean isInRange(int i) {
            return ShareSet.forNumber(i) != null;
        }
    }

    ShareSet(int i) {
        this.value = i;
    }

    public static ShareSet forNumber(int i) {
        if (i == 0) {
            return SHARE_SET_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return SHARE_SET_CHAT_VIEW;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return ShareSetVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static ShareSet valueOf(int i) {
        return forNumber(i);
    }
}
