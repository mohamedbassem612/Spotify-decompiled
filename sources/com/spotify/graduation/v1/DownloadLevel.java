package com.spotify.graduation.v1;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum DownloadLevel implements v190 {
    NONE(0),
    ACCOUNT_DATA(1),
    EXTENDED_STREAMING_HISTORY(2),
    TECHNICAL_LOG_INFORMATION(3),
    UNRECOGNIZED(-1);

    public static final int ACCOUNT_DATA_VALUE = 1;
    public static final int EXTENDED_STREAMING_HISTORY_VALUE = 2;
    public static final int NONE_VALUE = 0;
    public static final int TECHNICAL_LOG_INFORMATION_VALUE = 3;
    private static final y190 internalValueMap = new AnonymousClass1();
    private final int value;

    public static final class DownloadLevelVerifier implements z190 {
        static final z190 INSTANCE = new DownloadLevelVerifier();

        private DownloadLevelVerifier() {
        }

        public final boolean isInRange(int i) {
            return DownloadLevel.forNumber(i) != null;
        }
    }

    DownloadLevel(int i) {
        this.value = i;
    }

    public static DownloadLevel forNumber(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return ACCOUNT_DATA;
        }
        if (i == 2) {
            return EXTENDED_STREAMING_HISTORY;
        }
        if (i != 3) {
            return null;
        }
        return TECHNICAL_LOG_INFORMATION;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return DownloadLevelVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    /* JADX INFO: renamed from: com.spotify.graduation.v1.DownloadLevel$1, reason: invalid class name */
    public class AnonymousClass1 implements y190 {
        public final DownloadLevel findValueByNumber(int i) {
            return DownloadLevel.forNumber(i);
        }

        /* JADX INFO: renamed from: findValueByNumber, reason: collision with other method in class */
        public final v190 m351findValueByNumber(int i) {
            return DownloadLevel.forNumber(i);
        }
    }

    @Deprecated
    public static DownloadLevel valueOf(int i) {
        return forNumber(i);
    }
}
