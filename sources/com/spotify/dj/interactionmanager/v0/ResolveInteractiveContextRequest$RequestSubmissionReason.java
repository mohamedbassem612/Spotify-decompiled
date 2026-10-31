package com.spotify.dj.interactionmanager.v0;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum ResolveInteractiveContextRequest$RequestSubmissionReason implements v190 {
    REQUEST_PROMPT(0),
    DISMISS(1),
    NO_MIC_PERMISSIONS(2),
    UNRECOGNIZED(-1);

    public static final int DISMISS_VALUE = 1;
    public static final int NO_MIC_PERMISSIONS_VALUE = 2;
    public static final int REQUEST_PROMPT_VALUE = 0;
    private static final y190 internalValueMap = new AnonymousClass1();
    private final int value;

    public static final class RequestSubmissionReasonVerifier implements z190 {
        static final z190 INSTANCE = new RequestSubmissionReasonVerifier();

        private RequestSubmissionReasonVerifier() {
        }

        public final boolean isInRange(int i) {
            return ResolveInteractiveContextRequest$RequestSubmissionReason.forNumber(i) != null;
        }
    }

    ResolveInteractiveContextRequest$RequestSubmissionReason(int i) {
        this.value = i;
    }

    public static ResolveInteractiveContextRequest$RequestSubmissionReason forNumber(int i) {
        if (i == 0) {
            return REQUEST_PROMPT;
        }
        if (i == 1) {
            return DISMISS;
        }
        if (i != 2) {
            return null;
        }
        return NO_MIC_PERMISSIONS;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return RequestSubmissionReasonVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequest$RequestSubmissionReason$1, reason: invalid class name */
    public class AnonymousClass1 implements y190 {
        public final ResolveInteractiveContextRequest$RequestSubmissionReason findValueByNumber(int i) {
            return ResolveInteractiveContextRequest$RequestSubmissionReason.forNumber(i);
        }

        /* JADX INFO: renamed from: findValueByNumber, reason: collision with other method in class */
        public final v190 m68findValueByNumber(int i) {
            return ResolveInteractiveContextRequest$RequestSubmissionReason.forNumber(i);
        }
    }

    @Deprecated
    public static ResolveInteractiveContextRequest$RequestSubmissionReason valueOf(int i) {
        return forNumber(i);
    }
}
