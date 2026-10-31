package com.spotify.playlist.ai.creation.v2;

import p.hhg1;
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum Action implements v190 {
    ACTION_UNSPECIFIED(0),
    ACTION_QUEUED(1),
    ACTION_PROCESSING(2),
    ACTION_TIMEOUT(3),
    ACTION_SUCCESS(4),
    ACTION_ERROR(5),
    UNRECOGNIZED(-1);

    public static final int ACTION_ERROR_VALUE = 5;
    public static final int ACTION_PROCESSING_VALUE = 2;
    public static final int ACTION_QUEUED_VALUE = 1;
    public static final int ACTION_SUCCESS_VALUE = 4;
    public static final int ACTION_TIMEOUT_VALUE = 3;
    public static final int ACTION_UNSPECIFIED_VALUE = 0;
    private static final y190 internalValueMap = new AnonymousClass1();
    private final int value;

    public static final class ActionVerifier implements z190 {
        static final z190 INSTANCE = new ActionVerifier();

        private ActionVerifier() {
        }

        public final boolean isInRange(int i) {
            return Action.forNumber(i) != null;
        }
    }

    Action(int i) {
        this.value = i;
    }

    public static Action forNumber(int i) {
        if (i == 0) {
            return ACTION_UNSPECIFIED;
        }
        if (i == 1) {
            return ACTION_QUEUED;
        }
        if (i == 2) {
            return ACTION_PROCESSING;
        }
        if (i == 3) {
            return ACTION_TIMEOUT;
        }
        if (i == 4) {
            return ACTION_SUCCESS;
        }
        if (i != 5) {
            return null;
        }
        return ACTION_ERROR;
    }

    public static y190 internalGetValueMap() {
        return internalValueMap;
    }

    public static z190 internalGetVerifier() {
        return ActionVerifier.INSTANCE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.Action$1, reason: invalid class name */
    public class AnonymousClass1 implements y190 {
        public final Action findValueByNumber(int i) {
            return Action.forNumber(i);
        }

        /* JADX INFO: renamed from: findValueByNumber, reason: collision with other method in class */
        public final v190 m442findValueByNumber(int i) {
            return Action.forNumber(i);
        }
    }

    @Deprecated
    public static Action valueOf(int i) {
        return forNumber(i);
    }
}
