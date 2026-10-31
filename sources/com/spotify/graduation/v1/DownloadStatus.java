package com.spotify.graduation.v1;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum DownloadStatus implements v190 {
    UNKNOWN(0),
    REQUESTED(1),
    READY(2),
    UNRECOGNIZED(-1);

    public static final int READY_VALUE = 2;
    public static final int REQUESTED_VALUE = 1;
    public static final int UNKNOWN_VALUE = 0;
    private static final y190 internalValueMap = new AnonymousClass1();
    private final int value;

    public static final class DownloadStatusVerifier implements z190 {
        static final z190 INSTANCE = new DownloadStatusVerifier();

        private DownloadStatusVerifier() {
        }

        public final boolean isInRange(int i) {
            return DownloadStatus.forNumber(i) != null;
        }
    }

    DownloadStatus(int i) {
        this.value = i;
    }

    public static DownloadStatus forNumber(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return REQUESTED;
        }
        if (i != 2) {
            return null;
        }
        return READY;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return DownloadStatusVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    /* JADX INFO: renamed from: com.spotify.graduation.v1.DownloadStatus$1, reason: invalid class name */
    public class AnonymousClass1 implements y190 {
        public final DownloadStatus findValueByNumber(int i) {
            return DownloadStatus.forNumber(i);
        }

        /* JADX INFO: renamed from: findValueByNumber, reason: collision with other method in class */
        public final v190 m352findValueByNumber(int i) {
            return DownloadStatus.forNumber(i);
        }
    }

    @Deprecated
    public static DownloadStatus valueOf(int i) {
        return forNumber(i);
    }
}
